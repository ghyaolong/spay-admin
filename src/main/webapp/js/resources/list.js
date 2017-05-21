var serviceName ='resources';
var page_data;
var map;
//列表初始化
$(document).ready(function()
{
    findPage({serviceName:serviceName,callback:refresh_data});
});

//点击页面检索按钮
function searchPage(){
    findPage({serviceName:serviceName});
}

//刷新页面缓存数据
function refresh_data(data){
    $('#treeTable').treetable(option);
    page_data = data;
    map=formatData();
}

//功能区操作定义
function fn(res_key,url){
    if(res_key=='addResources'){
        addForm(url);
    }
}

function addForm(url){

    initForm({
        lable:'新增资源',
        init_url:url,
        submit_url:'resources/save.do',
        serviceName:serviceName,
        init_callback:function(){
            initSelect2();
        },
        succ_callback:refresh_data
    });
}

function initSelect2(){
    $(".menu_select2").select2({
        templateResult: formatState,
        templateSelection: selection_formatState
    });

    $(".menu_select2").on("select2:select", function (e) {
        var select_val = $(".menu_select2 option:selected").val();
        if(map[select_val] == '1'){
            $("#set_type").val("2");
            $("#type_value").val("2");
            $("#res_level_value").val("2");
            $("#resUrl").show();
            return ;
        }
        if(map[select_val] == '2'){
            $("#set_type").val("3");
            $("#type_value").val("3");
            $("#res_level_value").val("3");
            $("#resUrl").show();
            return ;
        }
        $("#set_type").val("1");
        $("#type_value").val("1");
        $("#res_level_value").val("1");
        $("#resUrl").hide();

    });

}


function formatState (state) {

    $(".select2-container--default").css("width","100%");

    if(map[state.id] == '1'){
        var $state = $(
            '<span><i class="fa fa-folder-o" style="text-indent:2em;"></i>' + state.text + '</span>'
        );

    }else if(map[state.id] == '2'){
        var $state = $(
            '<span><i class="fa fa-link" style="text-indent:4em;"></i>' + state.text + '</span>'
        );

    }else{
        var $state = $(
            '<span><i class="fa fa-tachometer"></i>' + state.text + '</span>'
        );
    }

    //if (!state.id) { return state.text; }

    return $state;
}

function selection_formatState (state) {

    $(".select2-container--default").css("width","100%");

    if(map[state.id] == '1'){
        var $state = $(
            '<span><i class="fa fa-folder-o"></i>' + state.text + '</span>'
        );

    }else if(map[state.id] == '2'){
        var $state = $(
            '<span><i class="fa fa-link"></i>' + state.text + '</span>'
        );

    }else{
        var $state = $(
            '<span><i class="fa fa-tachometer"></i>' + state.text + '</span>'
        );
    }

    //if (!state.id) { return state.text; }

    return $state;
}

function formatData(){
    var dataMap={};

    for(var i=0;i<page_data.length;i++){
        var m;
        var n;
        $.each(page_data[i],function(name,value){
            if(name=='id'){
                m=value;
            }else if(name=='type'){
                n=value;
            }
        })
        dataMap[m]=n;
    }

    console.log(dataMap);
    return dataMap;
}
















