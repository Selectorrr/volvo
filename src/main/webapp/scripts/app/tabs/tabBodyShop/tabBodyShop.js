'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabBodyShop', {
                parent: 'home',
                url: '/tabBodyShop',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabBodyShop/tabBodyShop.html',
                        controller: 'TabController'
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
                    report: function (ReportService) {
                        return ReportService.get({month: ReportService.options.month}).$promise;
                    }
                }
            });
    });
