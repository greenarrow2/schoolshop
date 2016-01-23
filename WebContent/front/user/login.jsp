<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

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

							<script type="text/javascript"
								src="${pageContext.request.contextPath }/js/common/jquery.min.js"></script>
							<link rel="stylesheet" type="text/css"
								href="${pageContext.request.contextPath }/css/common/style.css">
								<link rel="stylesheet" type="text/css"
									href="${pageContext.request.contextPath }/css/user/user.css">
									<script type="text/javascript"
										src="${pageContext.request.contextPath }/js/user/User.js"></script>
									<title>齐派送 用户登录 乐农优选生鲜超市|济南果蔬|济南网上买菜|济南食品</title>
</head>
<body>
	<div class="wrapper" id="bestln">
		<!-- 封套和备用接口,不会写入宽度值，应用position的子容器将备注z-index值！ -->
		<div class="topbar">
			<!-- 预留的头部空间/z-index:0 -->
		</div>
		<div class="shelf">
			<!-- z-index:0 -->
			<div class="b90">
				<span class="left">您好，欢迎来到乐农优选！ [<a
					href="./齐派送 用户登录 乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/齐派送 用户登录 乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品.html">请登录</a>]·
					[<a
					href="${pageContext.request.contextPath }/front/user/regist.jsp">免费注册</a>]·
				</span> <span class="right"> <a href="javascript:;"
					onclick="addfavorite();">收藏农乐</a> 丨 <a
					href="http://www.bestln.com/article/index/id/1.html">帮助中心</a> 丨
					<div
						style="position: absolute; margin-top: -28px; margin-left: -120px; *margin-top: -6px; *margin-left: -263px;">
						<iframe width="122" style="float: left;" scrolling="no"
							height="40" frameborder="0"
							src="./齐派送 用户登录 乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/followbutton.html"
							border="0" marginheight="0" marginwidth="0"
							allowtransparency="true"></iframe>
					</div>
				</span>
			</div>
		</div>
		<div class="application">
			<div class="b90">
				<div class="app">济南本地绿色生鲜冷链配送服务商</div>
			</div>
		</div>
		<div class="MainLogin">
			<div class="b90">
				<div class="son">
					<div class="aim left">
						<strong>为什么选择我们？</strong>
						<ul>
							<li><div class="left">全程冷链物流</div>
								<div class="left">
									<img
										src="./齐派送 用户登录 乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_ML_01.gif"
										width="85" height="42">
								</div></li>
							<li><div class="left">保证产品新鲜</div>
								<div class="left">
									<img
										src="./齐派送 用户登录 乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_ML_02.gif"
										width="85" height="42">
								</div></li>
							<li><div class="left">严把源头产品质量</div>
								<div class="left">
									<img
										src="./齐派送 用户登录 乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_ML_03.gif"
										width="85" height="42">
								</div></li>
							<li><div class="left">提供安全无公害产品</div>
								<div class="left">
									<img
										src="./齐派送 用户登录 乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_ML_04.gif"
										width="85" height="42">
								</div></li>
						</ul>
						<div class="RandowPic">
							<img
								src="./齐派送 用户登录 乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/ln_ML_02.png"
								width="291" height="275">
						</div>
					</div>
					<div class="LoginBox left">
						<div class="left">
							<span class="f1">账户名：</span><span class="f2">密 码：</span><span
								class="f3">验证码：</span>
						</div>
						<div class="left mor">

							<form name="login-form" id="login-form"
								action="${pageContext.request.contextPath }/front/user/login.htm"
								method="post">
								<div class="MorBox Name">
									<input class="text" name="userName" id="UserLoginForm_UserName"
										type="text"> <label class="error"
										id="LogForm_UserName_em_" style=""></label>
										<div class="MorIco_name"></div>
								</div>
								<input type="hidden" name="BackUrl" id="BackUrl">
									<div class="MorBox password">
										<input class="text" name="password"
											id="UserLoginForm_Password" type="password"> <label
											class="error" id="LogForm_UserName_em_" style=""></label>
											<div class="MorIco_password"></div>
									</div>
									<div class="MorBox nmber">
										<input class="text" name="verifyCode"
											id="UserLoginForm_verifyCode" type="text">
											<div class="MorIco_nmber">
												<img id="yw0"
													src="${pageContext.request.contextPath }/front/user/createCode.htm"
													alt="">
											</div>
									</div>
									<div class="MorBox cb">
										<input class="btn" checked="" name="AutoLogin" type="checkbox">
											<div class="MorIco_cb">
												<p>
													自动登录<a href="http://www.bestln.com/site/forget.html">忘记密码？</a>
												</p>
											</div>
									</div>
									<div class="MorBox go">
										<input class="goer" value="" name="submit" type="submit">
											<div class="MorIco_go">
												<p>
													<a href="${pageContext.request.contextPath }/front/user/regist.jsp">·免费注册</a>
												</p>
											</div>
									</div>
							</form>
						</div>
					</div>
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
					<p>Copyright©2013 www.bestln.com 版权所有</p>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
/*<![CDATA[*/
$(function() {
$('#yw0').after("<a id=\"yw0_button\" >换一张<\/a>");
$(document).on('click', '#yw0_button', function(){
	$('#yw0').attr('src',"/schoolshop/front/user/createCode.htm" );
});

});
/*]]>*/
</script>


</body>
</html>