var conInfoTabController  = function($scope,$timeout,$common,$state,dataDeliver) {

    $state.go("conInfo.conTab1");//跳转
    var obj = angular.fromJson(dataDeliver.getter());
    $scope.tabClose_onClick = function(){
        $state.go("bcntdebtList");
    };
};