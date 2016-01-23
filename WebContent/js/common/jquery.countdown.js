function showLoseTime(arr,idstr){
    if(idstr==''){
        idstr = 'LeftTime_';
    }
    for (var key in arr){
        $("#"+idstr+key).countdown({endtime:arr[key],format: 'his',callback:reload});
    }
}
function reload()
{
    window.location.reload();
}
jQuery.fn.countdown = function(options) {
    var defaults = {
        endtime: null,
        formart: 'his',
        callback: null,
        labels: null
    };
    options = $.extend(defaults, options);
	if(!options) options = '()';
    if(!options.labels){
        options.labels = {h: '小时', i: '分钟', s: '秒', y: '年', m: '月', d: '日'};
    }
	if(jQuery(this).length == 0) return false;
	var obj = this;	
	if(options.endtime < 0 || options.endtime == 'undefined')
	{
		if(options.callback) eval(options.callback);
		return null;
	}

	window.setTimeout(
		function() {
            var endtime = options.endtime;//取结束日期(毫秒值)
            var nowtime = new Date().getTime();        //今天的日期(毫秒值)
            var youtime = endtime - nowtime;//还有多久(毫秒值)
            var seconds = youtime / 1000;
            var minutes = Math.floor(seconds / 60);
            var hours = Math.floor(minutes / 60);
            var days = Math.floor(hours / 24);
            var CDay = days;
            var CHour = hours % 24;
            var CMinute = minutes % 60;
            var CSecond = Math.floor(seconds % 60);//"%"是取余运算，可以理解为60进一后取余数，然后只要余数。
            var str = '<strong class="countdown_row countdown_show3">';
            var formartStr = options.formart;
            var labes = options.labels;
            if(formartStr.indexOf('d')>-1){
                str += '<strong class="countdown_section"><strong class="countdown_amount">' + CDay + '</strong>' + labes.d + '</strong>';
            }
            str += '<strong class="countdown_section"><strong class="countdown_amount">' + CHour + '<\/strong>' + labes.h + '<\/strong>';
            str += '<strong class="countdown_section"><strong class="countdown_amount">' + CMinute + '<\/strong>' + labes.i + '<\/strong>';
            str +=  '<strong class="countdown_section"><strong class="countdown_amount">' + CSecond + '<\/strong>' + labes.s + '<\/strong>';
            str += '</strong>';
            if(youtime<0){
                str='已结束';
            }
			jQuery(obj).html(String(str));
			--options.endtime;
			if(youtime>=0){
                jQuery(obj).countdown(options);
            }else{
                return false;
            }
		}
		, 1000
	);
    return this;
}
jQuery.fn.countdown.stop = function() {
	window.clearTimeout(setTimeout("0")-1);
}