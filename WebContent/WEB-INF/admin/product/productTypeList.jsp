<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/admin/share/public.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品分类管理</title>
<%@ include file="/WEB-INF/admin/share/jspublic.jsp"%>
<script type="text/javascript" src="../../resources/product/productType.js"></script>
<script type="text/javascript">
Ext.onReady(function() {
    Ext.create('Ext.panel.Panel', {
   		renderTo: Ext.getBody(),
        items: [productTypeGrid]
    })});
</script>
</head>
<body>
</body>
</html>