//serviceName:设置当前模块页的请求路径
var serviceName ='ReturnTaskPool';

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
	load();
    if(res_key=='ReturnTaskPool_add'){
        addForm(resUrl);
    }else 
		if(res_key=='ReturnTaskPool_upd'){
			var id = $('input[name="id"]').filter(':checked').val();	
			if(id == undefined ){
				ShowFailure('冻结操作必须选中对应的记录！');
				return ;
			}
			updateReturnTaskPool(resUrl = resUrl + '?id='+id);
			findPage({serviceName:serviceName});
		}else{
			fs(res_key,resUrl);
			ShowSuccess('操作成功！D:\\Excel.xls盘下');
		}
}

/**
 * 导出Excel
 * @param res_key
 * @param resUrl
 */
function fs(res_key,resUrl){
	if(res_key=='ReturnTaskPool_excel'){
		excel(resUrl);
	}
}
function excel(resUrl){
	$.ajax({  
	      url:resUrl,  
	      dataType: "JSON",
	      success:function(data){ 
	    	  findPage({serviceName:serviceName});
	    	  
	      },  
	      }
	);          
}



/**初始化新增管理用户界面(init方法)
 * init方法参数说明：
   1、lable 弹出的form表单的title
   2、init_url 以此路径加载form表单元素
   3、submit_url:设置次表单提交路径
   4、serviceName，必须设置，和模块名称一致
   5、callback：form表单元素加载成功之后回调
 */
//修改
function updateReturnTaskPool(resUrl){
	initForm({
		lable:'修改页面',
		init_url:resUrl,
		submit_url:'ReturnTaskPool/updateReturnTaskPool.do',
		serviceName:'ReturnTaskPool'
	});
}

//添加
function addForm(resUrl){
	initForm({
		lable:'添加页面',
		init_url:resUrl,
        submit_url:'ReturnTaskPool/saveReturnTaskPool.do',
        serviceName:'ReturnTaskPool'
	});
	
}

function load(){
	function objInit(obj){
	    return $(obj).html('<option>请选择</option>');
	}
	$.ajax({
		type:"post",
		url:"http://api.syhbuy.cn/api/index.php?module=good_class&method=get_goods_list&token=0862b38d5c23ac0703a3f8e30d78d05a",
		dataType:'json',
		success:function(data){
			
			$.each(data.data,function(n,value){
                if(value.gc_parent_id==0){
                    $("#goods").append("<option value="+value.gc_id+">"+value.gc_name+"</option>");
                }
            });
            $('#goods').change(function(){
                objInit('#good');
                $.each(data.data,function(n,value){
                    if($("#goods option:selected").val()==value.gc_parent_id){
                       $("#good").append("<option value="+value.gc_id+">"+value.gc_name+"</option>");
                    }
                });
            });
            $('#good').change(function(){
                objInit('#go');
                $.each(data.data,function(n,value){
                    if($("#good option:selected").val()==value.gc_parent_id){
                        $("#go").append("<option value="+value.gc_id+">"+value.gc_name+"</option>");
                    }
                });
            });
		}
});
	
}

function save(){
	var directObjId = $("#goods option:selected").text();
	var directObjId2 = $("#good option:selected").text();
	var directObjId3 = $("#go option:selected").text();
	$.ajax({ 
		  type:"post",
	      url:'ReturnTaskPool/saveReturnTaskPool.do',  
	      dataType: 'JSON',
	      data:$("#oper_form").serialize()+"&directObjId="+directObjId+"&directObjId2="+directObjId+"&directObjId3="+directObjId3,
	      serviceName:'ReturnTaskPool',
	      success:function(data){
	      findPage({serviceName:serviceName});  
	      ShowSuccess('操作成功！');
	      $('.close').click();
	      }
	});
	    
}
//显示影藏
function test(){
	var type = $("#type").val();
	if(0==type){
		$("#taskpool").hide();
	}else if(1==type){
		$("#taskpool").show();
	}
	
}

