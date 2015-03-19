'use strict';

angular.module('volvoApp')
    .controller('LogoutController', function (Auth) {
        Auth.logout();
    });
