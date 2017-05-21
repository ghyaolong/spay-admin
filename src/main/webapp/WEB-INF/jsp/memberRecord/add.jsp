<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>充值</title>
    <script type="text/javascript">
	function checkPhone(){
	var phone = $("#phone").val();
	$.ajax({
		type: "POST",
		url: "memberRecord/checnPhone.do?phone="+phone,
		dataType:'json',
		success: function(data){
		$("#span").val(data.realName);
		}
	});	
	}

</script>
</head>
<body>
	<div class="panel-body">
			<div class="form-group">
				<label class="col-sm-2 control-label">充值手机号</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="phone" id = "phone" onblur="checkPhone()"
					data-bv-notempty="true" data-bv-notempty-message="手机号不能为空" 
					data-bv-regexp="true"
                    data-bv-regexp-regexp="^1\d{10}$|^(0\d{2,3}-?|\(0\d{2,3}\))?[1-9]\d{4,7}(-\d{1,8})?$"
                    data-bv-regexp-message="手机号请正确填写">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">付款信息</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="span" readonly="readonly">
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">充值金额</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" name="payAccount"
					data-bv-notempty="true" data-bv-notempty-message="充值金额不能为空"
					data-bv-regexp="true"
                    data-bv-regexp-regexp="^(([1-9]\d{0,9})|0)(\.\d{1,2})?$"
                    data-bv-regexp-message="金额格式不正确">
				</div>
			</div>
			<div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">充值类型</label>
                <div class="col-sm-10">
                <select data-required="true" class="form-control" name="rechargeType">
                <option value="5" selected="selected">后台充值</option>
                </select>
                </div>
            </div>
			<div class="line line-dashed line-lg pull-in"></div>
            <div class="form-group">
                <label class="col-sm-2 control-label">充值方式</label>
                <!-- 0银联 1微信 2支付宝3易宝4线下付款 -->
                <div class="col-sm-10">
                <select data-required="true" class="form-control" name="rechargeWay">
               		<option value="4" selected="selected">线下充值</option>
                </select>
               </div>
              </div>
	</div>
</body>
</html>
