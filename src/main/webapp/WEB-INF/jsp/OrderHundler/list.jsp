<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <script src="./js/OrderHundler/list.js"></script>
</head>
<body>
<!--检索区 -->
<section class="panel panel-default" style="margin-bottom: -1px;">
    <div class="panel-body">
        <form class="form-inline" role="form" id="searchForm">
            <div class="form-group">
                <label class="sr-only" ></label>用户ID
                <input type="text" class="form-control"  placeholder="请输入用户ID" name="userId">
            </div>
            <div class="form-group">
                <label class="sr-only" ></label>真实姓名
                <input type="text" class="form-control"  placeholder="请输入真实姓名" name="realName">
            </div>
            <div class="form-group">
                <label class="sr-only" ></label>订单ID
                <input type="text" class="form-control"  placeholder="请输入订单ID" name="orderId">
            </div>
            <div class="form-group">
                <label class="sr-only" ></label>订单状态
                <!-- 订单状态（0默认，1待更新，2成功） -->
               <select data-required="true" class="form-control" name="orderStatus" placeholder="请选择订单状态">
               <option value="">请选择</option>
               <option value="0">待支付</option>
               <option value="1">待更新</option>
               <option value="2">成功</option>
               </select>
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
        <table class="table table-striped b-t b-light">
            <thead>
            <tr>
                <th width="20">
                <th>用户ID</th>
                <th>真实姓名</th>
                <th>订单ID</th>
                <th>订单状态</th>
                <th>创建时间</th>
            </tr>
            </thead>
            <tbody>
            {#foreach $T.list as record}
            <tr>
                <td><input type="radio" name="id" value="{$T.record.id}"></td>
                <td>{$T.record.userId}</td>
                <td>{$T.record.realName}</td>
                <td>{$T.record.orderId}</td>
                <td>{$T.record.orderStatus}</td>
                <td>{$T.record.resgTimeString}</td>
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
<form class="form-horizontal"  id="oper_form" method="post" enctype="multipart/form-data">
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
