<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!--  data-bv-remote="true"
      data-bv-remote-url="role/validKey.do"
      data-bv-remote-message="该key已存在" 
-->
    <section>
            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">唯一KEY</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control "  name="roleKey"
                           data-bv-notempty="true" data-bv-notempty-message="唯一KEY不能为空"
                           data-bv-regexp="true"
                           data-bv-regexp-regexp="[a-zA-Z0-9_\.]+"
                           data-bv-regexp-message="唯一KEY只能由字母数字组成"
                           data-bv-stringlength="true"
                           data-bv-stringlength-min="6"
                           data-bv-stringlength-max="30"
                           data-bv-stringlength-message="唯一KEY应由6到30个字符组成"
                           data-bv-remote-delay="2000" >
                </div>
            </div>
 			<div class="panel-body">
            <div class="form-group">
                <label class="col-sm-2 control-label">角色名称</label>
                <div class="col-sm-10">
                      <input type="text" class="form-control" name="name"
                             data-bv-notempty="true" data-bv-notempty-message="角色名称不能为空">
                </div>
            </div>
            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">状态</label>
                <div class="col-sm-10">
                <select data-required="true" class="form-control" name="state">
                    <option value="0" selected="selected">有效</option>
                    <option value="1">无效</option>
                </select>
                </div>
            </div>

            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">描述</label>
                <div class="col-sm-10">
                <textarea class="form-control " name="description"></textarea>
                </div>
            </div>
        </div>
    </section>
</body>
</html>
