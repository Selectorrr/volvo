/**
 * Created by Selector on 22.03.2015.
 */
'use strict';

angular.module('volvoApp')
    .controller('TabNewCarsController', function ($scope, ReportService, currentReport) {

        $scope.model = currentReport.data;

        $scope.autoSavingAndCalculations = function () {
            recalculate();
            ReportService.saveReport($scope.model);
        }

        function recalculate () {
            if (!$scope.model.tabNewCars){
                return;
            }
            recalculateNewVolvoRetail();
            recalculateNewVolvoFlit();
            recalculateNewVolvoTotal();
        }

        function recalculateGrossProfitForData (data) {
            if (!data) {
                data = {};
            }
            data.fourth = recalculateGrossProfit(data);
            return data;
        }

        function recalculateGrossProfit (data) {
            if (!data || !data.second || !data.third){
                return;
            }
            return parseInt(data.second) - parseInt(data.third);
        }

        <!-- recalculateNewVolvoRetail -->

        function recalculateNewVolvoRetail () {
            $scope.model.tabNewCars.newVolvoRetailC30 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoRetailC30);
            $scope.model.tabNewCars.newVolvoRetailS40 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoRetailS40);
            $scope.model.tabNewCars.newVolvoRetailV40 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoRetailV40);
            $scope.model.tabNewCars.newVolvoRetailS60 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoRetailS60);
            $scope.model.tabNewCars.newVolvoRetailXc60 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoRetailXc60);
            $scope.model.tabNewCars.newVolvoRetailC70 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoRetailC70);
            $scope.model.tabNewCars.newVolvoRetailXc70 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoRetailXc70);
            $scope.model.tabNewCars.newVolvoRetailS80 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoRetailS80);
            $scope.model.tabNewCars.newVolvoRetailXc90 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoRetailXc90);
            $scope.model.tabNewCars.newVolvoRetailV60 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoRetailV60);

            recalculateNewVolvoRetailTotal();
            $scope.model.tabNewCars.newVolvoRetailTotal = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoRetailTotal);
        }

        function recalculateNewVolvoRetailTotal () {
            $scope.model.tabNewCars.newVolvoRetailTotal = {
                first: recalculateNewVolvoRetailTotalByType('first'),
                second: recalculateNewVolvoRetailTotalByType('second'),
                third: recalculateNewVolvoRetailTotalByType('third'),
                fourth: recalculateNewVolvoRetailTotalByType('fourth')
            }
        }

        function recalculateNewVolvoRetailTotalByType (type) {
            var result = 0;
            if ($scope.model.tabNewCars.newVolvoRetailC30[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoRetailC30[type]);
            }
            if ($scope.model.tabNewCars.newVolvoRetailS40[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoRetailS40[type]);
            }
            if ($scope.model.tabNewCars.newVolvoRetailV40[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoRetailV40[type]);
            }
            if ($scope.model.tabNewCars.newVolvoRetailS60[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoRetailS60[type]);
            }
            if ($scope.model.tabNewCars.newVolvoRetailXc60[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoRetailXc60[type]);
            }
            if ($scope.model.tabNewCars.newVolvoRetailC70[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoRetailC70[type]);
            }
            if ($scope.model.tabNewCars.newVolvoRetailXc70[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoRetailXc70[type]);
            }
            if ($scope.model.tabNewCars.newVolvoRetailS80[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoRetailS80[type]);
            }
            if ($scope.model.tabNewCars.newVolvoRetailXc90[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoRetailXc90[type]);
            }
            if ($scope.model.tabNewCars.newVolvoRetailV60[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoRetailV60[type]);
            }
            return result;
        }

        <!-- recalculateNewVolvoFlit -->

        function recalculateNewVolvoFlit () {
            $scope.model.tabNewCars.newVolvoFlitC30 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoFlitC30);
            $scope.model.tabNewCars.newVolvoFlitS40 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoFlitS40);
            $scope.model.tabNewCars.newVolvoFlitV40 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoFlitV40);
            $scope.model.tabNewCars.newVolvoFlitS60 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoFlitS60);
            $scope.model.tabNewCars.newVolvoFlitXc60 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoFlitXc60);
            $scope.model.tabNewCars.newVolvoFlitC70 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoFlitC70);
            $scope.model.tabNewCars.newVolvoFlitXc70 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoFlitXc70);
            $scope.model.tabNewCars.newVolvoFlitS80 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoFlitS80);
            $scope.model.tabNewCars.newVolvoFlitXc90 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoFlitXc90);
            $scope.model.tabNewCars.newVolvoFlitV60 = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoFlitV60);

            recalculateNewVolvoFlitTotal();
            $scope.model.tabNewCars.newVolvoFlitTotal = recalculateGrossProfitForData($scope.model.tabNewCars.newVolvoFlitTotal);
        }

        function recalculateNewVolvoFlitTotal () {
            $scope.model.tabNewCars.newVolvoFlitTotal = {
                first: recalculateNewVolvoFlitTotalByType('first'),
                second: recalculateNewVolvoFlitTotalByType('second'),
                third: recalculateNewVolvoFlitTotalByType('third'),
                fourth: recalculateNewVolvoFlitTotalByType('fourth')
            }
        }

        function recalculateNewVolvoFlitTotalByType (type) {
            var result = 0;
            if ($scope.model.tabNewCars.newVolvoFlitC30[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoFlitC30[type]);
            }
            if ($scope.model.tabNewCars.newVolvoFlitS40[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoFlitS40[type]);
            }
            if ($scope.model.tabNewCars.newVolvoFlitV40[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoFlitV40[type]);
            }
            if ($scope.model.tabNewCars.newVolvoFlitS60[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoFlitS60[type]);
            }
            if ($scope.model.tabNewCars.newVolvoFlitXc60[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoFlitXc60[type]);
            }
            if ($scope.model.tabNewCars.newVolvoFlitC70[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoFlitC70[type]);
            }
            if ($scope.model.tabNewCars.newVolvoFlitXc70[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoFlitXc70[type]);
            }
            if ($scope.model.tabNewCars.newVolvoFlitS80[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoFlitS80[type]);
            }
            if ($scope.model.tabNewCars.newVolvoFlitXc90[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoFlitXc90[type]);
            }
            if ($scope.model.tabNewCars.newVolvoFlitV60[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoFlitV60[type]);
            }
            return result;
        }

        <!-- recalculateNewVolvoTotal -->

        function recalculateNewVolvoTotal () {
            if (!$scope.model.tabNewCars.newVolvoTotal) {
                $scope.model.tabNewCars.newVolvoTotal = {};
            }
            $scope.model.tabNewCars.newVolvoTotal.first = recalculateNewVolvoTotalByType('first');
            $scope.model.tabNewCars.newVolvoTotal.second = recalculateNewVolvoTotalByType('second');
            $scope.model.tabNewCars.newVolvoTotal.third = recalculateNewVolvoTotalByType('third');
            $scope.model.tabNewCars.newVolvoTotal.fourth = recalculateNewVolvoTotalByType('fourth');
        }

        function recalculateNewVolvoTotalByType (type) {
            var result = 0;
            if ($scope.model.tabNewCars.newVolvoRetailTotal[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoRetailTotal[type]);
            }
            if ($scope.model.tabNewCars.newVolvoFlitTotal[type]) {
                result += parseInt($scope.model.tabNewCars.newVolvoFlitTotal[type]);
            }
            return result;
        }

    });
