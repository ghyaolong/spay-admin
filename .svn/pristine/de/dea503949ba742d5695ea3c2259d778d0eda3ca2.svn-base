<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>审核页面</title>
  <script src="./js/Balance/apply.js"></script>
</head>
<body>
	<section>
		<!-- 获取后台ID -->
		<input id="v" style="display: none;" name="id" value="${payApply.id}" />
		<div class="line line-dashed line-lg pull-in"></div>
		<div class="form-group">
			<label class="col-sm-2 control-label">会员名称</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="userId" value="${payApply.userId}" readonly="true"> 
					<input id="v" style="display: none;" name="singal" value="1" />
					<input id="v" style="display: none;" name="applytype"  value="${payApply.applytype}"/>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">调账金额</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="balanceamount"
					value="${payApply.balanceamount}" readonly="true">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">申请时间</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="searchEndTime"
					value="${payApply.searchEndTime}" readonly="true">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">状态</label>
			<div class="col-sm-10">
				<select data-required="true" class="form-control" placeholder="请输入充值状态" name="state" id="fin">
				   <option id= "state1" value="1" <c:if test="${'1' eq payApply.state}">selected</c:if>>审核中</option>
                   <option id= "state2" value="2" <c:if test="${'2' eq payApply.state}">selected</c:if>>审核通过</option>
                   <option id= "state3" value="3" <c:if test="${'3' eq payApply.state}">selected</c:if>>审核驳回</option>
				</select>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">缘由</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="advice" value="${payApply.advice}">
			</div>
		</div>
	</section>
</body>
</html>
