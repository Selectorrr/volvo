/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabNewCars', {
                parent: 'home',
                url: '/',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabNewCars/tabNewCars.html',
                        controller: 'TabController'
                    }
                }
            });
    });
