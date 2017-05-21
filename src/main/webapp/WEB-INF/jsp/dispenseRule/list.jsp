<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>分发券活动</title>
    <script src="./js/dispenseRule/list.js"></script>
</head>
<body>
<!--检索区 -->
<section class="panel panel-default" style="margin-bottom: -1px;">
    <div class="panel-body">
        <form class="form-inline" role="form" id="searchForm">
            <div class="form-group">
                <label class="sr-only" >用户名</label>
                <input type="text" class="form-control"  placeholder="用户名" name="userAccountName">
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
                <th width="20"></th>
                <th>会员名</th>
                <th>代金券</th>
                <th>来源类别</th>
                <th>来源对象</th>
                <th>面额</th>
                <th>余额</th>
                <th>生成时间</th>
                <th>启用时间</th>
                <th>失效时间</th>
                <th>定向类别</th>
                <th>券状态</th>
                <th>操作</th>
                
            </tr>
            </thead>
            <tbody>
            {#foreach $T.list as record}
            <tr>
               <td><input type="radio" name="id" value="{$T.record.id}"></td>
                <td>{$T.record.userAccountName}</td>
                <td>{$T.record.title}</td>
                <td>{$T.record.receiveCoupon}</td>
                <td>{$T.record.pathId}</td>
                <td>{$T.record.denomination}</td>
                <td>{$T.record.couponMoney}</td>
                <td>{$T.record.initTime}</td>
                <td>{$T.record.upTime}</td>
                <td>{$T.record.failureTime}</td>
                <td>{$T.record.orientationSort}</td>
                <td>{$T.record.couponSatus}</td>
                <td onclick="findById('{$T.record.id}')">查看详情{$T.record.userAccountName}</td>
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
                    <button type="button" class="btn btn-primary" id="modal_btn" onclick="upload()" >保存</button>
                </div>
            </div>
        </div>
    </div>
</form>
</body>
</html>