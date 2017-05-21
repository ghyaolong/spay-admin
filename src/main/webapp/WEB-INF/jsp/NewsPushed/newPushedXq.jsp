<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>推送消息</title>
</head>
<body>
<form class="form-horizontal">
<div class="panel-body">
    <!-- 获取后台ID -->
    <input id="v" style="display: none;" name="id" value="{newsPushed.id}"/>
    		<div class="form-group">
	                <label class="col-sm-2 control-label">内容主图</label>
	                <div class="col-sm-10">
	                	<img alt="" src="${newsPushed.hostImg}" width="200" height="200">
	            	</div>
	                <div class="col-sm-10">
	                </div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	        </div>
	             <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">跳转链接</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="chaining" disabled value="${newsPushed.chaining}">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">标题内容</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="title"
	                      data-bv-notempty="true" data-bv-notempty-message="标题不能为空" disabled value="${newsPushed.title}">
	                </div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">发送时间</label>
	                <div class="col-sm-10">
	                      <input type="Date" class="form-control" name="sendTime"
	                      data-bv-notempty="true" data-bv-notempty-message="发送时间不能为空" disabled value="${newsPushed.sendTimeShow}">
	                </div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">操作人</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="operator" disabled value="${newsPushed.operator}">
	            	</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">操作时间</label>
	                <div class="col-sm-10">
	                	<input type="Date" class="form-control" name="operatorTime" disabled value="${newsPushed.operatorTimeShow}"
	                	data-bv-notempty="true" data-bv-notempty-message="操作时间不能为空">
	            	</div>
	            	
	            </div>
	</form>          
</body>

</html>
