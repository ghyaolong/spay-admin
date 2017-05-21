<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="panel-body">
    <form class="form-horizontal">
        <div class="form-group">
            <label class="col-sm-2 control-label">真实姓名</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="realName"
                data-bv-notempty="true" data-bv-notempty-message="真实姓名不能为空"
                			data-bv-stringlength="true"
                            data-bv-stringlength-min="2"
                            data-bv-stringlength-max="30"
                            data-bv-stringlength-message="真实姓名应由2到30个字符组成"
                >
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">昵称</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="userName"
                data-bv-notempty="true" data-bv-notempty-message="昵称不能为空"
                			data-bv-stringlength="true"
                            data-bv-stringlength-min="2"
                            data-bv-stringlength-max="30"
                            data-bv-stringlength-message="昵称应由2到30个字符组成"
                >
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">邮箱</label>
            <div class="col-sm-10"> 
                <input type="text" class="form-control" name="mail"
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
                <input type="text" class="form-control" name="phone"
                data-bv-notempty="true" data-bv-notempty-message="手机号不能为空"
                data-bv-regexp="true"
                data-bv-regexp-regexp="^1\d{10}$|^(0\d{2,3}-?|\(0\d{2,3}\))?[1-9]\d{4,7}(-\d{1,8})?$"
                data-bv-regexp-message="手机号请正确填写"
                >
            </div>
        </div>
        <div class="line line-dashed line-lg pull-in"></div>
        <div class="form-group">
            <label class="col-sm-2 control-label">地址</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="address"
                data-bv-notempty="true" data-bv-notempty-message="地址不能为空"
                >
            </div>
        </div>
        <div class="line line-dashed line-lg pull-in"></div>
        <div class="form-group">
            <label class="col-sm-2 control-label">性别</label>
            <div class="col-sm-10">
             <select id="sex" name="sex" class="form-control" >
	              <option value="true">男</option>
	              <option value="false">女</option>
             </select>  
            </div>
        </div>
        <div class="line line-dashed line-lg pull-in"></div>
        <div class="form-group">
            <label class="col-sm-2 control-label">状态</label>
            <div class="col-sm-10">
             <select id="accountState" name="accountState" class="form-control" >
	              <option value="0">正常</option>
	              <option value="1">冻结</option>
             </select>  
            </div>
        </div>
    </form>
</div>

</body>
</html>
