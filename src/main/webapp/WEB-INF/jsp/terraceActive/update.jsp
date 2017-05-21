<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Title</title>
</head>
<body>
<div class="panel-body">
    <form class="form-horizontal">
    <!-- 获取后台ID -->
    <input id="v" style="display: none;" value="${terraceActive.id}" name="id"/>
        <div class="form-group">
            <label class="col-sm-2 control-label">标题</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="title" value="${terraceActive.title}"
                data-bv-notempty="true" data-bv-notempty-message="标题不能为空">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">活动说明</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="activeInstruction" value="${terraceActive.activeInstruction}"
                data-bv-notempty="true" data-bv-notempty-message="活动说明不能为空">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">开始时间</label>
            <div class="col-sm-10">
                <input type="Date" class="form-control" name="beTime" value="${terraceActive.beTime}"
                data-bv-notempty="true" data-bv-notempty-message="开始时间不能为空">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">结束时间</label>
            <div class="col-sm-10">
                <input type="Date" class="form-control" name="enTime" value="${terraceActive.enTime}"
                data-bv-notempty="true" data-bv-notempty-message="结束时间不能为空">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">状态</label>
            <div class="col-sm-10">
                <select type="text" class="form-control" name="status" value="${terraceActive.status}"
                 data-bv-notempty="true" data-bv-notempty-message="状态不能为空">
	                <option value="">请选择</option>
	                <option value="0">有效</option>
	                <option value="1">无效</option>
	                </select>
            </div>
        </div>
    </form>
</div>
</body>
</html>
