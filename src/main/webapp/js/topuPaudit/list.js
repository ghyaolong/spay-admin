//serviceName:设置当前模块页的请求路径
var serviceName ='topuPaudit';

// 列表页初始化
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
function fn(res_key, resUrl) {
	debugger;
	if (res_key == 'audit') {
		var id = $('input[name="id"]').filter(':checked').val();
		if (id == undefined) {
			ShowFailure('审核操作必须选中对应的审核记录！');
			return;
		} else {
			var state = "";
			state = $('input[name="id"]').filter(':checked').parent().next().next().next().next().next().next().next().next().html();
			if ('审核成功' == state) {
				ShowFailure('审核通过不能再次进行操作！');
			} else if ('审核驳回' == state) {
				ShowFailure('请重新提交大额充值申请！');
			} else {

				xq(resUrl = resUrl + '?id=' + id);

			}
		}
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
function xq(resUrl){
    initForm({
        lable:'审核页面',
        init_url:resUrl,
        submit_url:'topuPaudit/topuPauditUpdate.do',
        serviceName:'topuPaudit'
    });
}

function test(){
	$("#transferOrder").click(function(){
        var width = $(this).width();
        if(width==200)
        {
            $(this).width(440);
            $(this).height(300);
        }
        else
        {
            $(this).width(200);
            $(this).height(200);
        }
    });
}


