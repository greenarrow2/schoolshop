function AddToFav(gid) {
    var url = '/Goods/addtofav.html';
    $.post(url, {'GoodsId': gid}, function(data) {
        alert(data);
    });
}
function UpGoodsNumber() {
    $("#GoodsNumber").val(parseInt($("#GoodsNumber").val()) + 1);
}
function DownGoodsNumber() {
    var Number = $("#GoodsNumber").val() - 1 > 0 ? $("#GoodsNumber").val() - 1 : 1;
    $("#GoodsNumber").val(Number);
}
$(function(){
    $("#CommentMenu li").click(function() {
        $("#CommentMenu li").removeClass('on');
        $(this).addClass('on');
    });
    getGoodsComment("All", 'CommentAll');
});

$('#GoodsCommentPager a').live('click', function() {
    $.ajax({
        url: $(this).attr('href'),
        success: function(html) {
            $('#CommentList').html(html);
        }
    });
}); 
