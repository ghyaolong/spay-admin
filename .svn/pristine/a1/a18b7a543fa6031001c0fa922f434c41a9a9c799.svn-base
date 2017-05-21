<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加规则</title>
</head>
<script type="text/javascript">
function test() {
	var text = $('#selectParams option:selected').text();//选中的文本
	var value = $('#selectParams option:selected').val();//选中的值
	if(value == "0") {
		$("#resKey").attr("style", "display:none;");
		$("#resName").attr("style", "display:none;");
		$("#resKeyInput").attr(text);
		$("#resNameInput").attr(value);
	} else {
		$("#resKey").show();
		$("#resName").show();
		$("#resKeyInput").attr("");
		$("#resNameInput").attr("");
	}
}
</script>
<body>
    		<section>
    		<div class="form-group">
	                <label class="col-sm-2 control-label">业务模块</label>
	                <div class="col-sm-10">
	                	<select id="selectParams" onchange="test();">
							<option value="0" selected="selected">新增模块</option>
							<option value="100">交易</option>
	                	</select>
	            	</div>
	         </div>
    			<div class="form-group" id="resKey">
	                <label class="col-sm-2 control-label">业务key</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="reskey" id="resKeyInput"
	                      data-bv-notempty="true" data-bv-notempty-message="业务key不能为空">
	                </div>
	            </div>
    			<div class="form-group" id="resName">
	                <label class="col-sm-2 control-label">业务名称</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="resName" id="resNameInput"
	                      data-bv-notempty="true" data-bv-notempty-message="业务名称不能为空">
	                </div>
	            </div>
    			<div class="form-group" id="indexKey">
	                <label class="col-sm-2 control-label">规则key</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="indexKey"
	                      data-bv-notempty="true" data-bv-notempty-message="规则key不能为空">
	                </div>
	            </div>
    			<div class="form-group" id="indexName">
	                <label class="col-sm-2 control-label">规则名称</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="indexName"
	                      data-bv-notempty="true" data-bv-notempty-message="规则名称不能为空">
	                </div>
	            </div>
    			<div class="form-group" id="indexValue">
	                <label class="col-sm-2 control-label">规则值</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="code"
	                      data-bv-notempty="true" data-bv-notempty-message="规则值不能为空">
	                </div>
	            </div>
    			<div class="form-group" id="paramType">
	                <label class="col-sm-2 control-label">参数类型</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="paramType"
	                      data-bv-notempty="true" data-bv-notempty-message="参数类型不能为空">
	                </div>
	            </div>
	            <div class="form-group" id="description">
	                <label class="col-sm-2 control-label">描述</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="description">
	            	</div>
	            </div>
    </section>
</body>
</html>
