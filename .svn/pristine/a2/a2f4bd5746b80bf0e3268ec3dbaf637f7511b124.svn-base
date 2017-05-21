<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>修改账户状态</title>
</head>
<body>
<div class="panel-body">
    <form class="form-horizontal">
    <!-- 获取后台ID -->
    <input id="v" style="display: none;" value="${user.id}" name="id"/>
        <div class="form-group">
            <label class="col-sm-2 control-label">账户状态</label>
            <div class="col-sm-10">
               <select data-required="true" class="form-control" name="accountState" >
               <option value="0" <c:if test="${'0' eq user.accountState}">selected</c:if>>正常</option>
               <option value="1" <c:if test="${'1' eq user.accountState}">selected</c:if>>冻结</option>
               </select>
            </div>
        </div>
    </form>
</div>
</body>
</html>
				