<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>推送消息</title>
</head>
<body>
<form class="form-horizontal">
<div class="panel-body">
    <!-- 获取后台ID -->
    <input id="v" style="display: none;" name="id" value="{appAdvertisement.id}"/>
    		 <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">标题</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="title" disabled value="${appAdvertisement.title}">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
    		<div class="form-group">
	             <label class="col-sm-2 control-label">广告图</label>
	               <div class="col-sm-10">
	                	<img alt="" src="${appAdvertisement.img}" width="200" height="200">
	            </div>
	               <div class="col-sm-10"></div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	        </div>
	        <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">广告类型</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="advertisementtype" disabled value="${appAdvertisement.advertisementtype}">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	        <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">广告顺序</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="advertisementOrder" disabled value="${appAdvertisement.advertisementOrder}">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	        <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">链接地址</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="url" disabled value="${appAdvertisement.url}">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	</form>          
</body>

</html>
