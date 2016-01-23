<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0039)http://www.bestln.com/order/create.html -->
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <meta name="Resource-Type" content="document"><meta name="Distribution" content="global"><meta name="Generator" content="bestln.com"><meta name="CopyRight" content="Copyright (c) 2010 bestln.com. All Rights Reserved."><meta name="rating" content="general"><link rel="shortcut icon" type="image/x-icon" href="http://www.bestln.com/favicon.ico"><script type="text/javascript">
/*<![CDATA[*/
BU = 'http://www.bestln.com/'; RESBU = 'http://res.bestln.com/bestln'; SBU = 'http://static.bestln.com/'
/*]]>*/
</script>
<%@ include file="/front/share/lib.jsp" %> 
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/cart/UserCart.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/base.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/common.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/cart/order.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/cart/Areas.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/cart/AreasFunction.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common/sso.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common/suda.js"></script>
<title>齐派送  乐农优选生鲜超市|济南果蔬|济南网上买菜|济南食品</title>
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
                            <iframe width="122" style="float: left;" scrolling="no" height="40" frameborder="0" src="./提交订单信息和收货地址选择支付方式_files/followbutton.html" border="0" marginheight="0" marginwidth="0" allowtransparency="true"></iframe>
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
            <div class="box two">
                <ul>
                    <li>查看购物车</li>
                    <li class="on">提交订单信息</li>
                    <li>支付</li>
                    <li>订单成功</li>
                </ul>
            </div>
        </div>
    </div>
