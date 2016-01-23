<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0037)http://www.bestln.com/cart/index.html -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="Resource-Type" content="document">
<meta name="Distribution" content="global">
<meta name="Generator" content="bestln.com">
<meta name="CopyRight" content="Copyright (c) 2010 bestln.com. All Rights Reserved."><meta name="rating" content="general">
<link rel="shortcut icon" type="image/x-icon" href="http://www.bestln.com/favicon.ico"><script type="text/javascript">
/*<![CDATA[*/
BU = 'http://www.bestln.com/'; RESBU = 'http://res.bestln.com/bestln'; SBU = 'http://static.bestln.com/'
/*]]>*/
</script>
<%@ include file="/front/share/lib.jsp" %>       
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/base.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/common.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/cart/order.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common/message.js"></script>
<title>齐派送 购物车 乐农优选生鲜超市|济南果蔬|济南网上买菜|济南食品</title>
        <!--[if IE 6]>
        <script src="http://res.bestln.com/bestln/js/ie6_png0827.js" type="text/javascript"></script>
        <script type="text/javascript">
        DD_belatedPNG.fix('.app,RandowPic img,.right a,MorIco_name,MorIco_password,.orderNews');// .class透明PNG图片选择器在IE6的兼容（包括图片背景图，注意：偶尔造成图像定位失灵！）。
        </script>
        <![endif]-->
    </head>
    <body>
        <div class="wrapper" id="bestln"><!-- 封套和备用接口,不会写入宽度值，应用position的子容器将备注z-index值！ -->
            <div class="topbar"><!-- 预留的头部空间/z-index:0 -->
                
            </div>
            <div class="shelf"><!-- z-index:0 -->
                <div class="b90">
                    <span class="left">${user.userName}您好，欢迎来到乐农优选！
                        [<a href="http://www.bestln.com/">返回首页</a>]·
                                                [<a href="http://www.bestln.com/user/site/index.html">我的乐农</a>]·
                        [<a href="http://www.bestln.com/user/order/index.html">我的订单</a>]·
                        [<a href="http://www.bestln.com/logout.html">退出</a>]
                                            </span>
                    <span class="right">
                        <a href="javascript:;" onclick="addfavorite();">收藏农乐</a> 丨 
                        <a href="http://www.bestln.com/article/index/id/1.html">帮助中心</a> 丨 
                        <div style="position: absolute;margin-top:-28px;margin-left:-120px;*margin-top:-6px;*margin-left: -263px;">
                            <iframe width="122" style="float: left;" scrolling="no" height="40" frameborder="0" src="./查看购物车_files/followbutton.html" border="0" marginheight="0" marginwidth="0" allowtransparency="true"></iframe>
                        </div>
                    </span>
                </div>
            </div>
            <div class="application">
                <div class="b90">
                    <div class="app">购物流程</div>
                </div>
            </div>
            <div class="bread"><!-- 注册进度提示 -->
    <div class="b90">
        <div class="son">
            <div class="box one">
                <ul>
                    <li class="on">查看购物车</li>
                    <li>提交订单信息</li>
                    <li>支付</li>
                    <li>订单成功</li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div class="position">
    <div class="b90">
            </div>
</div>
<div class="UserCartOne">
    <div class="b90 CartBox">
    <c_rt:choose>
    <c_rt:when test="${empty buycart.buyItems}">
     <div class="b90 CartBox">
                <div class="b80" style="height:400px;">
            <div class="one">
                <div class="leer" style="margin-top:50px;">
                    <div class="left"><b>您的购物车是空的！</b></div>
                    <div class="left"><p>您可以：<a href="../../front/main/index.htm">返回首页</a></p></div>
                </div>
            </div>
        </div>
            </div>
    </c_rt:when>
    <c_rt:otherwise>
                    <div class="son">
                <div class="one" id="AjaxContent">
                    <ul>
                        <li class="hui">
                            <div class="l1">商品名称</div>
                            <div class="l2">样式</div>
                            <!--<div class="l3">库存状态</div>-->
                            <div class="l4">单价</div>
                            <div class="l5">数量</div>
                            <div class="l6">规格</div>
                            <div class="l7">小计</div>
                            <div class="l8">属性</div>
                            <div class="l9">操作</div>
                            
                        </li>
                         <c_rt:forEach items="${buycart.buyItems}" var="item" varStatus="vs">                   
                            <li>
                                <div class="l1">
                                    <div class="left">
                                        <img  src="${item.product.coverUrl}" width="56" height="56">
                                    </div>
                                    <span class="left"><a href="../../front/product/getProduct.htm?id=${item.product.id}" target="_blank">${item.product.productName}</a></span>
                                </div>
                                <div class="l2"><span>${item.productStyle.name}</span></div>
                                <div class="l4">
                                    <span id="price1">
                                                                          ￥${item.product.sellPrice}</span>
                                    <input type="hidden" value="8.28" name="sprice1" id="sprice1">                                </div>
                                                                    <div class="l5">
                                        <div>
                                            <a class="sub" href="javascript:;" onclick="downValue('amount${vs.index}',${item.product.id},${item.product.styleId});">减</a>
                                            <input class="text" id="amount${vs.index}" type="text" name="20430" value="${item.amount}" onblur="checkValue('amount1','9999', 1)">
                                            <a class="add" href="javascript:;" onclick="upValue('amount${vs.index}',${item.product.id},${item.product.styleId});">加</a>
                                        </div>
                                    </div>
                                                                <div class="l6"><span>400g</span></div>
                                <div class="l7"><span id="total${vs.index}">￥${item.product.sellPrice*item.amount}</span></div>
                                <div class="l8">
                                    <div>
                                        正价                                    </div>
                                </div>
                                <div class="l9"><span><a href="javascript:deleteItem(${item.product.id},${item.productStyle.id})">删除</a></span></div>
                            </li>
                            </c_rt:forEach>
                                                </ul>
                    <div class="tips">
                        <div class="left"><a href="http://www.bestln.com/">继续购物</a></div>
                        <div class="right">
                            <p class="left">您共选择<span id="CartNum">${buycart.allProductAmount}</span>件商品，
                                <strong>共计<span class="red" id="totalPrice">￥${totalSellPrice}</span></strong>
                                                            </p>
                            <p class="right"><c_rt:if test="${empty user}"><a href="../../front/user/login.jsp" >立即去结算</a></c_rt:if><c_rt:if test="${not empty user}"><a href="../../front/cartmanage/createOrder.htm" target="_blank">立即去结算</a></c_rt:if></p></div>
                    </div>
                </div>
                <div class="barer"></div>
                <div id="CartFavList">
                                    </div>
            </div>
            </c_rt:otherwise>
    </c_rt:choose>
            </div>
</div>
<div class="vid">
    <div class="b90">
        <div class="son"><img src="../../image/cart/ln_Car_10.png" width="990" height="126" alt="服务"></div>
    </div>
</div>
<script>
$(function(){
	allValue();
});
function FavAddToCart(logid){
    var FavCartAddurl = "/cart/favadd.html";
    $.post(FavCartAddurl,{'logid':logid},function(){
        window.location.reload();
    });
}

function deleteItem(productId,styleId){
	$.post('../../front/cartmanage/deleteCartItem.htm',{productId:productId,styleId:styleId}
	,function (result){
		if(result.length>20){
		$('#AjaxContent').empty();
		$('#AjaxContent').html(result);
		}else{
			 window.location.reload(true);
		}
	},'html');
}
</script>
</div>
</body></html>