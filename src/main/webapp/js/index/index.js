//-------------------------------------------如下分页相关--------------------------------
//单页显示记录数目
var PAGE_SIZE=16;
//页面初次加载，默认显示页
var START_PAGE=1;
//分页组建默认显示按钮数目
var VISIBLE_PAGES=5;

//初始化分页组件
function initPaginator(totalPages,pageNum,serviceName){
    if($("#pagePaginator").length>0){
        $("#pagePaginator").twbsPagination({
            totalPages:totalPages,
            visiblePages : VISIBLE_PAGES,
            startPage:pageNum,
            initiateStartPageClick:false,

            onPageClick: function (event, page) {
                findPage({pageNum:page,pageSize:PAGE_SIZE,serviceName:serviceName});
            }
        });
    }
}

/**findPage 列表加载，如下主要参数说明
1、pageNum:查询页码，默认为START_PAGE
2、pageSize:分页查询记录数目，默认为PAGE_SIZE
3、serviceName：必须设置项；其设置页面加载完成后，分页按钮的请求模块名
4、callback:回调方法，在数据加载完成并初始化分页之后回调，携带当前页加载数据data
 */

function findPage(settings){

    var defaultSetting={
        pageNum:START_PAGE,
        pageSize:PAGE_SIZE,
        serviceName:'',
        callback:function(data){}
    };

    $.extend(defaultSetting,settings);

    $.ajax({
        type: "POST",
        dataType: "JSON",
        url:defaultSetting.serviceName+"/page.do?pageNum="+defaultSetting.pageNum+"&pageSize="+defaultSetting.pageSize,
        data: $('#searchForm').serialize(),
        success: function (data) {
            // process the template
            $("#dataTable").setTemplateElement("dataTemplate");
            $("#dataTable").processTemplate(data);

            if($("#pagePaginator").length>0){
                initPaginator(data.pages,data.pageNum,defaultSetting.serviceName);
            }

            defaultSetting.callback(data)
        }
    });
}
//--------------------------form表单验证------------
//表单验证提示图标设置
var valid_Icons = {
    valid: 'glyphicon glyphicon-ok',
    invalid: 'glyphicon glyphicon-remove',
    validating: 'glyphicon glyphicon-refresh'
};

//表单验证规则定义，并定义验证成功后的表单提交，且表单提交处理成功后的后续处理，且发起一个回调callback（此时可再次发起重新查询列表页）
function setFormValid(serviceName,succ_callback){

    $('#oper_form').bootstrapValidator({
        feedbackIcons: valid_Icons ,
    }).on('success.form.bv', function(e) {
        // Prevent form submission
        e.preventDefault();

        // Get the form instance
        var $form = $(e.target);

        // Get the BootstrapValidator instance
        var bv = $form.data('bootstrapValidator');

        // Use Ajax to submit form data
        $.post($form.attr('action'), $form.serialize(), function(result) {
            if(result=='success'){
                $('#modal').modal('hide');
                //findPage({serviceName:serviceName});
                findPage({serviceName:serviceName,callback:succ_callback});
                ShowSuccess('操作成功！');
                $("#oper_form").data('bootstrapValidator').destroy();

                $('#oper_form').data('bootstrapValidator', null);

            }else{
                $('#modal').modal('hide');
                ShowFailure('操作失败！');
                $("#oper_form").data('bootstrapValidator').destroy();

                $('#oper_form').data('bootstrapValidator', null);
            }

        }, 'json');
    });

}

//------------------------form表单初始化------------------
//初始化弹出form界面
//lable 弹出的form表单的title
//init_url 以此路径加载form表单元素
//submit_url:设置次表单提交路径
//init_callback：form表单元素加载成功之后回调
//succ_callback:表单保存且页面重新加载之后回调。
function initForm(settings){
    var defaultSetting={
        lable:'',
        init_url:'',
        submit_url:'',
        serviceName:'',
        init_callback:function(){},
        succ_callback:function(data){}
    };

    $.extend(defaultSetting,settings);
    $('#myModalLabel').text(defaultSetting.lable);
    $('#oper_form').attr("action", defaultSetting.submit_url);
    $("#modal-body").load(defaultSetting.init_url,function(response,status,xhr){
        if(status =='success'){
            setFormValid(defaultSetting.serviceName,defaultSetting.succ_callback);
            defaultSetting.init_callback();
            $('#modal').modal('show');
            $('#modal_btn').attr('disabled',false);
        }
    });
}
//----------------select2组件初始化---------------------------
function initSelect2(){
    $(".select2").select2({
        templateResult: formatState,
        templateSelection: formatState
    });
}
//------------------------弹出提示框效果实现------------------
//tip是提示信息，type:'success'是成功信息，'danger'是失败信息,'info'是普通信息
function ShowTip(tip, type) {
    var $tip = $('#tip');
    if ($tip.length == 0) {
        $tip = $('<div id="tip" style="font-weight:bold;position:absolute;top:30%;left: 50%;z-index:9999" role="alert"></div>');
        $('body').append($tip);
    }
    $tip.stop(true).attr('class', 'alert alert-' + type).text(tip).css('margin-left', -$tip.outerWidth() / 2).fadeIn(500).delay(2000).fadeOut(500);
}

function ShowMsg(msg) {
    ShowTip(msg, 'info');
}

function ShowSuccess(msg) {
    ShowTip(msg, 'success');
}

function ShowFailure(msg) {
    ShowTip(msg, 'danger');
}

function ShowWarn(msg, $focus, clear) {
    ShowTip(msg, 'warning');
    if ($focus) $focus.focus();
    if (clear) $focus.val('');
    return false;
}
//-------------treetable相关设置---------------------
var option = {
    expandable:true,
    column:1
};