</div>
<form id="order-create-form" action="../../front/order/saveOrder.htm" method="post"><div class="UserCartTwo">
    <div class="b90">
        <div class="son">
            <h2>请您填写并核对订单信息</h2>
            <div class="one universal"><!-- 收货人信息开始↓ -->
                <div class="BorderWrapper">
                    <div class="title">
                        <strong>收货人信息：</strong>
                        <span>
                        <a href="javascript:DivShow('UserAddressEditBox');">[修改]</a>
                        </span>
                    </div>
                    <div class="set">
                        <div class="SetContent" id="UserAddressShowBox">
                        <c_rt:if test="${not empty user and not empty user.userDeliverInfo}">
                        <p>${user.userDeliverInfo.recipients}   ${user.userDeliverInfo.address} </p>
                        <p>${user.userDeliverInfo.mobile}  ${user.userDeliverInfo.email}</p>
                        </c_rt:if>
                        </div>
                    </div>
                </div>
                <input value="0" name="Order[Country]" id="Order_Country" type="hidden"><input value="0" name="Order[Province]" id="Order_Province" type="hidden"><input value="0" name="Order[City]" id="Order_City" type="hidden"><input value="0" name="Order[District]" id="Order_District" type="hidden"><input name="Order[Address]" id="Order_Address" type="hidden"><input name="Order[Consignee]" id="Order_Consignee" type="hidden"><input name="Order[ZipCode]" id="Order_ZipCode" type="hidden"><input name="Order[Mobile]" id="Order_Mobile" type="hidden"><input name="Order[Tel]" id="Order_Tel" type="hidden">                <div class="BorderWrapper " id="UserAddressEditBox" style="border:3px solid #90c31f;">
                    <div class="title">
                        <strong>收货人信息：</strong><span>
                        </span>
                    </div>
                    <div class="set">
                        <div class="SetContent">
                            <div id="AddressList">
                               <c_rt:forEach items="${user.udis}" var="udi">
                                <div class="Option">
                                            <div class="left">
                                                <input type="radio"  name="addressId" value="${udi.id}" id="Address_${udi.id}" <c_rt:if test="${udi.checked}">checked = "true"</c_rt:if>/>
                                                <label for="Address_${udi.id}">
                                                    <b>${udi.recipients}</b>
                                                     ${udi.address}  
                                                     ${udi.mobile }                                             
                                                     ${udi.email }</label>
                                            </div>
                                            <div class="left">
                                                <!--<a href="javascript:EditAddress(71539);">编辑</a>-->
                                            </div>
                                        </div>
                                        </c_rt:forEach>
                             </div>
                            <div class="Option on">
                                <div class="left">
                                    <input type="radio"  name="addressId" value="0">
                                    <label for="Address_0"><span>使用新地址</span></label>
                                </div>
                            </div>
                            <ul class="seter1">
                                <li>
                                    <div class="left le">
                                        <span class="red">*</span>收货人：
                                    </div>
                                    <div class="left ri">
                                        <input name="Name" id="Consignee_0" class="text" value="" type="text">
                                    </div>
                                </li>
                               <li>
                                 
                                    <div class="left le">
                                        <span class="red">*</span>
                                                                     收货地址：
                                    </div>
                                   <div class="left ri" id="AreasBox">
                                        <select id="Country_0" onchange="ChangeRegion($(this),1,'Province_0','Province_0,City_0,Districts_0')" name="UserAddress[Country]" onfocus="ChangeRegion($(this),0,'Country_0')">
                                            
                                        <option value="0">请选择</option><option value="1">中国</option></select>
                                        <select id="Province_0" onchange="ChangeRegion($(this),2,'City_0','City_0,Districts_0')" style="display:none" name="UserAddress[Province]">
                                            <option value="0">请选择</option>
                                        </select>
                                        <select id="City_0" onchange="ChangeRegion($(this),3,'Districts_0','')" style="display:none" name="UserAddress[City]">
                                            <option value="0">请选择</option>
                                        </select>
                                        <select name="UserAddress[District]" id="Districts_0" style="display:none">
                                            <option value="0">请选择</option>
                                        </select>
                                        (必填) 
                                    </div>
                                </li>
                                <li>
                                    <div class="left le">
                                        <span class="red">*</span>
                                        详细地址：
                                    </div>
                                    <div class="left ri"><input name="Address" id="Address_0" class="text2" value="" type="text"></div>
                                </li>
                                <li>
                                    <div class="left le">
                                        <span class="red">*</span>
                                        手机号码：
                                    </div>
                                    <div class="left ri"><input name="Mobile_0" id="Mobile_0" class="text" value="" type="text"></div>
                                </li>
                                <li>
                                    <div class="left le">邮箱：</div>
                                    <div class="left ri">
                                        <input name="Email" id="Email_0" class="text" value="" type="text">
                                    </div>
                                    <p class="left">发送货物状态、优惠信息和活动提醒</p>
                                </li>
                            </ul>
                            <div class="Submit1"><span><a href="javascript:;" onclick="ChangeAddress();">保存收货人信息</a></span></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="two universal"><!-- 支付及配送方式开始↓ -->
                <div class="BorderWrapper">
                    <div class="title">
                        <strong>支付及配送方式和时间段：</strong><span><a href="javascript:DivShow('ShippingEditBox');">[修改]</a></span>
                    </div>
                    <div class="set">
                        <div class="SetContent">
                            <p id="CheckPayment">支付宝</p>
                            <p id="CheckShipping">分段派送</p>
                        </div>
                    </div>
                </div>
                <div class="BorderWrapper none" id="ShippingEditBox" style="border:3px solid #90c31f;">
                    <div class="title">
                        <strong>支付及配送时间段：</strong>
                    </div>
                    <div class="set">
                        <div class="SetContent">
                            
                                <strong class="stg">支付方式</strong>
                                                                <div class="Option">
                                    <div class="left">
                                        <input checked="true" onclick="$('#Order_GoodsPercent').val(1);$('#CheckPayment').html('支付宝')" value="1" name="orderPayId" id="Order_PayId" type="radio">                                        <label><span>支付宝</span></label>
                                    </div>
                                    <div class="right">支付宝网站(www.alipay.com) 是国内先进的网上支付平台</div>
                                </div>
                                 <div class="Option">
                                    <div class="left">
                                        <input  onclick="$('#Order_GoodsPercent').val(2);$('#CheckPayment').html('货到付款')" value="2" name="orderPayId" id="Order_PayId" type="radio">                                        <label><span>货到付款</span></label>
                                    </div>
                                    <div class="right">货到付款</div>
                                </div>
                                                                <strong class="stg">配送时间段</strong>
                                                                <div class="Option on">
                                    <div class="left">
                                        <input onclick="changeShipping(1,'分段配送','1');" value="1" id="Order_Shipping_1" checked="checked" type="radio" name="orderShippingId">                                        <label for="Order_Shipping_1"><span>分段派送</span></label>
                                    </div>
                                    <div class="right">中午12:00 —— 2:00，晚上6:00 —— 7:30</div>
                                </div>
                                                                <div class="Option on">
                                    <div class="left">
                                        <input onclick="changeShipping(2,'紧急配送','2');" value="2" id="Order_Shipping_2" type="radio" name="orderShippingId">                                        <label for="Order_Shipping_5"><span>紧急派送</span></label>
                                    </div>
                                    <div class="right">半小时内送到</div>
                                </div>
                                                                 
                                <div id="SelfBox" class="SelfBox none"></div>
                                <div class="Submit2"><span><a href="javascript:getOrderAmount();DivHide('ShippingEditBox');">保存支付及配送方式</a></span></div>
                                
                            </div>
                    </div>
                </div>
                <div class="BorderWrapper">
                    <div style="padding-left: 15px;line-height: 32px; margin-bottom:10px;">
                        <strong style="font-weight:800; font-size:14px;">备注：</strong><div><textarea style="margin-top:5px; width:400px; height:50px;" name="UserBeizhu"></textarea></div>
                    </div>
                </div>
            </div>
                        <div class="four">
                <div class="goods">
                    <div class="title">
                        <strong>商品信息：</strong><span><a href="http://www.bestln.com/cart/index.html">[返回购物车]</a></span>
                    </div>
                    <div class="b9">
                        <div class="ul0">
                            <div class="li1"><p>商品名称</p></div>
                            <div class="li2"><p>规格</p></div>
                            <div class="li3"><p>价格</p></div>
                            <div class="li4"><p>数量</p></div>
                            <div class="li5"><p>备注</p></div>
                            <div class="li6"><p>小计</p></div>
                        </div>
                                                <ul>
                        <c_rt:forEach items="${buycart.buyItems}" var="item" varStatus="vs">
                                                                            <li>
                                <div class="ol1">
                                    <a href="http://www.bestln.com/goods/view/id/82.html">
                                        <img src="./提交订单信息和收货地址选择支付方式_files/20140620165744_53a3f7888b05b.jpg" alt="菠菜 400g/份 绿色蔬菜 乐农优选" width="56" height="56">
                                    </a>
                                </div>
                                <div class="ol2"><p><a href="http://www.bestln.com/goods/view/id/82.html">${item.product.productName}</a></p><p class="gray"></p></div>
                                <div class="ol3"><p>400g</p></div>
                                <div class="ol4"><p>￥${item.product.sellPrice}</p></div>
                                <div class="ol5"><p>${item.amount}</p></div>
                                <div class="ol6">正价 </div>
                                <div class="ol7"><p>￥${item.product.sellPrice*item.amount}</p></div>
                            </li>
                         </c_rt:forEach>
                                                    </ul>
                                                <div class="information">
                                                        <div class="Ili">
                                <div class="left">
                                    <span class="right">
                                        <b>${buycart.allProductAmount}</b>件商品含
                                        <b>0</b>件赠品，购物款金额：
                                    </span>
                                </div>
                                <div class="right">￥${totalSellPrice}</div>
                            </div>
                            <div id="OrderAmountBox">    <div class="Ili"><div class="left"><span class="right">应付款：</span></div><div class="right">￥${orderTotalPrice}</div></div></div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="five">
                <div class="cc5">
                    <div class="righter OrderMoney">
                        <div class="left"><strong>应付款<span class="red" id="PayBtnAmont">￥${orderTotalPrice}元</span></strong></div>
                        <div class="left"><p><input type="hidden" value="1" name="Order[GoodsPercent]" id="Order_GoodsPercent"></p></div>
                    </div>
                </div>
                <div class="right"><p><a href="javascript:checkprice();">立即提交订单</a></p></div>
            </div>
        </div>
    </div>
