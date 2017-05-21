<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/spay_admin/"+path;
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>">
    
</head>
<body>
    <section>
	        <div class="panel-body">
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
	                <label class="col-sm-2 control-label">交易详情</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="couponScale" value="${business.rewardObjType}" disabled="disabled">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">奖励对象</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="couponScale" value="${business.rewardObjType}" disabled="disabled">
	            	</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">奖励类型</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="activityBeginTime" value="${business.rewardType}" disabled="disabled">
	            	</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group" id="input" >
	                <label class="col-sm-2 control-label">奖励额度参考标准</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="activityEndTime" value="${business.rewardRef}" disabled="disabled">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">限制状态</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="beginTime" value="${business.isLimit}" disabled="disabled">
	            	</div>
	            </div>
    </section>
</body>
</html>
