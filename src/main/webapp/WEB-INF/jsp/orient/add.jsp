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
	                <label class="col-sm-2 control-label">用户名</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="title"
	                             data-bv-notempty="true" data-bv-notempty-message="标题不能为空" value="${orient.userAccountName}" disabled="disabled">
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
	                <label class="col-sm-2 control-label">代金券</label>
	                <div class="col-sm-10">
	                	<input class="form-control" name="cashCouponId" value=${orient.cashCouponId} disabled="disabled">
	            	</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group" id="input" >
	                <label class="col-sm-2 control-label">余额</label>
	                <div class="col-sm-10">
	                	<input  class="form-control" name="couponMoney" value="${orient.couponMoney}" disabled="disabled"> 
	            	</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">面值</label>
	                <div class="col-sm-10">
	                	<input  class="form-control" name="denomination" value="${orient.denomination}" disabled="disabled">
	            	</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group" id="input" >
	                <label class="col-sm-2 control-label">生成时间</label>
	                <div class="col-sm-10">
	                	<input class="form-control" name="generateTime" value="${orient.generateTime}" disabled="disabled">
	            	</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">定向类别</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="directCategory" disabled="disabled">
	            	</div>
	                <div class="col-sm-10">
	                </div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">定向对象</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="directObjId" disabled="disabled">
	            	</div>
	                <div class="col-sm-10">
	                </div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
	        </div>
    </section>
</body>
</html>
