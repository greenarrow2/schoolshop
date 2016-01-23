<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/admin/share/public.jsp"%>
<div class="MsgContent">
<div class="GoodsThumb">
        <img src="${product.coverUrl}" alt="${product.productName}" width="60" height="60">
    </div>
    <p>${product.productName}</p>
    <p>x ${num}</p>
    <p><span class="Price">￥${num*product.sellPrice}</span></p>
</div>