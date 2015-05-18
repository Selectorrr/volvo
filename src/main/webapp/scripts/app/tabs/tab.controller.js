/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .controller('TabController', function ($scope, ReportService, currentReport) {
        $scope.model = currentReport.data;
        $scope.autoSaving = _.debounce(_.bind(ReportService.saveReport, null, $scope.model), 500);

        $scope.selectedMonth = new Date();
        $scope.isPlan = false;

        $scope.changePlan = function () {
            console.log('is plan: ' + $scope.isPlan);
        }

        $scope.changeMonth = function () {
            var month = $scope.selectedMonth.getMonth();
            console.log('selected month: ' + month);
            ReportService.monthReport(month).then(function (report) {
                if (report.data) {
                    $scope.model = report.data;
                } else {
                    console.log('no data :(');
                }
            });
        }

    });
