/**
 * Created by Venkata Govardhan on 3/24/2016.
 */
var loginapp = angular.module("login",[]);
loginapp.controller('LoginController',['$scope','$location','$http', function ($scope, $location,$http) {
  $scope.login = function (username, password) {
    console.log(username);
    var url = "http://localhost:8080/MongoRestServiceExample/restService/user";

    var res = $http.get(url+"?name="+username+"&password="+password);

    res.success(function(result, status, headers, config) {
      if (result.length = 1) {
        userData = result[0];

      } else {
        alert('Please check your credentials.')
      }
    });
    res.error(function(result, status, headers, config) {
      console.log(result);
    });

  }
}])
