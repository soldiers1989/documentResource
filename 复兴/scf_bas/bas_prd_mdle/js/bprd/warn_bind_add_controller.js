/**
 * Filename:
 * Description:
 * Copyright:   Copyright (c) 2013
 * Company:     Shanghai Huateng Software Systems Co., Ltd.
 * @author      Wubin
 * @version     1.0
 * Create at:   2016/4/21
 */

var WarnBindAddController = function (dialogScope, parentScope, $common, $state, dataDeliver) {
    //console.log("userInfo信息："+JSON.stringify(userInfo));//用户信息，全局变量
    /*alert("userInfo信息："+JSON.stringify(userInfo));*/
    var data1 = dataDeliver.getter();
    var flag1 = data1.flag;
    var productId = data1.productId;//如果没有产品号，直接报错，提示产品号丢失，请重新操作！
    if (productId != "") {
        dialogScope.conditionForm = {};//初始化条件查询框 otherform
        dialogScope.datasource = {//初始化表格对象
            ds: []
        };
        dialogScope.selected={
            select:[]
        }
        dialogScope.conf = {//初始化分页对象
            pageNo: 1,
            pageSize: 10,
            totalRecord: 0
        }
        //监听分页
        dialogScope.$watch("conf.pageNo+conf.pageSize", function () {
            dialogScope.queryTable();
        });
        //重置按钮  warnNo,warnName
        dialogScope.rebort_onClick = function () {
            dialogScope.conditionForm.warnNo = "";
            dialogScope.conditionForm.warnName = "";
            dialogScope.queryTable();
        }
        //点击查询之后的搜索
        dialogScope.submit_onClick = function () {
            dialogScope.queryTable();
        };
        //查询操作
        dialogScope.queryTable = function (paramData) {
            var data = {
                pageNo: dialogScope.conf.pageNo,
                pageSize: dialogScope.conf.pageSize,
                value: dialogScope.conditionForm
            };
            var promiseQ = $common.get_asyncData("bBrpWarnParamService/findBBrpWarnParamByPage", data);
            promiseQ.then(function (res) {
                var data;
                if (res.errorCode == "SUC") {
                    data = res.contextData;
                    dialogScope.datasource.ds = data.records;
                    dialogScope.conf.totalRecord = data.totalRecord;
                } else {
                    $common.get_tipDialog(res.errorMsg, 'showError');
                }
            });
        };

        //保存按钮 warnNo,warnName
        dialogScope.save_onClick = function () {
            if (dialogScope.selected.select.length > 0) {
                var arrs = $common.copy(dialogScope.selected.select);//table表中选中的数据
                var list = new Array();
                for (var i in arrs) {
                    var bPrdWarnBind = {//后台需要的字段
                        productId: productId,
                        warnNo: arrs[i].warnNo,
                        warnName: arrs[i].warnName,
                    };
                    list[i] = bPrdWarnBind;
                }
                //     var primiseS = $common.get_asyncData('bPrdWarnBindService/add',{bPrdWarnBind:bPrdWarnBind})
                var primiseS = $common.get_asyncData('bPrdWarnBindService/batchAdd', {bPrdWarnBindList: list})
                primiseS.then(function (res) {
                    if (res.errorCode == "SUC") {//新增成功之后，要将对应的数据显示在前台table上
                        parentScope.queryWarnTable();
                        dialogScope.closeThisDialog();
                        $common.get_tipDialog('保存风险信息成功！', 'showSuccess');
                    } else {
                        $common.get_tipDialog(res.errorMsg, 'showError');
                    }
                });
            } else {
                $common.get_tipDialog('请至少选择一条记录！', 'showInform');
            }
        };
        //返回按钮
        dialogScope.back_onClick = function () {
            dialogScope.closeThisDialog();
        }
    } else {
        $common.get_tipDialog('产品号丢失，请重新进入产品工厂！', 'showError');
    }
};
