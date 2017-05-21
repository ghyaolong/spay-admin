//serviceName:设置当前模块页的请求路径
var serviceName ='adminUser';

// 页面加载完成列表页初始化
$(document).ready(function() {

    /**findPage 列表加载，如下主要参数说明
     1、pageNum:查询页码，默认为START_PAGE
     2、pageSize:分页查询记录数目，默认为PAGE_SIZE
     3、serviceName：必须设置项；其设置页面加载完成后，分页按钮的请求模块名
     4、callback:回调方法，在数据加载完成并初始化分页之后回调，携带当前页加载数据data
     */
    findPage({serviceName:serviceName});

});

//点击页面检索按钮
function searchPage(){
    findPage({serviceName:serviceName});
}

//功能区操作定义
function fn(res_key,url){
    if(res_key=='addAdminUser'){
        addForm(url);
        return;
    }
    if(res_key=='updateAdminUser'){
        var rids = $("input[type=checkbox][name=adminUser_radio]:checked") ;
        
        if(rids.length == 0){
            ShowFailure('必须选中待修改系统用户！');
            return;
        }

        if(rids.length > 1){
            ShowFailure('一次只能针对一个系统用户进行修改！');
            return;
        }
        updateForm(url+"?userId="+rids.val());
        return;
    }
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
        lable:'新增平台用户',
        init_url:url,
        submit_url:'adminUser/save.do',
        serviceName:serviceName,
        init_callback:function(){
            $(".menu_select2").select2();
            $(".select2-container--default").css("width","100%");
        }
    });
}

function updateForm(url){
    initForm({
        lable:'修改平台用户',
        init_url:url,
        submit_url:'adminUser/save.do',
        serviceName:serviceName,
        init_callback:function(){
            $(".menu_select2").select2();
            $(".select2-container--default").css("width","100%");
        }
    });

}














