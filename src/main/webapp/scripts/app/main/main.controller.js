'use strict';

angular.module('volvoApp')
    .controller('MainController', function ($scope, Principal, $stateParams) {
        $scope.month = $stateParams.month;
        Principal.identity().then(function (account) {
            $scope.account = account;
            $scope.isAuthenticated = Principal.isAuthenticated;
        });
        console.log($stateParams);
    });
