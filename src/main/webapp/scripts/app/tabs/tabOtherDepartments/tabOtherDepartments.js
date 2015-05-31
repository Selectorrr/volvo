'use strict';

angular.module('volvoApp')
    .config(function ($stateProvider) {
        $stateProvider
            .state('tabOtherDepartments', {
                parent: 'home',
                url: '/tabOtherDepartments?code&year&month&kind&createdBy',
                views: {
                    'tab-content@home': {
                        templateUrl: 'scripts/app/tabs/tabOtherDepartments/tabOtherDepartments.html',
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
