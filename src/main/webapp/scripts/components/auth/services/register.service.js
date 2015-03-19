'use strict';

angular.module('volvoApp')
    .factory('Register', function ($resource) {
        return $resource('api/register', {}, {});
    });


