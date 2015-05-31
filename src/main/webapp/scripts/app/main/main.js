'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('home', {
                parent: 'site',
                abstract: true,
                data: {
                    roles: ['ROLE_DEALER', 'ROLE_REPRESENTATIVE', 'ROLE_ADMIN']
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/main/main.html',
                        controller: 'MainController'
                    }
                },
                resolve: {
                    authorize: ['Auth',
                        function (Auth) {
                            return Auth.authorize();
                        }
                    ],
                    mainTranslatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('main');
                        return $translate.refresh();
                    }],
                    account: function (Principal) {
                        return Principal.identity();
                    }
                }
            });
    });
