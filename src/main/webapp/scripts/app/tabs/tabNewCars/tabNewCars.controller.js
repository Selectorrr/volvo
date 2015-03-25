/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .controller('TabNewCarsController', function ($scope, ReportService, currentReport) {

        $scope.model = currentReport.data;

        $scope.autoSaving = function () {
            ReportService.saveReport($scope.model);
        }

        $scope.recalculateGrossProfit = function (row) {
            if (!row) {
                return;
            }
            if (!row.second || !row.third) {
                row.fourth = null;
                return;
            }
            row.fourth = row.second - row.third;
        }

    });
