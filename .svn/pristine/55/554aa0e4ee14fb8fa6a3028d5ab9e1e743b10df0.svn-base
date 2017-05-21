<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>分发券活动</title>
    <script src="./js/business/list.js"></script>
</head>
<body>
<!--检索区 -->
<section class="panel panel-default" style="margin-bottom: -1px;">
    <div class="panel-body">
        <form class="form-inline" role="form" id="searchForm">
            <div class="form-group">
                <label class="sr-only" ></label>
                	奖励对象类别&nbsp;&nbsp;<select name="rewardObjType" class="form-control">
                		<option value = "">请选择</option>
                		<option value = "0">买方</option>
                		<option value = "1">卖方</option>
                		<option value = "2">第三方</option>
                	</select>
            </div> 
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <div class="form-group">
                <label class="sr-only" ></label>
                	奖励类型&nbsp;&nbsp;<select name="rewardType" class="form-control">
                		<option value = "">请选择</option>
                		<option value = "0">现金</option>
                		<option value = "1">代金券</option>
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
                <th width="20"><input type="checkbox" ></th>
                <th>奖励对象类别</th>
                <th>奖励类型</th>
                <th>奖励额度参考标准</th>
                <th>奖励值</th>
                <th>上限值</th>
                <th>是否限制</th>
                <th>是否冻结</th>
                <th>冻结周期（天）</th>
                <th>是否有效期</th>
                <th>有效期（天）</th>
                <th>定向类型</th>
                <th>定向对象</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
            {#foreach $T.list as record}
            <tr>
                <td><input type="radio" name="id" value="{$T.record.id}"></td>
                <td>{$T.record.rewardObjType}</td>
                <td>{$T.record.rewardType}</td>
                <td>{$T.record.rewardRef}</td>
                <td>{$T.record.bonus}</td>
                <td>{$T.record.upLimit}</td>
                <td>{$T.record.isLimit}</td>
                <td>{$T.record.isFreeze}</td>
                <td>{$T.record.freezePeriod}</td>
                <td>{$T.record.isIndate}</td>
                <td>{$T.record.indate}</td>
                <td>{$T.record.directCategory}</td>
                <td>{$T.record.directObjId}</td>
                <td onclick="findById('{$T.record.id}')">查看详情</td>
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
