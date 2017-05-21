//serviceName:设置当前模块页的请求路径
var serviceName ='activeRelation';

// 列表页初始化
$(document).ready(function() {
    findPage({serviceName:serviceName});
    load();
});

function load(){

	$.post('activeRelation/getActiveRelation.do',function(data){
		var dataList = data;
		for(var i = 0;i<=dataList.length;i++){
			$("#bussinessId").append("<option value='" + dataList[i].businessId + "'>" + dataList[i].businessId + "</option>");
		}
	},'json');
}


