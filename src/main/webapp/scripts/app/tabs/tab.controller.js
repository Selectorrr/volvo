/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .controller('TabController', function ($scope, ReportService, report, $timeout) {
        $scope.model = report;
        ReportService.options.model = report;
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
                // TODO: fact + plan
                ReportService.save({year: new Date().getFullYear(), month: $scope.options.month, kind: 'fact'}, $scope.model);
            }, 500);
        };

        $scope.selectedMonth = new Date();

        function changeMonth(month) {
            // TODO: fact + plan
            ReportService.get({year: new Date().getFullYear(), month: month, kind: 'fact'}).$promise.then(function (report) {
                ReportService.options.model = report;
                $scope.model = report;
            });
        }

    });
