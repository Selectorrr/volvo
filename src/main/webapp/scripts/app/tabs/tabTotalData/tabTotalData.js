'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabTotalData', {
                parent: 'home',
                url: '/tabTotalData',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabTotalData/tabTotalData.html',
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
                        return ReportService.get({
                            year: new Date().getFullYear(),
                            month: ReportService.options.month
                        }).$promise;
                    }
                }
            });
    });
