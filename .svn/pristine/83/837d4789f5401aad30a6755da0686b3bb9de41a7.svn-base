//serviceName:设置当前模块页的请求路径
var serviceName ='Balance';

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
    if(res_key=='zengjia_balance'){
    	if(id == undefined ){
			ShowFailure('添加金额操作必须选中对应的记录！');
			return ;
		}
    	resUrl = resUrl + '?id='+id
        addForm(resUrl);
     }else if(res_key=='jianshao_balance'){
		if(id == undefined ){
			ShowFailure('减少金额操作必须选中对应的记录！');
			return ;
		}
		resUrl = resUrl + '?id='+id
        addReduce(resUrl);
		
	}
   
}
/**初始化新增管理用户界面(init方法)
 * init方法参数说明：
   1、lable 弹出的form表单的title
   2、init_url 以此路径加载form表单元素
   3、submit_url:设置次表单提交路径
   4、serviceName，必须设置，和模块名称一致
   5、callback：form表单元素加载成功之后回调
 */

//添加交易
function addForm(resUrl){
	initForm({
		lable:'添加',
		init_url:resUrl,
        submit_url:'Balance/addPayApply.do',
        serviceName:'Balance'
	});
}
//减少金额
function addReduce(resUrl){
	initForm({
		lable:'减少',
		init_url:resUrl,
		submit_url:'Balance/addReduce.do',
		serviceName:'Balance'
	});
}

function test(){
	debugger;
	var a = $("#accountbalance").val();
	var b = $("#balanceamount").val();

	if(a!=""){
		  if(parseInt(b)>parseInt(a)){
			  ShowSuccess('减少金额必须小于账户余额！');
			  $("#balanceamount").val("");
		 }
		
	  }

	}



