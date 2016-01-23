/**
 * 购物车相关
 */
//显示/隐藏漂浮购物车
//获取滚动条的位置
$(document).ready(function(){
    $(window).scroll(function(){
        var ScrollTop = $(document).scrollTop();
        if (ScrollTop >= 180) {
            $("#SmallCart").removeClass('hidden');
        } else {
            $("#SmallCart").addClass('hidden');
        }
    });
    $("#MiniCart").mouseover(function(){
        getMiNiCart();
    });
});
//加入购物车
function AddToCart(goodsid,goodsNum,styleid){
    var GoodsNum = goodsNum ? goodsNum : 1; 
    //加入购物车，如果成功
    var url = "../../front/shopping/addCart.htm";
    $.post(url,{ productId:goodsid,num:GoodsNum,styleId:styleid},function(data){
            //执行飞入购物车
            //FlyToCart(goodsid);
            //购物车动态提示
            showCartMsg(data);
    },'html');
}

function showCartMsg(content){
    $("#GoodsMsg").html(content);
    $("#GoodsMsg").show("slow");
    setTimeout('$("#GoodsMsg").hide("slow")',3000); 
    getMiNiCart();
}
function FlyToCart(goodsid){
    //获取商品相对于窗口的偏移量
    var GoodsBox = $("#GoodsImg"+goodsid);
    var Gleft = GoodsBox.offset().left;
    var Gtop = GoodsBox.offset().top;
    $("#SmallCart").show();
    //获取购物车的偏移量
    var basketX         = $(document.body).width()-87;
    var basketY         = $("#SmallCart").offset().top; 
    //计算商品和购物车的距离
    var gotoX             = basketX - Gleft;
    var gotoY             = basketY - Gtop;
    //压缩商品图片大小
    var newImageWidth     = GoodsBox.find('img').width() /8;
    var newImageHeight    = GoodsBox.find('img').height()/8;
    //克隆
    GoodsBox.find('img').clone().prependTo(GoodsBox).css({'position' : 'absolute','z-index':9999,'marginTop':Gtop,'marginLeft':Gleft}).animate({ width: newImageWidth, height: newImageHeight}, 800 ).prependTo('body').css({'marginTop':Gtop,'marginLeft':Gleft}).animate({ marginLeft: basketX, marginTop: basketY-18, width: newImageWidth, height: newImageHeight,'z-index':9999}, 1000, function() {
        $(this).remove(); //加上这个，能让商品最后飞入购物车后销售 
    });
    getMiNiCart();
}
    

function allValue()
{
	var totalPrice = 0;
    var totalShop = 0;
	var num = 1;
	var outputLimit = 2;
	$(".CartBox input").each(function(){
		var price = '#price'+num;
		var nowPrice = $(price).text().replace('￥','');
		nowPrice = nowPrice.replace("元", '');
       
		var nowPrice = nowPrice*$("#amount"+num).val();
		nowPrice = nowPrice.toFixed(outputLimit);
        if(nowPrice == 'NaN')
        {
            nowPrice = '0.00';
        }
        var nowShop = $("#sprice"+num).val();
        if(nowShop<=0)
        {
            nowShop = nowPrice;
        }
        nowShop = nowShop * $("#amount"+num).val();
        //alert(nowPrice);
        
		$("#total"+num).text('￥' +nowPrice);
		totalPrice = totalPrice + parseFloat(nowPrice);
        totalShop = totalShop + parseFloat(nowShop);
		num++; 	
		}
	);
}
function AddToFavType(typeId, typeValue)
{
    var TypeId= parseInt(typeId);
    var TypeValue = parseInt(typeValue);
    $.ajax({
        type: "POST",
        url: "fav/add.html",
        data: {typeid:TypeId, typevalue:TypeValue},
        success: function(msg){
            if(msg)
            {
                MessageBox.show(msg);
            }else{
                MessageBox.show('系统繁忙！请稍后再试!');
            }
        }
    });
}    

