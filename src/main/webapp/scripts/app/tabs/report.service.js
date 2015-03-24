'use strict';

angular.module('volvoApp')
    .factory('ReportService', function ReportService($http) {
        return {
            currentReport: function () {
                return $http.get('/api/current-report', {});
            },
            saveReport: function (reportToSave){
                return $http.post('/api/save-report', reportToSave);
            }
        };
    });
