/**
 * Created by Selector on 31.05.2015.
 */
'use strict';

angular.module('volvoApp')
    .factory('TabService', function TabService(ReportService, $q) {
        return {
            getInitState: function ($stateParams) {
                var deferred = $q.defer();
                var options = {
                    year: $stateParams.year || new Date().getFullYear(),
                    month: $stateParams.month || new Date().toLocaleString("en-us", {month: "long"}).toLowerCase(),
                    kind: $stateParams.kind || 'fact',
                    createdBy: $stateParams.createdBy
                };
                ReportService.get(options).$promise.then(function (result) {
                    deferred.resolve({
                        options: options,
                        report: result
                    })
                });
                return deferred.promise;
            }
        }
    });
