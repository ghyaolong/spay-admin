//serviceName:设置当前模块页的请求路径
var serviceName ='payGeneral';

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
    if(res_key=='payGeneral_add'){
        addForm(resUrl);
    }else 
		if(res_key=='payGeneral_del'){
			var id = $('input[name="id"]').filter(':checked').val();	
			if(id == undefined ){
				ShowFailure('删除操作必须选中对应的记录！');
				return ;
			}
			deletePayGeneral(resUrl = resUrl + '?id='+id);
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
        lable:'新增通用券', 
        init_url:resUrl,
        submit_url:'payGeneral/save.do',
        serviceName:'payGeneral'
    });
}

/**
 * 删除规则
 * @param resUrl
 */
function deletePayGeneral(resUrl){
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
	if(res_key=='payGeneral_upd'){
		var id = $('input[name="id"]').filter(':checked').val();
		if(id == undefined ){
			ShowFailure('修改必须选中对应的记录！');
			return ;
		}
		
	}
	updatePayGeneral(resUrl = resUrl + '?id='+id);
}

//修改规则
function updatePayGeneral(resUrl){
	initForm({
		lable:'修改通用券页面',
		init_url:resUrl,
		submit_url:'payGeneral/updatePayGeneral.do',
		serviceName:'payGeneral'
	});
}
//查看详情
function findById(id){
	// $('#modal_btn').hide(); 
	// var id = $('input[name="id"]').val();
	initForm({
        lable:'查看用户通用券详情', 
        init_url:'payGeneral/findById.do?id='+id,
		submit_url:'#',
        serviceName:'payGeneral'
    });
}


function test(){
var a = $("#disableTimeShow").val();
var b = $("#enableTimeShow").val();

if(a!=""){
	  if(b>a){
		  ShowSuccess('失效时间不能小于启用时间！');
		  $("#disableTimeShow").val("");
	}
	
}

}

function tes(){
	var b = $("#enableTimeShow").val();
	var d = getCurrentDay();
	
		if(b<d){
			ShowSuccess('启用时间不能小于等于当前时间！');
			$("#enableTimeShow").val("");
		}
}


/**
 * 获得今日日期,格式yyyy-MM-dd
 * @returns {string}
 */
function getCurrentDay() {
    var date = new Date();
    var yyyy = date.getFullYear().toString();
    var mm = (date.getMonth() + 1).toString();
    var dd = (date.getDate()).toString();
    return yyyy + '-' + (mm[1] ? mm : "0" + mm[0]) + '-' + (dd[1] ? dd : "0" + dd[0]);
}

