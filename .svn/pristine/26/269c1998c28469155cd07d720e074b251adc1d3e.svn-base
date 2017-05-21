//serviceName:设置当前模块页的请求路径
var serviceName ='user';

// 列表页初始化
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

/**
 * 导出Excel
 * @param res_key
 * @param resUrl
 */
function fp(res_key,resUrl){
	outExcel(resUrl);
}
function outExcel(resUrl){
	$.ajax({  
	      url:resUrl,  
	      dataType: "JSON",
	      success:function(data){ 
	    	  findPage({serviceName:serviceName});
	    	 
	      },  
	      }
	);          
}

//功能区操作定义
function fn(res_key,resUrl){
	$('#modal_btn').show();
	if(res_key=='addUser'){
		addForm(resUrl);
	}else 
		if(res_key=='updateUser'){
			var id = $('input[name="id"]').filter(':checked').val();	
			if(id == undefined ){
				ShowFailure('修改操作必须选中对应的记录！');
				return ;
			}
			updateUser(resUrl = resUrl + '?id='+id);
		}else if(res_key=='updateState'){
			fs(res_key,resUrl);
			
		}else if(res_key=='out_excel'){
			fp(res_key,resUrl);
			ShowSuccess('操作成功！D:\\Excel.xls盘下');
		}
	
}

//修改会员账户状态
function fs(res_key,resUrl){
	
		var id = $('input[name="id"]').filter(':checked').val();
		if(id == undefined ){
			ShowFailure('修改状态必须选中对应的记录！');
			return ;
		}
    updateState(resUrl = resUrl + '?id='+id);
    
}


/**初始化新增管理用户界面(init方法)
 * init方法参数说明：
   1、lable 弹出的form表单的title
   2、init_url 以此路径加载form表单元素
   3、submit_url:设置次表单提交路径
   4、serviceName，必须设置，和模块名称一致
   5、callback：form表单元素加载成功之后回调
 */
function addForm(url){
	initForm({
		type: "POST",
        dataType: "JSON",
        lable:'新增会员用户',
        init_url:url,
        submit_url:'user/save.do',
        serviceName:'user'
    });
}

//会员修改页面
function updateUser(resUrl){
	 initForm({
		lable:'会员修改页面',
	    init_url:resUrl,
	    submit_url: 'user/update.do',
        serviceName:'user'
	 		});
}

//会员修改状态
function updateState(resUrl){
	initForm({
		lable:'会员修改状态页面',
		init_url:resUrl,
		submit_url: 'user/State.do',
		serviceName:'user'
	});
}

//查看详情页面
function detailsById(id){
	 $('#modal_btn').hide();
	 initForm({
			lable:'会员信息详情页面',
			init_url:"user/detailsById.do?id="+id,
			submit_url: '#',
			serviceName:'user',
			
		});
		}







