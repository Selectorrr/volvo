'use strict';

angular.module('volvoApp')
    .controller('NavbarController', function ($scope, $location, $state, Auth, Principal) {
        $scope.isAuthenticated = Principal.isAuthenticated;
        $scope.isInRole = Principal.isInRole;
        $scope.$state = $state;
        $scope.params = {
            year: new Date().getFullYear(),
            month: new Date().toLocaleString("en-us", {month: "long"}).toLowerCase(),
            kind: 'fact'
        };
        $scope.logout = function () {
            Auth.logout();
            $state.go('login');
        };
    });
