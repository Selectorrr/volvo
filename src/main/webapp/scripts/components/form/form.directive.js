/* globals $ */
'use strict';

angular.module('volvoApp')
    .directive('showValidation', function () {
        return {
            restrict: 'A',
            require: 'form',
            link: function (scope, element) {
                element.find('.form-group').each(function () {
                    var $formGroup = $(this);
                    var $inputs = $formGroup.find('input[ng-model],textarea[ng-model],select[ng-model]');

                    if ($inputs.length > 0) {
                        $inputs.each(function () {
                            var $input = $(this);
                            scope.$watch(function () {
                                return $input.hasClass('ng-invalid') && $input.hasClass('ng-dirty');
                            }, function (isInvalid) {
                                $formGroup.toggleClass('has-error', isInvalid);
                            });
                        });
                    }
                });
            }
        };
    })
    .directive('myCheckbox',function () {
        return {
            restrict: 'E',
            scope: {
                type: '@',
                label: '@',
                model: '='
            },
            link: function (scope, element, attrs) {
            },
            template: '<div class="checkbox">' +
                '<label><input type="checkbox"' +
                'ng-model="model">' +
                '{{label}}</label>' +
                '</div>'
        };
    }).directive('myInput',function () {
        return {
            restrict: 'E',
            replace: true,
            scope: {
                type: '@',
                label: '@',
                decimals: '@',
                model: '=',
                required: '=',
                validation: '=',
                name: '@',
                mask: '@',
                placeholder: '@',
                pattern: '@',
                myDisabled: '=',
                addon: '=',
                onBlur: '=',
                value: '@'
            },
            compile: function compile(tElement, tAttrs, transclude) {
                var $input = $(tElement).find('input');
                $input.attr('name', tAttrs.name);
                $input.attr('id', tAttrs.name);
                if (tAttrs.placeholder) {
                    $input.attr('placeholder', tAttrs.placeholder);
                }
                if (tAttrs.pattern) {
                    $input.attr('ng-pattern', tAttrs.pattern);
                }
                if (tAttrs.type === "number") {
                    $input.attr('number-format', true);
                    if (tAttrs.decimals) {
                        $input.attr('decimals', tAttrs.decimals);
                    }

                }
                if (tAttrs.addon) {
                    $input.parent().find('span').attr('class', 'input-group-addon ' + tAttrs.addon);
                }

                return {
                    pre: function preLink(scope, tElement, tAttrs, controllers) {

                    },
                    post: function postLink($scope, tElement, tAttrs, controllers) {
                        if (angular.isFunction($scope.onBlur)) {
                            $scope.$watch('model', $scope.onBlur);
                        }
                    }
                }
            },
            template: '<div class="input-group input-group-sm">' +
            '<input value="value" class="form-control text-right" aria-describedby="sizing-addon3" ng-model="model" ng-required=required ng-disabled="myDisabled">' +
                '<span></span>' +
                '</div>'
        };
    }).directive('mySelect',function () {
        return {
            restrict: 'E',
            transclude: true,
            scope: {
                label: '@',
                model: '=',
                required: '=',
                validation: '=',
                name: '@'
            },
            compile: function compile(tElement, tAttrs, transclude) {
                var $input = $(tElement).find('select');
                $input.attr('name', tAttrs.name);
                $input.attr('id', tAttrs.name);
            },
            controller: function ($scope, $element, $attrs) {
                $scope.$watch('required', function (value) {
                    if (value && value.length !== 0) {
                        var v = (function (string) {
                            return typeof string == 'string' ? string.toLowerCase() : string;
                        })("" + value);
                        value = !(v == 'f' || v == '0' || v == 'false' || v == 'no' || v == 'n' || v == '[]');
                    } else {
                        value = false;
                    }
                    $scope.requiredBoolean = value;
                });
            },
            template: '<div class="form-group" ng-class="{\'has-error\':validation(name)}">'
                + '<label>{{label}}</label>'
                + '<select class="form-control" ng-model="model" ng-required=requiredBoolean ng-transclude>'
                + '</select>'
                + '<span class="help-inline text-danger" ng-show="validation(name)">{{validation(name)}}</span>'
                + '</div>'
        };
    }).directive('myYesNo',function () {
        return {
            restrict: 'E',
            scope: {
                label: '@',
                model: '=',
                required: '=',
                validation: '=',
                name: '@'
            },
            compile: function compile(tElement, tAttrs, transclude) {
                var $input = $(tElement).find('input[type=hidden]');
                $input.attr('name', tAttrs.name);
                $input.attr('id', tAttrs.name);
            },
            template: '<div class="form-group" ng-class="{\'has-error\':validation(name)}"><label >{{label}}</label><br/>' +
                '<input type="hidden"  ng-model="model" ng-required=required>' +
                '<div class="btn-group yesNo" data-toggle="buttons">' +
                '<label class="btn btn-default" ng-class="{\'active\': model === true}" ng-click="model = true">' +
                '<input type="radio" name="options" id="yes" autocomplete="off" ng-checked="model === true"> Да' +
                '</label>' +
                '<label class="btn btn-default" ng-class="{\'active\': model === false}" ng-click="model = false">' +
                '<input type="radio" name="options" id="no" autocomplete="off" ng-checked="model === false"> Нет' +
                '</label>' +
                '</div>' +
                '<div class="help-inline text-danger" ng-show="validation(name)">{{validation(name)}}</div>' +
                '</div>'
        };
    }).directive('numberFormat', ['$filter', function ($filter) {
        return {
            require: 'ngModel',
            compile: function compile(tElement, tAttrs, transclude) {

                return {
                    pre: function preLink(scope, tElement, tAttrs, controllers) {

                    },
                    post: function postLink($scope, element, attrs, ngModelController) {
                        var decimals = attrs.decimals;

                        ngModelController.$parsers.push(function (data) {
                            var newData = data.replace(/,/g, '.');
                            var value = parseFloat(newData);
                            return isNaN(value) ? 0 : value;
                        });

                        function filterNumber(data) {
                            return $filter('number')(data, decimals);
                        }

                        ngModelController.$formatters.push(filterNumber);

                        element.bind('focus', function () {
                            ngModelController.$viewValue = ngModelController.$modelValue;
                            ngModelController.$render();
                        });

                        element.bind('blur', function () {
                            ngModelController.$viewValue = filterNumber(ngModelController.$modelValue);
                            ngModelController.$render();
                        });
                    }
                }

            }
        }
    }]).directive('numberOnly', function () {
        return {
            require: 'ngModel',
            link: function (scope, element, attrs, modelCtrl) {
                modelCtrl.$parsers.push(function (inputValue) {
                    var transformedInput = parseFloat(!inputValue.toString() ? 0 : inputValue.toString().replace(/\D/g, ''));
                    if (!isNaN(transformedInput) && transformedInput != inputValue) {
                        modelCtrl.$setViewValue(transformedInput);
                        modelCtrl.$render();
                    }
                    return transformedInput;
                });
            }
        };
    });
