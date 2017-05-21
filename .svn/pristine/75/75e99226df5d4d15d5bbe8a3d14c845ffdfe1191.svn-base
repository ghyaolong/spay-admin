<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/12
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
.form-group .col-sm-10 #couponScale {
    width: 180px;
    display: inline-block;
    padding-right: 0;
}
.form-group .col-sm-10 .bei{
	padding-left:10px;
}
</style>	
<body>
    <section>
	        <div class="panel-body">
	            <div class="form-group">
	                <label class="col-sm-2 control-label" >规则标题</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="title"
	                       data-bv-notempty="true" 
                           data-bv-notempty-message="标题不能为空"
                           data-bv-stringlength="true"
                           data-bv-stringlength-min="5"
                           data-bv-stringlength-max="30"
                           data-bv-stringlength-message="账户名称应由5到30个字符组成"
	                             >
	                </div>
	            </div>
	            <!--
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">所在部门</label>
	                <div class="col-sm-10">
	                <select data-required="true" class="form-control">
	                    <option value="">请选择</option>
	                    <option value="foo">运营中心</option>
	                    <option value="bar">研发中心</option>
	                </select>
	                </div>
	            </div>
	            -->
	            <div class="line line-dashed line-lg pull-in"></div>
	            <!-- <div class="form-group">
	                <label class="col-sm-2 control-label">比例</label>
					<div class="col-sm-10">
	                <select class="form-control" name="couponScale" >
	                	<option>10%</option>
	                	<option>20%</option>
	                	<option>30%</option>
	                	<option>40%</option>
	                	<option>50%</option>
	                </select>
						</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">活动开始时间</label>
	                <div class="col-sm-10">
	                	<input type="Date" class="form-control" name="activityBeginTime">
	            	</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group"  >
	                <label class="col-sm-2 control-label">活动结束时间</label>
	                <div class="col-sm-10">
	                	<input type="Date" class="form-control" name="activityEndTime">
	            	</div>
	            </div>
				<div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">券开始时间</label>
	                <div class="col-sm-10">
	                	<input type="Date" class="form-control" name="beginTime">
	            	</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group" >
	                <label class="col-sm-2 control-label">券结束时间</label>
	                <div class="col-sm-10">
	                	<input type="Date" class="form-control" name="endTime">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">定向类别</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="orientationCategory">
	            	</div>
	                <div class="col-sm-10">
	                </div>
	            </div> -->
	            <div class="form-group">
	                <label class="col-sm-2 control-label">定向对象</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="orientationId">
	            	</div>
	                <div class="col-sm-10">
	                </div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">返购买金额的</label>
	                <div class="col-sm-10">
	                	<input type="text" id="couponScale" name="couponScale"  class="form-control"
	                	data-bv-notempty="true" data-bv-notempty-message="比例不能为空"
	                	data-bv-regexp="true"
                        data-bv-regexp-regexp="^(([1-9]\d{0,9})|0)(\.\d{1,2})?$"
                        data-bv-regexp-message="比例不正确"><span class="bei">倍</span>
	            	</div>
	                	
	            	</div>
	                <div class="col-sm-10">
	                </div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">规则描述</label>
	                <div class="col-sm-10">
	                	<textarea class="form-control" name="ruleDesc" data-bv-notempty="true" data-bv-notempty-message="标题不能为空"></textarea>
	            	</div>
	                <div class="col-sm-10">
	                </div>
	            </div>
	            <!-- <div class="form-group">
	                <label class="col-sm-2 control-label">上传图片</label>
	                <div class="col-sm-10">
	                	<input type="file" name="file" class="form-control" accept=".xls,.doc,.txt,.pdf,.jpg">
	            	</div>
	                <div class="col-sm-10">
	                </div>
	            </div> -->
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	        </div>
    </section>
</body>
<script type="text/javascript">
function checkemail() {
	// 功能函数
	var temp = $.trim($("#couponScale").val());
	if(temp.length>10){
		ShowSuccess("格式过长，请重新输入！");
		$("#couponScale").val("");
		$("#couponScale").focus();
		return false;
	}
 	
  	var myreg = new RegExp("/^(\d*)?(\.)?\d+$/.test(this.value));");
	if (temp != "") {
		if (!myreg.test(temp)) {
			ShowSuccess('格式不正确，请重新输入！');
			$("#couponScale").val("");
			$("#couponScale").focus();
			return false;
		}
		return true;
	} else {
		alert("请设置倍数");
		return;
	}
}
</script>
</html>
