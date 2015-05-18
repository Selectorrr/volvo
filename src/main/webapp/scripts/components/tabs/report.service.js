'use strict';

angular.module('volvoApp')
    .factory('ReportService', function ReportService($http) {
        return {
            currentReport: function () {
                return $http.get('/api/current-report', {});
            },
            monthReport: function (value) {
                return $http.get('/api/month-report', {params: {monthNum: value}});
            },
            saveReport: function (reportToSave) {
                if (new Date(reportToSave.createdDate).getMonth() != new Date().getMonth()) {
                    return;
                }
                return $http.post('/api/save-report', reportToSave);
            }
        };
    });
