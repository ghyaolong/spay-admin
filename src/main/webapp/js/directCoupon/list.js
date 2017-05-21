//serviceName:设置当前模块页的请求路径
var serviceName ='directCoupon';
//页面加载完成列表页初始化
$(document).ready(function() {
	load();
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
    if(res_key=='directCoupon_add'){
        addForm(resUrl);
    }else 
		if(res_key=='directCoupon_del'){
			var id = $('input[name="id"]').filter(':checked').val();
			if(id == undefined ){
				ShowFailure('删除操作必须选中对应的记录！');
				return ;
			}
			deleteDirectCoupon(resUrl = resUrl + '?id='+id);
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
        lable:'添加定向代金券', 
        init_url:resUrl,
        submit_url:'directCoupon/saveDirectCoupon.do',
        serviceName:'directCoupon'
    });
}

/**
 * 删除规则
 * @param resUrl
 */
function deleteDirectCoupon(resUrl){
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
	if(res_key=='directCoupon_upd'){
		var id = $('input[name="id"]').filter(':checked').val();
		if(id == undefined ){
			ShowFailure('修改必须选中对应的记录！');
			return ;
		}
		
	}
	updateActiveRelation(resUrl = resUrl + '?id='+id);
}

//修改规则
function updateActiveRelation(resUrl){
	initForm({
		lable:'修改页面',
		init_url:resUrl,
		submit_url:'directCoupon/updateDirectCoupon.do',
		serviceName:'directCoupon'
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
	var val = document.getElementsByName("userId").value;
	var val1 = document.getElementsByName("title").value;
	var val2 = document.getElementsByName("denomination").value;
	var val3 = document.getElementsByName("enableTimeShow").value;
	var val4 = document.getElementsByName("disableTimeShow").value;
	var val5 = document.getElementsByName("directObjId").value;
	var val6 = document.getElementsByName("couponSatus").value;
	  if(val == ""){
	    alert("用户名不能为空");
	        return false;
	     }
	  if(val1 == ""){
		    alert("标题不能为空");
		        return false;
		     }

	  if(val2 == ""){
		    alert("面额不能为空");
		        return false;
		     }
	  if(val == ""){
		    alert("启用时间不能为空");
		        return false;
		     }
	  if(val == ""){
		    alert("失效时间不能为空");
		        return false;
		     }
	  if(val == ""){
		    alert("定向类别不能为空");
		        return false;
		     }
	  if(val == ""){
		    alert("返券状态不能为空");
		        return false;
		     }


	var directObjId1Name = $("#good option:selected").text();
	var directObjId2Name = $("#goods option:selected").text();
	var directObjId3Name = $("#go option:selected").text();
	
	$.ajax({  
	      url:'directCoupon/saveDirectCoupon.do',  
	      dataType: "JSON",
	      type:'POST',
	      data:$("#rule_form").serialize()+"&directObjId1Name="+directObjId1Name+"&directObjId2Name="+directObjId2Name+"&directObjId3Name="+directObjId3Name,
	      success:function(data){
	    	  findPage({serviceName:'directCoupon'});
	    	  ShowSuccess(data);
	    	  $(".close").click();
	      }
	});
}	
	
	function update(){
		var directObjId1Name = $("#good option:selected").text();
		var directObjId2Name = $("#goods option:selected").text();
		var directObjId3Name = $("#go option:selected").text();
		
		$.ajax({  
		      url:'directCoupon/updateDirectCoupon.do',  
		      dataType: "JSON",
		      type:'POST',
		      data:$("#update_form").serialize()+"&directObjId1Name="+directObjId1Name+"&directObjId2Name="+directObjId2Name+"&directObjId3Name="+directObjId3Name,
		      success:function(data){
		    	  findPage({serviceName:'directCoupon'});
		    	  ShowSuccess(data);
		    	  $(".close").click();
		      }
		});
}
	
	function setDirectObjName(id, hiddenId) {
		debugger;
		var directObjIdName = $("#" +id + " option:selected").text();
		$("#"+hiddenId).val(directObjIdName);
	}

	
	function checkDate(){
		var a = $("#disableTimeShow").val();
		var b = $("#enableTimeShow").val();
		if(b>a){
			ShowSuccess("失效时间不能小于开始时间！");
			$("#disableTimeShow").val("");
			
		}
		
	}
	
//获取当前时间	
   function test(){
	   
		var b = $("#enableTimeShow").val();
		var d = getCurrentDay();
			if(b<d){
				ShowSuccess('启用时间不能小于等于当前时间！');
				$("#enableTimeShow").val("");
			}
	}

   function getCurrentDay() {
	    var date = new Date();
	    var yyyy = date.getFullYear().toString();
	    var mm = (date.getMonth() + 1).toString();
	    var dd = (date.getDate()).toString();
	    return yyyy + '-' + (mm[1] ? mm : "0" + mm[0]) + '-' + (dd[1] ? dd : "0" + dd[0]);
	}
