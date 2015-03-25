'use strict';

angular.module('volvoApp')
    .controller('PasswordController', function ($scope, Auth, Principal) {
        Principal.identity().then(function (account) {
            $scope.account = account;
        });

        $scope.success = null;
        $scope.error = null;
        $scope.doNotMatch = null;
        $scope.changePassword = function () {
            if ($scope.password !== $scope.confirmPassword) {
                $scope.doNotMatch = 'ERROR';
            } else {
                $scope.doNotMatch = null;
                var onError = function () {
                    $scope.success = null;
                    $scope.error = 'ERROR';
                };
                Auth.changePassword($scope.password).then(function () {
                    Auth.login({
                        username: $scope.account.login,
                        password: $scope.password
                    }).then(function () {
                        $scope.error = null;
                        $scope.success = 'OK';
                    }).catch(onError);
                }).catch(onError);
            }
        };
    });
