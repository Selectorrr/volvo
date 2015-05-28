/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabFlittingShop', {
                parent: 'home',
                url: '/tabFlittingShop',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabFlittingShop/tabFlittingShop.html',
                        controller: 'TabController'
                    }
                }
            });
    });
