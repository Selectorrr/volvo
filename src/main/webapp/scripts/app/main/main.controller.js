'use strict';

angular.module('volvoApp')
    .controller('MainController', function ($scope, Principal, ReportService) {
        Principal.identity().then(function (account) {
            $scope.account = account;
            $scope.isAuthenticated = Principal.isAuthenticated;
        });
        $scope.options = ReportService.options;
    });
