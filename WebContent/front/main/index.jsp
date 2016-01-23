<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0022)http://www.bestln.com/ -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="Resource-Type" content="document">
		<meta name="Distribution" content="global">
			<meta name="Generator" content="bestln.com">
				<meta name="CopyRight"
					content="Copyright (c) 2010 bestln.com. All Rights Reserved.">
					<meta name="rating" content="general">
						<link rel="shortcut icon" type="image/x-icon"
							href="http://www.bestln.com/favicon.ico">
							<meta http-equiv="X-UA-Compatible" content="IE=9">
								<meta name="keywords"
									content="济南生鲜超市,济南果蔬,济南网上买菜,济南食品,济南农产品,乐农优选，济南生鲜超市,济南果蔬，济南网上买菜，济南食品，济南农产品">
									<meta name="description"
										content="SeoDescription，乐农优选是济南专业的生鲜类在线超市，包括各种生鲜，水果，蔬菜，食品，农产品等，为消费者提供网上买菜的机会，省时省力，我们的馋猫论坛更为爱美食的朋友们提供多种美食食谱。">
										<title>乐农优选生鲜超市|济南果蔬|济南网上买菜|济南食品</title> 
										<%@include file="/front/share/lib.jsp" %>
</head>
<body>
<%@ include file="/front/share/common.jsp" %>
        <div class="webConetnt w1210">
				<!--主体内容-->
				<div class="c_one mt10">
					<div class="fl left">
						<!--左侧flash-->
						<div class="flash" id="flashBox">
							<div class="flashCont">
								<ul style="display: none;">
									<li>
										<a href="" target="_blank"> 
										<img title="沾化冬枣" width="768" height="270" alt="沾化冬枣" src="../../image/flashCont/20141015093301_543dcece8b3ad.jpg">
										</a>
									</li>
								</ul>
								<ul class="none" style="display: none;">
									<li>
										<a href="" target="_blank"> 
										<img title="甘孜松茸" width="768" height="270" alt="甘孜松茸" src="../../image/flashCont/20141020094517_5444692e467b8.jpg">
										</a>
									</li>
								</ul>
								<ul class="none" style="display: none;">
									<li><a href=""
										target="_blank"> <img title="云南蒙自石榴" width="768"
											height="270" alt="云南蒙自石榴"
											src="../../image/flashCont/20141015093301_543dcece8b3ad.jpg"></a>
									</li>
								</ul>
								<ul class="none" style="display: none;">
									<li><a href=""
										target="_blank"> <img title="栖霞红富士" width="768"
											height="270" alt="栖霞红富士"
											src="../../image/flashCont/20141020094517_5444692e467b8.jpg"></a>
									</li>
								</ul>
								<ul class="none" style="display: none;">
									<li><a href="http://www.bestln.com/topic/view/id/76.html"
										target="_blank"> <img title="莱州梭子蟹" width="768"
											height="270" alt="莱州梭子蟹"
											src="../../image/flashCont/20141015093301_543dcece8b3ad.jpg"></a>
									</li>
								</ul>
								<ul class="none" style="display: block;">
									<li><a href=""
										target="_blank"> <img title="德冠啤酒" width="768"
											height="270" alt="德冠啤酒"
											src="../../image/flashCont/20141020094517_5444692e467b8.jpg"></a>
									</li>
								</ul>
							</div>
							<ol class="flashMenu">
								<li class=""><a
									href=""
									target="_blank">沾化冬枣</a></li>
								<li class=""><a
									href="http://www.bestln.com/topic/view/id/85.html"
									target="_blank">甘孜松茸</a></li>
								<li class=""><a
									href="http://www.bestln.com/topic/view/id/88.html"
									target="_blank">云南蒙自石榴</a></li>
								<li class=""><a
									href="http://www.bestln.com/topic/view/id/86.html"
									target="_blank">栖霞红富士</a></li>
								<li class=""><a
									href="http://www.bestln.com/topic/view/id/76.html"
									target="_blank">莱州梭子蟹</a></li>
								<li class="on"><a
									href="http://www.bestln.com/topic/view/id/82.html"
									target="_blank">德冠啤酒</a></li>
							</ol>
						</div>
						<div class="b_list">
							<div class="pic">
								<ul>
								<c_rt:forEach items="${hotProds}" var="hotProduct">
								
									<li><a target="_blank"
										href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${hotProduct.id}"><img
											width="191" height="180"
											src="${hotProduct.coverUrl}"
											alt="">${hotProduct.productName}</a></li>
								</c_rt:forEach>
								</ul>
							</div>
						</div>
					</div>
					<div class="right">
						<!--右侧乐农快讯-->
						<div>
							<img class="fl"
								src="../../image/images/webCall.png" width="210"
								height="77">
						</div>
						<h5>
							乐农快讯<a
								href="http://www.bestln.com/article/index/CatId/2/CatName/%E4%B9%90%E5%86%9C%E5%BF%AB%E8%AE%AF.html"
								target="_blank">更多&gt;&gt;</a>
						</h5>
						<span></span>
						<div class="news">
							<ul>
								<li><a
									href="http://www.bestln.com/article/view/id/282.html"
									title="2014年9月21日质量检测周报">2014年9月21日质量检测周报</a></li>
								<li><a
									href="http://www.bestln.com/article/view/id/281.html"
									title="2014年9月15日质量检测周报">2014年9月15日质量检测周报</a></li>
								<li><a
									href="http://www.bestln.com/article/view/id/280.html"
									title="乐农优选携手润华购车送大礼">乐农优选携手润华购车送大礼</a></li>
								<li><a
									href="http://www.bestln.com/article/view/id/279.html"
									title="2014年9月1日质量检测周报">2014年9月1日质量检测周报</a></li>
								<li><a
									href="http://www.bestln.com/article/view/id/278.html"
									title="中秋家宴，“果”然“油”你">中秋家宴，“果”然“油”你</a></li>
								<li><a
									href="http://www.bestln.com/article/view/id/277.html"
									title="2014年8月17日质量检测周报">2014年8月17日质量检测周报</a></li>
								<li><a
									href="http://www.bestln.com/article/view/id/276.html"
									title="民生银行便民自提点上线啦！">民生银行便民自提点上线啦！</a></li>
							</ul>
						</div>
						<div class="explain">

							<div>
								<img width="210" height="153"
									src="../../image/images/weixin.png"
									alt="">
							</div>
						</div>
					</div>
				</div>
				<!--选项卡-->
				<div class="two mt10">
					<!-- z-index:949~940-->
					<div class="fl hd_left" id="Xtabx">
						<!--选项卡-->
						<ol class="tabMenu">
							<li class="on">疯狂抢购</li>
							<li>猜您喜欢</li>
							<li>热卖商品</li>
							<li>热评商品</li>
							<li>新品上架</li>
						</ol>
						<!--选项卡 内容-->
						<div class="tabCont">
							<ul class="">
								<!--选项卡 疯狂抢购-->
								<c_rt:forEach items="${rushProducts}" var="rushProduct" begin="0" end="4" varStatus="cs">
								<li class="CBox${vs.index}">
									<div>
									
										<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${rushProduct.id}" target="_blank"> 
										<img src="${rushProduct.coverUrl}"
											width="176" height="176" alt="${rushProduct.productName}"></a> <i><img
											src="../../image/product/fengqiang.png"
											alt="疯狂"></i>
									</div>
									<p class="lnTitle">
										<a
											href=""
											target="_blank">${rushProduct.productName}</a>
									</p>
									<p class="lnPrice">
										乐农特价：<strong><font>￥</font>8.2<small>/约1000g</small></strong>
									</p>
									<p class="addToCar">
										<span class="fl">评论（${rushProduct.commentCount}）</span><a
											href="javascript:AddToCart(${rushProduct.id},1,${rushProduct.styleId});">加入购物车</a>
									</p>
								</li>
								</c_rt:forEach>
							</ul>
							<ul class="none">
								<!--选项卡 猜你喜欢-->
								<c_rt:forEach items="${likeProducts}" var="likeProduct" begin="0" end="4" varStatus="cs">
								<li class="CBox${vs.index}">
									<div>
										<a
											href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${likeProduct.id}"
											target="_blank"> <img
											src="${likeProduct.coverUrl}"
											width="176" height="176" alt="${likeProduct.productName}"></a> <i></i>
									</div>
									<p class="lnTitle">
										<a
											href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${likeProduct.id}"
											target="_blank">${likeProduct.productName}</a>
									</p>
									<p class="lnPrice">
										乐农特价：<strong><font>￥</font>22.5<small>/约500g</small></strong>
									</p>
									<p class="addToCar">
										<span class="fl">评论（${likeProduct.commentCount}）</span><a
											href="javascript:AddToCart(${likeProduct.id},1,${likeProduct.styleId});">加入购物车</a>
									</p>
								</li>
								</c_rt:forEach>
							</ul>
							<ul class="none">
								<!--选项卡 热卖商品-->
								<c_rt:forEach items="${hotProducts}" var="hotProduct" begin="0" end="4" varStatus="vs">
								<li class="CBox${vs.index}">
									<div>
										<a
											href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${hotProduct.id}"
											target="_blank"> <img
											src="${hotProduct.coverUrl}"
											width="176" height="176" alt="${hotProduct.productName}"></a> <i><img
											src="../../image/product/hotsell.png"
											alt="热卖"></i>
									</div>
									<p class="lnTitle">
										<a
											href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${hotProduct.id}"
											target="_blank">${hotProduct.productName}</a>
									</p>
									<p class="lnPrice">
										乐农特价：<strong><font>￥</font>18.0<small>/约500g</small></strong>
									</p>
									<p class="addToCar">
										<span class="fl">评论（${hotProduct.commentCount}）</span><a
											href="javascript:AddToCart(${hotProduct.id},1,${hotProduct.styleId});">加入购物车</a>
									</p>
								</li>
								</c_rt:forEach>
							</ul>
							<ul class="none">
								<!--选项卡 热评商品-->
								<c_rt:forEach items="${buzzProducts}" var="buzzProduct" begin="0" end="4" varStatus="vs">
								<li class="CBox${vs.index}">
									<div>
										<a
											href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${buzzProduct.id}"
											target="_blank"> <img
											src="${buzzProduct.coverUrl}"
											width="176" height="176" alt="${buzzProduct.productName}"></a>
										<i><img
											src="../../image/product/chaozan.png"
											alt="热评"></i>
									</div>
									<p class="lnTitle">
										<a
											href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${buzzProduct.id}"
											target="_blank">${buzzProduct.productName}</a>
									</p>
									<p class="lnPrice">
										乐农特价：<strong><font>￥</font>8.4<small>/约500g</small></strong>
									</p>
									<p class="addToCar">
										<span class="fl">评论（${buzzProduct.commentCount}）</span><a
											href="javascript:AddToCart(${buzzProduct.id},1,${buzzProduct.styleId});">加入购物车</a>
									</p>
								</li>
								</c_rt:forEach>
							</ul>
							<ul class="none">
								<!--选项卡 新品上架-->
								<c_rt:forEach items="${newProducts}" var="newProduct" begin="0" end="4" varStatus="vs">
								<li class="CBox${vs.index}">
									<div>
										<a
											href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${newProduct.id}"
											target="_blank"> <img
											src="${newProduct.coverUrl}"
											width="176" height="176" alt="${newProduct.productName}"></a>
										<i><img
											src="../../image/product/new.png"
											alt="新品"></i>
									</div>
									<p class="lnTitle">
										<a
											href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${newProduct.id}"
											target="_blank">${newProduct.productName}</a>
									</p>
									<p class="lnPrice">
										乐农特价：<strong><font>￥</font>${newProduct.sellPrice}<small>/件</small></strong>
									</p>
									<p class="addToCar">
										<span class="fl">评论（${newProduct.commentCount}）</span><a
											href="javascript:AddToCart(${newProduct.id},1,${newProduct.styleId});">加入购物车</a>
									</p>
								</li>
								</c_rt:forEach>
								
							</ul>

						</div>

					</div>
					<div class="hd_right fr">
						<h5>乐农热卖</h5>
						<h6>
							<a
								href="http://bestln.com/goods-61-%E8%8B%B9%E6%9E%9C%E5%B1%B1%E4%B8%9C%E7%83%9F%E5%8F%B0%E7%BA%A2%E5%AF%8C%E5%A3%AB%E8%8B%B9%E6%9E%9C500g%E4%BB%BD%E6%96%B0%E9%B2%9C%E6%B0%B4%E6%9E%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html.html"
								target="_blank"> <img
								src="./乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/20140729144301_53d7427636da1.jpg"
								width="208" height="196" alt="乐农热卖商品"></a>
						</h6>
						<p>
							<a
								href="http://bestln.com/goods-61-%E8%8B%B9%E6%9E%9C%E5%B1%B1%E4%B8%9C%E7%83%9F%E5%8F%B0%E7%BA%A2%E5%AF%8C%E5%A3%AB%E8%8B%B9%E6%9E%9C500g%E4%BB%BD%E6%96%B0%E9%B2%9C%E6%B0%B4%E6%9E%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html.html"
								target="_blank">减肥瘦身-红富士</a>
						</p>
					</div>
				</div>
				<div class="middleBar mt10 mb10"></div>
				 
				<div class="floor f1 mt10">
					<!--1楼周菜香 z-index 740~~749-->
					<div class="topper">
						<p align="right">
						<c_rt:forEach items="${productTwoType}" var="productTwoType" varStatus="vs">
						
						<a href="${pageContext.request.contextPath }/front/product/getProductAndTwoType.htm?id=${productTwoType.id}" target="_blank">${productTwoType.name}</a><c_rt:if test="${vs.count-vs.index!=1}">丨</c_rt:if>
						</c_rt:forEach>
						</p>
						<p></p>
					</div>
					<div class="f_left fl">
						<ul class="fleft">
						<c_rt:forEach items="${oneProducts}" var="oneProduct" begin="0" end="4" varStatus="vs">
						
					<li <c_rt:if test="${vs.index==0}">class="checked"</c_rt:if>
						<c_rt:if test="${vs.index!=0}">class="sub"</c_rt:if>>
								<div class="co">
									<b>${vs.index}</b>
									<div class="fl">
										<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${oneProduct.id}" target="_blank"> <img src="${oneProduct.coverUrl}" alt="" width="107" height="107"></a>
									</div>
									<div class="fr">
										<p>${oneProduct.productName}</p>
										<p>
											<strong><font>￥</font>163.0</strong><small>/份</small>
										</p>
									</div>
								</div>
							</li>
						</c_rt:forEach>
							
						</ul>
						<div class="bPic mt10">
							<img src="../../image/product/floor/Floor1.jpg" width="236" height="244" alt="">
						</div>
					</div>
					<div class="f_right fr">
						<ul>
						<c_rt:forEach items="${oneProducts}" var="oneProduct" begin="5" end="14" varStatus="vs">
							<li class="list${vs.index-4}">
								<div>
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${oneProduct.id}" target="_blank"> <img src="${oneProduct.coverUrl}" alt="" width="170" height="170"></a>
								</div>
								<p>
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${oneProduct.id}"
										target="_blank">${oneProduct.productName}</a>
								</p>
								<div>
									<strong>￥${oneProduct.sellPrice}<small>/份</small></strong>
								</div>
								<div>
									<font>评论：（${oneProduct.commentCount}）</font>
								</div>
								<div>
									<span><a
										href="javascript:AddToCart(${oneProduct.id},1,${oneProduct.styleId});"
										target="_blank">加入购物车</a></span>
								</div>
							</li>
							</c_rt:forEach>
							
						</ul>
					</div>
				</div>
				<!--一楼结束-->
				<div class="floor f2 mt10">
					<!--2楼绿色蔬菜 z-index 740~~749-->
					<div class="topper">
						<p align="right">
							<a
								href="http://www.bestln.com/cat-6-%E5%8F%B6%E8%8F%9C%E7%B1%BB.html">叶菜类</a>
							丨 <a
								href="http://www.bestln.com/cat-7-%E6%A0%B9%E8%8C%8E%E7%B1%BB.html">根茎类</a>
							丨 <a
								href="http://www.bestln.com/cat-8-%E6%9E%9C%E5%AE%9E%E7%B1%BB.html">果实类</a>
							丨 <a href="http://www.bestln.com/cat-9-%E8%8F%8C%E7%B1%BB.html">菌类</a>
							丨 <a
								href="http://www.bestln.com/cat-4-%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C.html">更多商品&gt;&gt;</a>
						</p>
					</div>
					<div class="f_left fl">
						<ul class="fleft">
						<c_rt:forEach items="${twoProducts}" var="twoProduct" begin="0" end="4" varStatus="vs">
						
					<li <c_rt:if test="${vs.index==0}">class="checked"</c_rt:if>
						<c_rt:if test="${vs.index!=0}">class="sub"</c_rt:if>>
								<div class="co">
									<b>${vs.index}</b>
									<div class="fl">
										<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${twoProduct.id}" target="_blank"> <img src="${twoProduct.coverUrl}" alt="" width="107" height="107"></a>
									</div>
									<div class="fr">
										<p>${twoProduct.productName}</p>
										<p>
											<strong><font>￥</font>163.0</strong><small>/份</small>
										</p>
									</div>
								</div>
							</li>
						</c_rt:forEach>
							
						</ul>
						<div class="bPic mt10">
							<img src="../../image/product/floor/Floor2.jpg" width="236" height="244" alt="">
						</div>
					</div>
					<div class="f_right fr">
						<ul>
						<c_rt:forEach items="${twoProducts}" var="twoProduct" begin="5" end="14" varStatus="vs">
							<li class="list${vs.index-4}">
								<div>
								
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${twoProduct.id}" target="_blank"> <img src="${twoProduct.coverUrl}" alt="" width="170" height="170"></a>
								</div>
								<p>
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${twoProduct.id}"
										target="_blank">${twoProduct.productName}</a>
								</p>
								<div>
									<strong>￥163.0<small>/份</small></strong>
								</div>
								<div>
									<font>评论：（0）</font>
								</div>
								<div>
									<span><a
										href="javascript:AddToCart(${oneProduct.id},1,${oneProduct.styleId});"
										target="_blank">加入购物车</a></span>
								</div>
							</li>
							</c_rt:forEach>
							
						</ul>
					</div>
				</div>
				<!--二楼结束-->
				<div class="floor f3 mt10">
					<!--2楼绿色蔬菜 z-index 740~~749-->
					<div class="topper">
						<p align="right">
							<a
								href="http://www.bestln.com/cat-2-%E8%BF%9B%E5%8F%A3%E6%B0%B4%E6%9E%9C.html">进口水果</a>
							丨 <a
								href="http://www.bestln.com/cat-3-%E5%9B%BD%E4%BA%A7%E6%B0%B4%E6%9E%9C.html">国产水果</a>
							丨 <a
								href="http://www.bestln.com/cat-388-%E5%8E%9F%E4%BA%A7%E5%9C%B0%E7%9B%B4%E9%87%87.html">原产地直采</a>
							丨 <a
								href="http://www.bestln.com/cat-1-%E6%96%B0%E9%B2%9C%E6%B0%B4%E6%9E%9C.html">更多商品&gt;&gt;</a>
						</p>
					</div>
					<div class="f_left fl">
						<ul class="fleft">
						<c_rt:forEach items="${threeProducts}" var="threeProduct" begin="0" end="4" varStatus="vs">
						
					<li <c_rt:if test="${vs.index==0}">class="checked"</c_rt:if>
						<c_rt:if test="${vs.index!=0}">class="sub"</c_rt:if>>
								<div class="co">
									<b>${vs.index}</b>
									<div class="fl">
										<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${threeProduct.id}" target="_blank"> <img src="${threeProduct.coverUrl}" alt="" width="107" height="107"></a>
									</div>
									<div class="fr">
										<p>${threeProduct.productName}</p>
										<p>
											<strong><font>￥</font>163.0</strong><small>/份</small>
										</p>
									</div>
								</div>
							</li>
						</c_rt:forEach>
							
						</ul>
						<div class="bPic mt10">
							<img src="../../image/product/floor/Floor3.jpg" width="236" height="244" alt="">
						</div>
					</div>
					<div class="f_right fr">
						<ul>
						<c_rt:forEach items="${threeProducts}" var="threeProduct" begin="5" end="14" varStatus="vs">
							<li class="list${vs.index-4}">
								<div>
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${threeProduct.id}" target="_blank"> <img src="${threeProduct.coverUrl}" alt="" width="170" height="170"></a>
								</div>
								<p>
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${threeProduct.id}"
										target="_blank">${threeProduct.productName}</a>
								</p>
								<div>
									<strong>￥163.0<small>/份</small></strong>
								</div>
								<div>
									<font>评论：（0）</font>
								</div>
								<div>
									<span><a
										href="http://www.bestln.com/foodcase/view/id/1.html"
										target="_blank">加入购物车</a></span>
								</div>
							</li>
							</c_rt:forEach>
							
						</ul>
					</div>
				</div>
				<!--三楼结束-->
				<div class="floor f4 mt10">
					<!--2楼绿色蔬菜 z-index 740~~749-->
					<div class="topper">
						<p align="right">
							<a
								href="http://www.bestln.com/cat-34-%E9%87%91%E9%94%A3%E6%94%BE%E5%BF%83%E8%82%89.html">金锣放心肉</a>
							丨 <a
								href="http://www.bestln.com/cat-221-%E9%9B%A8%E6%B6%A6%E6%94%BE%E5%BF%83%E9%B8%A1%E8%82%89.html">雨润放心鸡肉</a>
							丨 <a
								href="http://www.bestln.com/cat-11-%E6%94%BE%E5%BF%83%E8%82%89%E7%B1%BB.html">更多商品&gt;&gt;</a>
						</p>
					</div>
					<div class="f_left fl">
						<ul class="fleft">
						<c_rt:forEach items="${fourProducts}" var="fourProduct" begin="0" end="4" varStatus="vs">
						
					<li <c_rt:if test="${vs.index==0}">class="checked"</c_rt:if>
						<c_rt:if test="${vs.index!=0}">class="sub"</c_rt:if>>
								<div class="co">
									<b>${vs.index}</b>
									<div class="fl">
										<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${fourProduct.id}" target="_blank"> <img src="${fourProduct.coverUrl}" alt="" width="107" height="107"></a>
									</div>
									<div class="fr">
										<p>${fourProduct.productName}</p>
										<p>
											<strong><font>￥</font>${fourProduct.sellPrice}</strong><small>/份</small>
										</p>
									</div>
								</div>
							</li>
						</c_rt:forEach>
							
						</ul>
						<div class="bPic mt10">
							<img src="../../image/product/floor/Floor4.jpg" width="236" height="244" alt="">
						</div>
					</div>
					<div class="f_right fr">
						<ul>
						<c_rt:forEach items="${fourProducts}" var="fourProduct" begin="5" end="14" varStatus="vs">
							<li class="list${vs.index-4}">
								<div>
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${fourProduct.id}" target="_blank"> <img src="../../${fourProduct.coverUrl}" alt="" width="170" height="170"></a>
								</div>
								<p>
									<a href="http://www.bestln.com/foodcase/view/id/1.html"
										target="_blank">${fourProduct.productName}</a>
								</p>
								<div>
									<strong>￥163.0<small>/份</small></strong>
								</div>
								<div>
									<font>评论：（0）</font>
								</div>
								<div>
									<span><a
										href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${fourProduct.id}"
										target="_blank">加入购物车</a></span>
								</div>
							</li>
							</c_rt:forEach>
							
						</ul>
					</div>
				</div>
				<!--四楼结束-->
				<div class="floor f5 mt10">
					<!--五楼开始-->
					<div class="topper">
						<p align="right">
							<a href="http://www.bestln.com/cat-318-%E5%86%BB%E9%B2%9C.html">冻鲜</a>
							丨 <a href="http://www.bestln.com/cat-354-%E6%B4%BB%E9%B2%9C.html">活鲜</a>
							丨 <a
								href="http://www.bestln.com/cat-307-%E6%B0%B4%E4%BA%A7%E6%B5%B7%E9%B2%9C.html">更多商品&gt;&gt;</a>
						</p>
					</div>
					<div class="f_left fl">
						<ul class="fleft">
						<c_rt:forEach items="${fiveProducts}" var="fiveProduct" begin="0" end="4" varStatus="vs">
						
					<li <c_rt:if test="${vs.index==0}">class="checked"</c_rt:if>
						<c_rt:if test="${vs.index!=0}">class="sub"</c_rt:if>>
								<div class="co">
									<b>${vs.index}</b>
									<div class="fl">
										<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${fiveProduct.id}" target="_blank"> <img src="${fiveProduct.coverUrl}" alt="" width="107" height="107"></a>
									</div>
									<div class="fr">
										<p>${fiveProduct.productName}</p>
										<p>
											<strong><font>￥</font>163.0</strong><small>/份</small>
										</p>
									</div>
								</div>
							</li>
						</c_rt:forEach>
							
						</ul>
						<div class="bPic mt10">
							<img src="../../image/product/floor/Floor5.jpg" width="236" height="244" alt="">
						</div>
					</div>
					<div class="f_right fr">
						<ul>
						<c_rt:forEach items="${fiveProducts}" var="fiveProduct" begin="5" end="14" varStatus="vs">
							<li class="list${vs.index-4}">
								<div>
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${fiveProduct.id}" target="_blank"> <img src="${fiveProduct.coverUrl}" alt="" width="170" height="170"></a>
								</div>
								<p>
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${fiveProduct.id}"
										target="_blank">${fiveProduct.productName}</a>
								</p>
								<div>
									<strong>￥163.0<small>/份</small></strong>
								</div>
								<div>
									<font>评论：（0）</font>
								</div>
								<div>
									<span><a
										href="http://www.bestln.com/foodcase/view/id/1.html"
										target="_blank">加入购物车</a></span>
								</div>
							</li>
							</c_rt:forEach>
							
						</ul>
					</div>
				</div>
				<!--五楼结束-->
				<div class="floor f6 mt10">
					<!--六楼开始-->
					<div class="topper">
						<p align="right">
							<a href="http://www.bestln.com/cat-374-%E7%B2%AE%E6%B2%B9.html">粮油</a>
							丨 <a href="http://www.bestln.com/cat-384-%E7%B1%B3%E9%9D%A2.html">米面</a>
							丨 <a href="http://www.bestln.com/cat-386-%E8%B0%83%E6%96%99.html">调料</a>
							丨 <a
								href="http://www.bestln.com/cat-10-%E7%B2%AE%E6%B2%B9%E5%89%AF%E9%A3%9F.html">更多商品&gt;&gt;</a>
						</p>
					</div>
					<div class="f_left fl">
						<ul class="fleft">
						<c_rt:forEach items="${sixProducts}" var="sixProduct" begin="0" end="4" varStatus="vs">
						
					<li <c_rt:if test="${vs.index==0}">class="checked"</c_rt:if>
						<c_rt:if test="${vs.index!=0}">class="sub"</c_rt:if>>
								<div class="co">
									<b>${vs.index}</b>
									<div class="fl">
										<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${sixProduct.id}" target="_blank"> <img src="${sixProduct.coverUrl}" alt="" width="107" height="107"></a>
									</div>
									<div class="fr">
										<p>${sixProduct.productName}</p>
										<p>
											<strong><font>￥</font>163.0</strong><small>/份</small>
										</p>
									</div>
								</div>
							</li>
						</c_rt:forEach>
							
						</ul>
						<div class="bPic mt10">
							<img src="../../image/product/floor/Floor6.jpg" width="236" height="244" alt="">
						</div>
					</div>
					<div class="f_right fr">
						<ul>
						<c_rt:forEach items="${sixProducts}" var="sixProduct" begin="5" end="14" varStatus="vs">
							<li class="list${vs.index-4}">
								<div>
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${sixProduct.id}" target="_blank"> <img src="${sixProduct.coverUrl}" alt="" width="170" height="170"></a>
								</div>
								<p>
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${sixProduct.id}"
										target="_blank">${sixProduct.productName}</a>
								</p>
								<div>
									<strong>￥163.0<small>/份</small></strong>
								</div>
								<div>
									<font>评论：（0）</font>
								</div>
								<div>
									<span><a
										href="http://www.bestln.com/foodcase/view/id/1.html"
										target="_blank">加入购物车</a></span>
								</div>
							</li>
							</c_rt:forEach>
							
						</ul>
					</div>
					
				</div>
				<!--六楼结束-->
				<div class="floor f7 mt10">
					<!--七楼开始-->
					<div class="topper">
						<p align="right">
							<a
								href="http://www.bestln.com/cat-319-%E6%B4%9B%E5%8C%97%E6%98%A5%E9%85%92%E6%B0%B4.html">洛北春酒水</a>
							丨 <a
								href="http://www.bestln.com/cat-328-%E5%B1%B1%E5%9B%BD%E9%A5%AE%E8%89%BA%E8%8C%B6%E5%8F%B6%E7%A4%BC%E7%9B%92.html">山国饮艺茶叶礼盒</a>
							丨 <a
								href="http://www.bestln.com/cat-371-%E5%BE%B7%E5%86%A0%E5%95%A4%E9%85%92.html">德冠啤酒</a>
							丨 <a
								href="http://www.bestln.com/cat-174-%E9%85%92%E6%B0%B4%E8%8C%B6%E9%A5%AE.html">更多商品&gt;&gt;</a>
						</p>
					</div>
					<div class="f_left fl">
						<ul class="fleft">
						<c_rt:forEach items="${sevenProducts}" var="sevenProduct" begin="0" end="4" varStatus="vs">
						
					<li <c_rt:if test="${vs.index==0}">class="checked"</c_rt:if>
						<c_rt:if test="${vs.index!=0}">class="sub"</c_rt:if>>
								<div class="co">
									<b>${vs.index}</b>
									<div class="fl">
										<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${sevenProduct.id}" target="_blank"> <img src="${sevenProduct.coverUrl}" alt="" width="107" height="107"></a>
									</div>
									<div class="fr">
										<p>${sevenProduct.productName}</p>
										<p>
											<strong><font>￥</font>163.0</strong><small>/份</small>
										</p>
									</div>
								</div>
							</li>
						</c_rt:forEach>
							
						</ul>
						<div class="bPic mt10">
							<img src="../../image/product/floor/Floor7.jpg" width="236" height="244" alt="">
						</div>
					</div>
					<div class="f_right fr">
						<ul>
						<c_rt:forEach items="${sevenProducts}" var="sevenProduct" begin="5" end="14" varStatus="vs">
							<li class="list${vs.index-4}">
								<div>
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${sevenProduct.id}" target="_blank"> <img src="${sevenProduct.coverUrl}" alt="" width="170" height="170"></a>
								</div>
								<p>
									<a href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${sevenProduct.id}"
										target="_blank">${sevenProduct.productName}</a>
								</p>
								<div>
									<strong>￥163.0<small>/份</small></strong>
								</div>
								<div>
									<font>评论：（0）</font>
								</div>
								<div>
									<span><a
										href="http://www.bestln.com/foodcase/view/id/1.html"
										target="_blank">加入购物车</a></span>
								</div>
							</li>
							</c_rt:forEach>
							
						</ul>
					</div>
					
				</div>
				<!--七楼结束-->
				<div class="mt10 four w1210">
					<div class="fl w350">
						<h6>美味食谱</h6>
						<div class="foodBook div">
							<div>
								<div class="pic">
									<div class="cc" id="BookTabs">
										<div class="tabcon">
											<div class="ms" style="display: none;">
												<!-- 选项卡项 -->
												<strong><a
													href="http://www.bestln.com/foodbook-1096-%E9%9B%AA%E8%8E%B2%E5%AD%90%E7%BA%A2%E6%A2%A8%E7%B3%96%E6%B0%B4.html"
													target="_blank">雪莲子红梨糖水</a></strong> <a
													href="http://www.bestln.com/foodbook-1096-%E9%9B%AA%E8%8E%B2%E5%AD%90%E7%BA%A2%E6%A2%A8%E7%B3%96%E6%B0%B4.html"
													target="_blank"><img
													src="./乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/20141010094838_54373af6f16c4.jpg"
													width="328" height="150"></a>
												<p>
													主料：雪莲子,红梨,冰糖<br>调料：
												</p>
											</div>
											<div class="ms" style="display: none;">
												<!-- 选项卡项 -->
												<strong><a
													href="http://www.bestln.com/foodbook-1095-%E9%BB%91%E5%95%A4%E7%89%9B%E8%82%89%E5%B9%B2.html"
													target="_blank">黑啤牛肉干</a></strong> <a
													href="http://www.bestln.com/foodbook-1095-%E9%BB%91%E5%95%A4%E7%89%9B%E8%82%89%E5%B9%B2.html"
													target="_blank"><img
													src="./乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/20141010091436_543732fcc93db.jpg"
													width="328" height="150"></a>
												<p>
													主料：牛后臀肉,黑啤酒<br>调料：料酒,老抽,生抽,白糖,葱段,姜片,大料,...
												</p>
											</div>
											<div class="ms" style="display: block;">
												<!-- 选项卡项 -->
												<strong><a
													href="http://www.bestln.com/foodbook-1094-%E6%B2%B9%E7%85%8E%E8%98%91%E8%8F%87.html"
													target="_blank">油煎蘑菇</a></strong> <a
													href="http://www.bestln.com/foodbook-1094-%E6%B2%B9%E7%85%8E%E8%98%91%E8%8F%87.html"
													target="_blank"><img
													src="./乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/20141009094300_5435e82514833.jpg"
													width="328" height="150"></a>
												<p>
													主料：白蘑菇<br>调料：现磨黑椒碎,香菜,料酒,盐,油
												</p>
											</div>
										</div>
										<ul class="XtabMenu">
											<!-- 选项卡 -->
											<li class="">1</li>
											<li class="">2</li>
											<li class="on">3</li>
										</ul>
									</div>
								</div>
								<script>
                            jQuery('#BookTabs').Xtabs({hdcn: 'XtabMenu', hdtagcur: 'on', bdcn: 'tabcon', auto: 3000});
                        </script>
							</div>
						</div>
					</div>
					<div class="fl w680 ml10">
						<h6>热评商品</h6>
						<div class="blog">
						<c_rt:forEach items="${productComments}" var="productComment" begin="0" end="3" varStatus="vs">
							<dl>
								<dt class="fl">
									<a target="_blank"
										href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${buzzProduct.id}">
										<img src="${productComment.product.coverUrl}"
										width="98" height="98" alt="${productComment.product.productName}">
									</a>
								</dt>
								<dd class="right fl">
									<p>
										<strong>${productComment.comment.user.nickName}</strong>
									</p>
									<p class="h50">${productComment.comment.content}</p>
									<p>
										<small>${productComment.comment.createDate}</small>
									</p>
									<div class="star">
										<b class="up" style="width: 100%;"></b> <b class="down"></b>
									</div>
								</dd>
							</dl>
							</c_rt:forEach>
						</div>
					</div>
					<div class="fl w160 ml10 right">
						<h6>关注乐农</h6>
						<div class="wei
						xin">
							<span><img
								src="./乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/qrcode.png" alt="微博"
								width="158" height="158"></span>
							<p>
								乐农优选官方微博地址：<a href="http://www.weibo.com/u/3196981945"
									target="_blank">http://www.weibo.com/u/3196981945</a>
							</p>
						</div>
					</div>
				</div>


			</div>
			<script type="text/javascript">
    $(function() {
        $("#LeftMenuBox").show();
        $("#LeftMenu").mouseout(function(){
            $("#LeftMenuBox").show();
        });
    });
        var IndexPromoteGoods = new Array();
                IndexPromoteGoods[63] =1423130400000;
                IndexPromoteGoods[89] =1417687757000;
                IndexPromoteGoods[99] =1421150400000;
                IndexPromoteGoods[208] =1423389600000;
                IndexPromoteGoods[210] =1423994400000;
            showLoseTime(IndexPromoteGoods);
    </script>
			<div class="foot mt10 w1210">
				<div class="bottom">
					<ul class="f1 ul01">
						<h2>联系我们</h2>
						<li>服务热线:4006-591-784</li>
						<li>每天08：30-22：00</li>
						<li><a
							href="http://wpa.qq.com/msgrd?v=3&uin=2652127147&site=%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89%E7%94%9F%E9%B2%9C%E8%B6%85%E5%B8%82&menu=yes"
							target="_blank"> <img
								src="../image/images/ln_A_09b.gif" width="19"
								height="22">2652127147 </a></li>
						<li><a
							href="http://wpa.qq.com/msgrd?v=3&uin=2945478778&site=%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89%E7%94%9F%E9%B2%9C%E8%B6%85%E5%B8%82&menu=yes"
							target="_blank"> <img
								src="../image/images/ln_A_09b.gif" width="19"
								height="22">2945478778 </a></li>
						<li><img src="../image/images/ln_A_09b.gif"
							width="19" height="22">service@bestln.com</li>
					</ul>
					<ul class="fl">
						<h2 style="background-position: 0px -36px;">关于我们</h2>

						<li><a href="http://www.bestln.com/article/view/id/2.html">公司简介</a></li>
						<li><a href="http://www.bestln.com/article/view/id/6.html">联系我们</a></li>
						<li><a href="http://www.bestln.com/article/view/id/8.html">企业客户</a></li>
						<li><a href="http://www.bestln.com/article/view/id/9.html">招聘信息</a></li>

					</ul>
					<ul class="fl">
						<h2 style="background-position: 0px -72px;">新手指南</h2>

						<li><a href="http://www.bestln.com/article/view/id/7.html">新手购物指南</a></li>

						<li><a href="http://www.bestln.com/article/view/id/10.html">用户注册</a></li>

						<li><a href="http://www.bestln.com/article/view/id/11.html">会员制度</a></li>

						<li><a href="http://www.bestln.com/article/view/id/12.html">购物流程</a></li>

						<li><a href="http://www.bestln.com/article/view/id/13.html">用户注册协议</a></li>

					</ul>
					<ul>
						<h2 style="background-position: 0px -108px;">支付方式</h2>
						<li><a href="http://www.bestln.com/article/view/id/14.html">银行转账</a></li>
						<li><a href="http://www.bestln.com/article/view/id/15.html">礼券支付</a></li>
						<li><a href="http://www.bestln.com/article/view/id/16.html">余额支付</a></li>
						<li><a href="http://www.bestln.com/article/view/id/17.html">在线支付</a></li>

					</ul>
					<ul>
						<h2 style="background-position: 0px -144px;">配送中心</h2>

						<li><a href="http://www.bestln.com/article/view/id/18.html">配送时间</a></li>
						<li><a href="http://www.bestln.com/article/view/id/19.html">配送费用</a></li>
						<li><a href="http://www.bestln.com/article/view/id/20.html">配送方式及范围</a></li>

					</ul>
					<ul>
						<h2 style="background-position: 0px -180px;">售后服务</h2>

						<li><a href="http://www.bestln.com/article/view/id/21.html">退换货总则</a></li>
						<li><a href="http://www.bestln.com/article/view/id/22.html">退换货流程</a></li>
						<li><a href="http://www.bestln.com/article/view/id/23.html">投诉及建议</a></li>

					</ul>
					<ul>
						<h2 style="background-position: 0px -216px;">生鲜常识</h2>

						<li><a title="乐农优选教您如何挑选好吃的云南蒙自石榴"
							href="http://www.bestln.com/article/view/id/285.html">乐农优选教您...</a></li>
						<li><a title="如何挑选又脆又甜的沾化冬枣-乐农优选"
							href="http://www.bestln.com/article/view/id/284.html">如何挑选又脆...</a></li>
						<li><a title="秋季养生家常菜谱—乐农优选"
							href="http://www.bestln.com/article/view/id/274.html">秋季养生家常...</a></li>
						<li><a title="六种食物让你越吃越健康-乐农优选"
							href="http://www.bestln.com/article/view/id/272.html">六种食物让你...</a></li>
						<li><a title="夏季天气炎热水果冷冻一下反而更好吃-乐农优选"
							href="http://www.bestln.com/article/view/id/270.html">夏季天气炎热...</a></li>
						<li><a title="夏季养生就吃营养密度高的果蔬-乐农优选"
							href="http://www.bestln.com/article/view/id/269.html">夏季养生就吃...</a></li>

					</ul>
				</div>
				
				<div class="zs">
					<p>ICP备案证书号:鲁ICP备12032965号-2</p>
					<p>
						<a target="_blank" href="http://www.bestln.com/site/gongshi.html"><img
							src="./乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_A_11.gif" width="110"
							height="31"></a>
					</p>
				</div>
			</div>
			<div style="display: none">
				<script src="./乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/stat.php"
					language="JavaScript"></script>
				<script src="./乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/core.php"
					charset="utf-8" type="text/javascript"></script>
				<a href="http://www.cnzz.com/stat/website.php?web_id=5509163"
					target="_blank" title="站长统计">站长统计</a>
			</div>
			<!--选项卡 切换-->
		</div>
	</div>
	<div class="goTop rightHover">
		<div class="GoToTop none" id="goTop" style="display: none;">
			<a title="返回顶部" onfocus="this.blur();" href="javascript:;"></a>
		</div>
		<div id="hoverCart" class="hoverCar">
			<a href="http://www.bestln.com/cart/index.html" title="去结算"
				onfocus="this.blur();" target="_blank" id="cart_num">0</a>
		</div>
		<div class="hoverTwocode">
			<a href="javascript:;" class="backlink" onclick="" title="二维码"></a>
			<div class="qrcode">
				<a href="http://www.weibo.com/u/3196981945" target="_blank"> <img
					src="./乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/qrcode.png" alt="微博"
					width="87" height="87"></a>
				<p>新浪官方微博</p>
			</div>
		</div>
		<div class="hoverService">
			<a href="javascript:;" class="qqOnLineBg" title="在线客服"></a>
			<ul class="qqOnLine ul01">
				<li><a
					href="http://wpa.qq.com/msgrd?v=3&uin=2652127147&site=%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89%E7%94%9F%E9%B2%9C%E8%B6%85%E5%B8%82&menu=yes"
					target="_blank"> <img
						src="../image/images/ln_A_09b.gif" width="19"
						height="22">2652127147 </a></li>
				<li><a
					href="http://wpa.qq.com/msgrd?v=3&uin=2945478778&site=%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89%E7%94%9F%E9%B2%9C%E8%B6%85%E5%B8%82&menu=yes"
					target="_blank"> <img
						src="../image/images/ln_A_09b.gif" width="19"
						height="22">2945478778 </a></li>
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
</script>
</body>
</html>