<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Title</title>
</head>
<body>
<div class="panel-body">
    <form class="form-horizontal">
    <!-- 获取后台ID -->
    <input id="v" style="display: none;" value="${user.id}" name="id"/>
    <input id="v" style="display: none;" value="${user.userId}" name="userId"/>
        <div class="form-group">
            <label class="col-sm-2 control-label">用户</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="id" disabled value="${user.id}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">昵称</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="userName" disabled value="${user.userName}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">邮箱</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="mail" value="${user.mail}"
                data-bv-notempty="true" data-bv-notempty-message="邮箱不能为空"
               data-bv-regexp="true"
                data-bv-regexp-regexp="([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})"
                data-bv-regexp-message="邮箱格式不正确"
                >
            </div>
        </div>
        <div class="line line-dashed line-lg pull-in"></div>
        <div class="form-group">
            <label class="col-sm-2 control-label">手机号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="phone" value="${user.phone}"
                data-bv-notempty="true" data-bv-notempty-message="手机号不能为空"
                data-bv-regexp="true"
                data-bv-regexp-regexp="^1\d{10}$|^(0\d{2,3}-?|\(0\d{2,3}\))?[1-9]\d{4,7}(-\d{1,8})?$"
                data-bv-regexp-message="手机号请正确填写"
                >
            </div>
        </div>
        <div class="line line-dashed line-lg pull-in"></div>
        <div class="form-group">
            <label class="col-sm-2 control-label">性别</label>
            <div class="col-sm-10">
                <select id="sex" name="sex" class="form-control" value="${user.sex}">
	              <option value="true">男</option>
	              <option value="false">女</option>
             </select>  
            </div>
        </div>
        <div class="line line-dashed line-lg pull-in"></div>
        <div class="form-group">
            <label class="col-sm-2 control-label">地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="address" value="${user.address}"
                data-bv-notempty="true" data-bv-notempty-message="地址不能为空"
                >
            </div>
        </div>
        <%-- <div class="form-group">
            <label class="col-sm-2 control-label">真实姓名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="realName" disabled value="${user.realName}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">身份证号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="idCard" disabled value="${user.idCard}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">账户余额</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="accountBalance" disabled value="${user.accountBalance}">
            </div>
        </div> --%>
    </form>
</div>
</body>
</html>
