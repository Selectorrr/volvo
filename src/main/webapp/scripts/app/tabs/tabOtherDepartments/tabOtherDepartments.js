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
                }
            });
    });
