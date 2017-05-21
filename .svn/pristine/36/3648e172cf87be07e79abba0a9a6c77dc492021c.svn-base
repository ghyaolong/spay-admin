<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理用户列表</title>
    <script src="./js/ReturnTaskPool/list.js"></script>
</head>
<body>
<!--检索区 -->
<section class="panel panel-default" style="margin-bottom: -1px;">
    <div class="panel-body">
        <form class="form-inline" role="form" id="searchForm">
            <div class="form-group">
                <label class="sr-only" ></label>标题
                <input type="text" class="form-control"  placeholder="请输入标题" name="title">
            </div>
            <div class="form-group">
                <label class="sr-only" ></label>面值
                <input type="text" class="form-control"  placeholder="请输入面值" name="denomination">
            </div>
            <div class="form-group">
                <label class="sr-only" ></label>任务类型
               <select data-required="true" class="form-control" name="taskType" placeholder="请输入任务类型">
               <option value="">请选择</option>
               <option value="0">正常业务</option>
               <option value="1">后台添加</option>
               </select>
            </div>
			 <div class="form-group">
                <label class="sr-only" ></label>状态
               <select data-required="true" class="form-control" name="freezeAlive" placeholder="请输入状态">
               <option value="">请选择</option>
               <option value="0">正常</option>
               <option value="1">停用</option>
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
                <th>标题</th>
                <th>类型</th>
                <th>面值</th>
                <th>任务类型</th>
                <th>生成时间</th>
                <th>启用时间</th>
                <th>结束时间</th>
                <th>状态</th>
            </tr>
            </thead>
            <tbody>
            {#foreach $T.list as record}
            <tr>
                <td><input type="radio" name="id" value="{$T.record.id}"></td>
                <td>{$T.record.title}</td>
                <td>{$T.record.type}</td>
                <td>{$T.record.denomination}</td>
                <td>{$T.record.taskType}</td>
                <td>{$T.record.searchStartTime}</td>
                <td>{$T.record.searchEndTime}</td>
                <td>{$T.record.searchTime}</td>
                <td>{$T.record.freezeAlive}</td>
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
            </div>
        </div>
    </div>
</form>
</body>
</html>
