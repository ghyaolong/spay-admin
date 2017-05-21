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
            <div class="form-group">
                <label class="col-sm-2 control-label">资源名称</label>
                <div class="col-sm-10">
                      <input type="text" class="form-control" name="resName"
                             data-bv-notempty="true" data-bv-notempty-message="资源名称不能为空">
                </div>
            </div>

            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">父级资源</label>
                <div class="col-sm-10">
                <select data-required="true" class="form-control menu_select2" name="parentId">
                    <option value="0">----顶级目录----</option>
                    <c:forEach var = "key" items="${rs}" varStatus="s">
                        <c:if test="${key.resLevel != 3}">
                            <option value="${key.id}">
                                    ${key.resName}
                            </option>
                        </c:if>
                    </c:forEach>
                </select>
                </div>
            </div>
            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">资源类型</label>
                <div class="col-sm-10">
                    <select id="set_type" class="form-control" disabled>
                        <option value="1">目录</option>
                        <option value="2">菜单</option>
                        <option value="3">按钮</option>
                    </select>
                    <input id="type_value" type="hidden" name="type" value="1">
                    <input id="res_level_value" type="hidden" name="resLevel" value="1">

                </div>
            </div>

            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">唯一KEY</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control "  name="resKey"
                           data-bv-notempty="true" data-bv-notempty-message="唯一KEY不能为空"
                           data-bv-regexp="true"
                           data-bv-regexp-regexp="[a-zA-Z0-9_\.]+"
                           data-bv-regexp-message="唯一KEY只能由字母数字组成"
                           data-bv-stringlength="true"
                           data-bv-stringlength-min="6"
                           data-bv-stringlength-max="30"
                           data-bv-stringlength-message="唯一KEY应由6到30个字符组成"
                           data-bv-remote="true"
                           data-bv-remote-url="resources/validKey.do"
                           data-bv-remote-message="该key已存在"
                           data-bv-remote-type="POST"
                           data-bv-remote-delay="2000">
                </div>
            </div>
            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group" id="resUrl" style="display: none;">
                <label class="col-sm-2 control-label">URL地址</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" name="resUrl"
                           data-bv-notempty="true" data-bv-notempty-message="URL地址不能为空">
                </div>
            </div>
            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">icon</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control"  name="icon">
                </div>
            </div>

            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">是否隐藏</label>
                <div class="col-sm-10">
                <select data-required="true" class="form-control" name="isHide">
                    <option value="0" selected="selected">否</option>
                    <option value="1">是</option>
                </select>
                </div>
            </div>
            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">顺序</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control"  name="sort"
                           data-bv-notempty="true"
                           data-bv-notempty-message="顺序码不能为空！"
                           data-bv-regexp="true"
                           data-bv-regexp-regexp="^[1-9]\d*$"
                           data-bv-regexp-message="只能输入正整数">
                </div>
            </div>
            <div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">描述</label>
                <div class="col-sm-10">
                <textarea class="form-control " name="description"/>
                </div>
            </div>
        </div>
    </section>


</body>
</html>
