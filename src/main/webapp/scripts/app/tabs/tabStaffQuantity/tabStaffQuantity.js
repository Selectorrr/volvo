'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabStaffQuantity', {
                parent: 'home',
                url: '/tabStaffQuantity',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabStaffQuantity/tabStaffQuantity.html',
                        controller: 'TabController'
                    }
                }
            });
    });
