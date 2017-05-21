//serviceName:设置当前模块页的请求路径
var serviceName ='businessDef';

// 列表页初始化
$(document).ready(function() {
    findPage({serviceName:serviceName});
});


//页面加载完成列表页初始化
$(document).ready(function() {

    /**findPage 列表加载，如下主要参数说明
     1、pageNum:查询页码，默认为START_PAGE
     2、pageSize:分页查询记录数目，默认为PAGE_SIZE
     3、serviceName：必须设置项；其设置页面加载完成后，分页按钮的请求模块名
     4、callback:回调方法，在数据加载完成并初始化分页之后回调，携带当前页加载数据data
     */
    findPage({serviceName:serviceName});
    load();

});
function load(){

	$.post('businessDef/getBusinessDef.do',function(data){
		var dataList = data;
		for(var i = 0;i<=dataList.length;i++){
			$("#bussinessId").append("<option value='" + dataList[i].bussinessId + "'>" + dataList[i].businessDescribe + "</option>");
		}
	},'json');

}

//js验证
function ss(){
	var v=document.getElementById("bussinessId");
	if(v.value==""){
	ShowFailure('请选择一个项目！');
	return false;
	}
	return true;
	}

