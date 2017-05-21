<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>添加定向代金券</title>
<script src="./js/directCoupon/list.js"></script>
</head>
<body>
	<section>
		<div class="panel-body">
				<div class="form-group">
					<label class="col-sm-2 control-label">用户ID</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="userId"
							data-bv-notempty="true" data-bv-notempty-message="用户ID不能为空">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">标题</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="title"
							data-bv-notempty="true" data-bv-notempty-message="标题不能为空">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">面额</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="denomination"
							data-bv-notempty="true" data-bv-notempty-message="充值金额不能为空"
							data-bv-regexp="true"
                            data-bv-regexp-regexp="^(([1-9]+[0-9]*.{1}[0-9]+)|([0].{1}[1-9]+[0-9]*)|([1-9][0-9]*)|([0][.][0-9]+[1-9]*))$"
                            data-bv-regexp-message="面额格式不正确">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">启用时间</label>
					<div class="col-sm-10">
						<input type="Date" class="form-control" name="enableTimeShow" id ="enableTimeShow" onchange="test()"
							data-bv-notempty="true" data-bv-notempty-message="启用时间不能为空">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">失效时间</label>
					<div class="col-sm-10">
						<input type="Date" class="form-control" name="disableTimeShow" id = "disableTimeShow"
							data-bv-notempty="true" data-bv-notempty-message="失效时间不能为空" onchange="checkDate()">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">定向类别1</label>
					<div class="col-sm-10">
						<select name='directObjId' id=goods data-required='true'
							class='form-control' onchange="setDirectObjName('goods', 'directObjName1')"
							data-bv-notempty="true" data-bv-notempty-message="定向类别1不能为空">
							<option value='-1'>请选择</option>
						</select>
						<input type="hidden" id="directObjName1" name="directObjId1Name" value="" />
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">定向类别2</label>
					<div class="col-sm-10">
						<select name='directObjId2' id=good data-required='true'
							class='form-control' onchange="setDirectObjName('good', 'directObjName2')"
							data-bv-notempty="true" data-bv-notempty-message="定向类别2不能为空">
							<option value='-1'>请选择</option>
						</select>
						<input type="hidden" id="directObjName2" name="directObjId2Name" value="" />
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">定向类别3</label>
					<div class="col-sm-10">
						<select name='directObjId3' id=go data-required='true'
							class='form-control' onchange="setDirectObjName('go', 'directObjName3')"
							data-bv-notempty="true" data-bv-notempty-message="定向类别3不能为空">
							<option value='-1'>请选择</option>
						</select>
						<input type="hidden" id="directObjName3" name="directObjId3Name" value="" />
					</div>
				</div>
		</div>
		 <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">忽略</button>
                    <button type="submit" class="btn btn-primary" id="modal_btn">保存</button>
                </div>
	</section>
</body>
</html>
