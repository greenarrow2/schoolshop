<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0060)http://www.bestln.com/cat-6-%E5%8F%B6%E8%8F%9C%E7%B1%BB.html -->
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <meta name="Resource-Type" content="document"><meta name="Distribution" content="global"><meta name="Generator" content="bestln.com"><meta name="CopyRight" content="Copyright (c) 2010 bestln.com. All Rights Reserved."><meta name="rating" content="general"><link rel="shortcut icon" type="image/x-icon" href="http://www.bestln.com/favicon.ico"><script type="text/javascript">
/*<![CDATA[*/
BU = 'http://www.bestln.com/'; RESBU = 'http://res.bestln.com/bestln'; SBU = 'http://static.bestln.com/'
/*]]>*/
</script>        <meta http-equiv="X-UA-Compatible" content="IE=9">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/product/pager.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/product/list.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/base.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/common.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/index.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/product/pageList.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common/cart.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common/jquery.countdown.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common/common.js"></script>
<%@include file="/front/share/lib.jsp" %>
<title>齐派送  乐农优选生鲜超市|济南果蔬|济南网上买菜|济南食品</title>
        <!--[if IE 6]>
        <script src="http://res.bestln.com/bestln/js/ie6_png0827.js" type="text/javascript"></script>
        <script type="text/javascript">
        DD_belatedPNG.fix('.logo .ek21 span.left img,.cart span,.SideMenu .list .nav li img,#bestln .SideMenu .list .nav li,b,.number,.carc .payb a,.CommodityNumber .uper,.CommodityNumber .dower,.Goodses img,.yh img');// .class透明PNG图片选择器在IE6的兼容（包括图片背景图，注意：偶尔造成图像定位失灵！）。
        </script>
        <![endif]-->
    </head>
    <body>
        <div class="main_bestln">
                        <!--工具栏开始-->
            <div class="toolbar">
                <div class="w1210">
                    <span class="fl" id="memberInfo">您好，欢迎来到乐农优选！ 
    [<a href="http://www.bestln.com/user/site/index.html">我的乐农</a>]·
    [<a href="http://www.bestln.com/user/order/index.html">我的订单</a>]·
    [<a href="http://www.bestln.com/logout.html">退出</a>]
    </span>
                    <span class="fr">
                        <span>
                            <iframe width="122" class="mt5" style="float: left; clear: both;" scrolling="no" height="30" frameborder="0" src="./二级分类——叶菜类_files/followbutton.html" border="0" marginheight="0" marginwidth="0" allowtransparency="true"></iframe>
                        </span>
                       <a href="javascript:;" onclick="addfavorite();">收藏乐农</a> 丨 
                       <a href="http://www.bestln.com/article/view/id/7.html">帮助中心</a> 丨 
                    </span>
                </div>
            </div>
            <!--工具栏结束-->
            <!--logo,查询框，我的乐农，购物篮 z-index:999~990-->
            <div class="logo">
                <div class="w1210 logo_son">
                    <!--左侧logo--->
                    <span class="fl">
                        <a href="http://www.bestln.com/">
                            <img src="./二级分类——叶菜类_files/ln_A_02.png" alt="齐派送  乐农优选生鲜超市|济南果蔬|济南网上买菜|济南食品" width="210" height="90">
                        </a>
                    </span>
                    <!---搜索框-->
                    <div class="search fl">
                        <form action="http://www.bestln.com/search/index.html" target="_blank">
                            <div class="box">
                                <input type="text" class="inp1" id="searchKey" name="Keywords">
                                <input type="submit" class="inp2" value="搜索">
                            </div>
                        </form>
                        <div class="hotwords">
                                                        <strong>热门搜索:</strong>
                                                        <a target="_blank" class="hot" href="http://www.bestln.com/search/index/Keywords/%E7%BA%A2%E5%AF%8C%E5%A3%AB.html">红富士</a>
                                                        <a target="_blank" href="http://www.bestln.com/search/index/Keywords/%E9%95%BF%E8%8C%84+%E8%8F%A0%E8%8F%9C.html">长茄 菠菜</a>
                                                        <a target="_blank" href="http://www.bestln.com/search/index/Keywords/%E9%B8%A1%E8%9B%8B.html">鸡蛋</a>
                                                        <a target="_blank" href="http://www.bestln.com/search/index/Keywords/%E6%B2%B9%E9%BA%A6%E8%8F%9C.html">油麦菜</a>
                                                    </div>
                    </div>
                    <!--我的乐农-->
                    <div class="myln fl">
<!--                        <img class="fl" style="margin:5px;margin-left: 10px;display: inline;margin-top: 15px;" src="" width="150" height="51"/>-->
                        <!--购物车总数滑动门-->
                       <div class="cartNum">
                           <div class="uper" id="MiniCartNum">0</div>
                           <div class="down"></div>
                       </div>
                       <dl class="dl0 dl1">
                           <dt id="MiniCart">
                               <a href="http://www.bestln.com/cart/index.html" target="_blank">购物车</a>
                               <i></i>
                           </dt>
                           <dd>
                               <div class="carLTtop">
                                   <a href="http://www.bestln.com/cart/index.html">去结算</a>
                                   <span></span>
                               </div>
                               <div class="carList" id="MiniCartContent">
                                   0                               </div>
                               <div class="carLBottom"></div>
                           </dd>
                       </dl>
                       <dl class="dl0 dl2">
                           <dt>
                               <a href="http://www.bestln.com/user/site/index.html" target="_blank">我的乐农</a>
                           </dt>
                       </dl>
                   </div>
                </div>
            </div>
            <!--logo结束-->
            <!--导航条start z-index:989~980-->
            <div class="w1210">
                <div class="menuContainer">
                    <div class="w1210 son">
                        <!--左侧类别导航-->
                        <div class="mainNav w1210"><!--导航-->
                                                            <ul>
                                                                            <li><a href="http://www.bestln.com/">首页</a>
                                                                                    </li>
                                                                            <li><a href="http://www.bestln.com/foodcase/index.html">周菜香</a>
                                                                                    </li>
                                                                            <li><a href="http://www.bestln.com/foodbook/index.html">馋猫</a>
                                                                                            <img src="./二级分类——叶菜类_files/hot.png">
                                                                                    </li>
                                                                            <li><a href="http://www.bestln.com/cat-403-%E5%BF%AB%E9%A3%9F%E4%BB%A3%E9%B2%9C%E5%88%87%E8%8F%9C.html">快食代鲜切菜</a>
                                                                                            <img src="./二级分类——叶菜类_files/hot.png">
                                                                                    </li>
                                                                            <li><a href="http://www.bestln.com/cat-1-%E6%96%B0%E9%B2%9C%E6%B0%B4%E6%9E%9C.html">新鲜水果</a>
                                                                                    </li>
                                                                            <li><a href="http://www.bestln.com/cat-4-%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C.html">绿色蔬菜</a>
                                                                                    </li>
                                                                            <li><a href="http://www.bestln.com/cat-307-%E6%B0%B4%E4%BA%A7%E6%B5%B7%E9%B2%9C.html">水产海鲜</a>
                                                                                    </li>
                                                                            <li><a href="http://www.bestln.com/article/index/CatId/8/CatName/%E7%94%9F%E9%B2%9C%E5%B8%B8%E8%AF%86.html">生鲜常识</a>
                                                                                    </li>
                                                                    </ul>
                                                        </div>
                    </div>
                </div>
                 <div class="leftMenu">
                    <!--左侧类别导航-->
                     
