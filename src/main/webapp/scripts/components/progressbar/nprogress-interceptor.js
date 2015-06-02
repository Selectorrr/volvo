/**
 * Created by SLitvinov on 01.10.2014.
 */
/*global angular:true */
(function () {
    'use strict';
    angular.module('progressbar', [])
        .constant('NProgress', NProgress)
        .factory('progressbarInterceptor', function ($q, NProgress) {
            var changeProgressState = _.throttle(function (isStart) {
                if (isStart) {
                    if (!NProgress.isRendered()) {
                        NProgress.start();
                    }
                } else {
                    if (NProgress.isRendered()) {
                        NProgress.done();
                    }
                }
            }, 500);
            return {
                'request': function (config) {
                    changeProgressState(true);
                    return config;
                },
                'requestError': function (rejection) {
                    changeProgressState(false);
                    return $q.reject(rejection);
                },
                'response': function (response) {
                    changeProgressState(false);
                    return response;
                },
                'responseError': function (rejection) {
                    changeProgressState(false);
                    return $q.reject(rejection);
                }
            };
        })
        .config(function ($httpProvider) {
            $httpProvider.interceptors.push('progressbarInterceptor');
        });
})();