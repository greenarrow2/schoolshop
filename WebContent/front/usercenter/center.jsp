<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0042)http://www.bestln.com/user/site/index.html -->
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <meta name="Resource-Type" content="document"><meta name="Distribution" content="global"><meta name="Generator" content="bestln.com"><meta name="CopyRight" content="Copyright (c) 2010 bestln.com. All Rights Reserved."><meta name="rating" content="general"><link rel="shortcut icon" type="image/x-icon" href="http://www.bestln.com/favicon.ico"><script type="text/javascript">
/*<![CDATA[*/
BU = 'http://www.bestln.com/'; RESBU = 'http://res.bestln.com/bestln'; SBU = 'http://static.bestln.com/'
/*]]>*/
</script>
<%@ include file="/front/share/lib.jsp" %>
<link rel="stylesheet" type="text/css" href="../../css/user/user.css">
<script type="text/javascript" src="../../js/user/User.js"></script>
<title>齐派送 用户中心欢迎您 乐农优选生鲜超市|济南果蔬|济南网上买菜|济南食品</title>
        <!--[if IE 6]>
        <script src="http://res.bestln.com/bestln/js/ie6_png0827.js" type="text/javascript"></script>
        <script type="text/javascript">
        DD_belatedPNG.fix('.app,RandowPic img,MorIco_name,MorIco_password,.righter a');// .class透明PNG图片选择器在IE6的兼容（包括图片背景图，注意：偶尔造成图像定位失灵！）。
        </script>
        <![endif]-->
    </head>
    <body>
        <div class="wrapper" id="bestln"><!-- 封套和备用接口,不会写入宽度值，应用position的子容器将备注z-index值！ -->
            <div class="topbar"><!-- 预留的头部空间/z-index:0 --></div>
            <div class="shelf"><!-- z-index:0 -->
                <div class="b90">
                    <span class="left">${user.userName}您好，欢迎来到乐农优选！
                        [<a href="../../front/main/index.htm">返回首页</a>]·
                                                    [<c_rt:if test="${empty user}"><a href="../../front/user/login.jsp">我的订单</a></c_rt:if><c_rt:if test="${not empty user}"><a href="../../front/usercenter/getAllFavorite.htm">我的订单</a></c_rt:if>]·
                            [<a href="http://www.bestln.com/logout.html">退出</a>]
                                                </span>
                    <span class="right">
                        <a href="javascript:;" onclick="addfavorite();">收藏农乐</a> 丨 
                        <a href="http://www.bestln.com/article/index/id/1.html">帮助中心</a> 丨 
                        <div style="position: absolute;margin-top:-28px;margin-left:-120px;*margin-top:-6px;*margin-left: -263px;">
                            <iframe width="122" style="float: left;" scrolling="no" height="40" frameborder="0" src="./个人中心_files/followbutton.html" border="0" marginheight="0" marginwidth="0" allowtransparency="true"></iframe>
                        </div>
                    </span>
                </div>
            </div>
            <div class="application">
                <div class="b90">
                    <div class="app">用户中心</div>
                </div>
            </div>
            <div class="UserService">
                <div class="b90">
                    <div class="son">
                        <div class="left">
                            <div class="UserMax">
                                <div class="lefter">
                                    <div><img src="./个人中心_files/ln_US_01.jpg" width="80" height="80"></div>
                                    <div><a href="http://www.bestln.com/user/site/setpictrue.html">设置新头像</a></div>
                                </div>
                                <div class="righter"><a href="./个人中心_files/个人中心.html">我的乐农</a></div>
                                <div class="Max">
                                    <p>用户：<font class="hot">gege</font></p>
                                    <p><span>用户等级：<font class="hot">注册会员</font></span>
                                        <small>
                                            <a href="http://www.bestln.com/article/view/id/11.html">如何提升等级</a>
                                        </small>
                                    </p>
                                </div>
                            </div>
                            <ul class="UserLI">
                                <li>
                                    <div>交易管理</div>
                                    <ol>
                                        <li><a href="http://www.bestln.com/user/order/index.html">我的订单</a></li>
                                        <!--<li><a href="">我的周菜香</a></li>-->
                                        <li><a href="http://www.bestln.com/user/bonus/index.html">我的优惠券</a></li>
                                        <li><a href="../../front/usercenter/getAllAddress.htm">收货地址</a></li>
                                        <li><a href="http://www.bestln.com/user/pre/index.html">我的预定</a></li>
                                    </ol>
                                </li>
                                <li>
                                    <div>收藏夹</div>
                                    <ol>
                                        <li><a href="http://www.bestln.com/user/collect/index.html">商品收藏</a></li>
                                    </ol>
                                </li>
                                <li>
                                    <div>评论管理</div>
                                    <ol>
                                        <li><a href="http://www.bestln.com/user/comment/index.html">我的评论</a></li>
                                        <li><a href="http://www.bestln.com/user/message/index.html">我的留言</a></li>
                                    </ol>
                                </li>
                                <li>
                                    <div>帐号管理</div>
                                    <ol>
                                        <li><a href="http://www.bestln.com/user/info/index.html">我的资料</a></li>
                                        <li><a href="http://www.bestln.com/user/funds/index.html">我的资金</a></li>
                                        <li><a href="http://www.bestln.com/user/funds/recharge.html" target="_blank">我要充值</a></li>
                                        <li><a href="http://www.bestln.com/user/site/changepasswd.html">修改密码</a></li>
                                    </ol>
                                </li>
                                <li>
                                    <div>馋猫管理</div>
                                    <ol>
                                        <li><a href="http://www.bestln.com/user/foodbook/index.html">我的馋猫</a></li>
                                    </ol>
                                </li>
                            </ul>
                        </div>
                        <div class="right">
    <div class="one">
        <p><b>gege 欢迎您！</b></p>
        <p>· 等级：注册会员 · 积分：0 · 优惠券：0 ·  我的余额:0.00元</p>
    </div>
    <div class="two">
        <p>待付款订单 <a href="http://www.bestln.com/user/order/index/Type/Unpay.html">
            0</a>|待确认收货订单 <a href="http://www.bestln.com/user/order/index/Type/Unpack.html">0</a> |
            待评论订单 <a href="http://www.bestln.com/user/order/index/Type/UnComment.html">0</a>丨 <span><a href="http://www.bestln.com/user/info/address.html">收货地址管理</a></span></p>
    </div>
    <div class="three">
        <div class="Tittleer">
            <div class="lefter"><p class="ler">快捷到达</p><p class="rir"></p></div>
            <div class="righter"><a href="http://www.bestln.com/user/funds/recharge.html">立即充值</a></div>
        </div>
        <div class="Coneer">
            <div class="apper">
                <p>
                    <a href="http://www.bestln.com/user/order/index.html">我的订单</a>
                    <a href="http://www.bestln.com/user/bonus/index.html">我的优惠券</a>
                    <a href="http://www.bestln.com/user/info/address.html">收货地址</a>
                    <a href="http://www.bestln.com/user/comment/index.html">我的评论</a>
                    <a href="http://www.bestln.com/user/message/index.html">我的留言</a>
                    <a href="http://www.bestln.com/user/info/index.html">我的资料</a>
                    <a href="http://www.bestln.com/user/funds/index.html">我的资金</a>
                    <a href="http://www.bestln.com/user/funds/recharge.html">我要充值</a>
                    <a href="http://www.bestln.com/user/site/changepasswd.html">修改密码</a>
                </p>
            </div>
        </div>
    </div>
    <div class="four">
        <div class="Tittleer">
            <div class="lefter"><p class="ler">猜你喜欢</p><p class="rir"></p></div>
        </div>
        <div class="Coneer">
            <div class="collect">
                <div class="soner">
                    <ul>
                    <c_rt:forEach items="${products}" var="product" varStatus="vs">
                                                <li class="Cbox${vs.index}">
                            <div>
                                <a href="/goods/view/id/515.html">
                                    <img src="../${product.coverUrl}" alt="${product.productName}" height="142" width="142"></a>
