'use strict';

angular.module('volvoApp')
    .controller('UserController', function ($scope, User, $filter, $translate, $timeout, Auth) {
        $scope.users = [];
        $scope.loadAll = function () {
            User.query(function (result) {
                $scope.users = $filter('filter')(result, function (value, index) {
                    return ['system', 'anonymousUser', 'admin'].indexOf(value.login) === -1;
                });
            });
        };
        $scope.loadAll();

        function clearErrors() {
            if ($scope.form) {
                $scope.form.$setPristine();
            }
            $scope.doNotMatch = null;
            $scope.error = null;
            $scope.errorUserExists = null;
            $scope.errorEmailExists = null;
        }

        $scope.update = function (login) {
            clearErrors();
            $scope.isCreate = false;
            User.get({login: login}, function (result) {
                $scope.user = result;
                $scope.confirmPassword = null;
                $('#saveUserModal').modal('show');
            });
        };

        // TODO: messages
        $scope.userRoles = [
            {name: 'ROLE_DEALER',
                title: 'Дилер'},
            {name: 'ROLE_REPRESENTATIVE',
                title: 'Представитель'}
        ];

        $scope.delete = function (login) {
            User.get({login: login}, function (result) {
                $scope.user = result;
                $('#deleteUserConfirmation').modal('show');
            });
        };

        $scope.confirmDelete = function (login) {
            User.delete({login: login},
                function () {
                    $scope.loadAll();
                    $('#deleteUserConfirmation').modal('hide');
                    $scope.clear();
                });
        };

        $scope.clear = function () {
            $scope.isCreate = true;
            $scope.user = {login: null, password: null, id: null, roles: []};
        };

        clearErrors();

        $timeout(function () {
            angular.element('[ng-model="user.login"]').focus();
        });

        $scope.register = function () {
            if ($scope.user.password !== $scope.confirmPassword) {
                $scope.doNotMatch = 'ERROR';
            } else {
                $scope.user.langKey = $translate.use();
                clearErrors();
                Auth.createAccount($scope.user).then(function () {
                    $scope.loadAll();
                    $('#saveUserModal').modal('hide');
                    $scope.clear();
                }).catch(function (response) {
                    //$scope.success = null;
                    if (response.status === 400 && response.data === 'login already in use') {
                        $scope.errorUserExists = 'ERROR';
                    } else if (response.status === 400 && response.data === 'e-mail address already in use') {
                        $scope.errorEmailExists = 'ERROR';
                    } else {
                        $scope.error = 'ERROR';
                    }
                });
            }
        };
    });
