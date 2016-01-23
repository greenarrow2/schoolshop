$(document).ready(function() {
    $(".floor").find(".fleft li").mouseover(function(){
        $(this).parents('ul').find('li').removeClass('checked');
        $(this).parents('ul').find('li').addClass('sub');
        $(this).addClass('checked');
        $(this).removeClass('sub');
    });
    jQuery('#Xtabx').Xtabs({hdcn: 'tabMenu', hdtagcur: 'on', bdcn: 'tabCont'});
    jQuery('#flashBox').Xtabs({hdcn: 'flashMenu', hdtagcur: 'on', bdcn: 'flashCont',auto:3000});
})
function showLoseTime(arr){
    for (var key in arr){
        $("#LeftTime_"+key).countdown({endtime:arr[key],format: 'his',callback:reload});
    }
}
//缓存服务器时间函数
function serverTime() { 
    var time = null; 
    return time; 
}
function reload()
{
    window.location.reload();
}