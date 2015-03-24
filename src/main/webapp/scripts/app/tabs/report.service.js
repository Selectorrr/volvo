'use strict';

angular.module('volvoApp')
    .factory('ReportService', function ReportService($http) {
        return {
            tabNewCars: function () {
                return $http.get('/api/current-report/tab-new-cars', {});
            },
            saveTabNewCars: function (tab){
                return $http.post('/api/current-report/save-tab-new-cars', {tabNewCars: tab});
            }
        };
    });
