/**
 * @author 	mengjiajia
 * @version 1.0
 * @Copyright Shanghai Huateng Software Systems Co., Ltd.
 * Create at:   2016/11/21
 */
(function(){

	var parentwindow = window.parent;
	window.userInfo = parentwindow.userInfo;
	window.authorization=parentwindow.authorization;
	window.httpIpPort = parentwindow.httpIpPort;
	window.dictionary = parentwindow.dictionary;
	window._HTTP_IP_PORT = parentwindow._HTTP_IP_PORT;
	window.appNo = parentwindow.appNo;
	window.processId = parentwindow.processId;

	window.Write = true;
	window.Issued = true;
	window.Receipt = true;

	//跳转的路由配置
	var routeArry=[
		{
			'state':'staticDeliveryapply',
			'url':'/staticDeliveryapply',
			'templateUrl':'../html/deliveryApply/delivery_apply_detail.html',
			'controller':'deliveryApplyDetailController'
		},
		{//保证金追加
			'state':'staticDeliveryacctadd',
			'url':'/staticDeliveryacctadd',
			'templateUrl':'../html/deliveryApply/delivery_apply_acctadd.html',
			'controller':'deliveryApplyAcctaddController'
		},
		{//质押合同
			'state':'staticDeliveryslave',
			'url':'/staticDeliveryslave',
			'templateUrl':'../html/deliveryApply/info_slave.html',
			'controller':'infoSlaveController'
		},
		{//质押监管协议
			'state':'staticDeliveryprotocol',
			'url':'/staticDeliveryprotocol',
			'templateUrl':'../html/deliveryApply/info_protocol.html',
			'controller':'infoProtocolController'
		},
		{
			'state':'staticDeliveryfileupload',
			'url':'/staticDeliveryfileupload',
			'templateUrl':'../html/deliveryApply/info_fileupload.html',
			'controller':'infoFileuploadController'
		}
	];
	//模块的依赖加载配置
	var dependency=[
		//todo
	];
	scubeUI.module('smpDeliveryApplyGuide',dependency,routeArry);
	//手动拉起angular应用程序
	angular.element(document).ready(function() {
		angular.bootstrap(document.getElementsByTagName("body"),[scubeUI.moduleName]);
	});

}());
