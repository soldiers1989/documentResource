/**
 * @author 	liph
 * @version 1.0
 * @Copyright Shanghai Huateng Software Systems Co., Ltd.
 * Create at:   2016/11/21
 */
var buyInfoAddController = function(dialogScope,parentScope,$common,$state,appno,vidNo) {
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
    //点击刷新之后的搜索
    dialogScope.fresh_onClick =function(){
        dialogScope.queryTable();
        dialogScope.selected.select=[];
    };
    //点击查询之后的搜索
    dialogScope.submit_onClick =function(){
        dialogScope.queryTable();
        dialogScope.selected.select=[];
    };
    //查询操作brName,brNo
    dialogScope.queryTable = function(paramData){
        var data= {
            pageNo: dialogScope.conf.pageNo,
            pageSize: dialogScope.conf.pageSize,
            value:{protocolNo:vidNo,status:'1'},
            list:parentScope.datasource.ds
        };
        var promise = $common.get_asyncData("iBCntBuyInfoService/selectBCntBuyInfo",data);
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

    //点击确认触发按钮--添加到父页面上面
    dialogScope.confirm_onClick = function(){
        var data = dialogScope.selected.select;
        var parentda = parentScope.datasource.ds;
        for(var i=0;i<data.length;i++) {
            var parentlist = new Array();
            for(var j=0;j<parentda.length;j++){
                parentlist.push(parentda[j].tradeContno);
            }
            if($.inArray(data[i].tradeContno,parentlist) == -1){
                parentScope.datasource.ds.push(data[i]);
            }else{
                $common.get_tipDialog('购销合同重复','showInform');
            }

        }
        dialogScope.closeThisDialog();
    }
    dialogScope.goback_onClick = function(){
        dialogScope.closeThisDialog();
    }
};
