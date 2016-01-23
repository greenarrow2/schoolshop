$(window).bind("scroll", function() {
    var scrollTopNum = $(document).scrollTop();
    var winHeight = $(window).height();
    var goTop = $("#goTop");
    var hoverCar = $("#hoverCar");
    (scrollTopNum > 0) ? goTop.css("display", "block") : goTop.css("display", "none");
    (scrollTopNum > 0) ? hoverCar.css("display", "block") : hoverCar.css("display", "none");
});
$(function(){
    $("#goTop").click(function(){
        $('body,html').animate({scrollTop:0},1000);
        return false;
    });
});