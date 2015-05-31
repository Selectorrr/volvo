/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .controller('TabController', function ($scope, ReportService, $timeout, initState, Principal) {
        $scope.model = initState.report;
        _.extend(ReportService.initState, initState);
        var timeout = null;
        $scope.editDisable = !(Principal.isInRole('ROLE_DEALER') && $scope.model.status === 'STATUS_DRAFT');
        $scope.autoSaving = function () {
            if (timeout) {
                $timeout.cancel(timeout);
            }
            timeout = $timeout(function () {
                // TODO: fact + plan
                ReportService.save(initState.options, $scope.model);
            }, 500);
        };
        $scope.$watch('model', $scope.autoSaving, true);
    });
