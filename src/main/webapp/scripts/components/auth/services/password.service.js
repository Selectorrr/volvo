'use strict';

angular.module('volvoApp')
    .factory('Password', function ($resource) {
        return $resource('api/account/change_password', {}, {});
    });
