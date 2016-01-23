<%-- <%@page import="com.fis.cmp.entity.UserPhoto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	List<UserPhoto> photos = (List<UserPhoto>)request.getAttribute("photos");
	for(UserPhoto p:photos){
		
%>
	<img style="width:150px;height:150px" src="<%=p.getUrl()%>" /><img src="../images/delete.png" onclick="deletePhoto('<%=p.getSkyId() %>','<%=p.getUrl() %>',this)" />&nbsp;&nbsp;
<%}%>  --%>