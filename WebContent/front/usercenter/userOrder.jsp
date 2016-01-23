<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<!-- saved from url=(0043)http://www.bestln.com/user/order/index.html -->
<html xmlns="http://www.w3.org/1999/xhtml"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <meta name="Resource-Type" content="document"><meta name="Distribution" content="global"><meta name="Generator" content="bestln.com"><meta name="CopyRight" content="Copyright (c) 2010 bestln.com. All Rights Reserved."><meta name="rating" content="general"><link rel="shortcut icon" type="image/x-icon" href="http://www.bestln.com/favicon.ico"><script type="text/javascript">
/*<![CDATA[*/
BU = 'http://www.bestln.com/'; RESBU = 'http://res.bestln.com/bestln'; SBU = 'http://static.bestln.com/'
/*]]>*/
</script>        <link rel="stylesheet" type="text/css" href="./我的订单_files/pager.css">
<link rel="stylesheet" type="text/css" href="../../css/user/user.css">
<script type="text/javascript" src="../../js/common/jquery.min.js"></script>
<script type="text/javascript" src="../../js/user/User.js"></script>
<title>齐派送 我的订单 乐农优选生鲜超市|济南果蔬|济南网上买菜|济南食品</title>
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
                                                    [<a href="../../front/usercenter/getAllOrder.htm">我的订单</a>]·
                            [<a href="../../front/user/logout.htm">退出</a>]
                                                </span>
                    <span class="right">
                        <a href="javascript:;" onclick="addfavorite();">收藏农乐</a> 丨 
                        <a href="http://www.bestln.com/article/index/id/1.html">帮助中心</a> 丨 
                        <div style="position: absolute;margin-top:-28px;margin-left:-120px;*margin-top:-6px;*margin-left: -263px;">
                            <iframe width="122" style="float: left;" scrolling="no" height="40" frameborder="0" src="./我的订单_files/followbutton.html" border="0" marginheight="0" marginwidth="0" allowtransparency="true"></iframe>
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
                                    <div><img src="./我的订单_files/ln_US_01.jpg" width="80" height="80"></div>
                                    <div><a href="http://www.bestln.com/user/site/setpictrue.html">设置新头像</a></div>
                                </div>
                                <div class="righter"><a href="http://www.bestln.com/user/site/index.html">我的乐农</a></div>
                                <div class="Max">
                                    <p>用户：<font class="hot">${user.userName}</font></p>
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
                                        <li><a href="../../front/usercenter/getAllOrder.htm">我的订单</a></li>
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
        <p><b>我的订单</b></p>
    </div>
    <div class="three">
        <div class="Tittleer">
            <div class="lefter">
                <p class="ler">
                    <select onchange="SelectOrder()" name="Type" id="Type">
<option value="All">订单状态</option>
<option value="Unpay">待付款订单</option>
<option value="Unpack">待收货订单</option>
<option value="UnComment">待评价订单</option>
<option value="Complete">已完成订单</option>
</select>                </p>
                <p class="rir"></p>
            </div>
        </div>
        <div class="Coneer">
            <div class="bpper">
                <table class="orders_1" width="100%" align="center" border="0" cellspacing="0" cellpadding="0">
                    <tbody>
                        <tr>
                            <th align="center" width="300">购买商品</th>
                            <th align="center" width="50">价格</th>
                            <th align="center" width="50">数量</th>
                            <th align="right" width="100">订单金额</th>
                            <th align="right" width="100">
                                <select onchange="SelectOrder()" name="Time" id="Time">
