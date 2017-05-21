<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Title</title>
<script src="./js/ruleManage/list.js"></script>
</head>
<body id="body">
<div id="ruleDiv">
	<section id = "section">
		<div class="form-group">
	       <label class="col-sm-2 control-label">规则标题</label>
	          <div class="col-sm-10" id = "desc">
	              <input type="text" class="form-control" name="ruleDesc" data-bv-notempty="true" data-bv-notempty-message="规则标题不能为空">
	          </div>
	   </div>
	</section>
		<input type="button" onclick="clone2()" value="添加更多">
</div>
</body>
</html>
