<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>Title</title>
</head>
<body>
<div class="panel-body">
    <form class="form-horizontal">
    <!-- 获取后台ID -->
	<input id="v" style="display: none;" value="${topuPauditVo.id}" name="id"/>
        <div class="form-group">
            <label class="col-sm-2 control-label">用户</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="userId" name="userId" disabled="disabled" value="${topuPauditVo.userId}"
                >
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">付款账户名称</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="draweeAccountName" name="draweeAccountName" value="${topuPauditVo.draweeAccountName}"
                data-bv-notempty="true" data-bv-notempty-message="付款账户名称不能为空">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">付款账号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="draweeAccount" name="draweeAccount" value="${topuPauditVo.draweeAccount}"
                data-bv-notempty="true" data-bv-notempty-message="付款账号不能为空">
            </div>
        </div>
        <%-- <div class="form-group">
            <label class="col-sm-2 control-label">充值金额</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="payAccount" value="${topuPauditVo.payAccount}">
            </div>
        </div> --%>
       <%--  <div class="line line-dashed line-lg pull-in"></div>
        <div class="form-group">
            <label class="col-sm-2 control-label">充值时间</label>
            <div class="col-sm-10">
                <input type="Date" class="form-control" name="rechargeDate" value="${topuPauditVo.rechargeDate}">
            </div>
        </div>
        <div class="line line-dashed line-lg pull-in"></div>
        <div class="form-group">
            <label class="col-sm-2 control-label">充值方式</label>
            <div class="col-sm-10">
               <select data-required="true" class="form-control" name="rechargeWay" placeholder="请选择充值方式">
               <option value="0" selected="selected">银联</option>
               <option value="1">微信</option>
               <option value="2">支付宝</option>
               <option value="3">易宝</option>
               <option value="4">线下转账</option>
               </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">状态</label>
            <div class="col-sm-10">
               <select data-required="true" class="form-control" name="state" placeholder="请选择充值状态">
               <option value="">请选择</option>
               <option value="0">审核中</option>
               <option value="1">充值成功</option>
               <option value="2">充值失败</option>
               <option value="3">审核成功</option>
               <option value="4">审核驳回</option>
               </select>
            </div>
        </div> --%>
    </form>
</div>
</body>
</html>
