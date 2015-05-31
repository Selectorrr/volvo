'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('reports', {
                parent: 'entity',
                url: '/reports',
                data: {
                    roles: ['ROLE_ADMIN', 'ROLE_REPRESENTATIVE'],
                    pageTitle: 'volvoApp.reports.home.title'
                },
                views: {
                    'content@': {
                        templateUrl: 'scripts/app/representative/reports/reports.html',
                        controller: 'ReportsController'
                    }
                },
                resolve: {
                    authorize: ['Auth',
                        function (Auth) {
                            return Auth.authorize();
                        }
                    ],
                    yearReports: function (ReportService) {
                        return ReportService.query({
                            year: new Date().getFullYear()
                        }).$promise;
                    },
                    translatePartialLoader: ['$translate', '$translatePartialLoader', function ($translate, $translatePartialLoader) {
                        $translatePartialLoader.addPart('reports');
                        return $translate.refresh();
                    }]
                }
            })
    });