</div>
</form><div class="vid">
    <div class="b90">
        <div class="son"><img src="../../image/cart/ln_Car_10.png" width="990" height="126" alt="服务"></div>
    </div>
</div>
<script>
$(function(){
	$('#UserAddressEditBox').hide();
    getOrderAmount();
});
function checkprice(){
	$('#order-create-form').submit();
}

function getOrderAmount(){
    
    //用户所选支付方式
    var PayId = $("input[name='orderPayId']:checked").val();
    //用户所选配送方式
    var ShippingId = $("input[name='orderShippingId']:checked").val();
    
    if(PayId==7){
    	var UserMoney=0;
    }
       if(ShippingId==1){
		$("#PayBtnAmont").html("￥"+${orderTotalPrice}+'元');
       }
       if(ShippingId==2){
		$("#PayBtnAmont").html("￥"+${orderTotalPrice+2}+'元');
       }
       /*  if(data.Html){
            $("#OrderAmountBox").html(data.Html);
        } */
}
function ChangeAddress(){
    var SelectTypeVal = $("input[name='addressId']:checked").val();
    var OrderConutry = $("#Order_Country");
    var OrderProvince = $("#Order_Province");
    var OrderCity = $("#Order_City");
    var OrderDistrict = $("#Order_District");
    var OrderTel = $("#Order_Tel");
    var OrderMobile = $("#Order_Mobile");
    var OrderConsignee = $("#Order_Consignee");
    var OrderAddress = $("#Order_Address");
    if(SelectTypeVal>0){
        var url = "../../front/order/changeAddress.htm";
        $.post(url,{addressId:SelectTypeVal},function(result){
            OrderConutry.val(result.data.country);
            OrderProvince.val(result.data.province);
            OrderCity.val(result.data.city);
            OrderDistrict.val(result.data.district);
            OrderMobile.val(result.data.mobile);
            OrderConsignee.val(result.data.recipients);
            OrderAddress.val(result.data.address);
            $("#UserAddressShowBox").html(result.obj);
        },'json');
        $("#UserAddressEditBox").hide();
        //隐藏自提点显示
    	$("#SelfBox").html('');
        $("#SelfBox").addClass('none');
    }else{
        var url = "../../front/order/saveAddress.htm";
        $.post(url,{country:$("#Country_0").val(),province:$("#Province_0").val(),city:$("#City_0").val(),district:$("#Districts_0").val(),userId:${user.id},address:$("#Address_0").val(),mobile:$("#Mobile_0").val(),
        email:$("#Email_0").val(),consignee:$("#Consignee_0").val()},function(result){
          
                OrderConutry.val($("#Country_0").val());
                OrderProvince.val($("#Province_0").val());
                OrderCity.val($("#City_0").val());
                OrderDistrict.val($("#Districts_0").val());
                OrderTel.val($("#Tel_0").val());
                OrderMobile.val($("#Mobile_0").val());
                OrderConsignee.val($("#Consignee_0").val());
                OrderAddress.val($("#Address_0").val());
                $("#UserAddressShowBox").html(result.data);
                $(result.obj).appendTo("#AddressList");
        },'json');
        //隐藏自提点显示
        $("#UserAddressEditBox").hide();
        $("#SelfBox").html('');
        $("#SelfBox").addClass('none');
    }
}
function changeShipping(sid,sname,isself){
    	 $('#CheckShipping').html(sname);
         // $("#SelfBox").removeClass('none');
        //SearchShippingSelf(sid,sname,OrderConutry,OrderProvince,OrderCity,OrderDistrict,OrderAddress);
}
 
function DivShow(id){
    $("#"+id).show();
}
function DivHide(id){
    $("#"+id).hide();
}
</script>
</div>
</body>
</html>