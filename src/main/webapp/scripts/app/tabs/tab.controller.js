/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .controller('TabController', function ($scope, ReportService, currentReport) {
        $scope.model = currentReport.data;
        $scope.autoSaving = _.debounce(_.bind(ReportService.saveReport, null, $scope.model), 500);
    });
