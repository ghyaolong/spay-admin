//serviceName:设置当前模块页的请求路径
var serviceName ='dispenseRule';

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
function searchPage(){
    findPage({serviceName:serviceName});
}

//功能区操作定义
function fn(res_key,resUrl){
    if(res_key=='add_pay_active'){
        addForm(resUrl);
    }else if(res_key=='pay_active_detail'){
        	var id = $('input[name="id"]').filter(':checked').val();
        	if(id == undefined ){
        		ShowFailure('操作必须选中对应的记录！');
        		return ;
        	}
        	findActiveById(resUrl = resUrl + '?id='+id);
	    }else if(res_key=='pay_active_delete'){
	    	var id = $('input[name="id"]').filter(':checked').val();
        	if(id == undefined ){
        		ShowFailure('操作必须选中对应的记录！');
        		return ;
        	}
        	deleteById(id);
	    	
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
function addForm(url){
    initForm({
        lable:'新增代金券规则', 
        init_url:url,
        submit_url:'payActive/savePayActive.do',
        serviceName:'payActive'
    });
}
function deleteById(id){
	 $.ajax({
         type: "GET",
         url: "payActive/deleteActiveById.do",
         data: {id:id},
         dataType: "json",
         success: function(data){
        	 findPage({serviceName:serviceName});
        	 return;
                 }
	 		});
		}

function findActiveById(resUrl){
	$('#modal_btn').hide(); 
	initForm({
        lable:'规则详情',
        init_url:resUrl,
        submit_url:'payActive/updateActive.do',
        serviceName:'payActive'
    });
}

function doSearch(){
	findPage({serviceName:serviceName});
	
}

function upload(){
	var form = new FormData(document.getElementById("oper_form")); 
	$.ajax({  
	      url:"payActive/savePayActive.do",  
	      type:"post",  
	      data:form,  
	      cache: false,  
	      processData: false,  
	      contentType: false,
	      success:function(data){  
	    	  $('#modal').modal('hide');
	    	  findPage({serviceName:serviceName});
	      		},  
	      }
	);          
	
}
