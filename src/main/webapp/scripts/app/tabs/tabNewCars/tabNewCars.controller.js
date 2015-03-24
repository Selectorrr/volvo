/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .controller('TabNewCarsController', function ($scope, ReportService, currentReport) {

        $scope.model = currentReport.data;

        $scope.autoSaving = function () {
            console.log('auto saving..');
            ReportService.saveReport($scope.model);
        }

    });
