//serviceName:设置当前模块页的请求路径
var serviceName ='Reward';


// 页面加载完成列表页初始化
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
	if(res_key=='reward_add'){
		addForm(resUrl);
	}else 
		if(res_key=='reward_delete'){
			var id = $('input[name="id"]').filter(':checked').val();	
			if(id == undefined ){
				ShowFailure('删除操作必须选中对应的记录！');
				return ;
			}
			deleteReward(resUrl = resUrl + '?id='+id);
			findPage({serviceName:serviceName});
	    	  ShowSuccess('操作成功！');
		}else{
			fs(res_key,resUrl);
		}
	
}

function fs(res_key,resUrl){
	if(res_key=='reward_update'){
		var id = $('input[name="id"]').filter(':checked').val();
		if(id == undefined ){
			alert("修改奖励必须选中对应的记录！");
			return ;
		}
		
	}
    updateReward(resUrl = resUrl + '?id='+id);
}

//修改奖励
function updateReward(resUrl){
	initForm({
		lable:'修改奖励页面',
		init_url:resUrl,
		submit_url:'Reward/update.do',
		serviceName:'Reward'
	});
}


//添加奖励
function addForm(resUrl){
	initForm({
		lable:'添加奖励',
		init_url:resUrl,
        submit_url:'Reward/save.do',
        serviceName:'Reward'
	});
	
}

//删除奖励
function deleteReward(resUrl){
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












