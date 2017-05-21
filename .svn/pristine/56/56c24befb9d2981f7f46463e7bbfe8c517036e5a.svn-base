<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Title</title>
<script>
function a(){

 var b = document.getElementById("123");
 b.remove(0);
}
</script>
</head>
<body>
	<div class="panel-body">
			<!-- 获取后台ID -->
			<input id="v" style="display: none;" value="${payGeneral.id}"
				name="id" />
			<input id="v" style="display: none;" value="${payGeneral.cashCouponId}"
				name="cashCouponId" />
			<input id="v" style="display: none;" value="${payGeneral.title}"
				name="title" />
			<div class="form-group">
				<label class="col-sm-2 control-label">用户ID</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="userId"
						value="${payGeneral.userId}" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">通用券面额</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="denomination"
						value="${payGeneral.denomination}" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">通用券余额</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="couponMoney"
						value="${payGeneral.couponMoney}" data-bv-notempty="true"
						data-bv-notempty-message="余额不能为空"
						data-bv-regexp="true"
                        data-bv-regexp-regexp="^(([1-9]+[0-9]*.{1}[0-9]+)|([0].{1}[1-9]+[0-9]*)|([1-9][0-9]*)|([0][.][0-9]+[1-9]*))$"
                        data-bv-regexp-message="面额格式不正确" >
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">启用时间</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" name="enableTimeShow"
						value="${payGeneral.enableTimeShow}" data-bv-notempty="true"
						data-bv-notempty-message="启用时间不能为空">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">失效时间</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" name="disableTimeShow"
						value="${payGeneral.disableTimeShow}" data-bv-notempty="true"
						data-bv-notempty-message="失效时间不能为空">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">通用券状态</label>
				<div class="col-sm-10">
					<select data-required="true" class="form-control"
						name="couponSatus">
						<%-- <option value="1" <c:if test="${'1' eq payGeneral.couponSatus">selected</c:if>>${payGeneral.couponSatus}</option> --%>
						<option value="0" <c:if test="${'0' eq payGeneral.couponSatus}">selected</c:if>>使用中</option>
						<option value="1" <c:if test="${'1' eq payGeneral.couponSatus}">selected</c:if>>已使用</option>  
						<option value="2" <c:if test="${'2' eq payGeneral.couponSatus}">selected</c:if>>冻结</option>
					</select>
				</div>
			</div>
	</div>
</body>
</html>
