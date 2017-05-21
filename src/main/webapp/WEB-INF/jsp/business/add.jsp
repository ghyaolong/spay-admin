<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<head>
    <title>添加规则</title>
   <script src="./spay_admin/js/reward/add.js"></script>
     <!--  <script src="./js/business/list.js"></script>
    <script src="./notebook_files/bootstrap-treeview.min.js"></script> -->
    <base href="<%=basePath%>"> 
</head>
<body>
    		<section>
    		<div class="form-group">
	                <label class="col-sm-2 control-label">奖励ID</label>
	                <div class="col-sm-10">
	                      <!-- <input type="text" class="form-control" name="rewardId">  -->
	                     <select id="rewardId" name="rewardId" >
	                    <option>请选择</option>
                      </select>  
	                </div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">奖励对象类别</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="rewardObjType">
	                	 <option value="">请选择</option>
               			 <option value="0">买方</option>
               			 <option value="1">卖方</option>
               			 <option value="1">第三方</option>
               			</select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">奖励类型</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="rewardType">
	                	 <option value="">请选择</option>
               			 <option value="0">现金</option>
               			 <option value="1">代金券</option>
               			</select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">奖励额度参考标准</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="rewardRef">
	                	 <option value="">请选择</option>
               			 <option value="0">百分比</option>
               			 <option value="1">固定值</option>
               			</select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">奖励值</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="bonus">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">上限值</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="upLimit">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">是否限制</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="isLimit">
	                	 <option value="">请选择</option>
               			 <option value="0">不限制</option>
               			 <option value="1">限制</option>
               			</select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">是否冻结</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="isFreeze">
	                	 <option value="">请选择</option>
               			 <option value="0">不冻结</option>
               			 <option value="1">冻结</option>
               			</select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">冻结周期（天）</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="freezePeriod">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">是否有效期</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="isIndate">
	                	 <option value="">请选择</option>
               			 <option value="0">有</option>
               			 <option value="1">无</option>
               			</select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">有效期（天）</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="indate">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">定向类型</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="directCategory">
	                	 <option value="">请选择</option>
               			 <option value="0">不定向</option>
               			 <option value="1">业务</option>
               			 <option value="1">品类</option>
               			 <option value="1">商铺</option>
               			</select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">定向对象ID</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="directObjId">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
    </section>
</body>
</html>
