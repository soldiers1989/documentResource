/**
 * Created by htrad0036 on 2017/2/21.
 */

(function(){
    //跳转的路由配置
    var routeArry=[
        {
            'state':'priceFlucExpt',
            'url':'/priceFlucExpt',
            'default':'true',
            'templateUrl':'../../adv-wrn-mdle/html/priceFlucException/priceFlucExptQry.html',
            'controller':'PriceFlucExptController'
        }
    ];
    //模块的依赖加载配置
    var dependency=[
        //todo
    ];
    scubeUI.module('sto_wrn_mdle',dependency,routeArry);
}());