function AddToFavorite(goodsid)
{
    $.ajax({
        type: "POST",
        url: "/fav/add.html",
        data: {goodsid:goodsid},
        success: function(msg){
            if(msg)
            {
                MessageBox.show(msg);
            }else{
                MessageBox.show('系统繁忙！请稍后再试!');
            }
        }
    });
}

function upValue(value, productId,styleId)
{
	var nowValue = $("#"+value).val();
	var index = value.charAt(value.length-1);
    var productId = productId;
    var styleId = styleId;
        $.ajax({
            type: "POST",
            url: "../../front/cartmanage/addCart.htm",
            dataType: 'json',
            cache:false,
            async:false,
            data: {num:1, productId:productId, styleId:styleId},
            success: function(msg){
                if(msg.success)
                {
                        ++nowValue;
                    $("#"+value).val(nowValue);
                    $("#total"+index).empty();
                    $("#total"+index).html('￥'+msg.obj*nowValue);
                    $('#totalPrice').empty();
                    $('#totalPrice').html('￥'+msg.data);
                }
            }
        }); 
    /*}else{
        ++nowValue;
        $("#"+value).val(nowValue);
    }*/
   // modifyNum($("#"+value).attr('name'), nowValue);
    return true;
}
function modifyNum(cart, cartnum)
{
    $.ajax({
        type: "POST",
        url: "/cart/modify.html",
        data: {id:cart, num:cartnum},
        success: function(data){
            if(data.msg==''){
                $.ajax({
                    type: "POST",
                    url: "/cart/ajaxlist.html",
                    data: {'act':'getajax'},
                    success: function(msg){
                        $("#AjaxContent").html(msg);
                        allValue();
                        getCartFavList();
                    }
                });
            }else{
                alert(data.msg);
                window.location.reload();
            }
        },
        dataType: "json"
    });
}
function getCartFavList(){
    var url='/cart/ajaxfavlist.html';
    $.post(url,{'act':'getajax'},function(data){
        if(data){
            $("#CartFavList").html(data);
            $("#CartFavList").show();
        }else{
            $("#CartFavList").html('');
            $("#CartFavList").hide();
        }
    });
}
function downValue(value, productId,styleId)
{
	var nowValue = $("#"+value).val();
	var index = value.charAt(value.length-1);
    var productId = productId;
    var styleId = styleId;
    if(nowValue>1){
        $.ajax({
            type: "POST",
            url: "../../front/cartmanage/decCart.htm",
            dataType: 'json',
            cache:false,
            async:false,
            data: {num:1, productId:productId, styleId:styleId},
            success: function(msg){
                if(msg.success)
                {
                        --nowValue;
                    $("#"+value).val(nowValue);
                    $("#total"+index).empty();
                    $("#total"+index).html('￥'+msg.obj*nowValue);
                    $('#totalPrice').empty();
                    $('#totalPrice').html('￥'+msg.data);
                }
            }
        }); 
    }
    /*}else{
        ++nowValue;
        $("#"+value).val(nowValue);
    }*/
   // modifyNum($("#"+value).attr('name'), nowValue);
    return true;
}
/**
 * 检测购物车输入的商品数量
 * @param {type} amount
 * @param {type} num
 * @param {type} minNum
 * @returns {undefined}
 */
