<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <section>
	<!-- 获取后台ID -->
    <input id="v" style="display: none;" name="id" value="${b.id}"/>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">会员</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="userId" value="${b.userId}"  readOnly="true">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">账户金额</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="accountbalance" id="accountbalance" value="${b.accountBalance}" readOnly="true">
	                	<input id="v" style="display: none;" name="singal" value="1"/>
	            	</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">减少金额</label>
	                <div class="col-sm-10">
	                	<textarea class="form-control" name="balanceamount" data-bv-notempty="true" onchange="test()" id="balanceamount"
	                	data-bv-notempty-message="减少金额不能为空"  
	                	data-bv-regexp="true"
                        data-bv-regexp-regexp="^(([1-9]+[0-9]*.{1}[0-9]+)|([0].{1}[1-9]+[0-9]*)|([1-9][0-9]*)|([0][.][0-9]+[1-9]*))$"
                        data-bv-regexp-message="金额只能由数字组成"></textarea>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">缘由</label>
	                <div class="col-sm-10">
	                	<textarea class="form-control" data-bv-notempty="true"  name="advice"
	                	data-bv-notempty-message="缘由不能为空"  
	                	data-bv-regexp="true"
                        data-bv-regexp-regexp="^[\u4e00-\u9fa5]*$"
                        data-bv-regexp-message="只能输入文本内容"></textarea>
	            	</div>
	            </div> 
	          
    </section>
</body>
</html>
