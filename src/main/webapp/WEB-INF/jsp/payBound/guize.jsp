<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Title</title>
</head>
<body>
	<div class="panel-body">
		<form class="form-horizontal" id="oper_form">
			<div class="form-group">
				<label class="col-sm-2 control-label">大额小额设置</label>
				<div class="col-sm-10">
					<input type="text" onkeyup="checkemail(this.value)" class="form-control" id="indexValue" name="value" style="width: 200px;">
				</div>
			</div>
			<ul>
				<li>小额充值说明</li>
				<li>充值金额需小于等于10000</li>
				<li>其他问题请查看帮助中心</li>
			</ul>
			<ul>
				<li>大额充值说明</li>
				<li>充值金额需大于10000</li>
				<li>其他问题请查看帮助中心</li>
			</ul>

			<input type="button" value="保存" id="formSubit">
		</form>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		$("#formSubit").on("click",function(){
			if(checkemail()){
				$.ajax({
					type : "POST",
					url : "payBound/ruleAdd.do",
					data : $("#oper_form").serialize(),
					success : function(data) {
						if (data.success) {
							<%--$("#indexValue").val("");--%>
							ShowSuccess(data.msg);
						} else {
							ShowSuccess(data.msg);
						}
					}

				});
			}
		});
	});

	function checkemail() {
		// 功能函数
		var temp = $.trim($("#indexValue").val());
		if(temp.length>12){
			ShowSuccess("金额格式过长，请重新输入！");
			$("#indexValue").val("");
			$("#indexValue").focus();
			return false;
		}
		var myreg = new RegExp("^[0-9]*$");
		if (temp != "") {
			if (!myreg.test(temp)) {
				ShowSuccess("金额格式不正确，请重新输入！");
				$("#indexValue").val("");
				$("#indexValue").focus();
				return false;
			}
			return true;
		} 
	}
</script>
</html>
