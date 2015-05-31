/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabSecondHandCars', {
                parent: 'home',
                url: '/tabSecondHandCars?code&year&month&kind&createdBy',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabSecondHandCars/tabSecondHandCars.html',
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
