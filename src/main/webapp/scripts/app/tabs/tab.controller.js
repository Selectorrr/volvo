/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .controller('TabController', function ($scope, ReportService, report, $timeout) {
        $scope.model = report;
        var timeout = null;
        $scope.options = ReportService.options;
        $scope.$watch('options.month', function (month) {
            changeMonth(month);
        });
        $scope.autoSaving = function () {
            if (timeout) {
                $timeout.cancel(timeout);
            }
            timeout = $timeout(function () {
                ReportService.save({year: new Date().getFullYear(), month: $scope.options.month}, $scope.model)
            }, 500);
        };

        $scope.selectedMonth = new Date();

        function changeMonth(month) {
            ReportService.get({year: new Date().getFullYear(), month: month}).$promise.then(function (report) {
                $scope.model = report;
            });
        }

    });
