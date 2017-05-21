<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加规则</title>
</head>
<body>
<form class="form-horizontal">
    <!-- 获取后台ID -->
    <input id="v" style="display: none;" value="${business.id}" name="id"/>
    		<section>
    		<div class="form-group">
	                <label class="col-sm-2 control-label">奖励ID</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="rewardId" value="${business.rewardId}" data-bv-notempty="true" data-bv-notempty-message="奖励ID不能为空">
	                </div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">奖励对象类别</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="rewardObjType" value="${business.rewardObjType}"
	                	data-bv-notempty="true" data-bv-notempty-message="奖励对象类别不能为空">
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
	                	<select data-required="true" class="form-control" name="rewardType" value="${business.rewardType}"
	                	data-bv-notempty="true" data-bv-notempty-message="奖励类型不能为空" >
	                	 <option value="">请选择</option>
               			 <option value="0">现金</option>
               			 <option value="1">代金券</option>
               			</select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">奖励额度参考标准</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="rewardRef" value="${business.rewardRef}"
	                	data-bv-notempty="true" data-bv-notempty-message="奖励额度参考标准不能为空">
	                	 <option value="">请选择</option>
               			 <option value="0">百分比</option>
               			 <option value="1">固定值</option>
               			</select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">奖励值</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="bonus" value="${business.bonus}"
	                	data-bv-notempty="true" data-bv-notempty-message="奖励值不能为空">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">上限值</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="upLimit" value="${business.upLimit}"
	                	data-bv-notempty="true" data-bv-notempty-message="上限值不能为空">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">是否限制</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="isLimit" value="${business.isLimit}"
	                	data-bv-notempty="true" data-bv-notempty-message="是否限制不能为空">
	                	 <option value="">请选择</option>
               			 <option value="0">不限制</option>
               			 <option value="1">限制</option>
               			</select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">是否冻结</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="isFreeze" value="${business.isFreeze}"
	                	data-bv-notempty="true" data-bv-notempty-message="是否冻结不能为空">
	                	 <option value="">请选择</option>
               			 <option value="0">不冻结</option>
               			 <option value="1">冻结</option>
               			</select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">冻结周期（天）</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="freezePeriod" value="${business.freezePeriod}"
	                	data-bv-notempty="true" data-bv-notempty-message="冻结周期（天）不能为空">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">是否有效期</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="isIndate" value="${business.isIndate}"
	                	data-bv-notempty="true" data-bv-notempty-message="是否有效期不能为空">
	                	 <option value="">请选择</option>
               			 <option value="0">有</option>
               			 <option value="1">无</option>
               			</select>
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">有效期（天）</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="indate" value="${business.indate}"
	                	data-bv-notempty="true" data-bv-notempty-message="有效期（天）不能为空">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">定向类型</label>
	                <div class="col-sm-10">
	                	<select data-required="true" class="form-control" name="directCategory" value="${business.directCategory}"
	                	data-bv-notempty="true" data-bv-notempty-message="定向类型不能为空">
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
	                	<input type="text" class="form-control" name="directObjId" value="${business.directObjId}"
	                	data-bv-notempty="true" data-bv-notempty-message="定向对象ID不能为空">
	            	</div>
	            </div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label"></label>
	            </div>
    </section>
    </form>
</body>
</html>
