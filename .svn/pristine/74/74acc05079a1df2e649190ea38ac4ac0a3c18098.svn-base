//serviceName:设置当前模块页的请求路径
var serviceName ='ruleManage';

// 列表页初始化
$(document).ready(function() {
	findPage({serviceName:'ruleManage'});
});

//点击页面检索按钮
function ruleManage(){
	debugger;
    findPage({serviceName:serviceName});
}

//功能区操作定义
function fn(res_key,resUrl){
	if(res_key=='rule_save'){
		addForm(resUrl);
	}
}

//添加规则
function addForm(resUrl){
	initForm({
		lable:'创建规则',
		init_url:resUrl,
        submit_url:'ruleManage/saveRuleManage.do',
        serviceName:'ruleManage'
	});
}
/**
 * 选择定向时 定向选项显示
 * 
 */
function change(number){
	var op = $('#state'+number).val();
	if(op==1){
		$('#option'+number).css("display","block");
	}else{
		$('#option'+number).css("display","none");
	}
}
var index = 0;

/**
 * 选择长期时 修改天数框 为只读
 * 
 */
function show(num){
	$('#day'+num).val("");
	if($('#checkbox'+num).is(':checked')) {
		$('#day'+num).attr("readOnly",true);
	}else{
		$('#day'+num).attr("readOnly",false);
	}
}

var n = 1;
function clone(){
	var d = $("#num"+n);
	$("#num"+n).css("display","block");
	n+=1;
}



function validate(val){  
    var reg = new RegExp("^[0-9]*$");  
 if(!reg.test(val)){  
     alert("请输入数字!");  
 }  
 if(!/^[0-9]*$/.test(obj.value)){  
     alert("请输入数字!");  
 }  
}  
function saveList(){
	var list = [];
	var ruleDesc = $("#section").find("input[name=ruleDesc][type=text]").val();
	for(var i = 0;i<index;i++){
		debugger;
	var divs = $("#num"+i);
	 var indate  = divs.find("input[type=text][name=indate]").val();
	 var reg = new RegExp("^[0-9]*$");
	 if(!reg.test(indate)){  
		 indate = "0";
	 }
	 
	var dataa = {
			timeInterval:divs.find("input[name=timeInterval]").val(),
			rewardName:divs.find("input[name=rewardName]").val(),
			rewardObjType:divs.find("select[name=rewardObjType]").val(),
			bonus:divs.find("input[name=bonus]").val(),
			businessId:divs.find("select[name=businessId]").val(),
			isIndate:divs.find("input[type=checkbox][name=isIndate]").val(),
			indate:indate,
			amount:divs.find("input[type=text][name=amount]").val(),
			price:divs.find("input[type=text][name=price]").val(),
			directObjId1Name:divs.find("select[name=directObjId1] option:selected").text(),
			directObjId2Name:divs.find("select[name=directObjId2] option:selected").text(),
			directObjId3Name:divs.find("select[name=directObjId3] option:selected").text(),
			directObjId1:divs.find("select[name=directObjId1] option:selected").val(),
			directObjId2:divs.find("select[name=directObjId2] option:selected").val(),
			directObjId3:divs.find("select[name=directObjId3] option:selected").val(),
			uplimit:divs.find("input[name=uplimit]").val(),
			directCategory:divs.find("select[name=directCategory]").val(),
			rewardType:divs.find("select[name=rewardType]").val(),
			rewardRef:divs.find("select[name=rewardRef]").val(),
			periodCount:i+1,
	}
	list.push(dataa);
	}
	var data = {
			"ruleDesc":ruleDesc,
			"data":list
	}
	var obj = JSON.stringify(data);
	$.ajax({
		type: "POST",
		url: "ruleManage/saveRuleManage.do",
		data: {data:obj},
		dataType:'json',
		success: function(data){
			findPage({serviceName:'ruleManage'});
	    	  ShowSuccess(data);
	    	  $(".close").click();

		}
	});
}

