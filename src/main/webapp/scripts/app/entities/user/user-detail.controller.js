'use strict';

angular.module('volvoApp')
    .controller('UserDetailController', function ($scope, $stateParams, User) {
        $scope.user = {};
        $scope.load = function (login) {
            User.get({login: login}, function (result) {
                $scope.user = result;
            });
        };
        $scope.load($stateParams.login);
    });
