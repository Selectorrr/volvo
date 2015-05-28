'use strict';

angular.module('volvoApp')
    .controller('MainController', function ($scope, Principal, ReportService) {
        Principal.identity().then(function (account) {
            $scope.account = account;
            $scope.isAuthenticated = Principal.isAuthenticated;
        });
        $scope.options = ReportService.options;
        $scope.isInRole = Principal.isInRole;

        $scope.changeStatus = function (status) {
            // TODO: fact plan
            ReportService.options.model.status = status;
            ReportService.save({year: new Date().getFullYear(), month: $scope.options.month, kind: 'fact'}, ReportService.options.model);
        }

        $scope.isInAnyStatus = function () {
            return _.contains(arguments, ReportService.options.model.status);
        }
    });
