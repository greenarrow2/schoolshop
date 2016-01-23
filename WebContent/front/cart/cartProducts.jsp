<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/admin/share/public.jsp"%>
<c_rt:if test="${not empty buycart.buyItems}">
 <div class="son">
                    <ul>
                        <li class="hui">
                            <div class="l1">商品名称</div>
                            <div class="l2">样式</div>
                            <!--<div class="l3">库存状态</div>-->
                            <div class="l4">单价</div>
                            <div class="l5">数量</div>
                            <div class="l6">规格</div>
                            <div class="l7">小计</div>
                            <div class="l8">属性</div>
                            <div class="l9">操作</div>
                            
                        </li>
                         <c_rt:forEach items="${buycart.buyItems}" var="item" varStatus="vs">                   
                            <li>
                                <div class="l1">
                                    <div class="left">
                                        <img src="${item.product.coverUrl}"  width="56" height="56">
                                    </div>
                                    <span class="left"><a href="http://www.bestln.com/goods/view/id/82.html">${item.product.productName}</a></span>
                                </div>
                                <div class="l2"><span>${item.product.styleId}</span></div>
                                <div class="l4">
                                    <span id="price1">
                                                                          ￥${item.product.sellPrice}</span>
                                    <input type="hidden" value="8.28" name="sprice1" id="sprice1">                                </div>
                                                                    <div class="l5">
                                        <div>
                                            <a class="sub" href="javascript:;" onclick="downValue('amount${vs.index}',${item.product.id},${item.product.styleId});">减</a>
                                            <input class="text" id="amount${vs.index}" type="text" name="20430" value="${item.amount}" onblur="checkValue('amount1','9999', 1)">
                                            <a class="add" href="javascript:;" onclick="upValue('amount${vs.index}',${item.product.id},${item.product.styleId});">加</a>
                                        </div>
                                    </div>
                                                                <div class="l6"><span>400g</span></div>
                                <div class="l7"><span id="total${vs.index}">￥${item.product.sellPrice*item.amount}</span></div>
                                <div class="l8">
                                    <div>
                                        正价                                    </div>
                                </div>
                                <div class="l9"><span><a href="javascript:deleteItem(${item.product.id},${item.productStyle.id})">删除</a></span></div>
                            </li>
                            </c_rt:forEach>
                                                </ul>
                    <div class="tips">
                        <div class="left"><a href="http://www.bestln.com/">继续购物</a></div>
                        <div class="right">
                            <p class="left">您共选择<span id="CartNum">${buycart.allProductAmount}</span>件商品，
                                <strong>共计<span class="red" id="totalPrice">￥${totalSellPrice}</span></strong>
                                                            </p>
                            <p class="right"><c_rt:if test="${empty user}"><a href="../../front/user/login.jsp">立即去结算</a></c_rt:if><c_rt:if test="${not empty user}"><a href="../../front/cartmanage/createOrder.htm">立即去结算</a></c_rt:if></p></div>
                    </div>
                </div>
                <div class="barer"></div>
                <div id="CartFavList">
                   </div>
</c_rt:if>