/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .controller('TabNewCarsController', function ($scope, ReportService, currentReport) {


        $scope.model = currentReport.data;

        $scope.newVolvoRetailTable = [
            getValue($scope.model, 'tabNewCars', 'newVolvoRetailC30'),
            getValue($scope.model, 'tabNewCars', 'newVolvoRetailS40'),
            getValue($scope.model, 'tabNewCars', 'newVolvoRetailV40'),
            getValue($scope.model, 'tabNewCars', 'newVolvoRetailS60'),
            getValue($scope.model, 'tabNewCars', 'newVolvoRetailXc60'),
            getValue($scope.model, 'tabNewCars', 'newVolvoRetailC70'),
            getValue($scope.model, 'tabNewCars', 'newVolvoRetailXc70'),
            getValue($scope.model, 'tabNewCars', 'newVolvoRetailS80'),
            getValue($scope.model, 'tabNewCars', 'newVolvoRetailXc90'),
            getValue($scope.model, 'tabNewCars', 'newVolvoRetailV60'),
            getValue($scope.model, 'tabNewCars', 'newVolvoRetailTotal')
        ];

        $scope.newVolvoFlitTable = [
            getValue($scope.model, 'tabNewCars', 'newVolvoFlitC30'),
            getValue($scope.model, 'tabNewCars', 'newVolvoFlitS40'),
            getValue($scope.model, 'tabNewCars', 'newVolvoFlitV40'),
            getValue($scope.model, 'tabNewCars', 'newVolvoFlitS60'),
            getValue($scope.model, 'tabNewCars', 'newVolvoFlitXc60'),
            getValue($scope.model, 'tabNewCars', 'newVolvoFlitC70'),
            getValue($scope.model, 'tabNewCars', 'newVolvoFlitXc70'),
            getValue($scope.model, 'tabNewCars', 'newVolvoFlitS80'),
            getValue($scope.model, 'tabNewCars', 'newVolvoFlitXc90'),
            getValue($scope.model, 'tabNewCars', 'newVolvoFlitV60'),
            getValue($scope.model, 'tabNewCars', 'newVolvoFlitTotal')
        ];

        function getValue (model, tab, row) {
            if (!model[tab]) {
                model[tab] = {};
            }
            if (!model[tab][row]) {
                model[tab][row] = {};
            }
            return model[tab][row];
        }

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
            var newVolvoTotal = $scope.model.tabNewCars.newVolvoTotal;
            if (!newVolvoTotal) {
                newVolvoTotal = {};
            }
            newVolvoTotal[type] = result;
            return result;
        }

    });
