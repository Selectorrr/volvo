/* globals $ */
'use strict';

angular.module('volvoApp')
    .directive('myTable', function () {
        return {
            restrict: 'E',
            transclude: true,
            replace: true,
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
            template: '<tr ng-transclude></tr>'
        };
    })
    .directive('myCell', function () {
        return {
            restrict: 'E',
            replace: true,
            compile: function compile(tElement, tAttrs, transclude) {
                if (tAttrs.colspan) {
                    tElement.attr('colspan', tAttrs.colspan);
                }
                var size = tAttrs.size ? tAttrs.size : 2;
                tElement.addClass('col-xs-' + size);
                if (tAttrs.type === 'number' || tAttrs.type === 'ruble') {
                    var myInput =
                        '<my-input type="number" my-disabled="' + (tAttrs.myDisabled ? tAttrs.myDisabled : false) + '" addon="' +
                        (tAttrs.type === 'ruble' ? 'glyphicon-ruble' : '') + '" model="' + tAttrs.field +
                        '" value="' + tAttrs.value + '" on-blur="' + tAttrs.onBlur + '"' +
                        (tAttrs.decimals ? 'decimals=' + tAttrs.decimals : '') + '>' +
                        '</my-input>';
                    tElement.append(myInput);
                }
                if (tAttrs.text) {
                    tElement.append(tAttrs.text);
                }
                return {
                    pre: function preLink(scope, tElement, tAttrs, controllers) {

                    },
                    post: function postLink(scope, tElement, tAttrs, controllers) {
                    }
                }
            },
            template: '<td></td>'
        };
    });
