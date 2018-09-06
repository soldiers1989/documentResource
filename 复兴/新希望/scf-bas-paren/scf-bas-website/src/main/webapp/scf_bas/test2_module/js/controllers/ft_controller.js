/**
 * Filename:
 * Description:
 * Copyright:   Copyright (c) 2013
 * Company:     Shanghai Huateng Software Systems Co., Ltd.
 * @author      Wubin
 * @version     1.0
 * Create at:   2016/4/21
 */
var ftController = function($scope,$common,dataDeliver,$eventCommunicationChannel) {
    console.log("userInfo信息："+JSON.stringify(userInfo));//用户信息，全局变量
    $scope.conditionForm={};//初始化查询条件对象
    $scope.datasource={//初始化表格对象
        ds: []
    };
    $scope.selected={//初始化对象
        select: []
    };
    $scope.conf= {//初始化分页对象
        pageNo: 1,
        pageSize: 10,
        totalRecord: 0}
    //监听分页
    $scope.$watch("conf.pageNo+conf.pageSize",$scope.queryTable)

    //搜索
    $scope.submit_onClick =function(){
        $scope.queryTable();
        //$scope.selected.select=[];
    }
    $scope.queryTable = function(paramData){
        var data= {
            pageNo: 1,
            pageSize: 10,
            otherform:paramData
        };
        var promise = $common.get_asyncData("orgUserService/findOrgUserByPage2",data);
        promise.then(function(res){
            var data;
            if (res.errorCode =="SUC"){
                data = res.contextData;
                $scope.datasource.ds = data.records;
                $scope.conf.totalRecord = data.totalRecord;
            }else{
                $common.get_tipDialog(res.errorMsg,'showError');
            }
        });
    };
    $scope.add_onClick = function(){
        $common.get_ngDialog('ft/ftDialog.html', $scope
            ,["$scope",function(dialogScope){
                ftDialogController(dialogScope,$scope,$common,"add");
            }],"新增成功",{showClose:false});
    };
    $scope.update_onClick = function(){
        if($scope.selected.select.length <= 0){
            $common.get_tipDialog('请至少选择一条记录！','showInform');
        }else{
            $common.get_ngDialog('ft/ftDialog.html',$scope
                ,["$scope",function(dialogScope){
                    ftDialogController(dialogScope,$scope,$common,"update");
                }],"修改操作");
        };
    };
    $scope.delete_onClick = function(){
        if($scope.selected.select.length <= 0){
            $common.get_tipDialog('请至少选择一条记录！','showInform');
        }else{
            $common.get_tipDialog('确定删除吗！','showTip').then(function(){
                var primise = $common.get_asyncData('orgUserService/findOrgUserByPage2',{key:$scope.selected.select[0].id})
                primise.then(function(res){
                    if (res.errorCode =="SUC"){
                        $scope.queryTable();
                        $scope.selected.select=[];
                        $common.get_tipDialog('删除成功！','showSuccess');
                    }else{
                        $common.get_tipDialog(res.errorMsg,'showError');
                    }
                })
            })
        }
    }
    $scope.fresh_onClick = function(){
        $scope.queryTable();
        $scope.selected.select=[];
    }
    $scope.column = function(row){
        console.log(JSON.stringify(row))
    }
    //表格--------结束-------------------------
    console.log("userInfo信息");
};
