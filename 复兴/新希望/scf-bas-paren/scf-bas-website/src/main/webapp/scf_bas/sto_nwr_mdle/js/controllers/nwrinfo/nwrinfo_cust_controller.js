/**
 * Filename:
 * Description:
 * Copyright:   Copyright (c) 2013
 * Company:     Shanghai Huateng Software Systems Co., Ltd.
 * @author      liph
 * @version     1.0
 * Create at:   2016/4/21
 */

var nwrinfoCustController = function($scope,$common,$state,dataDeliver) {
	$scope.otherform = {
		orgCode:"",
		coreFlag:"1",
		brManagerNo:userInfo.brManagerNo,
		brNo:userInfo.brNo,
		mgrno:"",//管户员初始化
		industryType:"",//数据库国际行业代码的字段
		industryTypeName:"",//页面的国际行业代码名称
		area:""//区域，省份，直辖市
	};
	$scope.disable = true;
	var custcd = window.source.baseinfo.custcd;
	//-------------------页面初始化--------------
	$common.get_asyncData("bCrmBaseInfoService/findBCrmBaseInfoObjectByKey",{custcd:custcd}).then(function(res){
		var cust;
		if (res.errorCode =="SUC"){
			cust = res.contextData;
			var bCrmBrInfo={//   brManagerName,brName
				brNo:userInfo.brNo
			}
			///前台页面赋值(不通过flag去决定是否到后台查询数据，而是什么时候都要查询，防止，新增成功之后，去账户信息等页面，再跳转回此页面)
			var bCrmBaseInfo={
				orgCode:cust.orgCode
			};
			$common.get_asyncData("bCrmBaseInfoService/findBCrmBaseInfoByKey2",{bCrmBaseInfoAndEntInfo:bCrmBaseInfo}).then(function(res){
				if (res.errorCode =="SUC") {
					//这里有一个上下游关系字段需要修改一下
					if(res.contextData.supplyPosition){
						res.contextData.supplyPosition=res.contextData.supplyPosition.split(",");
					}
					$scope.otherform=res.contextData;
					//经办机构，操作人页面数据赋值
					$common.get_asyncData("bCrmBaseInfoService/findBCrmBrInfo",{bCrmBrInfo:bCrmBrInfo}).then(function(res1){
						if (res1.errorCode =="SUC") {
							$scope.otherform.brName=res1.contextData.brName;
						}else{
							$common.get_tipDialog(res1.errorMsg,'showError');
						}
					});
					$scope.otherform.tlrName=userInfo.tlrName;
				}else{
					$common.get_tipDialog(res.errorMsg,'showError');
				}
			});
		}else{
			$common.get_tipDialog(res.errorMsg,'showError');
		}
	});
	//国际行业分类(不支持页面的模糊查询。)
	$scope.industryTypeContent = {
		type:"tree",//展示类型table  tree
		url:"bBrpIndustryTypesService/findBBrpIndustryTypesTree",//请求url
		//param:{},//请求参数,如果不写该属性或者param:{},则以输入当前字段查
		split:"-",//分隔符
		extentColumn:["treeName"],
		column:["treeName","treeId"]//展示内容
	};
	$scope.industryTypeExtent = function(ds){
		$scope.otherform.industryType=ds.treeId;
	};
	$scope.$watch("otherform.industryTypeName",function(){
		$scope.industryTypeContent.param ={
			industryName:$scope.otherform.industryTypeName
		}
	});
	//省份、直辖市、自治区下拉查询（数据库area字段为100长度，此处可直接存储对应地区名称，而不是代码。）
	$scope.areaContent = {
		type:"table",//展示类型table  tree
		url:"bSysRegionService/findBSysRegionByPage",//请求url
		//param:{},//请求参数,如果不写该属性或者param:{},则以输入当前字段查
		split:"",//分隔符*/
		extentColumn:"regionName",
		column:["regionName"]//展示内容
	};
	$scope.dooextent = function(ds){
		$scope.otherform.areaName=ds.regionName;
		$scope.otherform.area=ds.regionCode;
		//areaName regionCode
	};
	$scope.$watch("otherform.areaName",function() {
		$scope.areaContent.param = {
			regionName: $scope.otherform.areaName
		};
	});
	//----------------------------------点击事件------------------------------
};