<option value="All">全部订单</option>
<option value="Today">今天</option>
<option value="Week">一周内</option>
<option value="Month">一个月内</option>
<option value="Quarterly">三个月内</option>
<option value="Half">半年内</option>
<option value="Year">一年内</option>
</select>               
                            </th>
                            <th aligen="left">订单操作</th>
                        </tr>
                    </tbody>
                </table>
                 <table class="orders"  width="100%" align="center" border="0" cellspacing="0" cellpadding="0">
                    <tbody>
                    <c_rt:forEach items="${pg.records}" var="order">
                        <tr>
                            <th align="left" colspan="4">订单号：${order.orderId} ${order.createTime}支付方式：支付宝</th>
                        </tr>
                        <tr>
                            <td align="center" valign="middle" width="450">
                                <ul>
                                 <c_rt:forEach items="${order.items}" var="item">
                                                                        <li>
                                        <div class="goods">
                                            <div class="order_img">
                                                <a target='_blank' href="../../front/product/getProdcut.htm?id=${item.productId}">
                                                    <img src="http://static.bestln.com/GoodsThumb/2013/12/24/20131224164729_52b94a21a8615.jpg" alt="${item.productName}"/>
                                                </a>
                                            </div>
                                            <div class="order_title"><a target='_blank'  href="../../front/product/getProduct.htm?id=${item.productId}">${item.productName}----${item.styleName}</a></div>
                                        </div>
                                        <div class="order_price">￥${item.productPrice}</div>
                                        <div class="order_count">${item.amount}</div>
                                    </li>
                                    </c_rt:forEach>
                                                                    </ul>

                            </td>
                            <td height="60" valign="top">
                                <div class="order_money">￥${order.payablefee}</div>
                            </td>
                            <td align="center" valign="top" width="100">
                                <div class="order_time"><c_rt:choose>
                                <c_rt:when test="${order.state=='WAITDELIVER'}">待发货</c_rt:when>
                                <c_rt:when test="${order.state=='CANCEL'}">取消</c_rt:when>
                                </c_rt:choose> </div>                   
                            </td>
                            <td align="center" valign="top" width="100">
                                <div class="order_cz">
                                <c_rt:if test="${order.state!='CANCEL'}"><a href='../../front/usercenter/cancleOrder.htm?id=${order.id}'>取消</a></c_rt:if>
                                <c_rt:if test="${order.state=='CANCEL'}"><a href='../../front/usercenter/reDoOrder.htm?id=${order.id}'>重新提交</a></c_rt:if>   
                                      <c_rt:if test="${order.paymentstate}">已付款</c_rt:if><c_rt:if test="${not order.paymentstate}"><a href='/user/order/pay/OrderSn/20141124019314.html'>付款</a></c_rt:if>
                                      <br />
                                    <a href="/user/order/view/OrderSn/20141124019314.html">查看详情</a>
                                </div>                
                            </td>
                        </tr>
                        </c_rt:forEach>
                    </tbody>
                </table>         
                                <div class="ggPage" id="pager">
                                <div class="ui-page-wrap">
								<b class="ui-page-num"> <b class="ui-page-prev">共
										${pg.totalRecord}个项目</b>
										<c_rt:if test="${pg.currentPage==1}">
										 <b class="ui-page-prev"
									style="border-left: 0 !important;">&lt;&lt;上一页</b>
									</c_rt:if>
									<c_rt:if test="${pg.currentPage!=1}">
									<a class="ui-page-next"
									href="../../front/usercenter/getAllOrder.htm?currentPage=${pg.currentPage - 1}">&lt;&lt;上一页 </a>
									</c_rt:if>
								 <c_rt:forEach  begin="${pg.pageIndex.startIndex}"
										end="${pg.pageIndex.endIndex}" var="wp">
										<c_rt:if test="${pg.currentPage==wp}">
											<a class="page_hover"
												href="">${wp}</a>
										</c_rt:if>
										<c_rt:if test="${pg.currentPage!=wp}">
											<a class="page_link"
												href="../../front/usercenter/getAllOrder.htm?currentPage=${wp}">${wp}</a>
										</c_rt:if>
									</c_rt:forEach> 
									<c_rt:if test="${pg.currentPage!=pg.totalPage}">
									<a class="ui-page-next"
									href="../../front/usercenter/getAllOrder.htm?currentPage=${pg.currentPage + 1}">下一页&gt;&gt;</a>
									</c_rt:if>
									<c_rt:if test="${pg.currentPage==pg.totalPage}">
										 <b class="ui-page-prev"
									style="border-left: 0 !important;">下一页>></b>
									</c_rt:if>
									<a class="page-break">${pg.currentPage}/
										${pg.totalPage}</a> </b>
							</div> 
                                    </div>
            </div>
        </div>
    </div>
</div>
<script>
function SelectOrder(){
    var Type = $("#Type").val();
    //var Time = $("#Time").val();
    window.location.href = "../../front/usercenter/getAllOrder.htm?orderType="+Type;
}
</script>                    </div>
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