<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    		<section>
    		<div class="form-group">
	                <label class="col-sm-2 control-label">标题内容</label>
	                <div class="col-sm-10">
	                      <input type="text" class="form-control" name="title"
	                     	data-bv-notempty="true" data-bv-notempty-message="标题内容不能为空"
                			data-bv-stringlength="true"
                            data-bv-stringlength-min="3"
                            data-bv-stringlength-max="100"
                            data-bv-stringlength-message="标题应由3到100个字符组成">
	                </div>
	            </div>
	             <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">面值</label>
	                <div class="col-sm-10">
	                	<input type="text" class="form-control" name="denomination"
	                	data-bv-notempty="true" data-bv-notempty-message="面值不能为空"
					    data-bv-regexp="true"
                        data-bv-regexp-regexp="^(([1-9]+[0-9]*.{1}[0-9]+)|([0].{1}[1-9]+[0-9]*)|([1-9][0-9]*)|([0][.][0-9]+[1-9]*))$"
                        data-bv-regexp-message="面值格式不正确" >

	            	</div>
	            </div>
	            <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">任务类型</label>
	                <div class="col-sm-10">
	                <select data-required="true" class="form-control" id="taskType" name="taskType">
               		<option value="1" selected="selected">后台添加</option>
               </select>
	          </div>
	      </div>
	      <div class="line line-dashed line-lg pull-in"></div>
	            <div class="form-group">
	                <label class="col-sm-2 control-label">返还类型</label>
	                <div class="col-sm-10">
	                <select data-required="true" class="form-control" id="type" name="type" data-bv-notempty="true" onchange="test()" data-bv-notempty-message="类型不能为空">
               		<option value="">请选择</option>
               		<option value="0">余额</option>
               		<option value="1">代金券</option>
               </select>
	          </div>
	      </div>
	      <div id= taskpool style="display: none">
		      <div class="form-group" >
		            <label class="col-sm-2 control-label">定向到</label>
		            <div class="col-sm-10">
		            <select name='directObjId' id=goods data-required='true' class='form-control' data-bv-notempty="true" data-bv-notempty-message="不能为空"> 
					<option value='0'>请选择</option> 
					</select>
					</div>
					</div>
			  <div class="form-group">
	   				<label class="col-sm-2 control-label"></label>
	   				<div class="col-sm-10">
		    		<select name='directObjId2' id=good data-required='true' class='form-control'> 
		    		<option value='0'>请选择</option> 
		    		</select>
		    		</div>
		    		</div>
		      <div class="form-group">	
		    		<label class="col-sm-2 control-label"></label>
		    		<div class="col-sm-10">
		    		<select name='directObjId3' id=go data-required='true' class='form-control'> 
		    		<option value='0'>请选择</option> 
		    		</select>
		    		</div>
		    		</div>
	    		</div>
	    		 <div class="modal-footer">
	    		 <button type="button" class="btn btn-default" data-dismiss="modal">忽略</button>
	    		 <button type="button" class="btn btn-primary" id="modal_btn" onclick="save()">保存</button>
	    		 </div>
    </section>
</body>
</html>
