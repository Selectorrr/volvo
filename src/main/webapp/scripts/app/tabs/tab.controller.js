/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .controller('TabController', function ($scope, ReportService, currentReport, $timeout) {

        $scope.model = currentReport.data;

        var timeout = null;

        $scope.autoSaving = function () {
            if (timeout) {
                $timeout.cancel(timeout);
            }
            timeout = $timeout(function () {
                ReportService.saveReport($scope.model)
            }, 500);
        }

    });
