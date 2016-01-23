<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/admin/share/public.jsp"%>
<c_rt:if test="${not empty order}">
<div id="orderDetail">
用户：${order.user.userName}  &nbsp;&nbsp;&nbsp;
订单ID：${order.id}  &nbsp;&nbsp;&nbsp;
订单号：${order.orderId}   &nbsp;&nbsp;&nbsp;
<br/>
创建时间：${order.createTime}   &nbsp;&nbsp;&nbsp;
修改时间：${order.updateTime}   &nbsp;&nbsp;&nbsp;
订单状态：<c_rt:choose>
   <c_rt:when test="${order.state=='CANCEL'}">订单取消</c_rt:when>
   <c_rt:when test="${order.state=='WAITDELIVER'}">等待发货</c_rt:when>
   <c_rt:when test="${order.state=='DELIVERED'}">已发货</c_rt:when>
   <c_rt:when test="${order.state=='RECEIVED'}">已收货</c_rt:when>
</c_rt:choose>
&nbsp;&nbsp;&nbsp;<br/>
支付状态：<c_rt:choose>
   <c_rt:when test="${order.paymentstate}"><font color="blue">已支付</font></c_rt:when>
   <c_rt:otherwise><font color="red">未支付</font></c_rt:otherwise>
</c_rt:choose>&nbsp;&nbsp;&nbsp;
支付方式：<c_rt:choose>
 <c_rt:when test="${order.paymentWay=='NET'}">网上支付</c_rt:when>
   <c_rt:when test="${order.state=='COD'}">货到付款</c_rt:when>
</c_rt:choose>&nbsp;&nbsp;&nbsp;<br/>
<h4>商品总价:${order.productTotalPrice}&nbsp;&nbsp;&nbsp;
订单总价: ${order.totalPrice} &nbsp;&nbsp;&nbsp;
配送费: ${order.deliverFee}</h4>&nbsp;&nbsp;&nbsp;
<hr>
<h4>收货人:${order.orderDeliverInfo.recipients}&nbsp;&nbsp;&nbsp;手机号：${order.orderDeliverInfo.mobile}&nbsp;&nbsp;&nbsp;收货地址：${order.orderDeliverInfo.address}</h4>
<hr>
订单处理：
<center><h1>
<c_rt:if test="${order.over}"><font color="yellow">已完成</font></c_rt:if>
<c_rt:if test="${not order.over}"><font color="red">未完成</font></c_rt:if>
</h1></center>
<hr>
<table style="border:1px solid black;border-color: blue;">
<tr bgcolor="red" style="border: 1px thick;">
<td style="border: 1px thick;">处理</td>
<td width="100" >订单项id</td>
<td width="100">商品id</td>
<td width="100">商品名称</td>
<td width="100">商品价格</td>
<td width="100">商品数量</td>
<td width="100">商品样式id</td>
<td width="100">商品样式名称</td>
<td width="100">商品处理情况</td>
</tr>
<c_rt:forEach items="${order.items}" var="item">
<tr align="center">
<td><input type="checkbox" <c_rt:if test="${item.done}">checked</c_rt:if>/></td>
<td width="100">${item.id}</td>
<td width="100">${item.productId}</td>
<td width="100">${item.productName}</td>
<td width="100">${item.productPrice}</td>
<td width="100">${item.amount}</td>
<td width="100">${item.styleId}</td>
<td width="100">${item.styleName}</td>
<td width="100"><c_rt:choose>
<c_rt:when test="${item.done}">已处理</c_rt:when>
<c_rt:when test="${not item.done}">未处理</c_rt:when>
</c_rt:choose></td>
</tr>
</c_rt:forEach>
</table>
</div>
</c_rt:if>
