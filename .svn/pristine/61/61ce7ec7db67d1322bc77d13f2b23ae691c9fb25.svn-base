<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>修改规则</title>
<script src="./js/directCoupon/list.js"></script>
<script src="./notebook_files/bootstrap-treeview.min.js"></script>
</head>
<script>
function a(){

 var b = document.getElementById("123");
 b.remove(0);
}

function b(){

 var c = document.getElementById("456");
 c.remove(0);
}

</script>
<body>
<div class="panel-body">
    <!-- 获取后台ID -->
    <input id="v" style="display: none;" value="${payDirectCoupon.id}" name="id"/>
    <div class="form-group">
					<label class="col-sm-2 control-label">用户ID</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="userId" value="${payDirectCoupon.userId}" readonly="readonly"
							data-bv-notempty="true" data-bv-notempty-message="用户ID不能为空">
					</div>
				</div>
        <div class="form-group">
            <label class="col-sm-2 control-label">标题</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="title" value="${payDirectCoupon.title}" 
                 data-bv-notempty="true" data-bv-notempty-message="标题不能为空">
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">面额</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="denomination" value="${payDirectCoupon.denomination}" readonly="readonly"
                 data-bv-notempty="true" data-bv-notempty-message="面额不能为空">
            </div>
        </div>
         <div class="form-group">
            <label class="col-sm-2 control-label">余额</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" name="couponMoney" value="${payDirectCoupon.couponMoney}"
                 data-bv-notempty="true" data-bv-notempty-message="面额不能为空">
            </div>
        </div>
        <div class="form-group">
					<label class="col-sm-2 control-label">启用时间</label>
					<div class="col-sm-10">
						<input type="Date" class="form-control" name="enableTimeShow" value="${payDirectCoupon.searchEndTime}"
							data-bv-notempty="true" data-bv-notempty-message="启用时间不能为空">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">失效时间</label>
					<div class="col-sm-10">
						<input type="Date" class="form-control" name="disableTimeShow" value="${payDirectCoupon.searchTime}"
							data-bv-notempty="true" data-bv-notempty-message="失效时间不能为空">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">定向类别1</label>
					<div class="col-sm-10">
						<select name='directObjId' id=goods data-required='true' 
							class='form-control' onchange="setDirectObjName('goods', 'directObjName1')">
							<option value='${payDirectCoupon.directObjId}'>${payDirectCoupon.directObjId1Name}</option>
						</select>
						<input type="hidden" id="directObjName1" name="directObjId1Name" value="${payDirectCoupon.directObjId1Name}" />
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">定向类别2</label>
					<div class="col-sm-10">
						<select name='directObjId2' id=good data-required='true' 
							class='form-control' onchange="setDirectObjName('good', 'directObjName2')">
							<option value='${payDirectCoupon.directObjId2}'>${payDirectCoupon.directObjId2Name}</option>
						</select>
						<input type="hidden" id="directObjName2" name="directObjId2Name" value="${payDirectCoupon.directObjId2Name}" />
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">定向类别3</label>
					<div class="col-sm-10">
						<select name='directObjId3' id=go data-required='true' 
							class='form-control' onchange="setDirectObjName('go', 'directObjName3')">
								<option value='${payDirectCoupon.directObjId3}'>${payDirectCoupon.directObjId3Name}</option>
						</select>
						<input type="hidden" id="directObjName3" name="directObjId3Name" value="${payDirectCoupon.directObjId3Name}" />
						<input type="hidden" id="generateTime" name="generateTime" value="${payDirectCoupon.generateTime}" />
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">返券状态</label>
					<div class="col-sm-10">
					 <select id="activeId" name="couponSatus" type="text" class="form-control"
	                  data-bv-notempty="true" data-bv-notempty-message="返券状态不能为空" onclick="b()" >
	                    <option value='${payDirectCoupon.couponSatus}' id="456">${payDirectCoupon.couponSatusShow}</option>
	                     <option value ="0">使用中</option>
	                     <option value ="1">已使用</option>
	                     <option value ="2">已冻结</option>
                	</select> 
					</div>
				</div>
 				<div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">忽略</button>
                    <button type="submit" class="btn btn-primary" id="modal_btn">保存</button>
                </div>
</body>
</html>
