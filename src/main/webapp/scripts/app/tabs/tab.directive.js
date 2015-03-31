/* globals $ */
'use strict';

angular.module('volvoApp')
    .directive('myTable', function () {
        return {
            restrict: 'E',
            transclude: true,
            replace: true,
            scope: {
                baseModel: '='
            },
            controller: ['$scope', function ($scope) {
                this.getTableModel = function () {
                    return $scope.baseModel;
                }
            }],
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
                baseModel: '@'
            }
            ,
            controller: ['$scope', function ($scope) {
                this.getRowName = function () {
                    return $scope.baseModel;
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
                cellSize: '@',
                onBlur: '=',
                baseModel: '@',
                text: '@',
                disabled: '=',
                addon: '@',
                value: '@'
            },
            compile: function compile(tElement, tAttrs, transclude) {
                var $td = $(tElement);
                if (tAttrs.colspan) {
                    $td.attr('colspan', tAttrs.colspan);
                }
                var cellSize = tAttrs.cellSize ? tAttrs.cellSize : 2;
                $td.addClass('col-xs-' + cellSize);
                if (tAttrs.type === 'number' || tAttrs.type === 'ruble') {
                    var myInput =
                        '<my-input type="number" disabled="disabled" addon="' +
                            (tAttrs.type === 'ruble' ? 'glyphicon-ruble' : '') + '" model="model" value="'+ tAttrs.value+'" on-blur="onBlur">' +
                            '</my-input>';
                    $td.append(myInput);
                }
                return {
                    pre: function preLink(scope, tElement, tAttrs, controllers) {

                    },
                    post: function postLink(scope, tElement, tAttrs, controllers) {
                        var tableCtrl = controllers[0];
                        var rowCtrl = controllers[1];
                        console.log(tableCtrl.getTableModel() + ' --> row');
                        console.log(tableCtrl.getTableModel()[rowCtrl.getRowName()] + ' --> row');

                        scope.model = tableCtrl.getTableModel()[rowCtrl.getRowName()][scope.baseModel];
                    }
                }
            },
            template: '<td>{{text}}</td>'
        };
    });
