/**
 * Created by htrad0036 on 2017/2/21.
 */

(function(){
    //跳转的路由配置
    var routeArry=[
        {
            'state':'mortgageChkStockMng',
            'url':'/mortgageChkStockMng',
            'default':'true',
            'templateUrl':'mortgageChkStockMng/mortgageChkStockMng_list.html',
            'controller':'mortgageChkStockMngListController'
        },
        {
            'state':'mortgageChkStockMngQry',
            'url':'/mortgageChkStockMngQry',
            'templateUrl':'mortgageChkStockMng/mortgageChkStockMng_qry.html',
            'controller':'mortgageChkStockMngQryController'
        },
        {
            'state':'tree',
            'url':'/tree',
            'templateUrl':'mortgageChkStockMng/base_tree.html',
            'controller':'BaseTreeController'
        },
        {
            'state':'tree.checkStoDel',
            'url':'/tree.checkStoDel',
            'templateUrl':'mortgageChkStockMng/chkStockMng_detail.html',
            'controller':'chkStockMngDetailController'
        },
        {
            'state':'tree.mortInfo',
            'url':'/tree.mortInfo',
            'templateUrl':'mortgageChkStockMng/mort_info.html',
            'controller':'mortInfoController'
        },
        {
            'state':'tree.contSlave',
            'url':'/tree.contSlave',
            'templateUrl':'mortgageChkStockMng/contSlave_detail.html',
            'controller':'contSlvaeDetailController'
        },
        {
            'state':'mortgageContAdd',
            'url':'/mortgageContAdd',
            'templateUrl':'../../bas_cnt_mdle/html/mortgageCont/mort_cont_Add.html',
            'controller':'mortgageContAddController'
        }
    ];
    //模块的依赖加载配置
    var dependency=[
        //todo
    ];
    scubeUI.module('adv_fcs_mdle',dependency,routeArry);
}());