<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt" %>
<%@ taglib uri="http://www.opensymphony.com/oscache" prefix="oscache" %>
	<div class="main_bestln">
		<!--工具栏开始-->
		<div class="toolbar">
			<div class="w1210">
				<span class="fl" id="memberInfo">您好<c_rt:if test="${not empty user}">${user.userName}</c_rt:if>，欢迎来到乐农优选！ <c_rt:if test="${empty user}">[<a
					href="${pageContext.request.contextPath }/front/user/login.jsp">请登录</a>]· [<a
					href="${pageContext.request.contextPath }/front/user/regist.jsp">免费注册</a>]·</c_rt:if>
					<c_rt:if test="${not empty user}"> [<a href="${pageContext.request.contextPath }/front/usercenter/center.htm">我的乐农</a>]·
    [<a href="${pageContext.request.contextPath }/front/cartmanage/createOrder.htm">我的订单</a>]·
    [<a href="${pageContext.request.contextPath }/front/user/logout.htm">退出</a>]</c_rt:if>
				</span> <span class="fr"> <span> <!-- <iframe width="122"
							class="mt5" style="float: left; clear: both;" scrolling="no"
							height="30" frameborder="0"
							src="./乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/followbutton.htm"
							border="0" marginheight="0" marginwidth="0"
							allowtransparency="true"></iframe> -->
				</span> <a href="javascript:;" onclick="addfavorite();">收藏乐农</a> 丨 <a
					href="http://www.bestln.com/article/view/id/7.html">帮助中心</a> 丨
				</span>
			</div>
		</div>
		<!--工具栏结束-->
		<!--logo,查询框，我的乐农，购物篮 z-index:999~990-->
		<div class="logo">
			<div class="w1210 logo_son">
				<!--左侧logo--->
				<span class="fl"> <a href="http://bestln.com/"> <img
						src="../../image/images/ln_A_02.png"
						alt="乐农优选生鲜超市|济南果蔬|济南网上买菜|济南食品" width="210" height="90"></a>
				</span>
				<!---搜索框-->
				<div class="search fl">
					<form action="http://www.bestln.com/search/index.html"
						target="_blank">
						<div class="box">
							<input type="text" class="inp1" id="searchKey" name="Keywords">
								<input type="submit" class="inp2" value="搜索">
						</div>
					</form>
					<div class="hotwords">
						<strong>热门搜索:</strong> <a target="_blank" class="hot"
							href="http://www.bestln.com/search/index/Keywords/%E7%BA%A2%E5%AF%8C%E5%A3%AB.html">红富士</a>
						<a target="_blank"
							href="http://www.bestln.com/search/index/Keywords/%E9%95%BF%E8%8C%84+%E8%8F%A0%E8%8F%9C.html">长茄
							菠菜</a> <a target="_blank"
							href="http://www.bestln.com/search/index/Keywords/%E9%B8%A1%E8%9B%8B.html">鸡蛋</a>
						<a target="_blank"
							href="http://www.bestln.com/search/index/Keywords/%E6%B2%B9%E9%BA%A6%E8%8F%9C.html">油麦菜</a>
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
								<a href="../../front/shopping/cartList.htm" target="_blank">去结算</a> <span></span>
							</div>
							<div class="carList" id="MiniCartContent">0</div>
							<div class="carLBottom"></div>
						</dd>
					</dl>
					<dl class="dl0 dl2">
						<dt>
							<a href="http://www.bestln.com/user/site/index.html"
								target="_blank">我的乐农</a>
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
					<div class="mainNav w1210">
						<!--导航-->
						<ul>
							<li class="on"><a
								href="${pageContext.request.contextPath }/front/main/index.htm">首页</a>
							</li>
							<li><a href="http://www.bestln.com/foodcase/index.html">周菜香</a>
							</li>
							<li><a href="http://www.bestln.com/foodbook/index.html">馋猫</a>
								<img src="../../image/images/hot.png"></li>
							<li><a
								href="http://www.bestln.com/cat-4-%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C.html">绿色蔬菜</a>
							</li>
							<li><a
								href="http://www.bestln.com/cat-1-%E6%96%B0%E9%B2%9C%E6%B0%B4%E6%9E%9C.html">新鲜水果</a>
							</li>
							<li><a
								href="http://www.bestln.com/cat-307-%E6%B0%B4%E4%BA%A7%E6%B5%B7%E9%B2%9C.html">水产海鲜</a>
							</li>
							<li><a
								href="http://www.bestln.com/article/index/CatId/8/CatName/%E7%94%9F%E9%B2%9C%E5%B8%B8%E8%AF%86.html">生鲜常识</a>
							</li>
							<li><a
								href="http://www.bestln.com/cat-174-%E7%89%B9%E8%89%B2%E7%A4%BC%E5%93%81.html">特色礼品</a>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<div class="leftMenu">
				<!--左侧类别导航-->

				<div class="sideMenu " id="LeftMenu">
					<h2>
						<a id="ShowAllCategory" href="javascript:;">所有商品分类</a>
					</h2>
					 
					<div class="menulist hidden" id="LeftMenuBox"
						style="display: block;">
						<ul class="nav">
						<c_rt:forEach items="${typeList}" var="type" varStatus="vs">
						<c_rt:if test="${empty type.parent}">
							<li class="catnav" id="list_${vs.index}">
								<div class="left">
									<i class="fl"></i>
									<h3>
										<a
											href="http://www.bestln.com/cat-4-%E7%BB%BF%E8%89%B2%E8%94%AC%E8%8F%9C.html"
											target="_blank">${type.name}</a>
									</h3>
									<p>
									<c_rt:forEach items="${type.children }" var="typechild">
										<a target="_blank"
											href="http://www.bestln.com/cat-6-%E5%8F%B6%E8%8F%9C%E7%B1%BB.html">${typechild.name}</a>
											</c_rt:forEach>
									</p>
								</div>
								<div class="catnav_son_list vhidden" style="height: 450px;">
									<ul>
									<c_rt:forEach items="${type.children }" var="typechild">
										<li>
											<h4>
												<a target="_blank"
													href="http://www.bestln.com/cat-6-%E5%8F%B6%E8%8F%9C%E7%B1%BB.html">${typechild.name}</a>
											</h4>
											<p>
											<c_rt:forEach items="${typechild.children}" var="typechch">
												<a target="_blank"
													href="http://www.bestln.com/cat-37-%E5%B0%8F%E7%99%BD%E8%8F%9C.html">${typechch.name}</a>
											</c_rt:forEach>
											</p>
										</li>
										</c_rt:forEach>
									</ul>
									<!--                    <ol >
                        <li>·推荐品牌</li>
                    </ol>-->
								</div>
							</li>
							</c_rt:if>
							</c_rt:forEach>
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