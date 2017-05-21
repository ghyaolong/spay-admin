<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<title>Title</title>
</head>
<body>
	<div class="panel-body">
			<div class="form-group">
				<label class="col-sm-2 control-label">标题</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="title"
					data-bv-notempty="true" data-bv-notempty-message="标题不能为空">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">面额</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="denomination"
					 data-bv-notempty="true" data-bv-notempty-message="面额不能为空"
					 data-bv-regexp="true"
                     data-bv-regexp-regexp="^(([1-9]+[0-9]*.{1}[0-9]+)|([0].{1}[1-9]+[0-9]*)|([1-9][0-9]*)|([0][.][0-9]+[1-9]*))$"
                     data-bv-regexp-message="面额格式不正确" >
				</div>
			</div>
					<div class="form-group">
				<label class="col-sm-2 control-label">启用时间</label>
				<div class="col-sm-10">
					<input type="Date" class="form-control" name="enableTimeShow" id="enableTimeShow" onchange="tes()"
					data-bv-notempty="true" data-bv-notempty-message="启用时间不能为空"
					>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">失效时间</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" name="disableTimeShow" id="disableTimeShow" onchange="test()"
					data-bv-notempty="true" data-bv-notempty-message="失效时间不能为空">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">用户ID</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="userId"
					data-bv-notempty="true" data-bv-notempty-message="用户ID不能为空">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
	</div>
</body>

</html>
