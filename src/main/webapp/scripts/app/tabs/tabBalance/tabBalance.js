'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabBalance', {
                parent: 'home',
                url: '/tabBalance?code&year&month&kind&createdBy',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabBalance/tabBalance.html',
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
