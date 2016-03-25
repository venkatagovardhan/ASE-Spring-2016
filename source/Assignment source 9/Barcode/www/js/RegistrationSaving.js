/**
 * Created by Venkata Govardhan on 3/24/2016.
 */
var registrationap = angular.module("register",[]);

registrationap.controller("RegistrationController", function($scope,$http, $httpParamSerializerJQLike){

  $scope.SaveRegistration = function(first,last,email,phone,user,pass) {
    console.log("inside login function");
    $http({
      method: 'POST',
      url : 'https://api.mongolab.com/api/1/databases/shanmuk/collections/students?apiKey=m-K-lcaCBR9mm8OtQc0TD0Y0Iq94Y40v',
      data: JSON.stringify({
        FirstName: first,
        LastName: last,
        Emailid: email,
        Phone: phone,
        UserName: user,
        password: pass
      }),
      contentType: "application/json"
    }).success(function() {
      $scope.first = "";
      $scope.last = "";
      $scope.email = "";
      $scope.phone = "";
      $scope.user = "";
      $scope.pass = "";

      $scope.msg ="Registration Done";
    })
  }

});
