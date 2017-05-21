//serviceName:设置当前模块页的请求路径
var serviceName ='activeRelation';

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

});

//点击页面检索按钮
function doSearch(){
    findPage({serviceName:serviceName});
}

//功能区操作定义
function fn(res_key,resUrl){
    if(res_key=='active_relation_add'){
        addForm(resUrl);
    }else 
		if(res_key=='active_relation_del'){
			var id = $('input[name="id"]').filter(':checked').val();	
			if(id == undefined ){
				ShowFailure('删除操作必须选中对应的记录！');
				return ;
			}
			deleteActiveRelation(resUrl = resUrl + '?id='+id);
			findPage({serviceName:serviceName});
	    	  ShowSuccess('操作成功！');
		}else{
			fs(res_key,resUrl);
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
function addForm(resUrl){
    initForm({
        lable:'新增业务规则', 
        init_url:resUrl,
        submit_url:'activeRelation/save.do',
        serviceName:'activeRelation'
    });
}

/**
 * 删除规则
 * @param resUrl
 */
function deleteActiveRelation(resUrl){
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

function fs(res_key,resUrl){
	if(res_key=='active_relation_upd'){
		var id = $('input[name="id"]').filter(':checked').val();
		if(id == undefined ){
			ShowFailure('修改操作必须选中对应的记录！');
			return ;
		}
		
	}
	updateActiveRelation(resUrl = resUrl + '?id='+id);
}

//修改规则
function updateActiveRelation(resUrl){
	initForm({
		lable:'修改业务规则页面',
		init_url:resUrl,
		submit_url:'activeRelation/update.do',
		serviceName:'activeRelation'
	});
}


