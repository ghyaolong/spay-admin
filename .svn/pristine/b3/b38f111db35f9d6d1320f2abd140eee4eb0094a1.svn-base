<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>审核列表</title>
    <script src="./js/topuPaudit/list.js"></script>

</head>
<body>
<!--检索区 -->
<section class="panel panel-default" style="margin-bottom: -1px;">
    <div class="panel-body">
        <form class="form-inline" role="form" id="searchForm">
             <div class="form-group">手机号<label class="sr-only" ></label>
                <input type="text" class="form-control"  name="phone" placeholder="请输入手机号">
            </div>
            <!-- 0银联 1微信 2支付宝3易宝4线下付款 -->
<!--             <div class="form-group">充值方式<label class="sr-only" ></label>
               <select data-required="true" class="form-control" name="rechargeWay" placeholder="请选择充值方式">
               <option value="">请选择</option>
               <option value="0">银联</option>
               <option value="1">微信</option>
               <option value="2">支付宝</option>
               <option value="3">易宝</option>
               <option value="4">线下付款</option>
               </select>
            </div> -->
            <div class="form-group">审核状态<label class="sr-only" ></label>
               <select data-required="true" class="form-control" name="state" placeholder="请选择充值状态">
               <option value="">请选择</option>
               <option value="0">审核中</option>
               <option value="3">审核成功</option>
               <option value="4">审核失败</option>
               </select>
            </div>
            <div class="form-group">充值时间<label class="sr-only" ></label>
                <input type="Date" class="form-control"  name="searchStartTime" placeholder="请输入开始时间">
                <input type="Date" class="form-control"  name="searchEndTime" placeholder="请输入结束时间">
            </div>
            <a href="#" class="btn btn-default" data-toggle="modal" onclick="searchPage();">检索</a>
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
        <table class="table table-striped b-t b-light">
            <thead>
            <tr>
                <th width="20">
                <th>用户ID</th>
                <th>流水号</th>
                <th>手机号</th>
                <th>充值金额</th>
                <th>充值时间</th>
                <th>充值方式</th>
                <th>转账银行</th>
                <th>审核状态</th>
                <th>备注</th>
                <th>审核说明</th>
                <th>处理时间</th>
            </tr>
            </thead>
            <tbody>
            {#foreach $T.list as record}
            <tr>
                <td><input type="radio" name="id" value="{$T.record.id}"></td>
                <td>{$T.record.userId}</td>
                <td>{$T.record.bankFlow}</td>
                <td>{$T.record.phone}</td>
                <td>{$T.record.payAccount}</td>
                <td>{$T.record.rechargeDateShow}</td>
                <td>{$T.record.rechargeWay}</td>
                <td>{$T.record.tranfserBank}</td>
                <td>{$T.record.state}</td>
                <td>{$T.record.remark}</td>
                <td>{$T.record.stateDesc}</td>
                <td>{$T.record.auDate}</td>
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
