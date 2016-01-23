<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0167)http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html -->
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ include file="/front/share/lib.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="Resource-Type" content="document">
<meta name="Distribution" content="global">
<meta name="Generator" content="bestln.com">
<meta name="CopyRight"
	content="Copyright (c) 2010 bestln.com. All Rights Reserved.">
<meta name="rating" content="general">
<link rel="shortcut icon" type="image/x-icon"
	href="http://www.bestln.com/favicon.ico">
<script type="text/javascript">
/*<![CDATA[*/
BU = 'http://www.bestln.com/'; RESBU = 'http://res.bestln.com/bestln'; SBU = 'http://static.bestln.com/'
/*]]>*/
</script>
<meta http-equiv="X-UA-Compatible" content="IE=9">
<meta name="description"
	content="西红柿 清肠排毒 蔬菜，乐农优选是济南专业的生鲜类在线超市，包括各种生鲜，水果，蔬菜，食品，农产品等，为消费者提供网上买菜的机会，省时省力，我们的馋猫论坛更为爱美食的朋友们提供多种美食食谱。">
<meta name="keywords"
	content="西红柿 清肠排毒 蔬菜，济南生鲜超市,济南果蔬，济南网上买菜，济南食品，济南农产品">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/product/goods.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/css/product/jquery.jqzoom.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/product/Goods.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/product/jquery.jqzoom-core.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/common/sso.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/common/suda.js"></script>
<title>西红柿 番茄 600g/盒 绿色蔬菜 乐农优选乐农优选生鲜超市|济南果蔬|济南网上买菜|济南食品</title>
<script src="${pageContext.request.contextPath}/js/product/share.js"></script>
<script src="${pageContext.request.contextPath}/js/product/logger.js"></script>
<script>
$(function (){
$("#LeftMenuBox").hide();
})
</script>
<link rel="stylesheet"
	href="http://bdimg.share.baidu.com/static/api/css/share_style0_16.css">
<link rel="stylesheet"
	href="http://bdimg.share.baidu.com/static/api/css/imgshare.css">
<link rel="stylesheet"
	href="http://bdimg.share.baidu.com/static/api/css/share_popup.css">
<link rel="stylesheet"
	href="http://bdimg.share.baidu.com/static/api/css/select_share.css">
