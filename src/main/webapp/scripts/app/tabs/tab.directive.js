/* globals $ */
'use strict';

angular.module('volvoApp')
    .directive('myTable', function () {
        return {
            restrict: 'E',
            transclude: true,
            replace: true,
            scope: {
                model: '=',
                field: '@'
            },
            controller: function ($scope) {
                $scope.model[$scope.field] = $scope.model[$scope.field] || {};
                var cells = [];
                this.getTableModel = function () {
                    return $scope.model[$scope.field];
                };
                this.addCell = function (refreshFunc) {
                    cells.push(refreshFunc);
                };
                this.getField = function () {
                    return $scope.field;
                };
                $scope.$watch('model', function (value) {
                    for (var i = 0; i < cells.length; i++) {
                        cells[i](value);
                    }
                })
            },
            template: '<div class="table-responsive">' +
            '<table class="table table-hover table-bordered table-condensed" ng-transclude>' +
            '</table>' +
            '</div>'
        };
    })
    .directive('myHead', function () {
        return {
            restrict: 'E',
            transclude: true,
            replace: true,
            template: '<thead ng-transclude></thead>'
        };
    })
    .directive('myBody', function () {
        return {
            restrict: 'E',
            transclude: true,
            replace: true,
            template: '<tbody ng-transclude></tbody>'
        };
    })
    .directive('myFoot', function () {
        return {
            restrict: 'E',
            transclude: true,
            replace: true,
            template: '<tfoot ng-transclude></tfoot>'
        };
    })
    .directive('myRow', function () {
        return {
            restrict: 'E',
            transclude: true,
            replace: true,
            require: '^myTable',
            scope: {
                field: '@'
            },
            controller: ['$scope', function ($scope) {
                this.getRowName = function () {
                    return $scope.field;
                }
            }],
            template: '<tr ng-transclude></tr>'
        };
    })
    .directive('myCell', function () {
        return {
            restrict: 'E',
            replace: true,
            require: ['^myTable', '^myRow'],
            scope: {
                type: '@',
                colspan: '@',
                size: '@',
                onBlur: '=',
                field: '@',
                text: '@',
                myDisabled: '=',
                addon: '@',
                value: '@'
            },
            compile: function compile(tElement, tAttrs, transclude) {
                if (tAttrs.colspan) {
                    tElement.attr('colspan', tAttrs.colspan);
                }
                var size = tAttrs.size ? tAttrs.size : 2;
                tElement.addClass('col-xs-' + size);
                if (tAttrs.type === 'number' || tAttrs.type === 'ruble') {
                    var myInput =
                        '<my-input type="number" my-disabled="myDisabled" addon="' +
                        (tAttrs.type === 'ruble' ? 'glyphicon-ruble' : '') + '" model="model.' + tAttrs.field +
                        '" value="' + tAttrs.value + '" on-blur="onBlur"' +
                        (tAttrs.decimals ? 'decimals=' + tAttrs.decimals : '') + '>' +
                        '</my-input>';
                    tElement.append(myInput);
                }
                return {
                    pre: function preLink(scope, tElement, tAttrs, controllers) {

                    },
                    post: function postLink(scope, tElement, tAttrs, controllers) {
                        var tableCtrl = controllers[0];
                        var rowCtrl = controllers[1];
                        tableCtrl.addCell(function (newModel) {
                            scope.model[tAttrs.field] = tableCtrl.getField() && rowCtrl.getRowName() && tAttrs.field && newModel[tableCtrl.getField()] ? newModel[tableCtrl.getField()][rowCtrl.getRowName()][tAttrs.field] : undefined;
                            console.log(newModel);
                        });
                        if (!tableCtrl.getTableModel()[rowCtrl.getRowName()]) {
                            tableCtrl.getTableModel()[rowCtrl.getRowName()] = {};
                        }
                        scope.model = tableCtrl.getTableModel()[rowCtrl.getRowName()];
                        scope.baseModel = tableCtrl.getTableModel();
                    }
                }
            },
            template: '<td>{{text}}</td>'
        };
    });
