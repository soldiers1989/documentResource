/**
 * Filename:
 * Description:
 * Copyright:   Copyright (c) 2013
 * Company:     Shanghai Huateng Software Systems Co., Ltd.
 * @author      shangxiujuan
 * @version     1.0
 * Create at:   2016/11/01
 */
var nrecBcpPressEditController = function($scope,$common,$state,dataDeliver,$eventCommunicationChannel) {
    $scope.otherform = dataDeliver.getter();

    var debtList = [];//应收账款总列表

    $scope.taskform = {};//任务基本信息
    $scope.taskdes = {};//代办任务节点信息
    var taskId = $scope.otherform.taskId;
    var flag = $scope.otherform.flag;
    var flag3;
    if(flag)
    {
        if(flag=="add")
        {
            $scope.disableButton = true; //提交按钮只读
            flag3 = "2";
        }
        if(flag=="update")
        {

        }
        if(flag=="view")
        {
            $scope.viewhide = true;
            $scope.viewdisable = true;
        }
    }
    else
    {
        $scope.viewhide = true;
        $scope.viewdisable = true;
        $scope.hideback = true;
    }

    //应收账款基本信息
    $scope.datasource = {//初始化表格对象
        ds: []
    };
    $scope.selected = {//初始化对象
        select: []
    };
    $scope.conf = {//初始化分页对象
        pageNo: 1,
        pageSize: 10,
        totalRecord: 0
    };
    var count = 0;
    //监听分页
    $scope.$watch("conf.pageNo+conf.pageSize",function() {
        if(count==0)
        {
            $scope.queryBaseInfo();
        }
        else
        {
            $scope.getListByPage();
        }
        count++;
    });

    $scope.$watch("otherform.appno",function() {
        if(count!=0)
        {
            $scope.queryDebtAppliList();
        }
    });
    //应收账款列表
    $scope.queryBaseInfo = function(paramData)
    {
        $common.get_asyncData("ndebtPressApplyService/DisputeInvoiceSetApplyAddGetter", {debtBussInfoVO:$scope.otherform}).then(function (res) {
            var data;
            if (res.errorCode == "SUC") {
                data = res.contextData;
                $scope.otherform = data[0];
                var appno = $scope.otherform.appno;
                if(appno==null||appno==""||appno==undefined)
                {
                    $scope.otherform.totalNum = 0;//催收总份数
                    $scope.otherform.totalAmount = "0.00";//催收总金额
                }
                var dataform = {
                    appno:$scope.otherform.appno,
                    factType:$scope.otherform.factType
                };
                $common.get_asyncData("ndebtPressApplyService/findRBcpAppliBussInfoByAppno", dataform).then(function (res) {
                    var data;
                    if (res.errorCode == "SUC") {
                        data = res.contextData;
                        $scope.taskform = data;
                        $scope.otherform.insertDate = $scope.taskform.startTaskDate;
                        if(flag3!=undefined||!flag3)
                        {
                            $scope.otherform.flag = flag3;
                        }
                        $scope.queryDebtAppliList();
                    } else {
                        $common.get_tipDialog(res.errorMsg, 'showInform');
                    }
                });
            } else {
                $common.get_tipDialog(res.errorMsg, 'showInform');
            }
        });
    };

    //分页查询查询应收账款列表
    //$scope.queryTable = function(paramData)
    //{
    //    var data= {
    //        pageNo: $scope.conf.pageNo,
    //        pageSize: $scope.conf.pageSize,
    //        debtCommonQryVO:$scope.otherform
    //    };
    //    $common.get_asyncData("ndebtPressApplyService/DebtPressInvoicesInfoGetter", data).then(function (res) {
    //        var data;
    //        if (res.errorCode == "SUC") {
    //            data = res.contextData;
    //            $scope.datasource.ds = data.records;
    //            $scope.conf.totalRecord = data.totalRecord;
    //            $scope.otherform.totalNum = data.totalRecord;
    //        } else {
    //            $common.get_tipDialog(res.errorMsg, 'showInform');
    //        }
    //    });
    //};

    //-------------------------------------点击事件----------------------------------
    //当催收方式改变的时候要判断是对应的字段的值是否改变了,如果改变了，则要将对应的票据数据清空
    $scope.pressModeChange=function(val){
        //变化前的值
        var oldVal =  $scope.otherform.pressMode;
        if((oldVal!=null&&oldVal!=""&&oldVal!=undefined)&&val !== oldVal){
            $scope.datasource.ds=[];
            $scope.otherform.totalNum=0;
            $scope.otherform.totalAmount="0.00";
        }
    };

    //addBill，deleteBill，save，commit，back returnType
    //添加票据信息（应收账款基本信息和业务合同号）
    $scope.add_onClick = function() {
        if($.doValidate("otherform")){
            $common.get_ngDialog('lanlnci/bcp_debt_list.html', $scope
                ,["$scope",function(dialogScope){
                    //查询参数的组装
                    dialogScope.conditionForm={
                        mastContno:$scope.otherform.mastContno,
                        flag:$scope.otherform.pressMode,  //催收方式
                        appno_Q:$scope.otherform.appno,
                        custcdSaller_Q:$scope.otherform.custcd,//卖方客户号
                        custcdBuyer_Q:$scope.otherform.custcdBuyer,//买方客户号
                        bussType_Q:$scope.otherform.bussType//业务品种
                    };//初始化查询条件
                    dialogScope.datasource={//初始化表格对象
                        ds: []
                    };
                    dialogScope.selected={//初始化对象
                        select: []
                    };
                    dialogScope.conf= {//初始化分页对象
                        pageNo: 1,
                        pageSize: 10,
                        totalRecord: 0};
                    //监听分页
                    dialogScope.$watch("conf.pageNo+conf.pageSize",function() {
                        dialogScope.queryTable();
                    });
                    //重置
                    dialogScope.rebort_onClick = function(){
                        dialogScope.$apply(function(){
                            dialogScope.conditionForm={
                                mastContno:$scope.otherform.mastContno,
                                flag:$scope.otherform.pressMode,  //催收方式
                                appno_Q:$scope.otherform.appno,
                                custcdSaller_Q:$scope.otherform.custcd,//卖方客户号
                                custcdBuyer_Q:$scope.otherform.custcdBuyer,//买方客户号
                                bussType_Q:$scope.otherform.bussType//业务品种
                            };
                        })
                    };
                    //搜索
                    dialogScope.submit_onClick =function(){
                        dialogScope.queryTable();
                    };
                    dialogScope.queryTable = function(){
                        var data= {
                            pageNo: dialogScope.conf.pageNo,
                            pageSize: dialogScope.conf.pageSize,
                            debtCommonQryVO:dialogScope.conditionForm,
                            list:debtList
                        };
                        $common.get_asyncData("ndebtPressApplyService/DebtInvoiceInfoAddQueryGetter",data).then(function(res){
                            var data;
                            if (res.errorCode =="SUC"){
                                data = res.contextData;
                                dialogScope.datasource.ds = data.records;
                                dialogScope.conf.totalRecord = data.totalRecord;
                            }else{
                                $common.get_tipDialog(res.errorMsg,'showError');
                            }
                        });
                    };
                    dialogScope.confirm_onClick = function(){
                        $scope.selected.select=[];
                        if(dialogScope.selected.select.length <= 0){
                            $common.get_tipDialog('请至少选择一条记录','showInform');
                            return false;
                        }
                        dialogScope.closeThisDialog();
                        var selected = dialogScope.selected.select;
                        var totalAmount = $scope.otherform.totalAmount;//催收总金额
                        var totalNum = $scope.otherform.totalNum;//催收份数
                        //计算票面金额的总额，计算费用。
                        for(var k in selected){
                            debtList.push(selected[k]);
                            totalAmount=parseFloat(totalAmount)+parseFloat(selected[k].remainingAmount);
                            totalNum=totalNum+1;
                            if(selected[k].warnCount==undefined)
                            {
                                selected[k].warnCount = 0;
                            }
                            if(selected[k].pressCount==undefined)
                            {
                                selected[k].pressCount = 0;
                            }
                        }
                        $scope.otherform.totalAmount=totalAmount;
                        $scope.otherform.totalNum=totalNum;
                        $scope.getListByPage();
                    };
                    dialogScope.back_onClick = function(){
                        dialogScope.closeThisDialog();
                    };
                }],"添加页面",{showClose:false});
        }

    };

    //删除票据信息
   $scope.delete_onClick = function() {
        if ($scope.selected.select.length != 1) {
            $common.get_tipDialog('请选择一条记录！', 'showInform');
        }
        else
        {
            var dsArray = debtList;
            var selected = $scope.selected.select;
            for (var i = 0; i < dsArray.length; i++) {
                for(var x in selected)
                {
                    if (dsArray[i].debtId == selected[x].debtId) {
                        debtList.splice(i, 1);
                        $scope.selected.select = [];
                        //改变催收总金额，催收份数，费用总额，实收费用
                        $scope.otherform.totalNum = parseFloat($scope.otherform.totalNum) - 1;//催收份数减一
                        if($scope.otherform.totalNum == 0){//没有出质票据,全部置空
                            $scope.otherform.totalAmount="0.00";//催收票据总金额
                            $scope.$apply();
                        }else{
                            $scope.otherform.totalAmount = parseFloat($scope.otherform.totalAmount) - parseFloat(selected[x].billsAmountView);//催收总金额
                            $scope.$apply();
                        }
                    }
                }
            }
            $scope.getListByPage();
        }
    };

    //直接保存并发起流程
    $scope.save_onClick = function(){
        if($.doValidate("otherform")) {
            if ($scope.datasource.ds.length <= 0) {
                $common.get_tipDialog("请先添加应收账款后再提交!", 'showInform');
                return false;
            }
            var data = {
                debtBussInfoVO: $scope.otherform,
                list: debtList
            };
            $common.get_asyncData("ndebtPressApplyService/DebtPressingApplySaveUpdate", data).then(function (res) {
                if (res.errorCode == "SUC") {
                    data = res.contextData;
                    $scope.otherform.appno=data.value;
                    dataDeliver.setter( $scope.otherform);
                    $scope.disableButton= false;
                    $common.get_tipDialog('保存成功！', 'showSuccess');
                    //$scope.otherform.flag = flag;
                    $scope.queryDebtAppliList();
                } else {
                    $common.get_tipDialog(res.errorMsg, 'showError');
                }
            });
        }
    };

    //提交
    $scope.sumbit_onClick = function(){
        if($.doValidate("otherform")) {
            if ($scope.datasource.ds.length <= 0) {
                $common.get_tipDialog("请先添加应收账款后再提交！", 'showInform');
                return false;
            }
            var param = {
                productId:$scope.otherform.bussType,
                invokPhase:"07"
            };
            $scope.otherform.invokPhase = "07";
            //获取风险拦截模型ID
            $common.get_asyncData("bprdChkdirInfoService/findBPrdChkdirInfoByParam",{omap:param}).then(function(res){
                if (res.errorCode =="SUC"){
                    var data = res.contextData;
                    var mdlId = data.mdlId;
                    if(mdlId==undefined||mdlId==""||mdlId==null)
                    {
                        $common.get_tipDialog('该业务品种对应调用阶段的风险拦截模型未绑定,请在业务配置中绑定！','showInform');
                        return;
                    }
                    //调用业务拦截
                    dataDeliver.setter({modelId:mdlId,chkMap:$scope.otherform});//传值
                    $common.get_ngDialog('../../bas_intcpdir_mdle/html/ft/intcpline.html',$scope,intcplineController,'业务拦截',{showClose:false},700);
                }else{
                    $common.get_tipDialog(res.errorMsg,'showInform');
                }
            });
        }
    };
    //监听业务拦截事件
    $scope.$on('interceptEvent',function(event,data) {
        console.log("data信息："+JSON.stringify(data));
        //根据业务拦截处理结果，执行成功继续提交，未执行成功返回
        if(data.checkResult!='SUC'){
            return;
        }
        $scope.disableButton = true;
        //锁定当前申请状态,防重复提交
        var data = {
            debtBussInfoVO: $scope.otherform,
            list: debtList
        };
        var primise = $common.get_asyncData("ndebtPressApplyService/DebtPressingApplyWriteSubmitUpdate", data);
        primise.then(function (res) {
            if (res.errorCode == "SUC") {
                if(taskId=="Write_task") {
                    $scope.viewhide=true;
                }else{
                    $state.go("list");
                }
                $common.get_tipDialog('提交成功！', 'showSuccess');
                $scope.disableButton = false;
            } else {
                $common.get_tipDialog(res.errorMsg, 'showError');
                $scope.disableButton = false;
            }
        });
    });

    //返回按钮
    $scope.back_onClick = function() {
        $state.go("list");
    };

    //获取已选择并已入库的应收账款列表
    $scope.queryDebtAppliList = function(paramData)
    {
        var appno = $scope.otherform.appno;
        if(appno!=null&&appno!=""&&appno!=undefined)
        {
            $common.get_asyncData("nRBcpAppliBussDtlService/queryRBcpAppliBussDtlByAppno", {appno:appno}).then(function (res) {
                var data;
                if (res.errorCode == "SUC") {
                    data = res.contextData;
                    debtList = data;
                    var totalAmount = 0;
                    for(var i=0;i<debtList.length;i++)
                    {
                        debtList[i].id = debtList[i].debtId;
                        var billsAmount= debtList[i].remainingAmount;//应收账款余额
                        if(!isNaN(billsAmount)){
                            totalAmount = totalAmount + billsAmount;
                        }
                    }
                    if(totalAmount==0)
                    {
                        $scope.otherform.totalAmount = "0.00";
                    }
                    else
                    {
                        $scope.otherform.totalAmount = totalAmount;
                    }
                    $scope.otherform.totalNum = debtList.length;
                    $scope.getListByPage();
                } else {
                    $common.get_tipDialog(res.errorMsg, 'showInform');
                }
            });
        }
    };

    $scope.getListByPage = function(paramData)
    {
        var param = {
            pageNo: $scope.conf.pageNo,
            pageSize: $scope.conf.pageSize,
            list:debtList
        };
        $common.get_asyncData("rbcpDebtInfoService/getListByPage", param).then(function (res) {
            var data;
            if (res.errorCode == "SUC") {
                data = res.contextData;
                $scope.datasource.ds = data.records||[];
                $scope.conf.totalRecord = data.totalRecord;
                $scope.selected.select = [];
            } else {
                $common.get_tipDialog(res.errorMsg, 'showError');
            }
        });
    };

    //历程信息
    $scope.progress_onClick=function(){
        if ($scope.selected.select.length != 1) {
            $common.get_tipDialog('请选择一条记录！', 'showInform');
        } else {
            var url = "";
            if(window.appNo){
                url='../../nrec_bcp_mdle/html/debtmanage/bcp_debt_progress_list.html'
            }else{
                url='debtmanage/bcp_debt_progress_list.html';
            }
            $common.get_ngDialog(url, $scope
                ,["$scope",function(dialogScope){
                    var row = $scope.selected.select[0];
                    var debtId = row.debtId;
                    dialogScope.datasource={//初始化表格对象
                        ds: []
                    };
                    dialogScope.selected={//初始化对象
                        select: []
                    };
                    dialogScope.conf= {//初始化分页对象
                        pageNo: 1,
                        pageSize: 10,
                        totalRecord: 0};
                    //监听分页
                    dialogScope.$watch("conf.pageNo+conf.pageSize",function(){
                        dialogScope.queryTable();
                    });
                    var rBcpDebtBussDtl={debtId:debtId};
                    //查询操作
                    dialogScope.queryTable = function(paramData){
                        var data= {
                            pageNo: dialogScope.conf.pageNo,
                            pageSize: dialogScope.conf.pageSize,
                            rBcpDebtBussDtl:rBcpDebtBussDtl
                        };
                        var promise = $common.get_asyncData("nrbcpDebtBussDtlService/findRBcpDebtBussDtlPageByPage",data);
                        promise.then(function(res){
                            var data;
                            if (res.errorCode =="SUC"){//数据中的经办机构要转换成中文
                                data = res.contextData;
                                dialogScope.datasource.ds = data.records;
                                dialogScope.conf.totalRecord = data.totalRecord;
                            }else{
                                $common.get_tipDialog(res.errorMsg,'showError');
                            }
                        });
                    };
                    dialogScope.back_onClick = function(){
                        dialogScope.closeThisDialog();
                        $scope.selected.select = [];
                    }
                }],"单据历程信息",{showClose:true});
        }
    };
};
