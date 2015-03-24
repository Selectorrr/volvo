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
        }

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

    });
