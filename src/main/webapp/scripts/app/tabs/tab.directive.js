/* globals $ */
'use strict';

angular.module('volvoApp')
    .directive('myTable', function () {
        return {
            restrict: 'E',
            transclude: true,
            replace: true,
            template:
                '<div class="table-responsive">' +
                    '<table class="table table-hover table-bordered table-condensed" ng-transclude>' +
                    '</table>' +
                '</div>'
        };
    })
    .directive('myRow', function () {
        return {
            restrict: 'E',
            transclude: true,
            replace: true,
            template:
                '<tr ng-transclude></tr>'
        };
    })
    .directive('myCell', function () {
        return {
            restrict: 'E',
            replace: true,
            scope: {
                type: '@',
                colspan: '@',
                cellClass: '@',
                onBlur: '=',
                model: '=',
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
                if (tAttrs.cellClass) {
                    $td.addClass(tAttrs.cellClass);
                }
                if (tAttrs.type === 'number') {
                    var myInput =
                        '<my-input type="number" disabled="disabled" addon="' + tAttrs.addon + '" model="model" value="value" on-blur="onBlur()">' +
                        '</my-input>';
                    $td.append(myInput);
                }
            },
            template:
                '<td>{{text}}</td>'
        };
    });
