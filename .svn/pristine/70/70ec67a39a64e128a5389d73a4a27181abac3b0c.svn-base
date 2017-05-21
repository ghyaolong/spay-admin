<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>交易流水</title>
    <script src="./js/payBalanceRecord/list.js"></script>
    <script src="./notebook_files/bootstrap-treeview.min.js"></script>
</head>
<body>
<!--检索区 -->
<section class="panel panel-default" style="margin-bottom: -1px;">
    <div class="panel-body">
        <form class="form-inline" role="form" id="searchForm">
             <div class="form-group">
                <label class="sr-only" ></label>手机号
                <input type="text" class="form-control"  placeholder="请输入手机号" name="phone">
            </div>
            <div class="form-group">
                <label class="sr-only" ></label>流水时间
                <input type="Date" class="form-control"  placeholder="请输入流水时间" name="searchStartTime">
                <input type="Date" class="form-control"  placeholder="请输入流水时间" name="searchEndTime">
            </div>
            
             <div class="form-group"><label class="sr-only" ></label>交易类型
            <!--0充值/1支付/2退款/3提现/4转账/5面对面支付-->
               <select data-required="true" class="form-control" name="condition" placeholder="请选择交易类型">
               <option value="">请选择</option>
               <option value="0">充值</option>
               <option value="1">支付</option>
               <option value="2">退款</option>
               <option value="3">提现</option>
               <option value="4">转账</option>
               <option value="5">面对面支付</option>
               <option value="6">收款</option>
               <option value="7">后台增款</option>
               <option value="8">后台减款</option>
               <option value="9">返现</option>
               </select>
            </div>
             <div class="form-group"><label class="sr-only" ></label>状态
            <!-- 0失败 1成功 -->
               <select data-required="true" class="form-control" name="transactionState" placeholder="请选择交易状态">
               <option value="">请选择</option>
               <option value="0">失败</option>
               <option value="1">成功</option>
                </select>
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
                <th>手机号</th>
                <th>用户ID</th>
                <th>交易号</th>
                <th>金额</th>
                <th>交易类型</th>
                <th>变动前总额</th>
                <th>变动后总额</th>
                <th>交易状态</th>
                <th>创建时间</th>
                <th>修改时间</th>
            </tr>
            </thead>
            <tbody>
            {#foreach $T.list as record}
            <tr>
                <td><input type="radio" name="id" value="{$T.record.id}"></td>
                <td>{$T.record.phone}</td>
                <td>{$T.record.userId}</td>
                <td>{$T.record.tranId}</td>
                <td>{$T.record.amount}</td>
                <td>{$T.record.condition}</td>
                <td>{$T.record.beforeChangBlance}</td>
                <td>{$T.record.afterChangeBlance}</td>
                <td>{$T.record.transactionState}</td>
                <td>{$T.record.createDateShow}</td>
                <td>{$T.record.updateDateShow}</td>
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
