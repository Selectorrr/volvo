'use strict';

angular.module('volvoApp')
    .controller('LogoutController', function (Auth,$state) {
        Auth.logout();
        $state.go('login');
    });
