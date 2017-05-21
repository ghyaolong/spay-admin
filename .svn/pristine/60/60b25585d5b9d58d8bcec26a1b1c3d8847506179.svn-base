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
	<input id="v" style="display: none;" value="${topuPauditVo.id}" name ="id"/>
	<input id="v1" style="display: none;" value="${topuPauditVo.reskey}" name ="reskey"/>
        <div class="form-group">
            <label class="col-sm-2 control-label">用户</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="userId" disabled value="${topuPauditVo.userId}">
                <input type="hidden" value="${topuPauditVo.userId}"  name="userId" >
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">手机号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="phone" disabled value="${topuPauditVo.phone}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">充值金额</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" disabled  value="${topuPauditVo.payAccount}">
                <input type="hidden" name="payAccount"  value="${topuPauditVo.payAccount}">
            </div>
        </div>
        <div class="line line-dashed line-lg pull-in"></div>
        <div class="form-group">
            <label class="col-sm-2 control-label">充值时间</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="rechargeDateShow" disabled value="${topuPauditVo.rechargeDateShow}">
            </div>
        </div>
        <div class="line line-dashed line-lg pull-in"></div>
        <div class="form-group">
            <label class="col-sm-2 control-label">充值方式</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="rechargeWay" disabled value="${topuPauditVo.rechargeWay}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">流水号</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="bankFlow" disabled value="${topuPauditVo.bankFlow}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">转账银行</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="tranfserBank" disabled value="${topuPauditVo.tranfserBank}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">转账单</label>
            <div class="col-sm-10">
                <span onclick="test()"><img src="${topuPauditVo.transferOrder}" id="transferOrder" name="transferOrder" height="200" width="200"></span>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">审核状态</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="state" disabled value="${topuPauditVo.state}">
            </div>
        </div>
         <div class="form-group">
            <label class="col-sm-2 control-label">审核时间</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="auditDate" disabled value="${topuPauditVo.auDate}">
            </div>
        </div>
         <div class="form-group">
            <label class="col-sm-2 control-label">备注</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="remark" disabled value="${topuPauditVo.remark}">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">审核</label>
            <div class="col-sm-10">
        <select data-required="true" class="form-control" name="state" value="${topuPauditVo.state}">
               <option value="3">审核成功</option>
               <option value="4">审核驳回</option>
               </select>
             </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">审核说明</label>
            <div class="col-sm-10">
                <textarea rows="5" cols="20" class="form-control" name="stateDesc"></textarea>
            </div>
        </div>
    </form>
</div>
</body>
</html>
