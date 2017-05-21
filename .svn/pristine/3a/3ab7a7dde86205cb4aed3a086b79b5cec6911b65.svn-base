<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>审核列表</title>

    <link rel="stylesheet" href="./notebook_files/jquery.treetable.css" type="text/css">
    <link rel="stylesheet" href="./notebook_files/jquery.treetable.theme.default.css" type="text/css">
    <script src="./notebook_files/jquery.treetable.js"></script>
    <script src="./js/resources/list.js"></script>
</head>
<body>
<!--检索区 -->
<section class="panel panel-default" style="margin-bottom: -1px;">
    <div class="panel-body">
        <form class="form-inline" role="form" id="searchForm">
            <div class="form-group">
                <label class="sr-only" >名称</label>
                <input type="text" class="form-control"  placeholder="资源名称" name="resName">
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
            <table id="treeTable" class="table table-striped b-t b-light">
                <thead>
            <tr>
            <th width="20">
            <th>资源名称</th>
            <th>资源类型</th>
            <th>唯一KEY</th>
            <th>URL地址</th>
            <th>是否隐藏</th>


        </tr>
            </thead>
                 <tbody>
            {#foreach $T as record}
            <tr data-tt-id="{$T.record.id}" data-tt-parent-id="{$T.record.parentId}">
            <td><input type="radio" name="post[]" value="2"></td>
            <td>{$T.record.resName}</td>
            <td>{$T.record.type}</td>
            <td>{$T.record.resKey}</td>
            <td>{$T.record.resUrl}</td>
            <td>{$T.record.isHide}</td>

        </tr>

            {#/for}
            </tbody>
            </table>
        </div>

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
                    <h4 class="modal-title" id="myModalLabel">新增用户</h4>
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
