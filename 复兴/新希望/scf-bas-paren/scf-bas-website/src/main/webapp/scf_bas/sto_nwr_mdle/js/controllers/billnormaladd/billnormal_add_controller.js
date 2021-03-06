/**
 * @author 	mengjiajia
 * @version 1.0
 * @Copyright Shanghai Huateng Software Systems Co., Ltd.
 * Create at:   2016/12/26
 */
var billNormalAddController = function($scope,$common,dataDeliver,$state,$eventCommunicationChannel) {
    $scope.baseinfo = dataDeliver.getter();
    $scope.source = {};
    $scope.source.baseinfo = $scope.baseinfo;
    var appno;
    $scope.datasource={//初始化表格对象
        ds:[]
    };
    $scope.selected={//初始化对象
        select: []
    };
    $scope.conf= {//初始化分页对象
        pageNo: 1,
        pageSize: 10,
        totalRecord: 0};
    //监听分页
    $scope.$watch("conf.pageNo",function(){
        $scope.queryTaskForm();
    });
    //获取任务信息
    $scope.queryTaskForm = function(paramData)
    {
        $common.get_asyncData("billNormalAddService/findRBcpAppliBussInfoByAppno", {appno:appno}).then(function (res) {
            var data;
            if (res.errorCode == "SUC") {
                data = res.contextData;
                $scope.taskform = data;
                if(!data.piid)
                {
                    $scope.source.taskform = {};
                    $state.go("billnormaladd.apply");
                    window.source = $scope.source;
                    window.Write = false;
                }
                else
                {
                    $common.get_asyncData("processService/getCurrentNodeEntity", {pid:data.piid}).then(function (res) {
                        var taskform;
                        if (res.errorCode == "SUC") {
                            taskform = res.contextData;
                            $scope.source.taskform = taskform;
                            $state.go("billnormaladd.apply");
                            window.source = $scope.source;
                            if(taskform.id == "Write")
                            {//普通仓单追加填写岗
                                window.Write = false;
                            }
                            else if(taskform.id == "Check")
                            {//普通仓单追加核价岗
                                window.Check = false;
                                window.BackToModify = false;
                            }
                            else if(taskform.id == "Review")
                            {//普通仓单追加审核
                                window.Review = false;
                                window.BackToModify = false;
                            }
                            else if(taskform.id == "Receipt")
                            {//普通仓单追加监管商回执
                                window.Receipt = false;
                                window.BackToModify = false;
                            }
                        } else {
                            $common.get_tipDialog(res.errorMsg, 'showInform');
                        }
                    })
                }
            } else {
                $common.get_tipDialog(res.errorMsg, 'showInform');
            }
        })
    };
    $scope.back_onClick = function(){
        $state.go("list");
    };
    //表格--------结束-------------------------
};
