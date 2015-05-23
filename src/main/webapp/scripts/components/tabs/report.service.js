'use strict';

angular.module('volvoApp')
    .factory('ReportService', function ReportService($resource) {
        var resource = $resource('/api/rest/reports/:month', {}, {
            'query': {method: 'GET', isArray: true},
            'getList': {
                method: 'GET',
                transformResponse: function (data) {
                    data = angular.fromJson(data);
                    return data;
                }
            }
        });
        resource.options = {
            month: new Date().getMonth() + 1
        };
        return resource;
    });
