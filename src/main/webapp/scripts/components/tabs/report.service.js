'use strict';

angular.module('volvoApp')
    .factory('ReportService', function ReportService($resource) {
        var resource = $resource('/api/rest/reports/:year/:month/:kind', {}, {
            'query': {method: 'GET', isArray: true},
            'getList': {
                method: 'GET',
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    return data;
                }
            }
        });
        resource.initState = {};
        return resource;
    });
