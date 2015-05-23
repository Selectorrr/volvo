'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabIndirectCharges', {
                parent: 'home',
                url: '/tabIndirectCharges',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabIndirectCharges/tabIndirectCharges.html',
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
