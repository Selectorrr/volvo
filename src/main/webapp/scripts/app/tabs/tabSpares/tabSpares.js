'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabSpares', {
                parent: 'home',
                url: '/tabSpares',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabSpares/tabSpares.html',
                        controller: 'TabController'
                    }
                }
            });
    });