<div class="sideMenu " id="LeftMenu">
    <h2><a id="ShowAllCategory" href="javascript:;">所有商品分类</a></h2>
    <div class="menulist hidden" id="LeftMenuBox">
                <ul class="nav">
                        <li class="catnav" id="list_01">
                <div class="left">
                    <i class="fl"></i>
                    <h3><a href="http://www.bestln.com/cat-4-%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C.html" target="_blank">绿色蔬菜</a></h3>
                    <p>
                        <a target="_blank" href="./二级分类——叶菜类_files/二级分类——叶菜类.html">叶菜类</a><a target="_blank" href="http://www.bestln.com/cat-7-%E6%A0%B9%E8%8C%8E%E7%B1%BB.html">根茎类</a><a target="_blank" href="http://www.bestln.com/cat-8-%E6%9E%9C%E5%AE%9E%E7%B1%BB.html">果实类</a><a target="_blank" href="http://www.bestln.com/cat-9-%E8%8F%8C%E7%B1%BB.html">菌类</a><a target="_blank" href="http://www.bestln.com/cat-403-%E5%BF%AB%E9%A3%9F%E4%BB%A3%E9%B2%9C%E5%88%87%E8%8F%9C.html">快食代鲜切菜</a>                    </p>
                </div>
                <div class="catnav_son_list vhidden" style="height: 450px;">
                                        <ul>
                                                <li>
                            <h4><a target="_blank" href="./二级分类——叶菜类_files/二级分类——叶菜类.html">叶菜类</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-37-%E5%B0%8F%E7%99%BD%E8%8F%9C.html">小白菜</a><a target="_blank" href="http://www.bestln.com/cat-39-%E6%B2%B9%E9%BA%A6%E8%8F%9C.html">油麦菜</a><a target="_blank" href="http://www.bestln.com/cat-41-%E8%8F%A0%E8%8F%9C.html">菠菜</a><a target="_blank" href="http://www.bestln.com/cat-42-%E6%B2%B9%E8%8F%9C.html">油菜</a><a target="_blank" href="http://www.bestln.com/cat-43-%E7%B4%AB%E7%94%98%E8%93%9D.html">紫甘蓝</a><a target="_blank" href="http://www.bestln.com/cat-45-%E5%8D%B7%E5%BF%83%E8%8F%9C.html">卷心菜</a><a target="_blank" href="http://www.bestln.com/cat-112-%E9%A6%99%E8%8F%9C.html">香菜</a><a target="_blank" href="http://www.bestln.com/cat-213-%E5%A8%83%E5%A8%83%E8%8F%9C.html">娃娃菜</a><a target="_blank" href="http://www.bestln.com/cat-271-%E8%92%9C%E9%BB%84.html">蒜黄</a><a target="_blank" href="http://www.bestln.com/cat-280-%E7%94%9F%E8%8F%9C.html">生菜</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-7-%E6%A0%B9%E8%8C%8E%E7%B1%BB.html">根茎类</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-46-%E8%8A%B9%E8%8F%9C.html">芹菜</a><a target="_blank" href="http://www.bestln.com/cat-47-%E5%A4%A7%E5%9C%9F%E8%B1%86.html">大土豆</a><a target="_blank" href="http://www.bestln.com/cat-48-%E5%B1%B1%E8%8D%AF.html">山药</a><a target="_blank" href="http://www.bestln.com/cat-49-%E5%A7%9C.html">姜</a><a target="_blank" href="http://www.bestln.com/cat-50-%E8%83%A1%E8%90%9D%E5%8D%9C.html">胡萝卜</a><a target="_blank" href="http://www.bestln.com/cat-108-%E8%92%9C%E8%8B%94.html">蒜苔</a><a target="_blank" href="http://www.bestln.com/cat-233-%E7%AB%A0%E4%B8%98%E5%A4%A7%E8%91%B1.html">章丘大葱</a><a target="_blank" href="http://www.bestln.com/cat-380-%E7%99%BD%E8%90%9D%E5%8D%9C.html">白萝卜</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-8-%E6%9E%9C%E5%AE%9E%E7%B1%BB.html">果实类</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-51-%E8%B1%86%E8%A7%92.html">豆角</a><a target="_blank" href="http://www.bestln.com/cat-52-%E8%8A%B8%E8%B1%86.html">芸豆</a><a target="_blank" href="http://www.bestln.com/cat-54-%E8%8C%84%E5%AD%90.html">茄子</a><a target="_blank" href="http://www.bestln.com/cat-55-%E8%A5%BF%E7%BA%A2%E6%9F%BF.html">西红柿</a><a target="_blank" href="http://www.bestln.com/cat-56-%E8%A5%BF%E8%91%AB%E8%8A%A6.html">西葫芦</a><a target="_blank" href="http://www.bestln.com/cat-58-%E5%B0%96%E6%A4%92.html">尖椒</a><a target="_blank" href="http://www.bestln.com/cat-59-%E5%86%AC%E7%93%9C.html">冬瓜</a><a target="_blank" href="http://www.bestln.com/cat-61-%E9%BB%84%E7%93%9C.html">黄瓜</a><a target="_blank" href="http://www.bestln.com/cat-62-%E5%8D%97%E7%93%9C.html">南瓜</a><a target="_blank" href="http://www.bestln.com/cat-63-%E6%9D%AD%E6%A4%92.html">杭椒</a><a target="_blank" href="http://www.bestln.com/cat-104-%E9%9D%92%E8%8F%9C%E6%A4%92.html">青菜椒</a><a target="_blank" href="http://www.bestln.com/cat-105-%E8%8B%A6%E7%93%9C.html">苦瓜</a><a target="_blank" href="http://www.bestln.com/cat-106-%E7%B4%AB%E6%B4%8B%E8%91%B1.html">紫洋葱</a><a target="_blank" href="http://www.bestln.com/cat-107-%E7%99%BD%E6%B4%8B%E8%91%B1.html">白洋葱</a><a target="_blank" href="http://www.bestln.com/cat-114-%E6%89%81%E8%B1%86.html">扁豆</a><a target="_blank" href="http://www.bestln.com/cat-206-%E7%B4%AB%E8%96%AF.html">紫薯</a><a target="_blank" href="http://www.bestln.com/cat-208-%E6%B0%B4%E6%9E%9C%E9%BB%84%E7%93%9C.html">水果黄瓜</a><a target="_blank" href="http://www.bestln.com/cat-281-%E6%9C%89%E6%9C%BA%E8%8F%9C%E8%8A%B1.html">有机菜花</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-9-%E8%8F%8C%E7%B1%BB.html">菌类</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-35-%E6%9D%8F%E9%B2%8D%E8%8F%87.html">杏鲍菇</a><a target="_blank" href="http://www.bestln.com/cat-36-%E9%B2%9C%E9%A6%99%E8%8F%87.html">鲜香菇</a><a target="_blank" href="http://www.bestln.com/cat-102-%E8%9F%B9%E5%91%B3%E8%8F%87.html">蟹味菇</a><a target="_blank" href="http://www.bestln.com/cat-296-%E9%87%91%E9%92%88%E8%8F%87.html">金针菇</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-403-%E5%BF%AB%E9%A3%9F%E4%BB%A3%E9%B2%9C%E5%88%87%E8%8F%9C.html">快食代鲜切菜</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-404-%E9%B2%9C%E5%88%87%E8%8F%9C%E5%A5%97%E9%A4%90.html">鲜切菜套餐</a><a target="_blank" href="http://www.bestln.com/cat-411-%E8%BE%A3%E7%82%92%E8%9A%95%E8%9B%B9.html">辣炒蚕蛹</a><a target="_blank" href="http://www.bestln.com/cat-412-%E5%AE%AB%E4%BF%9D%E9%B8%A1%E4%B8%81.html">宫保鸡丁</a><a target="_blank" href="http://www.bestln.com/cat-413-%E8%8A%BD%E8%8F%9C%E9%B8%A1%E7%B1%B3%E7%A2%8E.html">芽菜鸡米碎</a><a target="_blank" href="http://www.bestln.com/cat-414-%E4%BA%AC%E9%85%B1%E8%82%89%E4%B8%9D.html">京酱肉丝</a><a target="_blank" href="http://www.bestln.com/cat-415-%E6%B5%B7%E5%B8%A6%E7%83%A7%E4%BA%94%E8%8A%B1.html">海带烧五花</a><a target="_blank" href="http://www.bestln.com/cat-416-%E9%BB%84%E7%93%9C%E9%92%B1%E5%9F%B9%E6%A0%B9.html">黄瓜钱培根</a><a target="_blank" href="http://www.bestln.com/cat-417-%E9%BB%84%E7%93%9C%E6%9C%A8%E8%80%B3.html">黄瓜木耳</a><a target="_blank" href="http://www.bestln.com/cat-418-%E7%B3%96%E9%86%8B%E9%87%8C%E8%84%8A.html">糖醋里脊</a><a target="_blank" href="http://www.bestln.com/cat-419-%E7%BA%A2%E7%83%A7%E5%B8%A6%E9%B1%BC%E5%9D%97.html">红烧带鱼块</a><a target="_blank" href="http://www.bestln.com/cat-420-%E5%92%95%E5%92%BE%E8%82%89.html">咕咾肉</a><a target="_blank" href="http://www.bestln.com/cat-421-%E5%A4%A7%E7%9B%86%E9%B8%A1.html">大盆鸡</a><a target="_blank" href="http://www.bestln.com/cat-422-%E9%B1%BC%E9%A6%99%E8%82%89%E4%B8%9D.html">鱼香肉丝</a><a target="_blank" href="http://www.bestln.com/cat-423-%E9%BB%91%E6%A4%92%E9%B8%A1%E6%9F%B3.html">黑椒鸡柳</a><a target="_blank" href="http://www.bestln.com/cat-424-%E6%B8%85%E6%B1%86%E4%B8%B8%E5%AD%90.html">清汆丸子</a><a target="_blank" href="http://www.bestln.com/cat-425-%E8%BE%A3%E7%82%92%E9%B1%BF%E9%B1%BC.html">辣炒鱿鱼</a><a target="_blank" href="http://www.bestln.com/cat-426-%E9%A6%99%E8%8F%87%E9%B8%A1%E7%89%87.html">香菇鸡片</a><a target="_blank" href="http://www.bestln.com/cat-427-%E7%82%92%E6%B2%B3%E8%99%BE.html">炒河虾</a><a target="_blank" href="http://www.bestln.com/cat-428-%E6%B8%85%E7%82%96%E9%B2%AB%E9%B1%BC.html">清炖鲫鱼</a><a target="_blank" href="http://www.bestln.com/cat-429-%E9%85%B8%E8%8F%9C%E7%82%96%E4%BA%94%E8%8A%B1%E8%82%89.html">酸菜炖五花肉</a><a target="_blank" href="http://www.bestln.com/cat-430-%E4%BB%80%E9%94%A6%E7%8E%89%E7%B1%B3%E7%B2%92.html">什锦玉米粒</a>                            </p>
                        </li>
                                            </ul>
                    <!--                    <ol >
                        <li>·推荐品牌</li>
                    </ol>-->
                </div>
            </li>
                        <li class="catnav" id="list_02">
                <div class="left">
                    <i class="fl"></i>
                    <h3><a href="http://www.bestln.com/cat-1-%E6%96%B0%E9%B2%9C%E6%B0%B4%E6%9E%9C.html" target="_blank">新鲜水果</a></h3>
                    <p>
                        <a target="_blank" href="http://www.bestln.com/cat-2-%E8%BF%9B%E5%8F%A3%E6%B0%B4%E6%9E%9C.html">进口水果</a><a target="_blank" href="http://www.bestln.com/cat-3-%E5%9B%BD%E4%BA%A7%E6%B0%B4%E6%9E%9C.html">国产水果</a><a target="_blank" href="http://www.bestln.com/cat-388-%E5%8E%9F%E4%BA%A7%E5%9C%B0%E7%9B%B4%E9%87%87.html">原产地直采</a>                    </p>
                </div>
                <div class="catnav_son_list vhidden" style="height: 450px;">
                                        <ul>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-2-%E8%BF%9B%E5%8F%A3%E6%B0%B4%E6%9E%9C.html">进口水果</a></h4>
                            <p>
                                                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-3-%E5%9B%BD%E4%BA%A7%E6%B0%B4%E6%9E%9C.html">国产水果</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-65-%E7%BA%A2%E5%AF%8C%E5%A3%AB.html">红富士</a><a target="_blank" href="http://www.bestln.com/cat-66-%E6%B0%B4%E6%99%B6%E6%A2%A8.html">水晶梨</a><a target="_blank" href="http://www.bestln.com/cat-68-%E7%BA%A2%E6%8F%90.html">红提</a><a target="_blank" href="http://www.bestln.com/cat-69-%E5%93%88%E5%AF%86%E7%93%9C.html">哈密瓜</a><a target="_blank" href="http://www.bestln.com/cat-70-%E7%81%AB%E9%BE%99%E6%9E%9C.html">火龙果</a><a target="_blank" href="http://www.bestln.com/cat-73-%E6%9F%A0%E6%AA%AC.html">柠檬</a><a target="_blank" href="http://www.bestln.com/cat-77-%E8%8A%92%E6%9E%9C.html">芒果</a><a target="_blank" href="http://www.bestln.com/cat-103-%E5%9C%A3%E5%A5%B3%E6%9E%9C.html">圣女果</a><a target="_blank" href="http://www.bestln.com/cat-126-%E9%9D%92%E6%8F%90.html">青提</a><a target="_blank" href="http://www.bestln.com/cat-128-%E7%9A%87%E5%86%A0%E6%A2%A8.html">皇冠梨</a><a target="_blank" href="http://www.bestln.com/cat-130-%E6%9D%8E%E5%AD%90.html">李子</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-388-%E5%8E%9F%E4%BA%A7%E5%9C%B0%E7%9B%B4%E9%87%87.html">原产地直采</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-255-%E6%B2%BE%E5%8C%96%E5%86%AC%E6%9E%A3.html">沾化冬枣</a><a target="_blank" href="http://www.bestln.com/cat-369-%E9%BB%84%E9%87%91%E6%A2%A8.html">黄金梨</a><a target="_blank" href="http://www.bestln.com/cat-378-%E7%94%98%E5%AD%9C%E6%9D%BE%E8%8C%B8.html">甘孜松茸</a><a target="_blank" href="http://www.bestln.com/cat-381-%E4%BA%91%E5%8D%97%E8%92%99%E8%87%AA%E7%9F%B3%E6%A6%B4.html">云南蒙自石榴</a><a target="_blank" href="http://www.bestln.com/cat-387-%E6%B3%B0%E5%AE%89%E7%94%9C%E5%B1%B1%E6%A5%82.html">泰安甜山楂</a><a target="_blank" href="http://www.bestln.com/cat-389-%E6%A0%96%E9%9C%9E%E7%BA%A2%E5%AF%8C%E5%A3%AB.html">栖霞红富士</a><a target="_blank" href="http://www.bestln.com/cat-398-%E7%8E%89%E6%BA%AA%E4%BA%91%E5%86%A0%E6%A9%99%EF%BC%88%E8%A4%9A%E6%A9%99%EF%BC%89.html">玉溪云冠橙（褚橙）</a>                            </p>
                        </li>
                                            </ul>
                    <!--                    <ol >
                        <li>·推荐品牌</li>
                    </ol>-->
                </div>
            </li>
                        <li class="catnav" id="list_03">
                <div class="left">
                    <i class="fl"></i>
                    <h3><a href="http://www.bestln.com/cat-11-%E6%94%BE%E5%BF%83%E8%82%89%E7%B1%BB.html" target="_blank">放心肉类</a></h3>
                    <p>
                        <a target="_blank" href="http://www.bestln.com/cat-34-%E9%87%91%E9%94%A3%E6%94%BE%E5%BF%83%E8%82%89.html">金锣放心肉</a><a target="_blank" href="http://www.bestln.com/cat-221-%E9%9B%A8%E6%B6%A6%E6%94%BE%E5%BF%83%E9%B8%A1%E8%82%89.html">雨润放心鸡肉</a>                    </p>
                </div>
                <div class="catnav_son_list vhidden" style="height: 450px;">
                                        <ul>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-34-%E9%87%91%E9%94%A3%E6%94%BE%E5%BF%83%E8%82%89.html">金锣放心肉</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-97-%E9%87%91%E9%94%A3%E8%82%8B%E6%8E%92.html">金锣肋排</a><a target="_blank" href="http://www.bestln.com/cat-98-%E9%87%91%E9%94%A3%E9%87%8C%E8%84%8A.html">金锣里脊</a><a target="_blank" href="http://www.bestln.com/cat-99-%E9%87%91%E9%94%A3%E5%90%8E%E8%85%BF%E8%82%89.html">金锣后腿肉</a><a target="_blank" href="http://www.bestln.com/cat-100-%E9%87%91%E9%94%A3%E4%BA%94%E8%8A%B1%E8%82%89.html">金锣五花肉</a><a target="_blank" href="http://www.bestln.com/cat-262-%E9%A2%88%E8%83%8C%E8%82%89.html">颈背肉</a><a target="_blank" href="http://www.bestln.com/cat-263-%E6%8E%92%E9%AA%A8.html">排骨</a><a target="_blank" href="http://www.bestln.com/cat-274-%E7%8C%AA%E8%B9%84.html">猪蹄</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-221-%E9%9B%A8%E6%B6%A6%E6%94%BE%E5%BF%83%E9%B8%A1%E8%82%89.html">雨润放心鸡肉</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-222-%E9%B8%A1%E8%83%B8%E8%82%89.html">鸡胸肉</a><a target="_blank" href="http://www.bestln.com/cat-223-%E9%B8%A1%E7%BF%85%E4%B8%AD.html">鸡翅中</a><a target="_blank" href="http://www.bestln.com/cat-224-%E9%B8%A1%E8%85%BF.html">鸡腿</a><a target="_blank" href="http://www.bestln.com/cat-225-%E4%B8%89%E9%BB%84%E9%B8%A1.html">三黄鸡</a>                            </p>
                        </li>
                                            </ul>
                    <!--                    <ol >
                        <li>·推荐品牌</li>
                    </ol>-->
                </div>
            </li>
                        <li class="catnav" id="list_04">
                <div class="left">
                    <i class="fl"></i>
                    <h3><a href="http://www.bestln.com/cat-307-%E6%B0%B4%E4%BA%A7%E6%B5%B7%E9%B2%9C.html" target="_blank">水产海鲜</a></h3>
                    <p>
                        <a target="_blank" href="http://www.bestln.com/cat-318-%E5%86%BB%E9%B2%9C.html">冻鲜</a><a target="_blank" href="http://www.bestln.com/cat-354-%E6%B4%BB%E9%B2%9C.html">活鲜</a>                    </p>
                </div>
                <div class="catnav_son_list vhidden" style="height: 450px;">
                                        <ul>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-318-%E5%86%BB%E9%B2%9C.html">冻鲜</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-308-%E7%BA%A2%E8%99%BE%E4%BB%81.html">红虾仁</a><a target="_blank" href="http://www.bestln.com/cat-309-%E7%86%9F%E8%99%BE.html">熟虾</a><a target="_blank" href="http://www.bestln.com/cat-310-%E9%9D%92%E8%99%BE%E4%BB%81.html">青虾仁</a><a target="_blank" href="http://www.bestln.com/cat-311-%E6%89%87%E8%B4%9D.html">扇贝</a><a target="_blank" href="http://www.bestln.com/cat-313-%E5%B8%A6%E9%B1%BC.html">带鱼</a><a target="_blank" href="http://www.bestln.com/cat-314-%E4%B8%9C%E6%B5%B7%E9%BB%84%E8%8A%B1%E9%B1%BC.html">东海黄花鱼</a><a target="_blank" href="http://www.bestln.com/cat-315-%E9%B3%95%E9%B1%BC%E5%9D%97.html">鳕鱼块</a><a target="_blank" href="http://www.bestln.com/cat-316-%E5%B0%8F%E9%BB%84%E8%8A%B1.html">小黄花</a><a target="_blank" href="http://www.bestln.com/cat-365-%E5%A4%A7%E8%BF%9E%E6%B5%B7%E5%8F%82.html">大连海参</a><a target="_blank" href="http://www.bestln.com/cat-366-%E6%B5%B7%E9%B2%9C%E7%A4%BC%E7%9B%92.html">海鲜礼盒</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-354-%E6%B4%BB%E9%B2%9C.html">活鲜</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-363-%E6%B5%B7%E6%98%8E%E8%99%BE.html">海明虾</a><a target="_blank" href="http://www.bestln.com/cat-364-%E8%83%B6%E4%B8%9C%E9%B2%8D%E9%B1%BC.html">胶东鲍鱼</a><a target="_blank" href="http://www.bestln.com/cat-368-%E8%8E%B1%E5%B7%9E%E6%A2%AD%E5%AD%90%E8%9F%B9.html">莱州梭子蟹</a><a target="_blank" href="http://www.bestln.com/cat-390-%E9%98%B3%E6%BE%84%E6%B9%96%E5%A4%A7%E9%97%B8%E8%9F%B9.html">阳澄湖大闸蟹</a><a target="_blank" href="http://www.bestln.com/cat-391-%E9%B2%9C%E6%B4%BB%E7%88%AC%E8%99%BE.html">鲜活爬虾</a>                            </p>
                        </li>
                                            </ul>
                    <!--                    <ol >
                        <li>·推荐品牌</li>
                    </ol>-->
                </div>
            </li>
                        <li class="catnav" id="list_05">
                <div class="left">
                    <i class="fl"></i>
                    <h3><a href="http://www.bestln.com/cat-174-%E9%85%92%E6%B0%B4%E8%8C%B6%E9%A5%AE.html" target="_blank">酒水茶饮</a></h3>
                    <p>
                        <a target="_blank" href="http://www.bestln.com/cat-319-%E6%B4%9B%E5%8C%97%E6%98%A5.html">洛北春</a><a target="_blank" href="http://www.bestln.com/cat-328-%E5%B1%B1%E5%9B%BD%E9%A5%AE%E8%89%BA%E8%8C%B6.html">山国饮艺茶</a><a target="_blank" href="http://www.bestln.com/cat-371-%E5%BE%B7%E5%86%A0.html">德冠</a><a target="_blank" href="http://www.bestln.com/cat-395-%E9%9D%A0%E4%B8%8A%E9%85%92.html">靠上酒</a><a target="_blank" href="http://www.bestln.com/cat-401-%E5%B0%8A%E5%B0%BC%E7%BA%A2%E9%85%92.html">尊尼红酒</a>                    </p>
                </div>
                <div class="catnav_son_list vhidden" style="height: 450px;">
                                        <ul>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-319-%E6%B4%9B%E5%8C%97%E6%98%A5.html">洛北春</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-321-%E6%B4%9B%E5%8C%97%E6%98%A51945.html">洛北春1945</a><a target="_blank" href="http://www.bestln.com/cat-326-%E5%A4%A7%E5%B8%88%E7%BA%A7%E6%89%8B%E9%85%BF%E5%8E%9F%E6%B5%8630%E5%B9%B4.html">大师级手酿原浆30年</a><a target="_blank" href="http://www.bestln.com/cat-327-%E7%A6%8F%E4%B8%B4%E5%A4%A9%E4%B8%8B%E7%A4%BC%E7%9B%92.html">福临天下礼盒</a><a target="_blank" href="http://www.bestln.com/cat-332-%E9%BE%99%E5%87%A4%E5%91%88%E7%A5%A5.html">龙凤呈祥</a><a target="_blank" href="http://www.bestln.com/cat-334-%E9%82%A2%E4%BE%97%E9%9B%AA%E9%85%92.html">邢侗雪酒</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-328-%E5%B1%B1%E5%9B%BD%E9%A5%AE%E8%89%BA%E8%8C%B6.html">山国饮艺茶</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-329-%E5%AD%94%E6%98%8ES5000.html">孔明S5000</a><a target="_blank" href="http://www.bestln.com/cat-330-%E9%99%88%E5%B9%B4%E9%93%81%E8%A7%82%E9%9F%B3S5000.html">陈年铁观音S5000</a><a target="_blank" href="http://www.bestln.com/cat-331-%E5%A4%A7%E7%BA%A2%E8%A2%8DS5000.html">大红袍S5000</a><a target="_blank" href="http://www.bestln.com/cat-335-%E5%A4%A7%E7%BA%A2%E8%A2%8DS1500.html">大红袍S1500</a><a target="_blank" href="http://www.bestln.com/cat-336-%E5%AD%94%E6%98%8ES1200.html">孔明S1200</a><a target="_blank" href="http://www.bestln.com/cat-337-%E5%B1%B1%E5%9B%BD%E9%A6%99S1300.html">山国香S1300</a><a target="_blank" href="http://www.bestln.com/cat-338-%E9%87%91%E9%AA%8F%E7%9C%89S1000.html">金骏眉S1000</a><a target="_blank" href="http://www.bestln.com/cat-339-%E5%8F%A4%E9%81%93%E9%99%88%E9%A6%99%E6%99%AE%E6%B4%B1S1000.html">古道陈香普洱S1000</a><a target="_blank" href="http://www.bestln.com/cat-340-%E5%B0%8F%E4%B9%94%E5%A4%A9%E9%A6%99S560.html">小乔天香S560</a><a target="_blank" href="http://www.bestln.com/cat-341-%E5%B1%B1%E5%9B%BD%E9%A6%99S500.html">山国香S500</a><a target="_blank" href="http://www.bestln.com/cat-344-%E9%BE%99%E4%BA%95%E7%BB%BF%E8%8C%B6s1000.html">龙井绿茶s1000</a><a target="_blank" href="http://www.bestln.com/cat-345-%E7%A2%A7%E8%9E%BA%E6%98%A5s1000.html">碧螺春s1000</a><a target="_blank" href="http://www.bestln.com/cat-346-%E9%BB%84%E5%B1%B1%E6%AF%9B%E5%B3%B0s1250.html">黄山毛峰s1250</a><a target="_blank" href="http://www.bestln.com/cat-347-%E5%A4%A7%E7%BA%A2%E8%A2%8D%EF%BC%88%E7%BB%8F%E6%B5%8E%E8%A3%85%EF%BC%89.html">大红袍（经济装）</a><a target="_blank" href="http://www.bestln.com/cat-348-%E5%95%86%E5%8A%A1%E9%87%8E%E7%94%9F%E7%BA%A2%E8%8C%B6S660.html">商务野生红茶S660</a><a target="_blank" href="http://www.bestln.com/cat-349-%E5%95%86%E5%8A%A1%E6%AD%A3%E5%B1%B1%E5%B0%8F%E7%A7%8DS400.html">商务正山小种S400</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-371-%E5%BE%B7%E5%86%A0.html">德冠</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-372-%E5%BE%B7%E5%86%A0%E9%BB%91%E9%AA%91%E5%A3%AB%E5%95%A4%E9%85%92%E7%A4%BC%E7%9B%92.html">德冠黑骑士啤酒礼盒</a><a target="_blank" href="http://www.bestln.com/cat-373-%E5%BE%B7%E5%86%A0%E9%93%B6%E9%AA%91%E5%A3%AB%E5%95%A4%E9%85%92%E7%A4%BC%E7%9B%92.html">德冠银骑士啤酒礼盒</a><a target="_blank" href="http://www.bestln.com/cat-392-%E5%BE%B7%E5%86%A01689%E9%BB%84%E5%95%A4%E9%85%92%E7%A4%BC%E7%9B%92.html">德冠1689黄啤酒礼盒</a><a target="_blank" href="http://www.bestln.com/cat-393-%E5%BE%B7%E5%86%A01689%E9%BB%91%E5%95%A4%E9%85%92%E7%A4%BC%E7%9B%92.html">德冠1689黑啤酒礼盒</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-395-%E9%9D%A0%E4%B8%8A%E9%85%92.html">靠上酒</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-396-%E9%9D%A0%E9%85%92.html">靠酒</a><a target="_blank" href="http://www.bestln.com/cat-397-%E4%B8%8A%E9%85%92.html">上酒</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-401-%E5%B0%8A%E5%B0%BC%E7%BA%A2%E9%85%92.html">尊尼红酒</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-400-%E5%B0%8A%E5%B0%BC%E7%BB%B4%E7%BA%B32004%E5%85%AC%E7%88%B5.html">尊尼维纳2004公爵</a><a target="_blank" href="http://www.bestln.com/cat-402-%E5%B0%8A%E5%B0%BC%E7%BB%B4%E7%BA%B3%E4%BD%B3%E9%85%BF%E5%B9%B2%E7%BA%A2.html">尊尼维纳佳酿干红</a>                            </p>
                        </li>
                                            </ul>
                    <!--                    <ol >
                        <li>·推荐品牌</li>
                    </ol>-->
                </div>
            </li>
                        <li class="catnav" id="list_06">
                <div class="left">
                    <i class="fl"></i>
                    <h3><a href="http://www.bestln.com/cat-10-%E7%B2%AE%E6%B2%B9%E5%89%AF%E9%A3%9F.html" target="_blank">粮油副食</a></h3>
                    <p>
                        <a target="_blank" href="http://www.bestln.com/cat-374-%E7%B2%AE%E6%B2%B9.html">粮油</a><a target="_blank" href="http://www.bestln.com/cat-384-%E7%B1%B3%E9%9D%A2.html">米面</a><a target="_blank" href="http://www.bestln.com/cat-386-%E8%B0%83%E6%96%99.html">调料</a>                    </p>
                </div>
                <div class="catnav_son_list vhidden" style="height: 450px;">
                                        <ul>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-374-%E7%B2%AE%E6%B2%B9.html">粮油</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-375-%E7%AE%80%E8%A3%85%E7%BC%A4%E7%BA%B7%E7%89%B9%E7%BA%A7%E5%88%9D%E6%A6%A8%E6%A9%84%E6%A6%84%E6%B2%B9%E7%A4%BC%E7%9B%92.html">简装缤纷特级初榨橄榄油礼盒</a><a target="_blank" href="http://www.bestln.com/cat-376-%E7%B2%BE%E8%A3%85%E6%AC%A7%E5%B0%9A%E7%89%B9%E7%BA%A7%E5%88%9D%E6%A6%A8%E6%A9%84%E6%A6%84%E6%B2%B9%E7%A4%BC%E7%9B%92.html">精装欧尚特级初榨橄榄油礼盒</a><a target="_blank" href="http://www.bestln.com/cat-377-Dintel%28%E7%99%BB%E9%BC%8E%29%E7%89%B9%E7%BA%A7%E5%88%9D%E6%A6%A8%E6%A9%84%E6%A6%84%E6%B2%B9.html">Dintel(登鼎)特级初榨橄榄油</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-384-%E7%B1%B3%E9%9D%A2.html">米面</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-134-%E6%B0%91%E5%A4%A9%E9%A5%BA%E5%AD%90%E7%B2%89.html">民天饺子粉</a><a target="_blank" href="http://www.bestln.com/cat-135-%E6%B0%91%E5%A4%A9%E7%B2%BE%E5%88%B6%E7%B2%89.html">民天精制粉</a><a target="_blank" href="http://www.bestln.com/cat-136-%E6%B0%91%E5%A4%A9%E7%89%B9%E4%B8%80%E7%B2%89.html">民天特一粉</a><a target="_blank" href="http://www.bestln.com/cat-265-%E8%9B%8B%E6%B8%85%E6%8C%82%E9%9D%A2.html">蛋清挂面</a><a target="_blank" href="http://www.bestln.com/cat-266-%E9%BE%99%E9%A1%BB%E6%8C%82%E9%9D%A2.html">龙须挂面</a><a target="_blank" href="http://www.bestln.com/cat-267-%E5%85%A8%E9%BA%A6%E6%8C%82%E9%9D%A2.html">全麦挂面</a><a target="_blank" href="http://www.bestln.com/cat-268-%E5%8E%9F%E5%91%B3%E6%8C%82%E9%9D%A2.html">原味挂面</a><a target="_blank" href="http://www.bestln.com/cat-399-%E5%88%9D%E8%8D%B7%E9%9D%A2%E7%B2%89.html">初荷面粉</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-386-%E8%B0%83%E6%96%99.html">调料</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-94-%E5%A4%AA%E5%A4%AA%E4%B9%90%E4%B8%89%E9%B2%9C%E9%B8%A1%E7%B2%BE.html">太太乐三鲜鸡精</a><a target="_blank" href="http://www.bestln.com/cat-96-%E5%B4%94%E5%AD%97%E7%89%8C%E9%A6%99%E6%B2%B9.html">崔字牌香油</a><a target="_blank" href="http://www.bestln.com/cat-116-%E6%B5%B7%E5%A4%A9%E4%B8%8A%E7%AD%89%E8%9A%9D%E6%B2%B9.html">海天上等蚝油</a><a target="_blank" href="http://www.bestln.com/cat-117-%E6%B5%B7%E5%A4%A9%E7%94%9F%E6%8A%BD.html">海天生抽</a><a target="_blank" href="http://www.bestln.com/cat-118-%E6%B5%B7%E5%A4%A9%E8%80%81%E6%8A%BD.html">海天老抽</a><a target="_blank" href="http://www.bestln.com/cat-120-%E5%81%A5%E5%BA%B7%E7%A2%98%E7%9B%90.html">健康碘盐</a><a target="_blank" href="http://www.bestln.com/cat-121-%E8%B1%86%E8%B1%89%E9%B2%AE%E9%B1%BC.html">豆豉鲮鱼</a><a target="_blank" href="http://www.bestln.com/cat-232-%E7%8E%8B%E8%87%B4%E5%92%8C%E8%87%AD%E8%B1%86%E8%85%90.html">王致和臭豆腐</a>                            </p>
                        </li>
                                            </ul>
                    <!--                    <ol >
                        <li>·推荐品牌</li>
                    </ol>-->
                </div>
            </li>
                        <li class="catnav" id="list_07">
                <div class="left">
                    <i class="fl"></i>
                    <h3><a href="http://www.bestln.com/cat-155-%E8%9B%8B%E7%B1%BB.html" target="_blank">蛋类</a></h3>
                    <p>
                        <a target="_blank" href="http://www.bestln.com/cat-156-%E5%B1%B1%E9%B8%A1%E8%9B%8B.html">山鸡蛋</a><a target="_blank" href="http://www.bestln.com/cat-205-%E5%AE%B6%E9%B8%A1%E8%9B%8B.html">家鸡蛋</a>                    </p>
                </div>
                <div class="catnav_son_list vhidden" style="height: 450px;">
                                        <ul>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-156-%E5%B1%B1%E9%B8%A1%E8%9B%8B.html">山鸡蛋</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-293-%E5%B1%B1%E9%B8%A1%E8%9B%8B.html">山鸡蛋</a>                            </p>
                        </li>
                                                <li>
                            <h4><a target="_blank" href="http://www.bestln.com/cat-205-%E5%AE%B6%E9%B8%A1%E8%9B%8B.html">家鸡蛋</a></h4>
                            <p>
                                <a target="_blank" href="http://www.bestln.com/cat-294-%E5%AE%B6%E9%B8%A1%E8%9B%8B.html">家鸡蛋</a>                            </p>
                        </li>
                                            </ul>
                    <!--                    <ol >
                        <li>·推荐品牌</li>
                    </ol>-->
                </div>
            </li>
                    </ul>
            </div>
