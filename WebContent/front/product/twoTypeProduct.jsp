<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/front/share/lib.jsp" %>
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
  						<li class="previous"><a href="javascript:page(${id},${(pg.currentPage-2)*pg.maxResult},20)">上一页</a></li>
  						</c_rt:if>
                       <c_rt:if test="${pg.currentPage==1}">
  						<li class="previous"><a href="javascript:page(${id},0,20)">上一页</a></li>
  						</c_rt:if>
  						<c_rt:forEach begin="${pg.pageIndex.startIndex}" end="${pg.pageIndex.endIndex}" var="wp">
  						<c_rt:if test="${pg.currentPage==wp}">
  						<li class="page selected"><a href="javascript:page(${id},${(wp-1)*pg.maxResult},20)">${wp}</a></li>
  						</c_rt:if>
  						<c_rt:if test="${pg.currentPage!=wp}">
  						<li class="page"><a href="javascript:page(${id},${(wp-1)*pg.maxResult},20)">${wp}</a></li>
  						</c_rt:if>
  						</c_rt:forEach>
  						<c_rt:if test="${pg.currentPage!=pg.totalPage}">
  						<li class="next"><a href="javascript:page(${id},${(pg.currentPage)*pg.maxResult},20)">下一页</a></li>
 						</c_rt:if>
  						<c_rt:if test="${pg.currentPage==pg.totalPage}">
  						<li class="next"><a href="javascript:page(${id},${(pg.currentPage-1)*pg.maxResult},20)">下一页</a></li>
 						</c_rt:if>
 						</ul>                
             </div>
             </c_rt:if>
            </div>