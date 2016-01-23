<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/admin/share/public.jsp"%>

<div id="productTypes" style="border-color: blue;border-width: 10px;height: auto;width: auto;">
<table>
一级选择分类：
<c_rt:forEach items="${productTypes}" var="productType">
<c_rt:if test="${empty productType.parent }">
<td><input type="radio" name="productType" id="ps_${productType.id}" value="${productType.id}" onchange="getChtypes('ps_+${productType.id}')">${productType.name }</td>
</c_rt:if>
</c_rt:forEach>
</table>
</div>
<div id="productTypess" style="border-color: blue;border-width: 10px;height: auto;width: auto;"></div>
<div id="productTypesss" style="border-color: blue;border-width: 10px;height: auto;width: auto;"></div>
<div id="attrs" style="border-color: blue;border-width: 10px; width: auto;height: auto;"></div>
 