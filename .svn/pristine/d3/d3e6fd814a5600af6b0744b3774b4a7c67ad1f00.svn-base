<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>修改奖励</title>
</head>
<body>
<div class="panel-body">
    <form class="form-horizontal">
    <!-- 获取后台ID -->
   <input id="v" style="display: none;" value="${active.id}" name="id"/>
        <div class="panel-body">
	            <div class="form-group">
	                <label class="col-sm-2 control-label">规则标题</label>
	                <div class="col-sm-10">
	                   <input type="text" class="form-control" name="title" value="${active.title}"
	                    data-bv-notempty="true" data-bv-notempty-message="标题不能为空">
	                </div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">活动比例</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control"  id="couponScale" name="couponScale"  value="${active.couponScale}"
	                	data-bv-notempty="true" data-bv-notempty-message="比例不能为空"
	                	data-bv-regexp="true"
                        data-bv-regexp-regexp="^(([1-9]\d{0,9})|0)(\.\d{1,2})?$"
                        data-bv-regexp-message="比例不正确">
	            	</div>
	            	</div>
	            </div>
    </form>
	        </div>
</body>
</html>
