/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .controller('TabNewCarsController', function ($scope, ReportService) {

        $scope.model = {};

        ReportService.tabNewCars().then(function (tabNewCars) {
            $scope.model = tabNewCars.data;
            console.log($scope.model);
        });

        $scope.autoSaving = function () {
            console.log('auto saving..');
            ReportService.saveTabNewCars($scope.model);
        }

    });
