<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>推送消息</title>
</head>
<body>
<form class="form-horizontal">
<div class="panel-body">
     <!-- 获取后台ID -->
	 <input id="v" style="display: none;" value="${returnTaskPool.id}" name="id"/>
	             <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">状态</label>
	                <div class="col-sm-10">
	                <select data-required="true" class="form-control" id="freezeAlive" name="freezeAlive" value="${returnTaskPool.freezeAlive}"
	                data-bv-notempty="true" data-bv-notempty-message="状态不能为空">
               		<option value="">请选择</option>
               		<option value="0">正常</option>
               		<option value="1">停用</option>
               </select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	   </div>
	    <div class="modal-footer">
	    <button type="button" class="btn btn-default" data-dismiss="modal">忽略</button>
	    <button type="submit" class="btn btn-primary" id="modal_btn">保存</button>
	    </div>
	</form>          
</body>

</html>
