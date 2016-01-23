<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/admin/share/public.jsp"%>
<table>
二级选择分类:
<c_rt:forEach items="${productTypess}" var="productType">
<td><input type="radio" name="productType" id="psss_${productType.id}" value="${productType.id}" onchange="getChtypess('psss_+${productType.id}')">${productType.name }</td>
</c_rt:forEach>
</table>
 
 