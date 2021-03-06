<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>推送消息</title>
</head>
<body>
    		<section>
    		<div class="form-group">
	                <label class="col-sm-2 control-label">标题内容</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="title"
	                     	data-bv-notempty="true" data-bv-notempty-message="标题内容不能为空"
                			data-bv-stringlength="true"
                            data-bv-stringlength-min="6"
                            data-bv-stringlength-max="100"
                            data-bv-stringlength-message="标题应由6到100个字符组成">
	                </div>
	            </div>
	             <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">操作人</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="operator"
	                	data-bv-notempty="true" data-bv-notempty-message="操作人不能为空">
	            	</div>
	            </div>
	             <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">跳转链接</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="chaining">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	             <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">内容主图</label>
	                <div class="col-sm-10">
	                	<input type="file" name="file" class="form-control" accept=".xls,.doc,.txt,.pdf,.jpg"
	                	data-bv-notempty="true" data-bv-notempty-message="主图不能为空">
	            	</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
    </section>
</body>
</html>
