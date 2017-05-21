//serviceName:设置当前模块页的请求路径
var serviceName ='role';

// 页面加载完成列表页初始化
$(document).ready(function() {

    /**findPage 列表加载，如下主要参数说明
     1、pageNum:查询页码，默认为START_PAGE
     2、pageSize:分页查询记录数目，默认为PAGE_SIZE
     3、serviceName：必须设置项；其设置页面加载完成后，分页按钮的请求模块名
     4、callback:回调方法，在数据加载完成并初始化分页之后回调，携带当前页加载数据data
     */
    findPage({serviceName:serviceName});

    $("#modal_btn").click(function(){
        save_authorization();
    });

});

//点击页面检索按钮
function searchPage(){
    findPage({serviceName:serviceName});
}

//功能区操作定义
function fn(res_key,url){
    if(res_key=='addRole'){
        addForm(url);
        return;
    }

    if(res_key=='authorization'){
        var rids = $("input[type=checkbox][name=role_radio]:checked") ;

        if(rids.length == 0){
            ShowFailure('必须选中授权角色！');
            return;
        }

        if(rids.length > 1){
            ShowFailure('一次只能针对一个角色进行权限设置！');
            return;
        }

        authorizationForm(rids.val());
        return;
    }
}

//初始化角色授权弹出框
function authorizationForm(rid){
    $('#myModalLabel').text("角色授权");
    $("#modal-body").html('<div id="res_tree" data_role_id="'+rid+'"></div>');
    get_resource_tree(rid);
    $('#modal').modal('show');
}

function save_authorization(){

    //var role_id =  $('#res_tree').attr("data_role_id");
    var checkData = $('#res_tree').treeview('getChecked');

    $.ajax({
        type: "POST",
        dataType: "JSON",
        contentType:'application/json;charset=utf-8',
        data:JSON.stringify(checkData) ,
        url:serviceName+"/saveAuthorization.do",
        success: function (data) {
            //拿到数据之后的后续处理
            $('#modal').modal('hide');
            findPage({serviceName:serviceName});
            ShowSuccess('操作成功！');
            console.log(data);
        }
    });
}

//获取资源树json对象
function get_resource_tree(rid){
    $.ajax({
        type: "POST",
        dataType: "JSON",
        url:serviceName+"/getResTree.do?id="+rid,
        success: function (data) {
            //拿到数据之后的后续处理
            console.log(data);
            $('#res_tree').treeview(
                {
                    data: data,
                    showCheckbox:true,
                    //multiSelect:true,
                    onNodeChecked:function(event, node){
                        recursiveSelect(node);
                        checked_log($('#res_tree').treeview('getChecked'));
                    }
              });
        }
    });

}

function recursiveSelect(node){
    var pn = $('#res_tree').treeview('getParent', node);

    if(pn.nodeId == undefined){
        return ;
    }else{
        $('#res_tree').treeview('checkNode', [ pn, { silent: true } ]);
        recursiveSelect(pn.nodeId);
    }
}

function checked_log(arrs){
    $.each(arrs, function(idx, obj) {
        console.log(obj.nodeId+':'+obj.text);
    });

}



/**初始化新增管理用户界面(init方法)
 * init方法参数说明：
   1、lable 弹出的form表单的title
   2、init_url 以此路径加载form表单元素
   3、submit_url:设置次表单提交路径
   4、serviceName，必须设置，和模块名称一致
   5、callback：form表单元素加载成功之后回调
 */
function addForm(url){
    initForm({
        lable:'新增角色',
        init_url:url,
        submit_url:'role/save.do',
        serviceName:serviceName
    });
}














