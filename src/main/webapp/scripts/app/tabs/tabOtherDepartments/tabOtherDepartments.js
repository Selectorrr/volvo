'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabOtherDepartments', {
                parent: 'home',
                url: '/tabOtherDepartments',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabOtherDepartments/tabOtherDepartments.html',
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
                    currentReport: ['ReportService', function(ReportService) {
                        return ReportService.currentReport();
                    }]
                }
            });
    });
