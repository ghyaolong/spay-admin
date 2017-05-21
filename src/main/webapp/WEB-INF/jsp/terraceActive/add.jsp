<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加规则</title>
</head>
<body>
    		<section>
    		<div class="form-group">
	                <label class="col-sm-2 control-label">标题</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="title"
	                      data-bv-notempty="true" data-bv-notempty-message="标题不能为空">
	                </div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">活动说明</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="activeInstruction"
	                	data-bv-notempty="true" data-bv-notempty-message="活动说明不能为空">
	            	</div>
	            </div>
	             <div class="form-group">
	                <label class="col-sm-2 control-label">开始时间</label>
	                <div class="col-sm-10">
	                	<input type="Date" class="form-control" name="beTime"
	                	data-bv-notempty="true" data-bv-notempty-message="开始时间不能为空">
	            	</div>
	            </div>
	             <div class="form-group">
	                <label class="col-sm-2 control-label">结束时间</label>
	                <div class="col-sm-10">
	                	<input type="Date" class="form-control" name="enTime"
	                	data-bv-notempty="true" data-bv-notempty-message="结束时间不能为空">
	            	</div>
	            </div>
	             <div class="form-group">
	                <label class="col-sm-2 control-label">状态</label>
	                <div class="col-sm-10">
	                <select type="text" class="form-control" name="status"
	                data-bv-notempty="true" data-bv-notempty-message="状态不能为空">
	                <option value="">请选择</option>
	                <option value="0">有效</option>
	                <option value="1">无效</option>
	                </select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
    </section>
</body>
</html>
