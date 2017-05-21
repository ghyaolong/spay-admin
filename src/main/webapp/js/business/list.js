//serviceName:设置当前模块页的请求路径
var serviceName ='business';

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
function searchPage(){
    findPage({serviceName:serviceName});
}

//功能区操作定义
function fn(res_key,resUrl){
    if(res_key=='business_add'){
        addForm(resUrl);
    }else 
		if(res_key=='business_del'){
			var id = $('input[name="id"]').filter(':checked').val();	
			if(id == undefined ){
				ShowFailure('删除操作必须选中对应的记录！');
				return ;
			}
			deleteBusiness(resUrl = resUrl + '?id='+id);
			findPage({serviceName:serviceName});
	    	  ShowSuccess('操作成功！');
		}else{
			fs(res_key,resUrl);
		}
	
}
//修改交易
function fs(res_key,resUrl){
	if(res_key=='business_upd'){
		var id = $('input[name="id"]').filter(':checked').val();
		if(id == undefined ){
			ShowFailure('修改操作必须选中对应的记录！');
			return ;
		}
		
	}
	updateBusiness(resUrl = resUrl + '?id='+id);
}


/**初始化新增管理用户界面(init方法)
 * init方法参数说明：
   1、lable 弹出的form表单的title
   2、init_url 以此路径加载form表单元素
   3、submit_url:设置次表单提交路径
   4、serviceName，必须设置，和模块名称一致
   5、callback：form表单元素加载成功之后回调
 */
//修改交易
function updateBusiness(resUrl){
	initForm({
		lable:'修改交易页面',
		init_url:resUrl,
		submit_url:'business/update.do',
		serviceName:'business'
	});
}


//添加交易
function addForm(resUrl){
	initForm({
		lable:'添加交易',
		init_url:resUrl,
        submit_url:'business/saveBusiness.do',
        serviceName:'business'
	});
	
}

//删除交易
function deleteBusiness(resUrl){
	$.ajax({  
	      url:resUrl,  
	      dataType: "JSON",
	      success:function(data){ 
	    	  findPage({serviceName:serviceName});
	    	  ShowSuccess('操作成功！');
	      },  
	      }
	);          
}

//查看详情
function findById(){
	$('#modal_btn').hide(); 
	var id = $('input[name="id"]').val();
	initForm({
        lable:'查看交易详情', 
        init_url:'business/findById.do?id='+id,
        submit_url:'#',
        serviceName:'business'
    });
	
}


