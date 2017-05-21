<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Title</title>
</head>
<body>
<div class="panel-body">
    <form class="form-horizontal" onsubmit="return toVaild()">
    <!-- 获取后台ID -->
    <input id="v" style="display: none;" value="${parameter.id}" name="id"/>
    			<div class="form-group">
	                <label class="col-sm-2 control-label">业务Key</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="reskey" value="${parameter.reskey}"
	                	 data-bv-notempty="true" data-bv-notempty-message="业务key不能为空">
	            	</div>
	            </div>
        		<div class="form-group">
	                <label class="col-sm-2 control-label">业务名称</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="resName" value="${parameter.resName}"
	                      data-bv-notempty="true" data-bv-notempty-message="业务名称不能为空">
	                </div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">规则key</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="indexKey" value="${parameter.indexKey}"
	                	data-bv-notempty="true" data-bv-notempty-message="规则key不能为空">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">规则名称</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="indexName" value="${parameter.indexName}"
	                	 data-bv-notempty="true" data-bv-notempty-message="规则名称不能为空">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">规则Value</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="indexValue" value="${parameter.code}"
	                	 data-bv-notempty="true" data-bv-notempty-message="规则值不能为空">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">描述</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="description" value="${parameter.description}">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">参数类型</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="paramType" value="${parameter.paramType}"
	                	data-bv-notempty="true" data-bv-notempty-message="参数类型不能为空">
	            	</div>
	            </div>
    </form>
</div>
</body>
</html>
