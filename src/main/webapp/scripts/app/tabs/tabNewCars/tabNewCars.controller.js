/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .controller('TabNewCarsController', function ($scope, ReportService, currentReport) {


        $scope.model = currentReport.data;

        $scope.newVolvoRetailTable = [
            $scope.model.tabNewCars.newVolvoRetailC30,
            $scope.model.tabNewCars.newVolvoRetailS40,
            $scope.model.tabNewCars.newVolvoRetailV40,
            $scope.model.tabNewCars.newVolvoRetailS60,
            $scope.model.tabNewCars.newVolvoRetailXc60,
            $scope.model.tabNewCars.newVolvoRetailC70,
            $scope.model.tabNewCars.newVolvoRetailXc70,
            $scope.model.tabNewCars.newVolvoRetailS80,
            $scope.model.tabNewCars.newVolvoRetailXc90,
            $scope.model.tabNewCars.newVolvoRetailV60,
            $scope.model.tabNewCars.newVolvoRetailTotal
        ];

        $scope.newVolvoFlitTable = [
            $scope.model.tabNewCars.newVolvoFlitC30,
            $scope.model.tabNewCars.newVolvoFlitS40,
            $scope.model.tabNewCars.newVolvoFlitV40,
            $scope.model.tabNewCars.newVolvoFlitS60,
            $scope.model.tabNewCars.newVolvoFlitXc60,
            $scope.model.tabNewCars.newVolvoFlitC70,
            $scope.model.tabNewCars.newVolvoFlitXc70,
            $scope.model.tabNewCars.newVolvoFlitS80,
            $scope.model.tabNewCars.newVolvoFlitXc90,
            $scope.model.tabNewCars.newVolvoFlitV60,
            $scope.model.tabNewCars.newVolvoFlitTotal
        ];

        $scope.autoSaving = function () {
            ReportService.saveReport($scope.model);
        }

        $scope.recalculateGrossProfit = function (row) {
            if (!row) {
                return;
            }
            if (!row.second || !row.third) {
                row.fourth = null;
                return;
            }
            row.fourth = row.second - row.third;
        }

        $scope.recalculateNewVolvoRetailTotalByType = function (type) {
            return recalculateNewVolvoTotalByType($scope.newVolvoRetailTable, type);
        }

        $scope.recalculateNewVolvoFlitTotalByType = function (type) {
            return recalculateNewVolvoTotalByType($scope.newVolvoFlitTable, type);
        }

        function recalculateNewVolvoTotalByType (table, type) {
            var result = 0;
            for (var i = 0; i < table.length - 1; i++) {
                var row = table[i];
                if (row && row[type]) {
                    result += row[type];
                }
            }
            table[table.length - 1][type] = result;
            return result;
        }

        $scope.recalculateNewVolvoTotalByType = function (type) {
            var result = 0;
            var retail = $scope.newVolvoRetailTable[$scope.newVolvoRetailTable.length - 1];
            if (retail && retail[type]) {
                result += retail[type];
            }
            var flit = $scope.newVolvoFlitTable[$scope.newVolvoFlitTable.length - 1];
            if (flit && flit[type]) {
                result += flit[type];
            }
            $scope.model.tabNewCars.newVolvoTotal[type] = result;
            return result;
        }

    });
