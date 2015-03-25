'use strict';

angular.module('volvoApp')
    .controller('LoginController', function ($rootScope, $scope, $state, $timeout, Auth, Principal) {
        $scope.user = {};
        $scope.errors = {};

        $scope.rememberMe = true;
        $timeout(function () {
            angular.element('[ng-model="username"]').focus();
        });
        $scope.login = function () {
            var onError = function () {
                $scope.authenticationError = true;
            };
            Auth.login({
                username: $scope.username,
                password: $scope.password,
                rememberMe: $scope.rememberMe
            }).then(function () {
                $scope.authenticationError = false;
                Principal.identity()
                    .then(function () {
                        if ($rootScope.previousStateName &&
                            Principal.isInAnyRole($state.get($rootScope.previousStateName).data.roles)) {
                            $rootScope.back();
                        } else {
                            var toPages = ['tabNewCars', 'user'];
                            for (var i = 0; i < toPages.length; i++) {
                                var page = toPages[i];
                                if (Principal.isInAnyRole($state.get(page).data.roles)) {
                                    $state.go(page);
                                    return;
                                }
                            }
                        }
                    }).catch(onError);
            }).catch(onError);
        };
    });
