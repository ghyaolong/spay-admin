<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加广告</title>
</head>
<body>
    		<section>
    		<div class="form-group">
	                <label class="col-sm-2 control-label">标题</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" id="title" name="title" onkeyup="checkemail(this.value)"
	                      data-bv-notempty="true" data-bv-notempty-message="标题不能为空">
	                </div>
	            </div>
    		<div class="form-group">
	                <label class="col-sm-2 control-label">广告图片</label>
	                <div class="col-sm-10">
	                	<input type="file" onkeyup="checkemail(this.value)" id="file" name="file" class="form-control"  accept=".xls,.doc,.txt,.pdf,.jpg" 
	                	data-bv-notempty="true" data-bv-notempty-message="图片不能为空">
	            	</div>
	                <div class="col-sm-10">
	                </div>
	            </div>
	             <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">广告类型</label>
	                <div class="col-sm-10">
	           <select data-required="true" class="form-control" id="advertisementtype" name="advertisementtype" data-bv-notempty="true" data-bv-notempty-message="类型不能为空">
               		<option value="">请选择</option>
               		<option value="0">App欢迎页</option>
               		<option value="1">App启动页</option>
               		<option value="2">首页轮播大图</option>
               		<option value="3">首页底部广告</option>
               </select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">广告顺序</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="advertisementOrder"
	                	data-bv-notempty="true" data-bv-notempty-message="广告顺序不能为空">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">链接地址</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="url"
	                	data-bv-notempty="true" data-bv-notempty-message="链接地址不能为空">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
    </section>
</body>
</html>