function clone2(){
	getDivContext(index);
	index+=1;
}
function payWay(i){
	
	var divs = $("#num"+i);
	var rewareType = divs.find("select[name=rewardType]").val();
	var sel = divs.find("select[name=directCategory]");
	sel.empty();
	if(rewareType==0){//现金支付
		sel.append("<option value='3'>金额</option>");
	}else{
		sel.append("<option value='1'>定向券</option>");
		sel.append("<option value='2' selected='selected'>通用券</option>");
	}
	change(i);
}

function getDivContext(index) {
	function objInit(obj){
        return $(obj).html('<option>请选择</option>');
    }
		$.ajax({
			type:"post",
			url:"http://api.syhbuy.cn/api/index.php?module=good_class&method=get_goods_list",
			dataType:'json',
			success:function(data){
				var context = 
					"<div class='panel-body' id='num"+index+"'>"+
					"<div class='form-group'>"+
					"	<label class='col-sm-2 control-label'>送券方式</label>"+
					"</div>"+
					"<div class='line line-dashed line-lg pull-in'></div>"+
					"	<div class='form-group'>"+
					"		<label class='col-sm-2 control-label'>奖励名称</label>"+
					"		<div class='col-sm-10'>"+
					"			<input type='text' class='form-control' name='rewardName'>"+
					"		</div>"+
					"	</div>"+
					"<div class='form-group'>"+
					"	<label class='col-sm-2 control-label'>状态</label>"+
					"	<div class='col-sm-10'>"+
					"		<select data-required='true' class='form-control' name='timeRefType'"+
					"			style='WIDTH: 150px;float: left;'>"+
					"			<option value='0' selected='selected' >订单支付成功后</option>"+
					"		</select>"+ 
					"		<input type='text' class='form-control' name='timeInterval' style='width: 100px;float: left; 'data-bv-regexp='true' data-bv-regexp-regexp='^[0-9]*[1-9][0-9]*$' data-bv-regexp-message='请填写数字'>天"+
					"	</div>"+
					"</div>"+
					""+
					"<div class='line line-dashed line-lg pull-in'></div>"+
					"<div class='form-group'>"+
					"	<label class='col-sm-2 control-label'>规则指向</label>"+
					"	<div class='col-sm-10'>"+
					"		<select data-required='true' class='form-control' name='rewardObjType'"+
					"			style='WIDTH: 200px'>"+
					"			<option value='0' selected='selected'>买方</option>"+
					"			<option value='1'>卖方</option>"+
					"			<option value='2'>第三方</option>"+
					"		</select>"+
					"	</div>"+
					"<label class='col-sm-2 control-label'>返还类型</label>"+
					"	<div class='col-sm-10'>"+
					"		<select data-required='true' class='form-control' name='rewardType' onchange='payWay("+index+")' "+
					"			style='WIDTH: 200px'>"+
					"			<option value='0' selected='selected'>现金</option>"+
					"			<option value='1'>代金券</option>"+
					"		</select>"+
					"	</div>"+
					"	<div class='form-group'>"+
					"		<label class='col-sm-2 control-label'>返商品价格的</label>"+
					"		<div class='col-sm-10'>"+
					"			<input type='text' class='form-control' name='bonus' style='width:100px;float: left;' data-bv-regexp-regexp='^[0-9]*[1-9][0-9]*$' data-bv-regexp='true' >%的"+
					"		</div>"+
					"		<div class='col-sm-10'>"+
					"			<select data-required='true' class='form-control' name='rewardRef'"+
					"				style='width: 100px; float: left;' >"+
					"				<option value='0'>百分比</option>"+
					"				<option value='1'>固定值</option>"+
					"			</select>"+
					"		</div>"+
					
					"<label class='col-sm-2 control-label'>定向到平台</label>"+
					"		<div class='col-sm-10'>"+
					"			<select data-required='true' class='form-control' name='businessId' style='WIDTH: 100px; float: left;'>"+
					"				<option value='01' selected='selected'>商城</option>"+
					"				<option value='02'>蜂巢</option>"+
					"				<option value='03'>房产</option>"+
					"				<option value='04'>装修</option>"+
					"				<option value='05'>汽车</option>"+
					"			</select> " +
					"			<select data-required='true' class='form-control' name='directCategory' id='state"+index+"'"+
					"				style='width: 100px; float: left;' onchange='change("+index+")'>"+
					"				<option value='3'selected='selected'>金额</option>"+
					"			</select>"+
					"		</div>"+
					"<div class='form-group' id='option"+index+"' style='display: none'>"+
					"		<label class='col-sm-2 control-label'>定向到</label>"+
					"		<div class='col-sm-10'>"+
					"			<select name='directObjId1' id=goods"+index+" data-required='true' class='form-control'> "+
				    "			<option value='0'>请选择</option> "+
				    "			</select> "+
				    "			<select name='directObjId2' id=good"+index+" data-required='true' class='form-control'> "+
				    "			<option value='0'>请选择</option> "+
				    "			</select> "+
				    "			<select name='directObjId3' id=go"+index+" data-required='true' class='form-control'> "+
				    "			<option value='0'>请选择</option> "+
				    "			</select> "+
					"				</div>"+
					"			</div>"+
					"		</div>"+
					"<div class='form-group'>"+
					"	<label class='col-sm-2 control-label'>上限值</label>"+
					"		<div class='col-sm-10'>"+
					"			<input type='text' class='form-control' name='uplimit' data-bv-regexp-regexp='^[0-9]*[1-9][0-9]*$' data-bv-regexp='true' >"+
					"		</div>"+
					"</div>"+
					"<div class='form-group'>"+
					"	<label class='col-sm-2 control-label'>数量</label>"+
					"		<div class='col-sm-10'>"+
					"			<input type='text' class='form-control' name='amount' data-bv-regexp-regexp='^[0-9]*[1-9][0-9]*$' data-bv-regexp='true' >"+
					"		</div>"+
					"</div>"+
					"<div class='form-group'>"+
					"	<label class='col-sm-2 control-label'>金额/单价</label>"+
					"		<div class='col-sm-10'>"+
					"			<input type='text' class='form-control' name='price' data-bv-regexp-regexp='^[0-9]*[1-9][0-9]*$' data-bv-regexp='true' >"+
					"		</div>"+
					"</div>"+
					"	</div>"+
					"	<div class='form-group'>"+
					"		<label class='col-sm-2 control-label'>有效期为</label>"+
					"		<div class='col-sm-10'>"+
					"			<input type='text' class='form-control' name='indate' style='width:100px;' id = 'day"+index+"' data-bv-regexp-regexp='^[0-9]*[1-9][0-9]*$' data-bv-regexp='true' >天"+
					"			<input type='checkbox' name='isIndate' onchange='show("+index+")' id='checkbox"+index+"' >长期"+
					"		</div>"+
					"	</div>"+
					"	<br>"+
					"</div>";
				$("#section").append(context);
				
				
				$.each(data.data,function(n,value){
	                if(value.gc_parent_id==0){
	                    $("#goods"+index).append("<option value="+value.gc_id+">"+value.gc_name+"</option>")
	                }
	            });
	            $('#goods'+index).change(function(){
	                objInit('#good'+index);
	                $.each(data.data,function(n,value){
	                    if($("#goods"+index+" option:selected").val()==value.gc_parent_id){
	                       $("#good"+index).append("<option value="+value.gc_id+">"+value.gc_name+"</option>");
	                    }
	                })
	            });
	            $('#good'+index).change(function(){
	                objInit('#go'+index);
	                $.each(data.data,function(n,value){
	                    if($("#good"+index+" option:selected").val()==value.gc_parent_id){
	                        $("#go"+index).append("<option value="+value.gc_id+">"+value.gc_name+"</option>");
	                    }
	                })
	            });
			}
		});
	}
