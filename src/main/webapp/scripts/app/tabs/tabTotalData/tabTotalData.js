'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabTotalData', {
                parent: 'home',
                url: '/tabTotalData?code&year&month&kind&createdBy',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabTotalData/tabTotalData.html',
                        controller: 'TabController'
                    }
                },
                resolve: {
                    initState: function (TabService, $stateParams) {
                        return TabService.getInitState($stateParams);
                    }
                }
            });
    });