</div>
<script>
$(function(){
    if($('.catnav_son_list').height()<450){
        $('.catnav_son_list').height(450);
    };
    $("#LeftMenu").mouseout(function(){
        $("#LeftMenuBox").hide();
    });
    $("#LeftMenu").mouseover(function(){
        $("#LeftMenuBox").show();
    });
    $("#ShowAllCategory").mouseover(function(){
        $("#LeftMenuBox").show();
    });
});
</script>
                </div>
                <div class="listConetnt w1210"><!--主体内容-->
    <div class="curtUrl mt5">
        <b><a href="http://www.bestln.com/">首页</a></b><span>&gt;</span>
        <a href="${pageContext.request.contextPath}/front/product/getProductAndOneType.htm?id=${productTypeOne.id}">
        ${productTypeOne.name}</a>
                
                </div>
    <div class="lists">
        <div class="lLeft fl">
                        <ul class="listLeft1">
                        <li>
                    
                    <div class="on">
                        <b></b>
                        <a href="${pageContext.request.contextPath}/front/product/getProductAndOneType.htm?id=${productTypeOne.id}">${productTypeOne.name}</a>
                    </div>
                    <ol class="">
                                        <c_rt:forEach items="${productTypeOne.children}" var="tp">
                                                <li><a href="${pageContext.request.contextPath}/front/product/getProductAndTwoType.htm?id=${tp.id}">${tp.name}</a></li>
                                         </c_rt:forEach>        
                                            </ol>
                </li>
                        <c_rt:forEach items="${typeOnes}" var="type">
                                <li>
                    
                    <div class="">
                        <b></b>
                        <a href="${pageContext.request.contextPath}/front/product/getProductAndOneType.htm?id=${type.id}">${type.name}</a>
                    </div>
                    <ol class="none">
                                        <c_rt:forEach items="${type.children}" var="tp">
                                                <li><a href="${pageContext.request.contextPath}/front/product/getProductAndTwoType.htm?id=${tp.id}">${tp.name}</a></li>
                                         </c_rt:forEach>        
                                            </ol>
                </li>
                   </c_rt:forEach>
                            </ul>
                                    <!-- <ul class="listLeft2 mt10 pb10">
                <h5 class="bb">限时抢购</h5>
                                <li>
                    <div class="time" id="LeftTime_90"><strong class="countdown_row countdown_show3"><strong class="countdown_section"><strong class="countdown_amount">18</strong>小时</strong><strong class="countdown_section"><strong class="countdown_amount">23</strong>分钟</strong><strong class="countdown_section"><strong class="countdown_amount">52</strong>秒</strong></strong></div>
                    <div>
                        <b><img src="./二级分类——叶菜类_files/ln_A_21c.png" width="40" height="43"></b>
                        <div class="cut">
                            <a href="http://www.bestln.com/goods-90-%E6%B2%B9%E8%8F%9C350g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140620164731_53a3f523d446f.jpg" width="160" height="160" alt="油菜 350g/份 绿色蔬菜 乐农优选">
                            </a>
                        </div>
                    </div>
                    <p><a href="http://www.bestln.com/goods-90-%E6%B2%B9%E8%8F%9C350g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html">油菜 350g/份 绿色蔬...</a></p>
                    <p><font color="#888">抢购价：</font><strong>￥1.2<small>/约350g</small></strong></p>  
                </li>
                                <li>
                    <div class="time" id="LeftTime_93"><strong class="countdown_row countdown_show3"><strong class="countdown_section"><strong class="countdown_amount">20</strong>小时</strong><strong class="countdown_section"><strong class="countdown_amount">23</strong>分钟</strong><strong class="countdown_section"><strong class="countdown_amount">52</strong>秒</strong></strong></div>
                    <div>
                        <b><img src="./二级分类——叶菜类_files/ln_A_21c.png" width="40" height="43"></b>
                        <div class="cut">
                            <a href="http://www.bestln.com/goods-93-%E7%94%9F%E8%8F%9C%E5%A4%A7%E5%8F%B6%E7%94%9F%E8%8F%9C450g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140620165920_53a3f7e8409fe.jpg" width="160" height="160" alt="生菜 大叶生菜 450g/份 绿色蔬菜 乐农优选">
                            </a>
                        </div>
                    </div>
                    <p><a href="http://www.bestln.com/goods-93-%E7%94%9F%E8%8F%9C%E5%A4%A7%E5%8F%B6%E7%94%9F%E8%8F%9C450g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html">生菜 大叶生菜 450g/...</a></p>
                    <p><font color="#888">抢购价：</font><strong>￥4.0<small>/约450g</small></strong></p>  
                </li>
                                <li>
                    <div class="time" id="LeftTime_211"><strong class="countdown_row countdown_show3"><strong class="countdown_section"><strong class="countdown_amount">16</strong>小时</strong><strong class="countdown_section"><strong class="countdown_amount">18</strong>分钟</strong><strong class="countdown_section"><strong class="countdown_amount">30</strong>秒</strong></strong></div>
                    <div>
                        <b><img src="./二级分类——叶菜类_files/ln_A_21c.png" width="40" height="43"></b>
                        <div class="cut">
                            <a href="http://www.bestln.com/goods-211-%E9%A6%99%E8%8F%9C130g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140621090340_53a4d9ec32d63.jpg" width="160" height="160" alt="香菜 130g/份 绿色蔬菜 乐农优选">
                            </a>
                        </div>
                    </div>
                    <p><a href="http://www.bestln.com/goods-211-%E9%A6%99%E8%8F%9C130g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html">香菜 130g/份 绿色蔬...</a></p>
                    <p><font color="#888">抢购价：</font><strong>￥0.5<small>/约130g</small></strong></p>  
                </li>
                            </ul> -->
                                    <div class="listLeft2 listLeft4 mt10">
                <h5 class="bb">一周销量排行</h5>
                <ul class="listLeftUl" id="SaleTop">
                                        <li class="sub">
                        <small class="red">1</small>
                        <div class="img fl">
                            <a href="http://www.bestln.com/goods-89-%E7%94%98%E8%93%9D%E7%B4%AB%E7%94%98%E8%93%9D750g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140124093140_52e1c27d83082.jpg" alt="甘蓝 紫甘蓝 750g/份 绿色蔬菜 乐农优选" width="48" height="48">
                            </a>
                        </div>
                        <div class="tit fl">
                            <p><a href="http://www.bestln.com/goods-89-%E7%94%98%E8%93%9D%E7%B4%AB%E7%94%98%E8%93%9D750g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">甘蓝 紫甘蓝 ...</a></p>
                            <p><strong class="red">6.9元/约750g</strong></p>
                        </div>
                    </li>
                                       <li class="sub">
                        <small class="red">2</small>
                        <div class="img fl">
                            <a href="http://www.bestln.com/goods-96-%E8%8C%B4%E9%A6%99%E8%8B%97%E8%8C%B4%E9%A6%99%E8%8F%9C500g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20131217134348_52afe4950f1aa.jpg" alt="茴香苗 茴香菜  500g/份  绿色蔬菜  乐农优选" width="48" height="48">
                            </a>
                        </div>
                        <div class="tit fl">
                            <p><a href="http://www.bestln.com/goods-96-%E8%8C%B4%E9%A6%99%E8%8B%97%E8%8C%B4%E9%A6%99%E8%8F%9C500g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">茴香苗 茴香...</a></p>
                            <p><strong class="red">1.8元/约500g</strong></p>
                        </div>
                    </li>
                                       <li class="sub">
                        <small class="red">3</small>
                        <div class="img fl">
                            <a href="http://www.bestln.com/goods-85-%E6%B2%B9%E9%BA%A6%E8%8F%9C350g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140123144550_52e0ba9f66e0d.jpg" alt="油麦菜 350g/份 绿色蔬菜 乐农优选" width="48" height="48">
                            </a>
                        </div>
                        <div class="tit fl">
                            <p><a href="http://www.bestln.com/goods-85-%E6%B2%B9%E9%BA%A6%E8%8F%9C350g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">油麦菜 350g/...</a></p>
                            <p><strong class="red">2.0元/约350g</strong></p>
                        </div>
                    </li>
                                       <li class="sub">
                        <small class="red">4</small>
                        <div class="img fl">
                            <a href="http://www.bestln.com/goods-211-%E9%A6%99%E8%8F%9C130g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140621090340_53a4d9ec32d63.jpg" alt="香菜 130g/份 绿色蔬菜 乐农优选" width="48" height="48">
                            </a>
                        </div>
                        <div class="tit fl">
                            <p><a href="http://www.bestln.com/goods-211-%E9%A6%99%E8%8F%9C130g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">香菜 130g/份...</a></p>
                            <p><strong class="red">0.5元/约130g</strong></p>
                        </div>
                    </li>
                                       <li class="sub">
                        <small class="red">5</small>
                        <div class="img fl">
                            <a href="http://www.bestln.com/goods-94-%E5%8D%B7%E5%BF%83%E8%8F%9C660g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140331090535_5338bf5fdf181.jpg" alt="卷心菜 660g/份 绿色蔬菜 乐农优选" width="48" height="48">
                            </a>
                        </div>
                        <div class="tit fl">
                            <p><a href="http://www.bestln.com/goods-94-%E5%8D%B7%E5%BF%83%E8%8F%9C660g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">卷心菜 660g/...</a></p>
                            <p><strong class="red">2.3元/约660g</strong></p>
                        </div>
                    </li>
                                       <li class="sub">
                        <small class="red">6</small>
                        <div class="img fl">
                            <a href="http://www.bestln.com/goods-97-%E5%A8%83%E5%A8%83%E8%8F%9C500g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140620165959_53a3f80f4655d.jpg" alt="娃娃菜 500g/份 绿色蔬菜 乐农优选" width="48" height="48">
                            </a>
                        </div>
                        <div class="tit fl">
                            <p><a href="http://www.bestln.com/goods-97-%E5%A8%83%E5%A8%83%E8%8F%9C500g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">娃娃菜 500g/...</a></p>
                            <p><strong class="red">4.4元/约500g</strong></p>
                        </div>
                    </li>
                                       <li class="sub">
                        <small class="red">7</small>
                        <div class="img fl">
                            <a href="http://www.bestln.com/goods-93-%E7%94%9F%E8%8F%9C%E5%A4%A7%E5%8F%B6%E7%94%9F%E8%8F%9C450g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140620165920_53a3f7e8409fe.jpg" alt="生菜 大叶生菜 450g/份 绿色蔬菜 乐农优选" width="48" height="48">
                            </a>
                        </div>
                        <div class="tit fl">
                            <p><a href="http://www.bestln.com/goods-93-%E7%94%9F%E8%8F%9C%E5%A4%A7%E5%8F%B6%E7%94%9F%E8%8F%9C450g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">生菜 大叶生...</a></p>
                            <p><strong class="red">4.0元/约450g</strong></p>
                        </div>
                    </li>
                                       <li class="sub">
                        <small class="red">8</small>
                        <div class="img fl">
                            <a href="http://www.bestln.com/goods-78-%E7%99%BD%E8%8F%9C%E5%B0%8F%E7%99%BD%E8%8F%9C400g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20131118114556_52898d750c68c.jpg" alt="白菜 小白菜 400g/份 绿色蔬菜 乐农优选" width="48" height="48">
                            </a>
                        </div>
                        <div class="tit fl">
                            <p><a href="http://www.bestln.com/goods-78-%E7%99%BD%E8%8F%9C%E5%B0%8F%E7%99%BD%E8%8F%9C400g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">白菜 小白菜 ...</a></p>
                            <p><strong class="red">1.8元/约400g</strong></p>
                        </div>
                    </li>
                                       <li class="sub">
                        <small class="red">9</small>
                        <div class="img fl">
                            <a href="http://www.bestln.com/goods-90-%E6%B2%B9%E8%8F%9C350g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140620164731_53a3f523d446f.jpg" alt="油菜 350g/份 绿色蔬菜 乐农优选" width="48" height="48">
                            </a>
                        </div>
                        <div class="tit fl">
                            <p><a href="http://www.bestln.com/goods-90-%E6%B2%B9%E8%8F%9C350g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">油菜 350g/份...</a></p>
                            <p><strong class="red">1.2元/约350g</strong></p>
                        </div>
                    </li>
                                       <li class="sub">
                        <small class="red">10</small>
                        <div class="img fl">
                            <a href="http://www.bestln.com/goods-82-%E8%8F%A0%E8%8F%9C400g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140620165744_53a3f7888b05b.jpg" alt="菠菜 400g/份 绿色蔬菜 乐农优选" width="48" height="48">
                            </a>
                        </div>
                        <div class="tit fl">
                            <p><a href="http://www.bestln.com/goods-82-%E8%8F%A0%E8%8F%9C400g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">菠菜 400g/份...</a></p>
                            <p><strong class="red">2.8元/约400g</strong></p>
                        </div>
                    </li>
                                   </ul>
            </div>
                    </div>
        <div class="lRight fr">
                        <div class="salesPromotion sequence">
                <!-- <dl>
                    <dt><h5>热卖推荐</h5></dt>
                                        <dd>
                        <div class="fl">
                            <a href="http://www.bestln.com/goods-97-%E5%A8%83%E5%A8%83%E8%8F%9C500g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140620165959_53a3f80f4655d.jpg" width="100" height="100" alt="娃娃菜 500g/份 绿色蔬菜 乐农优选">
                            </a>
                        </div>
                        <div class="fr">
                            <p><a href="http://www.bestln.com/goods-97-%E5%A8%83%E5%A8%83%E8%8F%9C500g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">娃娃菜 500g/份 绿色蔬菜 乐农优选</a></p>
                            <p>特价：<strong>￥4.4/约500g</strong></p>
                            <p class="buy"><a href="javascript:AddToCart(97);">加入购物车</a></p>
                        </div>
                    </dd>
                                        <dd>
                        <div class="fl">
                            <a href="http://www.bestln.com/goods-94-%E5%8D%B7%E5%BF%83%E8%8F%9C660g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">
                                <img src="./二级分类——叶菜类_files/20140331090535_5338bf5fdf181.jpg" width="100" height="100" alt="卷心菜 660g/份 绿色蔬菜 乐农优选">
                            </a>
                        </div>
                        <div class="fr">
                            <p><a href="http://www.bestln.com/goods-94-%E5%8D%B7%E5%BF%83%E8%8F%9C660g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html" target="_blank">卷心菜 660g/份 绿色蔬菜 乐农优选</a></p>
                            <p>特价：<strong>￥2.3/约660g</strong></p>
                            <p class="buy"><a href="javascript:AddToCart(94);">加入购物车</a></p>
                        </div>
                    </dd>
                                    </dl> -->
            </div>
                        <div class="sequence mt10">
                <span class="fl">
                    排序:</span>
                    <ul class="fl">
                        <li><a class="on" href="http://www.bestln.com/cat-6-%E5%8F%B6%E8%8F%9C%E7%B1%BB.html?page=1&OrderBy=sale&OrderStr=ASC">销量↓</a></li>
                        <li><a href="http://www.bestln.com/cat-6-%E5%8F%B6%E8%8F%9C%E7%B1%BB.html?page=1&OrderBy=price&OrderStr=ASC">价格↓</a></li>
                        <li><a href="http://www.bestln.com/cat-6-%E5%8F%B6%E8%8F%9C%E7%B1%BB.html?page=1&OrderBy=comment&OrderStr=ASC">评论数↓</a></li>
                        <li><a href="http://www.bestln.com/cat-6-%E5%8F%B6%E8%8F%9C%E7%B1%BB.html?page=1&OrderBy=time&OrderStr=ASC">上架时间↓</a></li>
                    </ul>
            </div>
            <div id="product">
                        <div class="goods">
	                <ul>
	                	<c_rt:forEach items="${pg.records}" var="record">
	                        <li>
	                        <div>
	                            <a href="" target="_blank">
	                                <img width="211" height="211" src="" alt="">
	                            </a>
	                            <b></b>
	                        </div>
	                        <p align="center"><a href="" target="_blank">${record.productName}</a></p>
	                        <p class="mt20">乐农价：<strong>￥${record.sellPrice}</strong>/份</p>
	                        <p><font><a href="" target="_blank">已有17人评论</a></font></p>
	                        <p><a href="javascript:AddToCart(82,$('#CatBuyNum82').val());" class="buy">加入购物车</a><span class="fl ml15">数量 x <input id="CatBuyNum82" type="text" value="1"></span></p>
	                    </li>
	                    </c_rt:forEach>
	                    </ul>
            </div>
            <div id="pager" class="yahoo2">
            <c_rt:if test="${pg.totalRecord>=20}">
             <div class="PageList">
                       <ul id="yw0" class="yiiPager">
                       <c_rt:if test="${pg.currentPage!=1}">
  						<li class="previous"><a href="javascript:oneTypePage(${id},${(pg.currentPage-2)*pg.maxResult},20)">上一页</a></li>
  						</c_rt:if>
                       <c_rt:if test="${pg.currentPage==1}">
  						<li class="previous"><a href="javascript:oneTypePage(${productTypeOne.id},0,20)">上一页</a></li>
  						</c_rt:if>
  						<c_rt:forEach begin="${pg.pageIndex.startIndex}" end="${pg.pageIndex.endIndex}" var="wp">
  						<c_rt:if test="${pg.currentPage==wp}">
  						<li class="page selected"><a href="javascript:oneTypePage(${productTypeOne.id},${(wp-1)*pg.maxResult},20)">${wp}</a></li>
  						</c_rt:if>
  						<c_rt:if test="${pg.currentPage!=wp}">
  						<li class="page"><a href="javascript:oneTypePage(${productTypeOne.id},${(wp-1)*pg.maxResult},20)">${wp}</a></li>
  						</c_rt:if>
  						</c_rt:forEach>
  						<c_rt:if test="${pg.currentPage!=pg.totalPage}">
  						<li class="next"><a href="javascript:oneTypePage(${productTypeOne.id},${(pg.currentPage)*pg.maxResult},20)">下一页</a></li>
 						</c_rt:if>
  						<c_rt:if test="${pg.currentPage==pg.totalPage}">
  						<li class="next"><a href="javascript:oneTypePage(${productTypeOne.id},${(pg.currentPage-1)*pg.maxResult},20)">下一页</a></li>
 						</c_rt:if>
 						</ul>                
             </div>
             </c_rt:if>
            </div>
            </div>
            <!-- -->
        </div>
    </div>
