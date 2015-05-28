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
                }
            });
    });
