<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/admin/share/public.jsp"%>
<div id="productGenres" style="border-color: blue;border-width: 10px;height: auto;width: auto;">
<table>
<c:forEach items="${productGenres}" var="productGenre">
<td><input type="radio" name="productGenre" id="ps_${productGenre.id}" value="${productGenre.id}" onchange="getAttrs('ps_+${productGenre.id}')">${productGenre.genreName }</td>
</c:forEach>
</table>
</div>
<div id="attrs" style="border-color: blue;border-width: 10px; width: auto;height: auto;"></div>
 