</div>
<script>
function showLoseTime(arr){
    for (var key in arr){
        $("#LeftTime_"+key).countdown({endtime:arr[key],format: 'his',callback:reload});
    }
}
$(document).ready(function(){
    $(".listLeft1").children("li").click(
      function(index){
          $(this).find("b").toggle(
               function(){$(this).parents("li").children("ol").hide();$(this).parents("li").children("div").removeClass('on');},
               function(){$(this).parents("li").children("ol").show();$(this).parents("li").children("div").addClass('on');}
        )}
    );
    var PromoteGoods = new Array();PromoteGoods[90]=1425031200000;PromoteGoods[93]=1420027200000;PromoteGoods[211]=1424246078000;showLoseTime(PromoteGoods);    $("#SaleTop").children('li').mouseover(function(){
        $("#SaleTop").children('li').addClass('sub');
        $(this).removeClass('sub');
    });
 });    
</script>                <div class="foot mt10 w1210">
    <div class="bottom">
        <ul class="f1 ul01">
            <h2>联系我们</h2>
            <li>服务热线:4006-591-784</li>
            <li>每天08：30-22：00</li>
                                <li>
                        <a href="http://wpa.qq.com/msgrd?v=3&uin=2652127147&site=%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89%E7%94%9F%E9%B2%9C%E8%B6%85%E5%B8%82&menu=yes" target="_blank">
                            <img src="./二级分类——叶菜类_files/ln_A_09b.gif" width="19" height="22">2652127147                        </a>
                    </li>
                                <li>
                        <a href="http://wpa.qq.com/msgrd?v=3&uin=2945478778&site=%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89%E7%94%9F%E9%B2%9C%E8%B6%85%E5%B8%82&menu=yes" target="_blank">
                            <img src="./二级分类——叶菜类_files/ln_A_09b.gif" width="19" height="22">2945478778                        </a>
                    </li>
                        <li><img src="./二级分类——叶菜类_files/ln_A_09d.gif" width="19" height="22">service@bestln.com</li>
        </ul>
        <ul class="fl">
            <h2 style="background-position:0px -36px;">关于我们</h2>
                        
                                <li><a href="http://www.bestln.com/article/view/id/2.html">公司简介</a></li>
                                <li><a href="http://www.bestln.com/article/view/id/6.html">联系我们</a></li>
                                <li><a href="http://www.bestln.com/article/view/id/8.html">企业客户</a></li>
                                <li><a href="http://www.bestln.com/article/view/id/9.html">招聘信息</a></li>
                            
                    </ul>
        <ul class="fl">
            <h2 style="background-position:0px -72px;">新手指南</h2>
                        
                                <li><a href="http://www.bestln.com/article/view/id/7.html">新手购物指南</a></li>
            
                            <li><a href="http://www.bestln.com/article/view/id/10.html">用户注册</a></li>
            
                            <li><a href="http://www.bestln.com/article/view/id/11.html">会员制度</a></li>
            
                            <li><a href="http://www.bestln.com/article/view/id/12.html">购物流程</a></li>
            
                            <li><a href="http://www.bestln.com/article/view/id/13.html">用户注册协议</a></li>
            
                    </ul>
        <ul>
            <h2 style="background-position:0px -108px;">支付方式</h2>
                                            <li><a href="http://www.bestln.com/article/view/id/14.html">银行转账</a></li>
                                <li><a href="http://www.bestln.com/article/view/id/15.html">礼券支付</a></li>
                                <li><a href="http://www.bestln.com/article/view/id/16.html">余额支付</a></li>
                                <li><a href="http://www.bestln.com/article/view/id/17.html">在线支付</a></li>
                            
                    </ul>
        <ul>
            <h2 style="background-position:0px -144px;">配送中心</h2>
                        
                                <li><a href="http://www.bestln.com/article/view/id/18.html">配送时间</a></li>
                                <li><a href="http://www.bestln.com/article/view/id/19.html">配送费用</a></li>
                                <li><a href="http://www.bestln.com/article/view/id/20.html">配送方式及范围</a></li>
                            
                    </ul>
        <ul>
            <h2 style="background-position:0px -180px;">售后服务</h2>
                        
                                <li><a href="http://www.bestln.com/article/view/id/21.html">退换货总则</a></li>
                                <li><a href="http://www.bestln.com/article/view/id/22.html">退换货流程</a></li>
                                <li><a href="http://www.bestln.com/article/view/id/23.html">投诉及建议</a></li>
                            
                    </ul>
        <ul>
            <h2 style="background-position:0px -216px;">生鲜常识</h2>
                        
                            <li><a title="乐农优选教您如何挑选好吃的云南蒙自石榴" href="http://www.bestln.com/article/view/id/285.html">乐农优选教您...</a></li>
                            <li><a title="如何挑选又脆又甜的沾化冬枣-乐农优选" href="http://www.bestln.com/article/view/id/284.html">如何挑选又脆...</a></li>
                            <li><a title="秋季养生家常菜谱—乐农优选" href="http://www.bestln.com/article/view/id/274.html">秋季养生家常...</a></li>
                            <li><a title="六种食物让你越吃越健康-乐农优选" href="http://www.bestln.com/article/view/id/272.html">六种食物让你...</a></li>
                            <li><a title="夏季天气炎热水果冷冻一下反而更好吃-乐农优选" href="http://www.bestln.com/article/view/id/270.html">夏季天气炎热...</a></li>
                            <li><a title="夏季养生就吃营养密度高的果蔬-乐农优选" href="http://www.bestln.com/article/view/id/269.html">夏季养生就吃...</a></li>
                            
                    </ul>
    </div>
    <div class="friend">
        <span><img src="./二级分类——叶菜类_files/ln_A_10.gif" width="62" height="27" alt="乐农优选"></span>
                <p>友情连接：
                        <a href="http://www.hopingshandong.gov.cn/" target="_blank">好品山东</a>
                        <a href="http://www.zgjnhbh.com/" target="_blank">韩博会</a>
                    </p>
    </div>
    <div class="zs">
        <p>ICP备案证书号:鲁ICP备12032965号-2</p>
        <p><a target="_blank" href="http://www.bestln.com/site/gongshi.html"><img src="./二级分类——叶菜类_files/ln_A_11.gif" width="110" height="31"></a></p>
    </div>
