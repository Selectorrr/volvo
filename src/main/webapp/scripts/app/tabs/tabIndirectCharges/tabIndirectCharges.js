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
                }
            });
    });
