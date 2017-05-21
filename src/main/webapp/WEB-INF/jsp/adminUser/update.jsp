<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/12
  Time: 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>

    <section>
        <div class="panel-body">
            <input  type="hidden" name="id" value="${adminUser.id}">
            <div class="form-group">
                <label class="col-sm-2 control-label">真实姓名</label>
                <div class="col-sm-10">
                      <input type="text" class="form-control" name="userName" value="${adminUser.userName}"
                             data-bv-notempty="true" data-bv-notempty-message="用户真实姓名不能为空" >
                </div>
            </div>
            <!--
            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">所在部门</label>
                <div class="col-sm-10">
                <select data-required="true" class="form-control">
                    <option value="">请选择</option>
                    <option value="foo">运营中心</option>
                    <option value="bar">研发中心</option>
                </select>
                </div>
            </div>
            -->
            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">登录账户</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control "  name="accountName" value="${adminUser.accountName}"
                           data-bv-notempty="true" data-bv-notempty-message="登录账户不能为空"
                           data-bv-regexp="true"
                           data-bv-regexp-regexp="[a-zA-Z0-9_\.]+"
                           data-bv-regexp-message="账户只能由字母数字组成"
                           data-bv-stringlength="true"
                           data-bv-stringlength-min="6"
                           data-bv-stringlength-max="30"
                           data-bv-stringlength-message="账户名称应由6到30个字符组成"
                           >
                </div>
            </div>
            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">登录密码</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" name="password" autocomplete="off" value="${adminUser.password}"
                           data-bv-notempty="true" data-bv-notempty-message="不能为空"
                           data-bv-regexp="true"
                           data-bv-regexp-regexp="[a-zA-Z0-9_\.]+"
                           data-bv-regexp-message="只能由字母数字组成"
                           data-bv-stringlength="true"
                           data-bv-stringlength-min="6"
                           data-bv-stringlength-max="30"
                           data-bv-stringlength-message="应由6到30个字符组成">

                </div>
            </div>
            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">账户角色</label>
                <div class="col-sm-10">
                    <select  data-required="true" class="form-control menu_select2" name="roleIds" multiple>
                        <c:forEach items="${urs}" var="user_role">
                            <option <c:if test="${user_role.checked}"> selected="selected" </c:if> value="${user_role.role.id}">${user_role.role.name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>

            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">账户状态</label>
                <div class="col-sm-10">
                <select data-required="true" class="form-control" name="locked">
                    <option value="0" <c:if test="${adminUser.locked ==0}"> selected </c:if> >正常</option>
                    <option value="1" <c:if test="${adminUser.locked ==1}"> selected </c:if> >锁定</option>
                </select>
                </div>
            </div>
            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">特别说明</label>
                <div class="col-sm-10">
                <textarea class="form-control " name="description">${adminUser.description}</textarea>
                </div>
            </div>
        </div>
    </section>


</body>
</html>
