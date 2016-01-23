<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="Resource-Type" content="document"><meta name="Distribution" content="global"><meta name="Generator" content="bestln.com"><meta name="CopyRight" content="Copyright (c) 2010 bestln.com. All Rights Reserved."><meta name="rating" content="general"><link rel="shortcut icon" type="image/x-icon" href="http://www.bestln.com/favicon.ico">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/common/style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/css/user/user.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/user/jquery.yiiactiveform.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/user/User.js"></script> 
<title>齐派送 用户注册 乐农优选生鲜超市|济南果蔬|济南网上买菜|济南食品</title>

    </head>
    <body>
        <div class="wrapper" id="bestln"><!-- 封套和备用接口,不会写入宽度值，应用position的子容器将备注z-index值！ -->
            <div class="topbar"><!-- 预留的头部空间/z-index:0 --></div>
            <div class="shelf"><!-- z-index:0 -->
                <div class="b90">
                    <span class="left">您好，欢迎来到乐农优选！
                                                [<a href="${pageContext.request.contextPath }/front/user/login.jsp">请登录</a>]·
                        [<a href="./齐派送 用户注册 乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/齐派送 用户注册 乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品.htm">免费注册</a>]·
                                            </span>
                    <span class="right">
                        <a href="javascript:;" onclick="addfavorite();">收藏农乐</a> 丨 
                        <a href="http://www.bestln.com/article/index/id/1.html">帮助中心</a> 丨 
                        <div style="position: absolute;margin-top:-28px;margin-left:-120px;*margin-top:-6px;*margin-left: -263px;">
                            <iframe width="122" style="float: left;" scrolling="no" height="40" frameborder="0" src="./齐派送 用户注册 乐农优选生鲜超市 济南果蔬 济南网上买菜 济南食品_files/followbutton.htm" border="0" marginheight="0" marginwidth="0" allowtransparency="true"></iframe>
                        </div>
                    </span>
                </div>
            </div>
            <form id="userForm" onsubmit="return checkForm()" name="" action="${pageContext.request.contextPath }/front/user/regist.htm" method="post"><div class="application">
    <div class="b90">
        <div class="app">免费注册</div>
    </div>
</div>
<div class="Register">
    <div class="b90">
        <div class="son">
            <div class="t"><span>新用户注册</span></div>
            <div class="l502 left">
                <div class="l222 left">
                    <span><font class="red">*&nbsp;</font>账户名：</span>
                    <span><font class="red">*&nbsp;</font>请填写邮箱：</span>
                    <span><font class="red">*&nbsp;</font>请设置密码：</span>
                    <span><font class="red">*&nbsp;</font>请确认密码：</span>
                </div>
                 
                <div class="r255 right">
                    <div class="R255Box Name error">
                        <input class="text" name="userName" onblur="valiUserName()" id="RegForm_UserName" type="text" maxlength="255">       
                        <div class="MerIco_name"></div>
                       
                        <label class="error" id="RegForm_UserName_em_" style=""></label>                    </div>
                    <div class="R255Box Name error">
                        <input class="text" name="email" onblur="valiEmail()" id="RegForm_Email" type="text" maxlength="255">                        <div class="MerIco_EMail"></div>
                        <label class="errorMessage" id="RegForm_Email_em_" style=""></label>                    </div>
                    <div class="R255Box password error">
                        <input class="text" name="password" onblur="valiPassword()" id="RegForm_Password" type="password">                        <div class="MerIco_password"></div>
                        <label class="errorMessage" id="RegForm_Password_em_" style=""></label>                    </div>
                    <div class="R255Box password error">
                        <input class="text" name="rePassword" onblur="valiRePassword()" id="RegForm_RePassword" type="password">                        <div class="MerIco_password"></div>
                        <label class="errorMessage" id="RegForm_RePassword_em_" style=""></label>                    </div>
                    <div class="R255Box service">
                        <input id="ytRegForm_Agree" type="hidden" value="0" name="RegForm[Agree]">
                        <input class="btn" checked="checked" name="RegForm[Agree]" id="RegForm_Agree" value="1" type="checkbox">                        
                        <label class="error" id="RegForm_Agree_em_" style="display:none"></label>                        <div class="MerIco_cb"><p>我已阅读并同意<a href="javascript:;">《乐农优选用户协议》</a></p></div>
                    </div>
                    <div class="R255Box go">
                        <input class="goer" name="submit" value="" type="submit">
                    </div>
                </div>
            </div>
            <div class="r308 right">
                <div class="box">
                    <p>已有帐号？请直接登陆~</p>
                    <div><a href="${pageContext.request.contextPath }/front/user/login.jsp">立即登录</a></div>
                    <p class="tyu"><a href="http://www.bestln.com/site/forget.html">·忘记密码？</a></p>
                </div>
            </div>
        </div>  
    </div>
</div>
</form>            <div class="foott">
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
</div>        </div>
    <script type="text/javascript">
/*<![CDATA[*/
jQuery(function($) {
jQuery('#user-reg-form').yiiactiveform({'validateOnSubmit':true,'attributes':[{'id':'RegForm_UserName','inputID':'RegForm_UserName','errorID':'RegForm_UserName_em_','model':'RegForm','name':'UserName','enableAjaxValidation':true,'successCssClass':'ok'},{'id':'RegForm_Email','inputID':'RegForm_Email','errorID':'RegForm_Email_em_','model':'RegForm','name':'Email','enableAjaxValidation':true},{'id':'RegForm_Password','inputID':'RegForm_Password','errorID':'RegForm_Password_em_','model':'RegForm','name':'Password','enableAjaxValidation':true},{'id':'RegForm_RePassword','inputID':'RegForm_RePassword','errorID':'RegForm_RePassword_em_','model':'RegForm','name':'RePassword','enableAjaxValidation':true},{'id':'RegForm_Agree','inputID':'RegForm_Agree','errorID':'RegForm_Agree_em_','model':'RegForm','name':'Agree','enableAjaxValidation':true}],'focus':'#RegForm_UserName'});
});
/*]]>*/
</script>


</body></html>