</head>
<body>
<%@ include file="/front/share/common.jsp"%>
	</div>
	<div class="listConetnt w1210">
		<!--主体内容-->
		<div class="curtUrl mt5">
			<b><a href="http://www.bestln.com/">首页</a></b> <span>&gt;</span>
	       <c_rt:forEach items="${productTypes}" var="productType" varStatus="vs">
	        <c_rt:if test="${vs.index == 0}">
			 <a href="${pageContext.request.contextPath }/front/product/getProductAndOneType.htm?id=${productType.id}">${productType.name}</a>
			 </c_rt:if>
			 <c_rt:if test="${vs.index == 1}">
			 <a href="${pageContext.request.contextPath }/front/product/getProductAndTwoType.htm?id=${productType.id}">${productType.name}</a>
			 </c_rt:if>
			 <c_rt:if test="${vs.index == 2}">
			 <a href="${pageContext.request.contextPath }/front/product/getProductAndThreeType.htm?id=${productType.id}">${productType.name}</a>
			 </c_rt:if>
			<span>&gt;</span>
			</c_rt:forEach>
			${product.productName}
		</div>
		<div class="lists">
			<div class="lLeft fl">
				<div class="goodViewList goodViewList1">
					<h5 class="bb">筛选分类</h5>
					<ul>
					   <c_rt:forEach items="${childTypes}" var="typeThree">
						<li><a
							href="http://www.bestln.com/goodscategory/index/id/51.html">${typeThree.name}</a></li>
						</c_rt:forEach>
					</ul>
				</div>
			</div>
			<div class="lRight fr">
				<div class="goodsInfo">
					<div class="left fl">
						<div class="DLe1">
							<a href="${product.coverUrl}"
								title="${product.productName}" class="jqzoom" rel="gal1" id="GoodsImg112"
								style="outline-style: none; text-decoration: none;">
								<div class="zoomPad">
									<img
										src="${product.coverUrl}"
										width="348" height="348" alt="${product.productName}"
										data-bd-imgshare-binded="1" title="" style="opacity: 1;">
								<div class="zoomPup"
										style="top: 71.5px; left: 71.5px; width: 203px; height: 203px; position: absolute; border-width: 1px; display: none; "></div>
									<div class="zoomWindow"
										style="position: absolute; z-index: 5001; left: 358px; top: 0px; display: none;">
										<div class="zoomWrapper" style="width: 350px;">
											<div class="zoomWrapperTitle"
												style="width: 100%; position: absolute; display: block;">${product.productName}</div>
											<div class="zoomWrapperImage"
												style="width: 100%; height: 350px;">
												<img
													src="${product.coverUrl}"
													data-bd-imgshare-binded="1"
													style="position: absolute; border: 0px; display: block; left: -125px; top: -125px;">
											</div>
										</div>
									</div>
									<div class="zoomPreload"
										style="visibility: hidden; top: 152.5px; left: 129px; position: absolute;">加载图片</div>
								</div>
							</a>
						</div>
						<div class="DLe2">
							<b class="btl fl">向左</b>
							<div class="DLeli">
								<ul>
								<li><a href="javascript:void(0);"
										rel="{gallery: 'gal1', smallimage: '${product.coverUrl}',largeimage: '../../${product.coverUrl}'}">
											<img
											src="${product.coverUrl}"
											width="50" height="50" data-bd-imgshare-binded="1">
									</a></li>
								<c_rt:forEach items="${photos}" var="photo">
									<li><a href="javascript:void(0);"
										rel="{gallery: 'gal1', smallimage: 'http://static.bestln.com/GoodsImg/2014/01/23/20140123144343_52e0ba1f9bc66.jpg',largeimage: 'http://static.bestln.com/OriginalImg/2014/01/23/20140123144343_52e0ba1f9b8a2.jpg'}">
											<img
											src="${photo.url}"
											width="50" height="50" data-bd-imgshare-binded="1">
									</a></li>
								</c_rt:forEach>
								</ul>
							</div>
							<b class="btr fr">向右</b>
						</div>
						<div class="DLe2">
							<div class="appSC">
								<a class="gray" href="javascript:AddToFav(112);">收藏这个商品</a>
							</div>
							<div class="appFX">
								<div class="bdsharebuttonbox bdshare-button-style0-16"
									data-bd-bind="1413631366882">
									<a
										href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
										class="bds_more" data-cmd="more"></a> <a
										href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
										class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"></a> <a
										href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
										class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"></a> <a
										href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
										class="bds_tqq" data-cmd="tqq" title="分享到腾讯微博"></a> <a
										href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
										class="bds_renren" data-cmd="renren" title="分享到人人网"></a> <a
										href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
										class="bds_weixin" data-cmd="weixin" title="分享到微信"></a>
								</div>
								<script>window._bd_share_config={"common":{"bdSnsKey":{},"bdText":"","bdMini":"2","bdPic":"","bdStyle":"0","bdSize":"16"},"share":{},"image":{"viewList":["qzone","tsina","tqq","renren","weixin"],"viewText":"分享到：","viewSize":"16"},"selectShare":{"bdContainerClass":null,"bdSelectMiniList":["qzone","tsina","tqq","renren","weixin"]}};with(document)0[(getElementsByTagName('head')[0]||body).appendChild(createElement('script')).src='http://bdimg.share.baidu.com/static/api/js/share.js?v=89860593.js?cdnversion='+~(-new Date()/36e5)];</script>
							</div>
						</div>
					</div>
					<div class="right fr">
						<div class="dbr">
							<h1>${product.productName}</h1>
						</div>
						<div class="dbr">
							<p>校园云货号:${product.code}</p>
							<div>
								<span class="fl mr5">客户评分:</span>
								<div class="b fl mr5">
									<b class="up" style="width: 100%;"></b> <b class="down"></b>
								</div>
								<div class="fl">
									<a href="javascript:;">(已有59条评论)</a>
								</div>
							</div>
						</div>
						<div class="goodsNews">
							<p class="pb10">
								商品单价:<strong class="reder fb f24" id="PrceBox112">${product.sellPrice }</strong>/件
							</p>
							<p>
								品<font class="ml20">牌</font>：${product.brand.brandName}
							</p>
							<p>储藏方法： 常温、冷藏保存</p>
						</div>
						<div>
						 样式：
						       <select name="styleId" id="styleId">
						       <c_rt:forEach items="${styles}" var="style">
								 <option value="${style.id}">${style.name}</option>
							   </c_rt:forEach>
								</select>
						</div>
						<div class="DRe4">
							<div class="count p10">
								<span class="fl p10">数 量</span> <input class="fl mr5" value="1"
									id="GoodsNumber" type="text">
								<div class="fl btdd">
									<a href="javascript:UpGoodsNumber();" class="upper">加</a> <a
										href="javascript:DownGoodsNumber();" class="down">减</a>
								</div>
							</div>
							<ul class="p10">
								<li><a
									href="javascript:AddToCart(${product.id},$('#GoodsNumber').val(),$('#styleId').val());"
									class="add">加入购物车</a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="goodsCont">
					<div class="tabTit mt10">
						<ul id="GoodsMenu">
							<li class="on">商品详情</li>
							<li class="">商品评价</li>
							<li class="">搭配组合</li>
						</ul>
					</div>
					<div class="taber1 taber" id="GoodsContent">
						<p align="center">
							<img
								src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/wxts.jpg"
								alt="配送说明" data-bd-imgshare-binded="1">
						</p>
						<p align="center">
							<img alt=""
								src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/1398157948_lvd.jpg"
								data-bd-imgshare-binded="1">
						</p>
						<div align="center">
							<table style="width: 700px;" class="mceItemTable ke-zeroborder"
								border="0" align="center">
								<tbody>
									<tr>
										<td><span
											style="font-family: arial, helvetica, sans-serif; color: #339966; font-size: medium;"><span
												style="color: #000000; font-size: 18px;"><span>&nbsp;&nbsp;&nbsp;
												</span><span
													style="line-height: 2; font-family: SimSun; font-size: 16px;">西红柿古名六月柿、喜报三元。在秘鲁和墨西哥，最初称之为“狼桃”。果实营养丰富，具特殊风味。番茄原产于中美洲和南美洲，现作为食用蔬果已被全球性广泛种植。</span></span></span>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
						<p align="center">
							<img alt=""
								src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/1386381709_fzu.jpg"
								data-bd-imgshare-binded="1">
						</p>
						<p align="center">
							<img alt=""
								src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/1386381715_yao.jpg"
								data-bd-imgshare-binded="1">
						</p>
						<div align="center">
							<table style="width: 700px;" class="mceItemTable ke-zeroborder"
								border="0" align="center">
								<tbody>
									<tr>
										<td>
											<p class="p0">
												<span
													style="font-family: arial, helvetica, sans-serif; color: #339966; font-size: medium;"><span
													style="color: #000000;"><span
														style="font-size: 18px;"><span>&nbsp;&nbsp;&nbsp;
														</span><span
															style="line-height: 2; font-family: SimSun; font-size: 16px;">西红柿一般以果形周正，无裂口、无虫咬，成熟适度，酸甜适口，肉肥厚，心室小者为佳。&nbsp;西红柿是人们日常生活中不可缺少的美味佳品，它味道沙甜，汁多爽口，风味佳，生食、熟食可，还可加工成西红柿酱、西红柿汁。</span></span></span></span>
											</p>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
						<p align="center">
							<img alt=""
								src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/1386381727_gaw.jpg"
								data-bd-imgshare-binded="1">
						</p>
						<p align="center">
							<img alt=""
								src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/1386381734_bwk.jpg"
								data-bd-imgshare-binded="1">
						</p>
						<div align="center">
							<table style="width: 700px;" class="mceItemTable ke-zeroborder"
								border="0" align="center">
								<tbody>
									<tr>
										<td><span
											style="font-family: arial, helvetica, sans-serif; color: #339966; font-size: medium;"><span
												style="color: #000000; font-size: 18px;"><span>&nbsp;&nbsp;&nbsp;
												</span><span
													style="line-height: 2; font-family: SimSun; font-size: 16px;">乐农合作伙伴西红柿种植基地有充足的光照、适宜的温差，使得产出的西红柿色艳、味美，客人赞不绝口。</span></span></span>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
						<p align="center">
							<img alt=""
								src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/1387423023_avn.jpg"
								data-bd-imgshare-binded="1">
						</p>
						<p align="center">
							<img alt=""
								src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/1386381761_rpl.jpg"
								data-bd-imgshare-binded="1">
						</p>
						<div align="center">
							<table style="width: 700px;" class="mceItemTable ke-zeroborder"
								border="0" align="center">
								<tbody>
									<tr>
										<td><span
											style="font-family: arial, helvetica, sans-serif; color: #339966; font-size: medium;"><span
												style="color: #000000; font-size: 18px;"><span>&nbsp;&nbsp;&nbsp;
												</span><span
													style="line-height: 2; font-family: SimSun; font-size: 16px;">西红柿当中的食物纤维是清肠排毒的好帮手。食物纤维不但无法被肠胃消化，还能吸收体内的胆固醇和脂肪等物质并随着大便排出，从而起到瘦身、健身的作用。</span></span></span>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
						<p align="center">
							<img alt=""
								src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/1386381777_lbj.jpg"
								data-bd-imgshare-binded="1"><img alt=""
								src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/201311121140401988_x.jpg"
								width="700" height="189" data-bd-imgshare-binded="1"><img
								alt=""
								src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/1386207899_jzi.jpg"
								width="700" height="1274" data-bd-imgshare-binded="1">
						</p>
						<p align="center">
							<img alt=""
								src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/1386207909_grr.jpg"
								width="700" height="1121" data-bd-imgshare-binded="1"><a
								href="http://weibo.com/u/3196981945?topnav=1&wvr=5&topsug=1"
								target="_blank"><img alt=""
								src="http://image.suning.cn/uimg/sop/commodity/201310311042292211_x.jpg"
								width="700" height="274" data-bd-imgshare-binded="1"></a>
						</p>
					</div>
					<div id="GoodsComment" class="DetailsRight4 taber2 taber">
						<div class="inTab">
							<div class="t2ta">
								<p>
									<strong class="hot">94<span>%</span></strong><span class="gray">好评度</span>
								</p>
							</div>
							<div class="t2tb">
								<dl>
									<dt>好评</dt>
									<dd>
										<div>
											<div class="part" style="width: 94%"></div>
										</div>
									</dd>
									<dd>94%</dd>
								</dl>
								<dl>
									<dt>中评</dt>
									<dd>
										<div>
											<div class="part" style="width: 0%"></div>
										</div>
									</dd>
									<dd>0%</dd>
								</dl>
								<dl>
									<dt>差评</dt>
									<dd>
										<div>
											<div class="part" style="width: 6%"></div>
										</div>
									</dd>
									<dd>6%</dd>
								</dl>
							</div>
							<div class="t2tc">
								<p class="gray">购买商品，成功签收，并确认后即可发表评论，每成功发表一条评论，即有可能获得积分！</p>

							</div>
						</div>
						<div class="cdc">
							<div>
								<ol id="CommentMenu">
									<!-- 评论选项卡 -->
									<li id="CommentAll" class="on"
										onclick="getGoodsComment('All',$(this).attr('id'))">全部评论(59)</li>
									<li id="CommentGood"
										onclick="getGoodsComment('Good',$(this).attr('id'))">好评（56）</li>
									<li id="CommentNormal"
										onclick="getGoodsComment('Normal',$(this).attr('id'))">中评（0）</li>
									<li id="CommentBad"
										onclick="getGoodsComment('Bad',$(this).attr('id'))">差评（3）</li>
								</ol>
							</div>
						</div>
						<div class="cdd" id="CommentList">
							<div id="CommentsContent">
								<ul style="padding-bottom: 20px;">
									<li>
										<div class="dd1">
											<p>总体还行，主要是方便。</p>
											<p class="gray">2014-10-16 08:08:08</p>
										</div>
										<div class="dd3">
											<p>15098871603</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>总体还行，主要是方便。</p>
											<p class="gray">2014-10-16 08:07:45</p>
										</div>
										<div class="dd3">
											<p>15098871603</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>第二次买了，这次质量出乎意料的差。哈密瓜坏了一个，送来的时候已经是晚上了，出门去拿的，拿回家以后才发现是坏的。生菜也是坏的。李子个头特别小，不如以前买的好吃。不满意。</p>
											<p class="gray">2014-10-10 14:05:54</p>
										</div>
										<div class="dd3">
											<p>wqy_924@163.com</p>
											<p class="b">
												<b class="up" style="width: 40%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>第二次买了，这次质量出乎意料的差。哈密瓜坏了一个，送来的时候已经是晚上了，出门去拿的，拿回家以后才发现是坏的。生菜也是坏的。李子个头特别小，不如以前买的好吃。不满意。</p>
											<p class="gray">2014-10-10 14:05:17</p>
										</div>
										<div class="dd3">
											<p>wqy_924@163.com</p>
											<p class="b">
												<b class="up" style="width: 40%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>第二次买了，这次质量出乎意料的差。哈密瓜坏了一个，送来的时候已经是晚上了，出门去拿的，拿回家以后才发现是坏的。生菜也是坏的。李子个头特别小，不如以前买的好吃。不满意。</p>
											<p class="gray">2014-10-10 14:04:39</p>
										</div>
										<div class="dd3">
											<p>wqy_924@163.com</p>
											<p class="b">
												<b class="up" style="width: 40%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>小黄花真的非常赞，红烧做法，味道鲜美，比超市的质量好很多；
												西红柿也很棒，酸酸的味道像有小时候在老家柿子颗上面直接摘下来吃的感觉； 生菜和菠菜的特点是鲜嫩；
												南瓜和紫薯的价格和质量还算可以； 唯一的缺憾的黄瓜不够新鲜。 整体非常满意，推荐给了同事和朋友，以后还会常来的。</p>
											<p class="gray">2014-09-19 08:45:57</p>
										</div>
										<div class="dd3">
											<p>zaj333</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:20:53</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:20:01</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:19:08</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:18:15</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:17:22</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:16:27</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:15:35</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:14:41</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:13:44</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:12:50</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:11:54</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:10:58</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:10:04</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
									<li>
										<div class="dd1">
											<p>菜都很新鲜，超出预想，不过肉有点贵，可以在同事间推广。</p>
											<p class="gray">2014-09-17 09:09:08</p>
										</div>
										<div class="dd3">
											<p>漪岸0319</p>
											<p class="b">
												<b class="up" style="width: 100%;"></b><b class="down"></b>
											</p>
										</div>
									</li>
								</ul>
								<div id="GoodsCommentPager" class="list">
									<ul id="yw0" class="yiiPager">
										<li class="first hidden"><a
											href="http://www.bestln.com/goods/Comment/GoodsId/112/Type/All.html">&lt;&lt;</a></li>
										<li class="previous hidden"><a
											href="http://www.bestln.com/goods/Comment/GoodsId/112/Type/All.html">上一页</a></li>
										<li class="page selected"><a
											href="http://www.bestln.com/goods/Comment/GoodsId/112/Type/All.html">1</a></li>
										<li class="page"><a
											href="http://www.bestln.com/goods/Comment/GoodsId/112/Type/All/page/2.html">2</a></li>
										<li class="page"><a
											href="http://www.bestln.com/goods/Comment/GoodsId/112/Type/All/page/3.html">3</a></li>
										<li class="next"><a
											href="http://www.bestln.com/goods/Comment/GoodsId/112/Type/All/page/2.html">下一页</a></li>
										<li class="last"><a
											href="http://www.bestln.com/goods/Comment/GoodsId/112/Type/All/page/3.html">&gt;&gt;</a></li>
									</ul>
								</div>

							</div>
						</div>
					</div>

					<div class="DetailsRight3 taber3 taber none">
						<div class="inTab">
							<dl>
								<dt>
									<div>
										<p>
											<a href="javascript:;"> <img
												src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/20140123144343_52e0ba1fb171c.jpg"
												width="142" height="142" alt="西红柿 番茄 600g/盒 绿色蔬菜 乐农优选"
												data-bd-imgshare-binded="1">
											</a>
										</p>
										<p>
											<a href="javascript:;">西红柿 番茄 600g/盒 绿色蔬菜 乐农优选</a>
										</p>
									</div>
								</dt>
								<dd>
									<div class="ddcc">
										<ul>
											<li>
												<div>
													<a
														href="http://www.bestln.com/goods-275-%E5%AE%B6%E9%B8%A1%E8%9B%8B8%E6%9E%9A1%E4%BB%BD%E7%94%9F%E9%B2%9C%E8%9B%8B%E7%B1%BB%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html"
														target="_blank"> <img
														src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/20131225171052_52baa11cc8fd8.jpg"
														width="100" height="100" alt="家鸡蛋 8枚/1份 生鲜蛋类 乐农优选"
														data-bd-imgshare-binded="1">
													</a>
												</div>
												<div>
													<p>
														<a
															href="http://www.bestln.com/goods-275-%E5%AE%B6%E9%B8%A1%E8%9B%8B8%E6%9E%9A1%E4%BB%BD%E7%94%9F%E9%B2%9C%E8%9B%8B%E7%B1%BB%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html"
															target="_blank">家鸡蛋 8枚/1份 生鲜蛋类 乐农</a>
													</p>
												</div>
												<div>
													<p>
														<label><input type="checkbox" name="LinkGoodsId[]"
															checked="checked" value="275" id="LinkGoods_275"><span
															class="red"><font>￥</font><span
																class="dp_good_price">5.00</span></span>/份</label>
													</p>
												</div>
											</li>
											<li>
												<div>
													<a
														href="http://www.bestln.com/goods-84-%E5%A4%A7%E8%91%B1350g%E7%AB%A0%E4%B8%98%E5%87%BA%E4%BA%A7%E9%A6%99%E9%B2%9C.html"
														target="_blank"> <img
														src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/20140621090541_53a4da6522b2e.jpg"
														width="100" height="100" alt="大葱350g 章丘出产 香 鲜"
														data-bd-imgshare-binded="1">
													</a>
												</div>
												<div>
													<p>
														<a
															href="http://www.bestln.com/goods-84-%E5%A4%A7%E8%91%B1350g%E7%AB%A0%E4%B8%98%E5%87%BA%E4%BA%A7%E9%A6%99%E9%B2%9C.html"
															target="_blank">大葱350g 章丘出产 香 鲜</a>
													</p>
												</div>
												<div>
													<p>
														<label><input type="checkbox" name="LinkGoodsId[]"
															checked="checked" value="84" id="LinkGoods_84"><span
															class="red"><font>￥</font><span
																class="dp_good_price">1.20</span></span>/份</label>
													</p>
												</div>
											</li>
											<li>
												<div>
													<a
														href="http://www.bestln.com/goods-211-%E9%A6%99%E8%8F%9C130g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html"
														target="_blank"> <img
														src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/20140621090340_53a4d9ec32d63.jpg"
														width="100" height="100" alt="香菜 130g/份 绿色蔬菜 乐农优选"
														data-bd-imgshare-binded="1">
													</a>
												</div>
												<div>
													<p>
														<a
															href="http://www.bestln.com/goods-211-%E9%A6%99%E8%8F%9C130g%E4%BB%BD%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html"
															target="_blank">香菜 130g/份 绿色蔬菜 乐农优</a>
													</p>
												</div>
												<div>
													<p>
														<label><input type="checkbox" name="LinkGoodsId[]"
															checked="checked" value="211" id="LinkGoods_211"><span
															class="red"><font>￥</font><span
																class="dp_good_price">0.60</span></span>/份</label>
													</p>
												</div>
											</li>
											<li class="lilast">
												<div>
													<a
														href="http://www.bestln.com/goods-128-%E5%B0%96%E6%A4%92%E9%9D%92%E5%B0%96%E6%A4%92330g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html"
														target="_blank"> <img
														src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/20140621090119_53a4d95f366b7.jpg"
														width="100" height="100" alt="尖椒 青尖椒 330g/盒 绿色蔬菜 乐农优选"
														data-bd-imgshare-binded="1">
													</a>
												</div>
												<div>
													<p>
														<a
															href="http://www.bestln.com/goods-128-%E5%B0%96%E6%A4%92%E9%9D%92%E5%B0%96%E6%A4%92330g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html"
															target="_blank">尖椒 青尖椒 330g/盒 绿色蔬菜</a>
													</p>
												</div>
												<div>
													<p>
														<label><input type="checkbox" name="LinkGoodsId[]"
															checked="checked" value="128" id="LinkGoods_128"><span
															class="red"><font>￥</font><span
																class="dp_good_price">0.90</span></span>/盒</label>
													</p>
												</div>
											</li>
										</ul>
									</div>
								</dd>
								<dd>
									<div class="ddrr">
										<h3>购买人气组合</h3>
										<p class="xx">
											已选择<span class="red" id="chk_num">(4)</span>个搭配
										</p>
										<p class="ss">
											搭配价：<span class="red bb"><span>￥</span><strong
												id="price_count">11.7</strong></span>
										</p>
										<p>
											<a href="javascript:AddManyToCart();">加入购物车</a>
										</p>
									</div>
								</dd>
							</dl>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
