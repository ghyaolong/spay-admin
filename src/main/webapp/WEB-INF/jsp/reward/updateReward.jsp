<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>修改奖励</title>
</head>
<body>
<div class="panel-body">
    <form class="form-horizontal">
    <!-- 获取后台ID -->
    <input id="v" style="display: none;" value="${reward.id}" name="id"/>
        <div class="form-group">
            <label class="col-sm-2 control-label">规则ID</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="ruleId" value="${reward.ruleId}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">时间参考类型</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="timeRefType" value="${reward.timeRefType}"
                data-bv-notempty="true" data-bv-notempty-message="时间间隔不能为空">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">时间间隔</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="timeInterval" value="${reward.timeInterval}"
                data-bv-notempty="true" data-bv-notempty-message="时间间隔不能为空">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">期数</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="periodCount" value="${reward.periodCount}"
                data-bv-notempty="true" data-bv-notempty-message="期数不能为空">
            </div>
        </div>
    </form>
</div>
</body>
</html>
