/**
 * Created by htrad0036 on 2017/2/17.
 */

(function(){
    //跳转的路由配置
    var routeArry=[
        {
            'state':'pickupNteQry',
            'url':'/pickupNteQry',
            'default':'true',
            'templateUrl':'../../adv_nte_mdle/html/pickupNotice/pickup_notice_qry.html',
            'controller':'PickupNoticeQryController'
        }
    ];
    //模块的依赖加载配置
    var dependency=[
        //todo
    ];
    scubeUI.module('adv_nte_mdle',dependency,routeArry);
}());