</div>
<div style="display:none"><script src="./二级分类——叶菜类_files/stat.php" language="JavaScript"></script><script src="./二级分类——叶菜类_files/core.php" charset="utf-8" type="text/javascript"></script><a href="http://www.cnzz.com/stat/website.php?web_id=5509163" target="_blank" title="站长统计">站长统计</a></div>
<!--选项卡 切换-->
            </div>
        </div>
        <div class="goTop rightHover">
            <div class="GoToTop none" id="goTop">
                <a title="返回顶部" onfocus="this.blur();" href="javascript:;"></a>
            </div>
                        <div id="hoverCart" class="hoverCar">
                <a href="http://www.bestln.com/cart/index.html" title="去结算" onfocus="this.blur();" target="_blank" id="cart_num">0</a>
            </div>
            <div class="hoverTwocode">
                <a href="javascript:;" class="backlink" onclick="" title="二维码"></a>
                <div class="qrcode">
                    <a href="http://www.weibo.com/u/3196981945" target="_blank">
                        <img src="./二级分类——叶菜类_files/qrcode.png" alt="微博" width="87" height="87">
                    </a>
                    <p>新浪官方微博</p>
                </div>
            </div>
            <div class="hoverService">
                <a href="javascript:;" class="qqOnLineBg" title="在线客服"></a>
                <ul class="qqOnLine ul01">
                                        <li>
                            <a href="http://wpa.qq.com/msgrd?v=3&uin=2652127147&site=%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89%E7%94%9F%E9%B2%9C%E8%B6%85%E5%B8%82&menu=yes" target="_blank">
                                <img src="./二级分类——叶菜类_files/ln_A_09b.gif" width="19" height="22">2652127147                            </a>
                        </li>
                                        <li>
                            <a href="http://wpa.qq.com/msgrd?v=3&uin=2945478778&site=%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89%E7%94%9F%E9%B2%9C%E8%B6%85%E5%B8%82&menu=yes" target="_blank">
                                <img src="./二级分类——叶菜类_files/ln_A_09b.gif" width="19" height="22">2945478778                            </a>
                        </li>
                               </ul>
            </div>
        </div>
        <div id="GoodsMsg"></div>
    

<script>
$(function(){
    $(".backlink").click(function(){
      $('.qrcode').toggle();
    });
    $(".qqOnLineBg").click(function(){
      $('.qqOnLine').toggle();
    });
    $.post('/site/getUserInfo.html',{},function(data){
        $("#memberInfo").html(data);
    },'html'); 
});


</script></body></html>