function checkValue(amount,num, minNum)
{
	var re = /^[1-9]+[0-9]*]*$/;  
	var num = parseInt(num);
    var min = parseInt(minNum)>0?parseInt(minNum):1;
	var num2 = parseInt($("#"+amount).val());
	if(!re.test(num2)){
		if(num!=0){
			$("#"+amount).val(minNum);
            modifyNum($("#"+amount).attr('name'), minNum);
			MessageBox.show("请认真填写数量!");
		}
	}
    
	if(num2<min)
	{
		$("#"+amount).val(min);
	}
	if(num==0)
	{
		$("#"+amount).val(min);
	}
    var sort = amount.replace('amount', '');
    if($("#TypeLock"+sort).val())
    {
        $.ajax({
            type: "POST",
            url: "/cart/checktype.html",
            dataType: 'json',
            cache:false,
            async:false,
            data: {now:num2, cartid:$("#TypeCartId"+sort).val(),  typeid:$("#TypeId"+sort).val(), typevalue:$("#TypeValue"+sort).val()},
            success: function(msg){
                if(msg.num)
                {
                    if(msg.content)
                    {
                        MessageBox.show(msg.content);
                    }
                    $("#"+amount).val(msg.num)
                    num2 = msg.num;
                }
            }
        }); 
    }else{
        $("#"+amount).val(num2);
    }
    modifyNum($("#"+amount).attr('name'), num2);
	$.ajax({
        type: "POST",
        url: "/cart/ajaxlist.html",
        data: {'act':'getajax'},
        success: function(msg){
            $("#AjaxContent").html(msg);
            allValue();
        }
    });
}




function MiNiupValue(value, total)
{
	var nowValue = $("#"+value).val();
    var total = parseInt(total);
    ++nowValue;
    $("#"+value).val(nowValue);
    MiNimodifyNum($("#"+value).attr('name'), 1,total);
    return true;
}
function MiNimodifyNum(cart, cartnum,styleid)
{
    $.ajax({
        type: "POST",
        url: "../../front/shopping/addCart.htm",
        data: {productId:cart, num:cartnum, styleId:styleid},
        success: function(){
            getMiNiCart();
        }
    });
}
function MiNimodifyNumDec(cart, cartnum,styleId)
{
	$.ajax({
		type: "POST",
		url: "../../front/shopping/decCart.htm",
		data: {productId:cart, num:cartnum,styleId:styleId},
		success: function(){
			getMiNiCart();
		}
	});
}

function getMiNiCart(){
    var url = '../../front/shopping/allCartProducts.htm';
    $.post(url,{},function(data){
        $("#MiniCartContent").html(data);
        $.post('../../front/shopping/cartProductNum.htm',{},function(mdata){
           $("#MiniCartNum").html(mdata);
           $("#cart_num").html(mdata);
        },'json');
    },'html'); 
}

function MiNidownValue(value, min,styleId)
{
	var nowValue = $("#"+value).val();
	if(nowValue>min){
        --nowValue;
        $("#"+value).val(nowValue);
        MiNimodifyNumDec($("#"+value).attr('name'), 1,styleId);
	}else
    {
		MessageBox.show("已到最小购买数量限制!");
		return false;
	}
}
/**
 * 检测购物车输入的商品数量
 * @param {type} amount
 * @param {type} num
 * @param {type} minNum
 * @returns {undefined}
 */
function MiNicheckValue(amount,num, minNum,productId,styleId)
{
	var re = /^[1-9]+[0-9]*]*$/;  
	var num = parseInt(num);
    var min = parseInt(minNum)>0?parseInt(minNum):1;
	var num2 = parseInt($("#"+amount).val());
	if(!re.test(num2)){
		if(num!=0){
			$("#"+amount).val(minNum);
            //modifyNum($("#"+amount).attr('name'), minNum);
			MessageBox.show("请认真填写数量!");
		}
	}
    
	if(num2<min)
	{
		$("#"+amount).val(min);
	}
	if(num==0)
	{
		$("#"+amount).val(min);
	}
    $("#"+amount).val(num2);
    var flag = num-num2;
    if(flag>0){
    	MiNimodifyNumDec(productId, flag,styleId)
    }
    var flag2 = num2-num;
    if(flag2>0){
    	MiNimodifyNum(productId, flag2,styleId);
    }
	getMiNiCart();
}
/**
 * 删除购物项
 * @param productId
 * @param styleId
 */
function deleteCartItem(productId,styleId){
	if(productId!=null && styleId!=null){
		$.post('../../front/shopping/deleteCartItem.htm',{
			productId:productId,
			styleId:styleId
		},function (result){
			getMiNiCart();
			alert(result.obj);
		},'json');
	}
}