/**
 * Filename:
 * Description:
 * Copyright:   Copyright (c) 2013
 * Company:     Shanghai Huateng Software Systems Co., Ltd.
 * @author      shangxiujuan
 * @version     1.0
 * Create at:   2016/11/01
 */
var debtOutPoolApplyController = function($scope,$common,$state,dataDeliver,$eventCommunicationChannel) {
    var dataX=dataDeliver.getter();
    //页面初始化
    $scope.otherform={};
    //应收账款转让表单
    $scope.bcpDatasource={//初始化表格对象
        ds:[]
    };
    $scope.bcpSelected={//初始化对象
        select: []
    };
    $scope.bcpConf= {//初始化分页对象
        pageNo: 1,
        pageSize: 15,
        totalRecord: 0};

    //页面数据加载
    var appno;
    $scope.dataSource=[];
    if(window.appNo){
        appno = window.appNo;
        $scope.hide=true;//按钮隐藏
        $scope.hide1=true;//按钮隐藏
        queryFormResourseByAppno();
    }else if(dataX.appno){//如果是修改按钮跳转过来
        appno=dataX.appno;
        queryFormResourseByAppno();
        if(dataX.flag){//是超链接查看按钮跳转过来的
            $scope.hide=true;
        }
    }else{//如果是新增按钮跳转过来
        $scope.submit=true;//提交按钮只读
        var mastContno=dataX.mastContno;
        var promiseA = $common.get_asyncData("bcntBcpInfoService/queryBCntBcpInfoByMastContno",{key:mastContno});
        promiseA.then(function(res1){
            if(res1.errorCode =="SUC") {
                $scope.otherform= res1.contextData;
                // 账期 loanDays，宽限期 debtGraceDays
                $scope.otherform.aging=$scope.otherform.loanDays;
                $scope.otherform.gracePeriod=$scope.otherform.debtGraceDays;
                //买方，卖方客户号，业务品种， financingType实际上融资方式，就可以判断factType是1还是8
                $scope.otherform.custcdSaller=$scope.otherform.custcd;
                $scope.otherform.custcdBuyer=$scope.otherform.businessCustcd;
                $scope.otherform.bussType=$scope.otherform.supplyChainPdId;
                $scope.otherform.cnameSeller=$scope.otherform.cname;
                taskFormInfo();//判断保理业务类型
                totalFee();
            }else{
                $common.get_tipDialog(res1.errorMsg,'showError');
            }
        });
    }
    //有申请号时页面信息加载方法
    function queryFormResourseByAppno(){
        //页面form
        var promiseA = $common.get_asyncData("nRBcpAppliBussInfoService/findBcpAppliBussInfoByAppno",{key:appno});
        promiseA.then(function(res1){
            if(res1.errorCode =="SUC") {
                var formInfo=res1.contextData
                var promise = $common.get_asyncData("bcntBcpInfoService/queryBCntBcpInfoByMastContno",{key:formInfo.mastContno});
                promise.then(function(res){
                    if(res.errorCode =="SUC") {
                        $scope.otherform= res.contextData;
                        //买方，卖方客户号，业务品种，手续费率 financingType实际上融资方式，就可以判断factType是1还是8
                        $scope.otherform.custcdSaller=$scope.otherform.custcd;
                        $scope.otherform.custcdBuyer=$scope.otherform.businessCustcd;
                        $scope.otherform.bussType=$scope.otherform.supplyChainPdId;
                        $scope.otherform.cnameSeller=$scope.otherform.cname;
                        $scope.otherform.appno=appno;
                        //insertDate 争议日期，争议份数 debtNum，争议金额 amount，其他备注信息 memo
                        $scope.otherform.insertDate=formInfo.insertDate;
                        $scope.otherform.debtNum=formInfo.debtNum;
                        $scope.otherform.amount=formInfo.amount;
                        $scope.otherform.memo=formInfo.memo;
                        taskFormInfo();//任务页面信息回显
                    }else{
                        $common.get_tipDialog(res.errorMsg,'showError');
                    }
                });
            }else{
                $common.get_tipDialog(res1.errorMsg,'showError');
            }
        });
        //页面table
        var promise= $common.get_asyncData("nRBcpAppliBussDtlService/queryAppliBussDetailByAppno",{appno:appno});
        promise.then(function(res){
            if(res.errorCode =="SUC") {
                $scope.dataSource = res.contextData||[];
                $scope.bcpConf.totalRecord = $scope.dataSource.length;
            }else{
                $common.get_tipDialog(res.errorMsg,'showError');
            }
        });
    }

    //页面任务信息加载 scfWorkFlowService.findBPbcAppliBaseInfoByAppno(appno, process);
    $scope.otherformX={};
    //监听分页
    $scope.$watch("bcpConf.pageNo+bcpConf.pageSize+dataSource",function(){
        pageHelper();
    });
    //前台分页
    function pageHelper(){
        $scope.bcpDatasource.ds=[];
        var pageNo=parseFloat($scope.bcpConf.pageNo);
        var pageSize=parseFloat($scope.bcpConf.pageSize);
        var y ;
        if(pageNo*pageSize>=$scope.bcpConf.totalRecord){
            y=$scope.bcpConf.totalRecord-1;
        }else{
            y=pageNo*pageSize-1;
        }
        for(var x =(pageNo-1)*pageSize;x<=y;x++){
            $scope.bcpDatasource.ds.push($scope.dataSource[x]);
        }
    }
    //页面factType 判断 以及任务页面信息加载
    function taskFormInfo(){
        var bCrmBrInfo={appno:appno};
        var promiseA = $common.get_asyncData("iScfWorkFlowService/findBPbcAppliBaseInfoByAppno",bCrmBrInfo);
        promiseA.then(function(res1){
            if(res1.errorCode =="SUC") {
                $scope.otherformX = res1.contextData;//经办机构
                if(!window.appNo){
                    $scope.otherform.insertDate=$scope.otherformX.startTaskDate;
                }
                $scope.otherformX.processTemplateName='应收账款池融资入池申请';
            }else{
                $common.get_tipDialog(res1.errorMsg,'showError');
            }
        });
    }

    //页面金额计算
    function totalFee(){
        var datasourceX=$scope.dataSource;
        var debtNum=0;
        var amount=0;//入池总金额
        for(var x in datasourceX){
            if(!datasourceX[x].remainingAmount){
                datasourceX[x].remainingAmount=0;
            }
            debtNum=debtNum+1;
            amount=amount+parseFloat(datasourceX[x].remainingAmount);
        }
        $scope.otherform.debtNum=debtNum;
        $scope.otherform.amount=amount;
        $scope.bcpConf.totalRecord=debtNum;//页面单据数量
    }
    //-------------------------------------点击事件----------------------------------
    //页面单据新增
    $scope.addDebt_onClick = function(){
        var url;
        if(window.appNo){
            url='../../nrec_bcp_mdle/html/disputeRegister/debt_info_choose.html'
        }else{
            url='disputeRegister/debt_info_choose.html';
        }
        $common.get_ngDialog(url, $scope
            ,["$scope",function(dialogScope){
                var list=$common.copy($scope.dataSource);
                var mastContno=$scope.otherform.mastContno;
                dialogScope.conditionForm={//需要先定义业务品种对应的产品ID
                    mastContno:mastContno,//业务合同号
                    lockAppno:appno,
                    poolFlag:'1'//入池的
                };
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
                dialogScope.rebort_onClick =function(){
                    dialogScope.conditionForm={//需要先定义业务品种对应的产品ID
                        mastContno:mastContno,//业务合同号
                        lockAppno:appno ,poolFlag:'1'//入池的
                    };
                    dialogScope.selected.select=[];
                    dialogScope.$apply();
                };
                //点击查询之后的搜索
                dialogScope.submit_onClick =function(){
                    dialogScope.selected.select=[];
                    dialogScope.queryTable();

                };
                //查询操作
                dialogScope.queryTable = function(paramData){
                    var data= {
                        pageNo: dialogScope.conf.pageNo,
                        pageSize: dialogScope.conf.pageSize,
                        value:dialogScope.conditionForm,
                        list:list
                    };
                    var promise = $common.get_asyncData("rbcpDebtInfoService/findRBcpDebtInfoForInPoolOrOutPool",data);
                    promise.then(function(res){
                        var data;
                        if (res.errorCode =="SUC"){//数据中的经办机构要转换成中文
                            data = res.contextData;
                            dialogScope.datasource.ds = data.records;
                            dialogScope.conf.totalRecord =data.totalRecord;
                        }else{
                            $common.get_tipDialog(res.errorMsg,'showError');
                        }
                    });
                };
                /* 确定按钮*/
                dialogScope.confirm_onClick=function(){
                    if(dialogScope.selected.select.length == 0){
                        $common.get_tipDialog("请选择数据！",'showError');
                    }else{
                        for(var x in dialogScope.selected.select){
                            $scope.dataSource.push(dialogScope.selected.select[x]);
                        }
                        totalFee();
                        $scope.bcpSelected.select=[];
                        dialogScope.closeThisDialog();
                    }
                };
                dialogScope.back_onClick = function(){
                    dialogScope.closeThisDialog();
                }
            }],"选择出池单据",{showClose:true});

    };

   //删除票据信息
    $scope.delDebt_onClick = function() {
        if ($scope.bcpSelected.select.length != 1) {
            $common.get_tipDialog('请选择一条记录！', 'showInform');
        } else {
            var dsArray = $scope.dataSource;
            var selected = $scope.bcpSelected.select[0];
            for(var x in dsArray){
                if(dsArray[x].billsNo==selected.billsNo){
                    dsArray.splice(x,1);
                }
            }
            $scope.bcpSelected.select=[];
            totalFee();//页面数据计算
            $scope.$apply();
        }
    };
    //历程信息
    $scope.progress_onClick=function(){
        if ($scope.bcpSelected.select.length != 1) {
            $common.get_tipDialog('请选择一条记录！', 'showInform');
        } else {
            var url;
            if(window.appNo){
                url='../../nrec_bcp_mdle/html/debtmanage/bcp_debt_progress_list.html'
            }else{
                url='debtmanage/bcp_debt_progress_list.html';
            }
            $common.get_ngDialog(url, $scope
                ,["$scope",function(dialogScope){
                    var debtId="";
                    if($scope.bcpSelected.select[0].appno){//如果传过来的信息有申请号，就应该用对应的debtId字段
                        debtId=$scope.bcpSelected.select[0].debtId;
                    }else{
                        debtId=$scope.bcpSelected.select[0].id;//应收账款基本信息ID
                    }
                    dialogScope.datasource={//初始化表格对象
                        ds: []
                    };
                    dialogScope.selected={//初始化对象
                        select: []
                    };
                    dialogScope.conf= {//初始化分页对象
                        pageNo: 1,
                        pageSize: 10,
                        totalRecord: 0}
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
                        dialogScope.closeThisDialog();$scope.bcpSelected.select = [];
                    }
                }],"单据历程信息",{showClose:true});
        }
    };
    //校验单据信息
    function checkBcpdatasource(){
        if ($scope.dataSource.length == 0) {//判断票据信息有没有添加 custcdSaller,cnameSeller
            $common.get_tipDialog("请添加单据信息！", 'showError');
            return false;
        }
        return true;
    }
    //保存但不发起流程
    $scope.save_onClick=function(){
        if($.doValidate("otherform")) {
            if(checkBcpdatasource()==true){
                var data2 = {
                    value: $scope.otherform,//应收账款转让申请基本信息
                    list: $scope.dataSource//应收账款申请明细信息
                };
                var promise = $common.get_asyncData("debtOutPoolService/saveOrUpdateOutPoolInfo", data2);
                promise.then(function (res) {
                    if (res.errorCode == "SUC") {
                        $common.get_tipDialog('保存成功！', 'showSuccess');
                        $scope.otherform.appno=res.contextData.value;
                        $scope.submit=false;
                    } else {
                        $common.get_tipDialog(res.errorMsg, 'showError');
                    }
                });
            }
          }
    };
    //直接保存并发起流程
    $scope.submit_onClick=function(){
        if($.doValidate("otherform")) {
            if(checkBcpdatasource()==true){
                var param = {
                    productId:$scope.otherform.bussType,
                    invokPhase:"14"
                };
                $scope.otherform.invokPhase = "14";
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
        }
    };
    //监听业务拦截事件
    $scope.$on('interceptEvent',function(event,data) {
        console.log("data信息："+JSON.stringify(data));
        //根据业务拦截处理结果，执行成功继续提交，未执行成功返回
        if(data.checkResult!='SUC'){
            return;
        }
        $scope.submit=true;//提交按钮只读
        var data2 = {
            value: $scope.otherform,//应收账款转让申请基本信息
            list: $scope.dataSource//应收账款申请明细信息
        };
        var promise = $common.get_asyncData("debtOutPoolService/submitOutPoolInfo", data2);
        promise.then(function (res) {
            if (res.errorCode == "SUC") {
                $common.get_tipDialog('提交成功！', 'showSuccess');
                //这里提交成功之后应该是返回到申请明细页面上去
                //并且最好就是把申请号和申请类型都写好
                var data={
                    mastContno:$scope.otherform.mastContno
                };
                dataDeliver.setter(data);
                $state.go("outPoolApplyList");
            } else {
                $scope.submit=false;
                $common.get_tipDialog(res.errorMsg, 'showError');
            }
        });
    });

    //返回按钮
    $scope.back_onClick = function() {
        var data={
            mastContno:$scope.otherform.mastContno
        }
        dataDeliver.setter(data);
        $state.go("outPoolApplyList");
    }
};
