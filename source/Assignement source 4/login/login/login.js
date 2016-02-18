(function () {
    "use strict";
    angular.module("myApp")
        .controller("LoginCtrl", LoginCtrl);

    function LoginCtrl($scope, $log, loginSrv, notify) {

        $scope.validateUser = function () {
            loginSrv.validateLogin($scope.username, $scope.password)
                .then(function (data) {
                    if (data.isValidUser) {
                        window.location.href = '/directions.html';
                    }
                    else {
                        $log.error("error handler message");
                    }
                })
        }
    } }());