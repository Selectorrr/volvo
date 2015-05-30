'use strict';

angular.module('volvoApp')
    .controller('ReportsController', function ($scope, yearReports, $filter) {
        $scope.year = new Date().getFullYear();
        $scope.$watch('year', function (value) {
            $scope.year = !value ? new Date().getFullYear() : value;
        });
        $scope.reports = mapYears(yearReports);
        function mapYears(yearReports) {
            var result = [];
            _.each(yearReports, function (year, index, list) {
                _.each(year, function (value, key, list) {
                    if (value && (_.has(value, 'plan') || _.has(value, 'fact'))) {
                        var common = {
                            year: year.year,
                            month: $filter('translate')('months.' + key),
                            monthOriginal: key,
                            code: year.code,
                            createdBy: year.createdBy
                        };
                        _.each(['plan', 'fact'], function (type, index, list) {
                            if (_.has(value, type)) {
                                result.push(_.extend({}, common, {
                                    kind: $filter('translate')('kind.' + type),
                                    kindOriginal: type,
                                    status: $filter('translate')('status.' + value[type].status)
                                }))
                            }
                        });
                    }
                });
            });
            return result;
        }
    });