<!--                                <b><img src="../images/ln_A_21f.png" width="40" height="43"  alt="收藏品"/></b>-->
                            </div>
                            <div><p> <a href="../../front/product/getProduct.htm?id=${product.id}" target="_blank">${product.productName}</a></p></div>
                            <div><strong>￥${product.sellPrice}<small>/个</small></strong></div>
                        </li>
                     </c_rt:forEach>
                     </ul>
                </div>
            </div>
        </div>
    </div>
    <!-- -->
</div>
<!--[if IE 6]>
<script>
    $(".collect").find(".soner li").each(function(i,n){
        $(this).mouseover(function(){$(this).addClass('userlihover');});
    });
    $(".collect").find(".soner li").mouseout(function(){
        $(this).mouseout(function(){$(this).removeClass('userlihover')});
    });
</script>
<![endif]-->
                    </div>
                </div>
            </div>
            <div class="foott">
    <div class="b90">
        <div class="son">
            <p>
                <a href="http://www.bestln.com/article/view/id/6.html">联系我们</a> 丨 
                <a href="http://www.bestln.com/article/view/id/2.html">关于我们</a> 丨 
                <a href="http://www.bestln.com/article/view/id/7.html">新手指南</a> 丨 
                <a href="http://www.bestln.com/article/view/id/17.html">支付方式</a> 丨 
                <a href="http://www.bestln.com/article/view/id/18.html">配送中心</a> 丨 
                <a href="http://www.bestln.com/article/view/id/21.html">售后服务</a> 丨 
                <a href="http://www.bestln.com/article/view/id/24.html">特色服务</a>
            </p>
            <p>Copyright©2013  www.bestln.com 版权所有</p>
        </div>
    </div>
</div>    
</div>
</body>
</html>