<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/admin/share/public.jsp"%>
<c_rt:if test="${buycart.allProductAmount != 0}">
	<ul>
		<c_rt:forEach items="${buycart.buyItems}" var="item" varStatus="vs">
			<li><input type="hidden" value="1" name="MiNiTypeLock${vs.index}" id="MiNiTypeLock${vs.index}">
				<input type="hidden" value="1" name="MiNiTypeId${vs.index}" id="MiNiTypeId${vs.index}">
				<input type="hidden" name="MiNiTypeValue${vs.index}" id="MiNiTypeValue${vs.index}">
				<input type="hidden" value="${item.product.id}" name="MiNiTypeCartId${vs.index}"
				id="MiNiTypeCartId${vs.index}">
				<div class="mnb fl pr5 ml5">
					<div class="fl">
						<input class="number" id="MiNiamount${vs.index}" type="text"
							name="${item.product.id}"
							onblur="MiNicheckValue('MiNiamount${vs.index}', ${item.amount},1,${item.product.id},${item.productStyle.id})"
							value="${item.amount}">
					</div>
					<div class="fr">
						<div class="add"
							onclick="MiNiupValue('MiNiamount${vs.index}',${item.productStyle.id});">加</div>
						<div class="del"
							onclick="MiNidownValue('MiNiamount${vs.index}', 1,${item.productStyle.id});">减</div>
					</div>
				</div>
				<div class="img fl mr5">
					<img src="${item.product.coverUrl }"
						alt="${item.product.productName}" width="64" height="64">
				</div>
				<div class="txt fl pr5">
					<p>
						<a
							href="${pageContext.request.contextPath }/front/product/getProduct.htm?id=${item.product.id}">${item.product.productName}</a>
					</p>
					<strong>￥${item.product.sellPrice} /个 <span><font>ｘ</font>${item.amount}</span></strong>
				</div> <span class="dbar fl"> <a
					href="javascript:deleteCartItem(${item.product.id},${item.productStyle.id});"> <img
						src="../../image/images/ln_A_06.png" alt="去结算" width="12"
						height="12">
				</a>
			</span></li>
		</c_rt:forEach>
	</ul>
	<div class="topay">
		<p>
			共<font>${buycart.allProductAmount}</font>件商品(优惠品、团购等活动商品此处不显示) 合计：<strong>￥${totalSellPrice}</strong>
		</p>
		<a href="http://www.bestln.com/cart/index.html">去付款</a>
	</div>
</c_rt:if>