'use strict';

angular.module('volvoApp')
    .factory('Activate', function ($resource) {
        return $resource('api/activate', {}, {
            'get': {method: 'GET', params: {}, isArray: false}
        });
    });


