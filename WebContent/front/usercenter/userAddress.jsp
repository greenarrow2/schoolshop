<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0044)http://www.bestln.com/user/info/address.html -->
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <meta name="Resource-Type" content="document"><meta name="Distribution" content="global"><meta name="Generator" content="bestln.com"><meta name="CopyRight" content="Copyright (c) 2010 bestln.com. All Rights Reserved."><meta name="rating" content="general"><link rel="shortcut icon" type="image/x-icon" href="http://www.bestln.com/favicon.ico"><script type="text/javascript">
/*<![CDATA[*/
BU = 'http://www.bestln.com/'; RESBU = 'http://res.bestln.com/bestln'; SBU = 'http://static.bestln.com/'
/*]]>*/
</script>  
<link rel="stylesheet" type="text/css" href="../../css/user/user.css">
<script type="text/javascript" src="../../js/user/User.js"></script>  
<script type="text/javascript" src="../../js/common/jquery.min.js"></script>
<script type="text/javascript" src="../../js/cart/Areas.js"></script>
<script type="text/javascript" src="../../js/cart/AreasFunction.js"></script>
<title>齐派送  乐农优选生鲜超市|济南果蔬|济南网上买菜|济南食品</title>
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
                    <span class="left">gege您好，欢迎来到乐农优选！
                        [<a href="http://www.bestln.com/">返回首页</a>]·
                                                    [<a href="http://www.bestln.com/user/order/index.html">我的订单</a>]·
                            [<a href="../../front/user/logout.htm">退出</a>]
                                                </span>
                    <span class="right">
                        <a href="javascript:;" onclick="addfavorite();">收藏农乐</a> 丨 
                        <a href="http://www.bestln.com/article/index/id/1.html">帮助中心</a> 丨 
                        <div style="position: absolute;margin-top:-28px;margin-left:-120px;*margin-top:-6px;*margin-left: -263px;">
                            <iframe width="122" style="float: left;" scrolling="no" height="40" frameborder="0" src="./收货地址_files/followbutton.html" border="0" marginheight="0" marginwidth="0" allowtransparency="true"></iframe>
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
                                    <div><img src="./收货地址_files/ln_US_01.jpg" width="80" height="80"></div>
                                    <div><a href="http://www.bestln.com/user/site/setpictrue.html">设置新头像</a></div>
                                </div>
                                <div class="righter"><a href="http://www.bestln.com/user/site/index.html">我的乐农</a></div>
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
                                        <li><a href="../../front/usercenter/getAllFavorite.htm">商品收藏</a></li>
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
        <p><b>我的地址</b></p>
    </div>
    <div class="two" style="height:auto;">
        <p>默认： / <br></p>
    </div>
    <div class="three old">
        <div class="hyzx02">
            <div class="udd1"> <span>小提示</span>
                <p>1、这里可以管理您的收货地址</p>
            </div>
            <div class="hyzx0201" style="margin-top:10px;">
                <div id="con">
                <c_rt:forEach items="${udis}" var="udi">
                                     <form action="" method="post" name="theForm" onsubmit="">
                        <table bgcolor="#dddddd" border="0" cellpadding="5" cellspacing="1" width="100%">
                            <input name="UserAddress[AddressId]" id="UserAddress_AddressId" type="hidden" value="71539" />                            <tbody>
                                <tr height="26">
                                    <td align="right" bgcolor="#ffffff">配送区域：</td>
                                    <td colspan="3" align="left" bgcolor="#ffffff">
                                        <select id="Country_71539" onchange="ChangeRegion($(this),1,'Province_bbbbbbbbbbbbbbbbbb')" name='UserAddress[Country]' onfocus="ChangeRegion($(this),0,'Country_Province_bbbbbbbbbbbbbbbbbb')">
                                            <option value='0'>请选择</option>
                                                                                        <option value="1"selected>中国</option>
                                                                                    </select>
                                        <select id="Province_71539" onchange="ChangeRegion($(this),2,'City_71539')" name='UserAddress[Province]'>
                                            <option value='0'>请选择</option>
                                                                                        <option value="2"selected>北京</option>
                                                                                        <option value="3">安徽</option>
                                                                                        <option value="4">福建</option>
                                                                                        <option value="5">甘肃</option>
                                                                                        <option value="6">广东</option>
                                                                                        <option value="7">广西</option>
                                                                                        <option value="8">贵州</option>
                                                                                        <option value="9">海南</option>
                                                                                        <option value="10">河北</option>
                                                                                        <option value="11">河南</option>
                                                                                        <option value="12">黑龙江</option>
                                                                                        <option value="13">湖北</option>
                                                                                        <option value="14">湖南</option>
                                                                                        <option value="15">吉林</option>
                                                                                        <option value="16">江苏</option>
                                                                                        <option value="17">江西</option>
                                                                                        <option value="18">辽宁</option>
                                                                                        <option value="19">内蒙古</option>
                                                                                        <option value="20">宁夏</option>
                                                                                        <option value="21">青海</option>
                                                                                        <option value="22">山东</option>
                                                                                        <option value="23">山西</option>
                                                                                        <option value="24">陕西</option>
                                                                                        <option value="25">上海</option>
                                                                                        <option value="26">四川</option>
                                                                                        <option value="27">天津</option>
                                                                                        <option value="28">西藏</option>
                                                                                        <option value="29">新疆</option>
                                                                                        <option value="30">云南</option>
                                                                                        <option value="31">浙江</option>
                                                                                        <option value="32">重庆</option>
                                                                                        <option value="33">香港</option>
                                                                                        <option value="34">澳门</option>
                                                                                        <option value="35">台湾</option>
                                                                                    </select>
                                        <select id="City_71539" onchange="ChangeRegion($(this),3,'Districts_71539')" name='UserAddress[City]'>
                                            <option value='0'>请选择</option>
                                                                                        <option value="52"selected>北京</option>
                                                                                    </select>
                                        <select  name='UserAddress[District]' id="Districts_71539">
                                            <option value="0">请选择</option>
                                                                                        <option value="500">东城区</option>
                                                                                        <option value="501">西城区</option>
                                                                                        <option value="502">海淀区</option>
                                                                                        <option value="503">朝阳区</option>
                                                                                        <option value="504">崇文区</option>
                                                                                        <option value="505">宣武区</option>
                                                                                        <option value="506">丰台区</option>
                                                                                        <option value="507"selected>石景山区</option>
                                                                                        <option value="508">房山区</option>
                                                                                        <option value="509">门头沟区</option>
                                                                                        <option value="510">通州区</option>
                                                                                        <option value="511">顺义区</option>
                                                                                        <option value="512">昌平区</option>
                                                                                        <option value="513">怀柔区</option>
                                                                                        <option value="514">平谷区</option>
                                                                                        <option value="515">大兴区</option>
                                                                                        <option value="516">密云县</option>
                                                                                        <option value="517">延庆县</option>
                                                                                    </select>
                                        (必填) 
                                    </td>
                                </tr>
                                <tr height="26">
                                    <td align="right" bgcolor="#ffffff">收货人姓名：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="consignee_71539" name="UserAddress[Consignee]" type="text" maxlength="150" value="aa" />                                        (必填) 
                                    </td>
                                    <td align="right" bgcolor="#ffffff">电子邮件地址：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="Email_71539" name="UserAddress[Email]" type="text" maxlength="255" value="2222222222@qq.com" />                                    </td>
                                </tr>
                                <tr height="26">
                                    <td align="right" bgcolor="#ffffff">详细地址：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="Address_71539" name="UserAddress[Address]" type="text" maxlength="255" value="bbbbbbbbbbbbbbbbbb" />                                        (必填)
                                    </td>
                                    <td align="right" bgcolor="#ffffff">邮政编码：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="ZipCode_71539" name="UserAddress[ZipCode]" type="text" maxlength="100" />                                    </td>
                                </tr>
                                <tr height="26">
                                    <td align="right" bgcolor="#ffffff">手机：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="Mobile_71539" name="UserAddress[Mobile]" type="text" maxlength="30" value="1344444444444" />                                        (必填)
                                    </td>
                                    <td align="right" bgcolor="#ffffff">电话：</td>
                                    <td align="left" bgcolor="#ffffff">
                                         <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="Tel_71539" name="UserAddress[Tel]" type="text" maxlength="100" value="" />                                    </td>
                                </tr>
                                <tr height="26">
                                    <td align="right" bgcolor="#ffffff">标志建筑：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="SignBuilding_71539" name="UserAddress[SignBuilding]" type="text" maxlength="255" value="" />                                    </td>
                                    <td align="right" bgcolor="#ffffff">最佳送货时间：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="BestTime_71539" name="UserAddress[BestTime]" type="text" maxlength="255" value="" />                                    </td>
                                </tr>
                                <tr height="26">
                                    <td align="right" bgcolor="#ffffff">&nbsp;</td>
                                    <td colspan="3" align="center" bgcolor="#ffffff">
                                        <label for="UserAddress_IsDefault_71539">设为默认地址</label>                                        <input id="ytUserAddress_IsDefault_71539" type="hidden" value="0" name="UserAddress[IsDefault]" /><input id="UserAddress_IsDefault_71539" name="UserAddress[IsDefault]" value="1" checked="checked" type="checkbox" />                                        <input name="submit" class="bnt_blue_1" value="确认修改" type="submit">
                                        <input name="button" class="bnt_blue" onclick="window.location.href='/user/address/delete/id/71539.html'"  value="删除" type="button" />
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </form>   
                    </c_rt:forEach> 
                                        <form action="" method="post" name="theForm" onsubmit="return CheckAddress($(this))">
                        <table bgcolor="#dddddd" border="0" cellpadding="5" cellspacing="1" width="100%">
                            <tbody>
                                <tr height="26">
                                    <td align="right" bgcolor="#ffffff">配送区域：</td>
                                    <td colspan="3" align="left" bgcolor="#ffffff">
                                        <select id="Country_0" onchange="ChangeRegion($(this),1,'Province_0','Province_0,City_0,Districts_0')" name="UserAddress[Country]" onfocus="ChangeRegion($(this),0,'Country_0')">
                                            <option value="0">请选择</option>
                                        </select>
                                        <select id="Province_0" onchange="ChangeRegion($(this),2,'City_0','City_0,Districts_0')" style="display:none" name="UserAddress[Province]">
                                            <option value="0">请选择</option>
                                        </select>
                                        <select id="City_0" onchange="ChangeRegion($(this),3,'Districts_0','')" style="display:none" name="UserAddress[City]">
                                            <option value="0">请选择</option>
                                        </select>
                                        <select name="UserAddress[District]" id="Districts_0" style="display:none">
                                            <option value="0">请选择</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr height="26">
                                    <td align="right" bgcolor="#ffffff">收货人姓名：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input id="consignee_0" style="border:1px solid #cccccc;height:20px;" class="inputBg" name="UserAddress[Consignee]" type="text" maxlength="150">                                        (必填)
                                    </td>
                                    <td align="right" bgcolor="#ffffff">电子邮件地址：</td>
                                    <td align="left" bgcolor="#ffffff">
                                         <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="email_0" name="UserAddress[Email]" type="text" maxlength="255">                                    </td>
                                </tr>
                                <tr height="26">
                                    <td align="right" bgcolor="#ffffff">详细地址：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="address_0" name="UserAddress[Address]" type="text" maxlength="255">                                        (必填)</td>
                                    <td align="right" bgcolor="#ffffff">邮政编码：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="zipcode_0" name="UserAddress[ZipCode]" type="text" maxlength="100">                                    </td>
                                </tr>
                                <tr height="26">
                                    <td align="right" bgcolor="#ffffff">手机：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="mobile_0" name="UserAddress[Mobile]" type="text" maxlength="30">                                        (必填)
                                    </td>
                                    <td align="right" bgcolor="#ffffff">电话：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="tel_0" name="UserAddress[Tel]" type="text" maxlength="100">                                    </td>
                                </tr>
                                <tr height="26">
                                    <td align="right" bgcolor="#ffffff">标志建筑：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="sign_building_0" name="UserAddress[SignBuilding]" type="text" maxlength="255">                                    </td>
                                    <td align="right" bgcolor="#ffffff">最佳送货时间：</td>
                                    <td align="left" bgcolor="#ffffff">
                                        <input class="inputBg" style="border:1px solid #cccccc;height:20px;" id="best_time_0" name="UserAddress[BestTime]" type="text" maxlength="255">                                    </td>
                                </tr>
                                <tr height="26">
                                    <td align="right" bgcolor="#ffffff">&nbsp;</td>
                                    <td colspan="3" align="center" bgcolor="#ffffff">
                                        <label for="UserAddress_IsDefault_0">设为默认地址</label>                                        <input id="ytUserAddress_IsDefault_0" type="hidden" value="0" name="UserAddress[IsDefault]"><input id="UserAddress_IsDefault_0" name="UserAddress[IsDefault]" value="1" type="checkbox">                                        <input name="submit" class="bnt_blue_2" style="background:none repeat scroll 0 0 #90c31f;height:26px;color:#F3F5F5;" value="新增收货地址" type="submit">
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </form>
                                    </div>
                <div class="clear"></div>
            </div>
        </div>
    </div>
    <!-- --> 
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
            <p>Copyright©2013  www.bestln.com 版权所有</p>
        </div>
    </div>
</div>        
</div>
</body>
</html>