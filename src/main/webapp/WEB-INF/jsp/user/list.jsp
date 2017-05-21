<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>用户列表</title>
<script src="./js/user/list.js"></script>
<script src="./area_array.js"></script>
</head>
<body>

	<!--检索区 -->
	<section class="panel panel-default" style="margin-bottom: -1px;">
		<div class="panel-body">
			<form class="form-inline" role="form" id="searchForm">
				<div class="form-group">
					<label class="sr-only"></label>昵称&nbsp;&nbsp;<input type="text"
						class="form-control" placeholder="请输入用户昵称" name="userName">
				</div>
				<div class="form-group">
					<label class="sr-only"></label>手机号<input type="text"
						class="form-control" placeholder="请输入手机号"  name="phone">
				</div>
			<div class="form-group"><label class="sr-only" ></label>账户状态
               <select data-required="true" class="form-control" name="accountState" placeholder="请选择账户状态">
               <option value="">请选择</option>
               <option value="0">正常</option>
               <option value="1">冻结</option>
               </select>
            </div>
			<!-- <div class="form-group">

				<label class="sr-only"></label>注册时间<input type="Date"
					class="form-control" placeholder="请输入开始时间" name="searchStartTime">
					<input type="Date"
					class="form-control" placeholder="请输入结束时间" name="searchEndTime">

			</div> -->
				<a href="#" class="btn btn-default" data-toggle="modal" onclick="searchPage()">检索</a>
			</form>
		</div>
	</section>

	<section class="panel panel-default">

		<!--功能操作区域 -->
		<div class="row wrapper">
			<div class="col-sm-9 m-b-xs">
				<c:forEach items="${btns}" var="btn"><a href="javascript:void(0)" 
				class="btn btn-default" onclick="fn('${btn.resKey}','${btn.resUrl}');"> 
				<i class="${btn.icon}"></i> ${btn.resName}</a>
				</c:forEach>
			</div>
		</div>
		
		<!--数据列表模板 -->
		<textarea id="dataTemplate" style="display: none">
    <div class="table-responsive">
        <table class="table table-striped b-t b-light">
            <thead>
            <tr>
                <th width="20">
                <th>用户ID</th>
                <th>昵称</th>
                <th>手机号</th>
                <th>邮箱</th>
                <th>性别</th>
                <th>详细地址</th>
                <th>账户状态</th>
                <th>真实姓名</th>
                <th>账户余额</th>
                <th>注册时间</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            {#foreach $T.list as record}
            <tr>
                <td><input type="radio" name="id" value="{$T.record.id}"></td>
                <td>{$T.record.id}</td>
                <td>{$T.record.userName}</td>
                <td>{$T.record.phone}</td>
                <td>{$T.record.mail}</td>
                <td>{$T.record.sex}</td>
                <td>{$T.record.address}</td>
                <td>{$T.record.accountState}</td>
                <td>{$T.record.realName}</td>
                <td>{$T.record.accountBalance}</td>
                <td>{$T.record.resgTimeString}</td>
                <td onclick="detailsById('{$T.record.id}')"><a style="cursor:pointer" href="#"><font color="blue">查看详情</font></a></td>
            </tr>
            {#/for}
            </tbody>
        </table>
    </div>
    
    <footer class="panel-footer">
        <div class="row">
            <div class="col-sm-4 hidden-xs">

            </div>
            <div class="col-sm-4 text-center">
                <small class="text-muted inline m-t-sm m-b-sm">showing
                    {$T.startRow}-{$T.endRow} of {$T.total} items</small>
            </div>
            <div class="col-sm-4 text-right text-center-xs">
                <ul id="pagePaginator"
							class="pagination pagination-sm m-t-none m-b-none">

                </ul>
            </div>
        </div>
    </footer>
    
    </textarea>

		<div id="dataTable"></div>

	</section>

	  <!--模态框 -->
<form class="form-horizontal"  id="oper_form" method="post" >
    <div class="modal fade" id="modal">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
                    <h4 class="modal-title" id="myModalLabel"></h4>
                </div>
                <div class="modal-body" id="modal-body">
                   <!--表单内容-->


                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">忽略</button>
                    <button type="submit" class="btn btn-primary" id="modal_btn">保存</button>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>
