var app = angular.module("myApp", [])


app.controller("RegisterController", function ($scope, $http, $httpParamSerializerJQLike) {

    $scope.pageClass = 'register';
$scope.register = function(username, password, email) {
   console.log("inside login function");
$http({
    method: 'POST',
    url : 'https://api.mongolab.com/api/1/databases/locatorvg/collections/studentnames?apiKey=wWuT-RIV5d_AMlwUqRzLNlLy-WbhTcCE',
    data: JSON.stringify({
                name: username,
                password: password,
                email: email
            }),
    contentType: "application/json"
}).success(function() {
    $scope.user.first ="";
    $scope.user.last ="";
    $scope.password ="";
    $scope.email ="";
    
    $scope.msg ="User created successfully";
        })
}
    
});  