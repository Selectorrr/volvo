'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabIndirectCharges', {
                parent: 'home',
                url: '/tabIndirectCharges?code&year&month&kind&createdBy',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabIndirectCharges/tabIndirectCharges.html',
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
