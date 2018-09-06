/**
 * Filename:
 * Description:
 * Copyright:   Copyright (c) 2013
 * Company:     Shanghai Huateng Software Systems Co., Ltd.
 * @author      Wubin
 * @version     1.0
 * Create at:   2016/4/21
 */
var fourDeliveryAppGuideController = function($scope,$common,dataDeliver,$state,$eventCommunicationChannel) {
    $scope.otherform = {};
    var bdata = window.parent.data;
    var appno = window.parent.appNo;
    var process= window.parent.modelId;// 担保提货提货申请
    queryTaskInfo();//任务信息
    //获取任务信息
    function queryTaskInfo(){
        var data = {
            appno:appno,
            process:process
        };
        $common.get_asyncData("iScfWorkFlowService/findBPbcAppliBaseInfoByAppno",data).then(function (res) {
            var task;
            if (res.errorCode == "SUC") {
                task = res.contextData;
                $scope.taskform = task;
            } else {
                $common.get_tipDialog(res.errorMsg, 'showInform');
            }
        })
    }
        //通过申请编号获得申请相关的信息
    var promise = $common.get_asyncData("bPbcAppliBaseInfoService/findBPbcAppliBaseInfoByKey",{"key":appno});
    promise.then(function(res){
        var data;
        if (res.errorCode =="SUC"){
            data = res.contextData;
            $scope.otherform = data;
            $scope.otherform.debetNo=data.ext1;
            $scope.otherform.conId = data.slaveContno;
            $scope.otherform.gutId = data.custcd;
            $state.go("fourDeliveryDtl");
            /*    var flag={
                    flag:"task"
                };
                $.extend($scope.otherform,flag);
             */
                dataDeliver.setter($scope.otherform);
        }else{
            $common.get_tipDialog(res.errorMsg,'showError');
        }
    });


    //表格--------结束-------------------------
};
