//serviceName:设置当前模块页的请求路径
var serviceName ='PayApplyBalance';

//页面加载完成列表页初始化
$(document).ready(function() {
    /**findPage 列表加载，如下主要参数说明
     1、pageNum:查询页码，默认为START_PAGE
     2、pageSize:分页查询记录数目，默认为PAGE_SIZE
     3、serviceName：必须设置项；其设置页面加载完成后，分页按钮的请求模块名
     4、callback:回调方法，在数据加载完成并初始化分页之后回调，携带当前页加载数据data
     */
    findPage({serviceName:serviceName});
});

//点击页面检索按钮
function doSearch(){
    findPage({serviceName:serviceName});
}

//功能区操作定义
function fn(res_key,resUrl){
	var id = $('input[name="id"]').filter(':checked').val();
	$('#modal_btn').show();
    if(res_key=='PayApplyBalance'){
    	if(id == undefined ){
			ShowFailure('审核操作必须选中对应的记录！');
			return ;
	}else{
		var state="";
		state=$('input[name="id"]').filter(':checked').parent().next().next().next().html();
		 if('审核通过'==state){
			 ShowFailure('审核通过不能再次进行审核操作！');
		}else if('审核驳回'==state){
			 ShowFailure('请重新提交调账申请！');
		 }else {
		    resUrl = resUrl + '?id='+id;
		    addForm(resUrl);
		
	    }
	 }
  }
}
//审核
function addForm(resUrl){
	initForm({
		lable:'审核',
		init_url:resUrl,
        submit_url:'PayApplyBalance/addPayApplyBalance.do',
        serviceName:'PayApplyBalance'
	});
}





