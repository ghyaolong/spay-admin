<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加规则</title>
    <script src="./js/activeRelation/add.js"></script>
    <script src="./js/businessDef/list.js"></script>
    <script src="./notebook_files/bootstrap-treeview.min.js"></script>
</head>
<body>
<form class="form-horizontal" onsubmit=" return ss()">
    		<section>
    		<div class="form-group">
	                <label class="col-sm-2 control-label">业务号</label>
	                <div class="col-sm-10">
	                <select id="bussinessId" name="bussinessId" type="text" class="form-control"
	                data-bv-notempty="true" data-bv-notempty-message="业务号不能为空">
	                    <option>请选择</option>
	                </select>
	                </div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">业务描述</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="businessDescribe"
	                	data-bv-notempty="true" data-bv-notempty-message="业务描述不能为空">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
    </section>
    </form>
</body>

</html>
