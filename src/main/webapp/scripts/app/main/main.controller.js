'use strict';

angular.module('volvoApp')
    .controller('MainController', function ($scope, Principal, ReportService, account, $state) {
        $scope.account = account;
        $scope.isAuthenticated = Principal.isAuthenticated;
        $scope.initState = ReportService.initState;
        $scope.isInRole = Principal.isInRole;
        $scope.state = $state;
        $scope.year = parseInt($state.params.year);
        $scope.$watch('year', _.debounce(function (year) {
            if (year != $state.params.year) {
                $state.go($state.current.name, _.extend($state.params, {year: year}), {reload: true})
            }
        }, 500));
        $scope.getHref = function (options, stateName) {
            return $state.href(stateName || $state.current.name, _.extend({}, ReportService.initState.options, options));
        };

        $scope.changeStatus = function (status) {
            ReportService.initState.report.status = status;
            ReportService.save(ReportService.initState.options,
                ReportService.initState.report);
        };

        $scope.isInAnyStatus = function () {
            return _.contains(arguments, ReportService.initState.report.status);
        };
    });
