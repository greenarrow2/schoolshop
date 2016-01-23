<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
	<form id="typeAttrs" method="post">
		<table align="center">
			<c:forEach items="${attributes}" var="attribute" varStatus="vs">
				<tr>
					<td><input type="hidden" name="attributeName" value="${attribute.attributeName}">${attribute.attributeName}:</td>
					<td><input type="text" name="attributeValue"></td>
				</tr>
			</c:forEach>
			<tr><input type="hidden" name="typeId" value="${typeId}"></tr>
			<tr><td><input type="button" onclick="subTypeAttr()" value="提交"></td>
             <td><input type="reset" value="清空"></td></tr>
		</table>
		
	</form>
 