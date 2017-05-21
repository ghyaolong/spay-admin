<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>转账页面</title>
    <script src="./js/Balance/apply.js"></script>
</head>
<body>
<!--检索区 -->
<section class="panel panel-default" style="margin-bottom: -1px;">
    <div class="panel-body">
        <form class="form-inline" role="form" id="searchForm">
            <div class="form-group">
                <label class="sr-only" ></label>会员名称
                <input type="text" class="form-control"  placeholder="请输入会员名称" name="userId">
            </div> 
            <div class="form-group">
                <label class="sr-only" ></label>状态
               <select data-required="true" class="form-control"  placeholder="请输入充值状态" name="state">
               <option value="">请选择</option>
               <option value="1">审核中</option>
               <option value="2">审核通过</option>
               <option value="3">审核驳回</option>
               </select>
            </div> 
            <div class="form-group">
                <label class="sr-only" ></label>充值类型
                <select data-required="true" class="form-control"  placeholder="请输入充值类型" name="applytype">
	               <option value="">请选择</option>
	               <option value="0">添加金额</option>
	               <option value="1">减少金额</option>
               </select>
            </div> 
            <div class="form-group">
                <label class="sr-only" ></label>调账金额
                <input type="text" class="form-control"  placeholder="请输入调账金额" name="balanceamount">
            </div> 
            <a href="#" class="btn btn-default" data-toggle="modal" onclick="doSearch();">检索</a>
        </form>
    </div>
</section>

<section class="panel panel-default">

    <!--功能操作区域 -->
    <div class="row wrapper">
        <div class="col-sm-9 m-b-xs">
            <c:forEach items="${btns}" var="btn">
                <a href="javascript:void(0)" class="btn btn-default" onclick="fn('${btn.resKey}','${btn.resUrl}');"><i class="${btn.icon}"></i> ${btn.resName}</a>
            </c:forEach>
        </div>
    </div>
    <!--数据列表模板 -->
    <textarea id="dataTemplate" style="display:none">
    <div class="table-responsive">
        <table class="table table-striped b-t b-light" id = "table">
            <thead>
            <tr>
                <th width="20">
                <th>会员名称</th>
                <th>调账前金额</th>
                <th>状态</th>
                <th>调账金额</th>
                <th>充值类型</th>
                <th>调账时间</th>
                <th>申请时间</th>
            </tr>
            </thead>
            <tbody>
            {#foreach $T.list as record}
	            <tr>
	                <td><input type="radio" name="id" value="{$T.record.id}"></td>
	                <td>{$T.record.userId}</td>
	                <td>{$T.record.accountBalance}</td>
	                <td>{$T.record.state}</td>
	                <td>{$T.record.balanceamount}</td>
	                <td>{$T.record.applytype}</td>
	                <td>{$T.record.searchStartTime}</td>
	                <td>{$T.record.searchEndTime}</td>
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
                <ul id="pagePaginator" class="pagination pagination-sm m-t-none m-b-none">

                </ul>
            </div>
        </div>
    </footer>
   </textarea>

    <!--数据列表 -->
    <div id="dataTable"></div>
</section>

    <!--模态框 -->
<form class="form-horizontal"  id="oper_form">
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
                    <button type="submit" class="btn btn-primary" id="modal_btn">添加</button>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>
