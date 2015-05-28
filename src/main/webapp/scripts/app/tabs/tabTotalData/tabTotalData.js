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
                }
            });
    });
