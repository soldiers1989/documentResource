/**
 * Created by htrad0016 on 2016/8/23.
 */
(function(){
    //跳转的路由配置
    var routeArry=[
        {
            'state':'pooldebtList',
            'url':'/pooldebtdtlList',
            'default':'true',
            'templateUrl':'pooldebtdtl/pooldebtList.html',
            'controller':'pooldebtListController'
        },
        {
            'state':'pooldebtdtl',
            'url':'/pooldebtdtl',
            'templateUrl':'pooldebtdtl/pooldebtdtl.html',
            'controller':'pooldebtdtlController'
        },
        {
            'state':'pooldebtprcs',
            'url':'/pooldebtprcs',
            'templateUrl':'pooldebtdtl/pooldebtprcs.html',
            'controller':'pooldebtprcsController'
        }

    ];
    //模块的依赖加载配置
    var dependency=[
        //todo
    ];
    scubeUI.module('pool_dbtd',dependency,routeArry)
}());