var chk_values = [${product.id}];
var pri_all = parseFloat(${product.sellPrice});

$(document).ready(function() {
	$('.jqzoom').jqzoom({
        zoomWidth: 350, //放大图的宽度(默认是 200)
        zoomHeight: 350, //放大图的高度(默认是 200)
        offset: 0, //离原图的距离(默认是 10)
        position: "right", //放大图的定位(默认是 "right")
        preload:1,
        preloadText:"加载图片"
    });
	alert("aaaaaaa");
    getGoodsPrce(${product.id});
    $("#GoodsMenu").find('li').each(function(i,n){
        $(this).click(function(){       
            $("#GoodsMenu").find('li').removeClass('on');
            $(this).addClass('on');
            var n = i+1;
            $(".taber").addClass("none");
            $(".taber"+n).removeClass("none");

            /*if($("#GoodsContent").hasClass('none')){
                $("#GoodsContent").removeClass('none');
            }else{
                $("#GoodsContent").addClass('none');
            }*/
        });
    });
    //最后一个搭配商品没有后边的加号
    $(".DetailsRight3 .inTab dl dd ul li").last().addClass("lilast");  
    
    chk_num();
    
    //复选框改变时改变搭配个数，改变搭配价格
    $('input[name="LinkGoodsId[]"]').click(function(){
        chk_values = [${product.id}];
        pri_all = parseFloat(4.00);
        chk_num();
    });
});

