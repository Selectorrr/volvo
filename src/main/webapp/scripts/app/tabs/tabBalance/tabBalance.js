'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabBalance', {
                parent: 'home',
                url: '/tabBalance',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabBalance/tabBalance.html',
                        controller: 'TabController'
                    }
                }
            });
    });
