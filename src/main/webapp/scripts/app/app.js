'use strict';

angular.module('volvoApp', ['LocalStorageModule', 'tmh.dynamicLocale',
    'ngResource', 'ui.router', 'ngCookies', 'pascalprecht.translate', 'ngCacheBuster', 'infinite-scroll'])

    .run(function ($rootScope, $location, $window, $http, $state, $translate, Auth, Principal, Language, ENV, VERSION) {
        $rootScope.ENV = ENV;
        $rootScope.VERSION = VERSION;
        $rootScope.$on('$stateChangeStart', function (event, toState, toStateParams) {
            $rootScope.toState = toState;
            $rootScope.toStateParams = toStateParams;

            if (Principal.isIdentityResolved()) {
                Auth.authorize();
            }

            // Update the language
            Language.getCurrent().then(function (language) {
                $translate.use(language);
            });
        });

        $rootScope.$on('$stateChangeSuccess', function (event, toState, toParams, fromState, fromParams) {
            var titleKey = 'global.title';

            $rootScope.previousStateName = fromState.name;
            $rootScope.previousStateParams = fromParams;

            // Set the page title key to the one configured in state or use default one
            if (toState.data.pageTitle) {
                titleKey = toState.data.pageTitle;
            }
            $translate(titleKey).then(function (title) {
                // Change window title with translated one
                $window.document.title = title;
            });
        });

        $rootScope.back = function () {
            // If previous state is 'activate' or do not exist go to 'home'
            if ($rootScope.previousStateName === 'activate' || $state.get($rootScope.previousStateName) === null) {
                $state.go('tabNewCars');
            } else {
                $state.go($rootScope.previousStateName, $rootScope.previousStateParams);
            }
        };

        $rootScope.$on('event:auth-loginRequired', function () {
            Auth.logout();
            $state.go('login');
        });
    })

    .factory('authInterceptor', function ($rootScope, $q, $location, localStorageService) {
        return {
            // Add authorization token to headers
            request: function (config) {
                config.headers = config.headers || {};
                var token = localStorageService.get('token');

                if (token && token.expires && token.expires > new Date().getTime()) {
                    config.headers['x-auth-token'] = token.token;
                }

                return config;
            }
        };
    })

    .factory('authHttpResponseInterceptor', function ($q, $rootScope) {
        return {
            responseError: function (rejection) {
                if (rejection.status === 401 && rejection.config && rejection.config.url &&
                    rejection.config.url.lastIndexOf('api/account', 0) !== 0) {
                    $rootScope.$broadcast('event:auth-loginRequired', rejection);
                }
                return $q.reject(rejection);
            }
        }
    })

    .config(function ($stateProvider, $urlRouterProvider, $httpProvider, $locationProvider, $translateProvider, tmhDynamicLocaleProvider, httpRequestInterceptorCacheBusterProvider) {

        //Cache everything except rest api requests
        httpRequestInterceptorCacheBusterProvider.setMatchlist([/.*api.*/, /.*protected.*/], true);

        $urlRouterProvider.otherwise('/tabNewCars');
        $stateProvider.state('site', {
            'abstract': true,
            views: {
                'navbar@': {
                    templateUrl: 'scripts/components/navbar/navbar.html',
                    controller: 'NavbarController'
                }
            },
            resolve: {
                authorize: ['Auth',
                    function (Auth) {
                        return Auth.authorize();
                    }
                ],
                translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                    $translatePartialLoader.addPart('global');
                    $translatePartialLoader.addPart('language');
                    return $translate.refresh();
                }]
            }
        });

        $httpProvider.interceptors.push('authInterceptor');
        $httpProvider.interceptors.push('authHttpResponseInterceptor');

        // Initialize angular-translate
        $translateProvider.useLoader('$translatePartialLoader', {
            urlTemplate: 'i18n/{lang}/{part}.json'
        });

        $translateProvider.preferredLanguage('ru');
        $translateProvider.useCookieStorage();

        tmhDynamicLocaleProvider.localeLocationPattern('bower_components/angular-i18n/angular-locale_{{locale}}.js');
        tmhDynamicLocaleProvider.useCookieStorage('NG_TRANSLATE_LANG_KEY');
        $(window).scroll(function () {
            var alpha = $(window).scrollTop() / 300;
            var $volvoLogo = $('.volvo-logo');
            if (alpha >= 1) {
                $('.masthead').css("margin-bottom", '80px');
                $('.masthead, #nav').css("backgroundColor", 'rgba(22,22,24,.9)');
                $volvoLogo.css("opacity", '0.9');
                $volvoLogo.css("filter", "alpha(opacity=90)");
            } else {
                $('.masthead, #nav').css("backgroundColor", 'rgba(22,22,24,' + (alpha - 0.1) + ')');
                $volvoLogo.css("opacity", (alpha - 0.1));
                $volvoLogo.css("filter", "alpha(opacity=" + (alpha - 0.1) * 100 + ")");
                $('.masthead').css("margin-bottom", '');
            }
        })
    });