function getGoodsComment(Type, title) {
    var url = "/Goods/Comment.html";
    $.post(url, {'GoodsId': '112', 'Type': Type}, function(data) {
        $("#" + title).html(data.title);
        $("#CommentList").html(data.html);
    }, 'json');
}
function getGoodsPrce(gid){
    var url = "/Goods/getPrice.html";
    $.post(url, {'GoodsId': gid}, function(data) {
        if(data.error==0){
            $("#PrceBox" + gid).html(data.Price);
        }
    }, 'json');
}

 //页面加载时显示搭配个数
 function chk_num(){
    var chk_num = $('input[name="LinkGoodsId[]"]:checked');
    $("#chk_num").html("()");
    $("#chk_num").html("("+chk_num.size()+")");
    chk_num.each(function(){  
        chk_values.push($(this).val());  
        var price =parseFloat( $(this).next().children(".dp_good_price").html());
        price = parseFloat(price);
        pri_all += price;
    });
    pri_all = Math.round(pri_all*100)/100;
    $("#price_count").html("").html(pri_all);
}

function AddManyToCart(){  
    if(chk_values.length>1){
        for(i=0;i<chk_values.length;i++){
            setTimeout(addToCar(chk_values[i]),i*1000);
        }
    }else{
        alert("请至少选择一个搭配商品！");
    }
}
function addToCar(id){
    return function(){
         AddToCart(id);
     };
}
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
						src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_A_09b.gif"
						width="19" height="22" data-bd-imgshare-binded="1">2652127147
				</a></li>
				<li><a
					href="http://wpa.qq.com/msgrd?v=3&uin=2945478778&site=%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89%E7%94%9F%E9%B2%9C%E8%B6%85%E5%B8%82&menu=yes"
					target="_blank"> <img
						src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_A_09b.gif"
						width="19" height="22" data-bd-imgshare-binded="1">2945478778
				</a></li>
				<li><img
					src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_A_09d.gif"
					width="19" height="22" data-bd-imgshare-binded="1">service@bestln.com</li>
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
		<div class="friend">
			<span><img
				src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_A_10.gif"
				width="62" height="27" alt="乐农优选" data-bd-imgshare-binded="1"></span>
			<p>
				友情连接： <a href="http://www.hopingshandong.gov.cn/" target="_blank">好品山东</a>
				<a href="http://www.zgjnhbh.com/" target="_blank">韩博会</a>
			</p>
		</div>
		<div class="zs">
			<p>ICP备案证书号:鲁ICP备12032965号-2</p>
			<p>
				<a target="_blank" href="http://www.bestln.com/site/gongshi.html"><img
					src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_A_11.gif"
					width="110" height="31" data-bd-imgshare-binded="1"></a>
			</p>
		</div>
	</div>
	<div style="display: none">
		<script
			src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/stat.php"
			language="JavaScript"></script>
		<script
			src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/core.php"
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
					src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/qrcode.png"
					alt="微博" width="87" height="87" data-bd-imgshare-binded="1">
				</a>
				<p>新浪官方微博</p>
			</div>
		</div>
		<div class="hoverService">
			<a href="javascript:;" class="qqOnLineBg" title="在线客服"></a>
			<ul class="qqOnLine ul01">
				<li><a
					href="http://wpa.qq.com/msgrd?v=3&uin=2652127147&site=%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89%E7%94%9F%E9%B2%9C%E8%B6%85%E5%B8%82&menu=yes"
					target="_blank"> <img
						src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_A_09b.gif"
						width="19" height="22" data-bd-imgshare-binded="1">2652127147
				</a></li>
				<li><a
					href="http://wpa.qq.com/msgrd?v=3&uin=2945478778&site=%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89%E7%94%9F%E9%B2%9C%E8%B6%85%E5%B8%82&menu=yes"
					target="_blank"> <img
						src="./西红柿 番茄 600g 盒 绿色蔬菜 乐农优选乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_A_09b.gif"
						width="19" height="22" data-bd-imgshare-binded="1">2945478778
				</a></li>
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
	<iframe frameborder="0" id="bdSharePopup_selectshare1413631366893bg"
		class="bdselect_share_bg" style="display: none;"></iframe>
	<div id="bdSharePopup_selectshare1413631366893box"
		style="display: none;" share-type="selectshare"
		class="bdselect_share_box" data-bd-bind="1413631366892">
		<div class="selectshare-mod-triangle">
			<div class="triangle-border"></div>
			<div class="triangle-inset"></div>
		</div>
		<div class="bdselect_share_head">
			<span>分享到</span><a class="bdselect_share_dialog_close"></a>
		</div>
		<div class="bdselect_share_content">
			<ul class="bdselect_share_list bdshare-button-style0-16">
				<div class="bdselect_share_partners"></div>
				<a
					href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
					class="bds_more" data-cmd="more"></a>
			</ul>
		</div>
	</div>
	<div id="bdimgshare_1413631366899"
		class="sr-bdimgshare sr-bdimgshare-list sr-bdimgshare-16 sr-bdimgshare-black"
		style="height: 36px; line-height: 26px; font-size: 12px; position: absolute; top: 199px; left: 291.5px; width: 348px; display: none;"
		data-bd-bind="1413631366899">
		<div class="bdimgshare-bg"></div>
		<div
			class="bdimgshare-content bdsharebuttonbox bdshare-button-style0-16">
			<label class="bdimgshare-lbl">分享到：</label><a
				href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
				onclick="return false;" class="bds_qzone" data-cmd="qzone"
				hidefocus=""></a><a
				href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
				onclick="return false;" class="bds_tsina" data-cmd="tsina"
				hidefocus=""></a><a
				href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
				onclick="return false;" class="bds_tqq" data-cmd="tqq" hidefocus=""></a><a
				href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
				onclick="return false;" class="bds_renren" data-cmd="renren"
				hidefocus=""></a><a
				href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
				onclick="return false;" class="bds_weixin" data-cmd="weixin"
				hidefocus=""></a><a
				href="http://www.bestln.com/goods-112-%E8%A5%BF%E7%BA%A2%E6%9F%BF%E7%95%AA%E8%8C%84600g%E7%9B%92%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C%E4%B9%90%E5%86%9C%E4%BC%98%E9%80%89.html#"
				onclick="return false;" class="bds_more" data-cmd="more"
				hidefocus=""></a>
		</div>
	</div>
</body>
</html>