<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/admin/share/public.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<%@ include file="/WEB-INF/admin/share/jspublic.jsp"%>
<script type="text/javascript"
	src="../../resources/product/addProduct.js"></script>
<script type="text/javascript">
	Ext.onReady(function() { 
		Ext.create('Ext.panel.Panel', {
			renderTo : Ext.getBody(),
			items : [type]
		});
		//得到一级分类
		$.post('../../admin/producttype/getProductTypes.htm',{},function (result){
			   $('#productAttr').html(result);
			},'html');
	});
	
	//得到二级分类
	function getChtypes(id){
		var typeValue =  $('input:radio:checked').val();
		$.post('../../admin/producttype/getProductTypess.htm',{id:typeValue,type:2},function (result){
			$('#productTypess').html(result);
		},'html');
	}
	//得到三级分类
	function getChtypess(id){
		var typeValue =  $('input:radio:checked').val();
		$.post('../../admin/producttype/getProductTypess.htm',{id:typeValue,type:3},function (result){
			$('#productTypesss').html(result);
		},'html');
	}
	//根据分类得到分类中的参数
	function getAttrs(id){
		var typeValue =  $('input:radio:checked').val();
		$.post('../../admin/attribute/attributesByType.htm',{start:0,limit:30,typeId:typeValue},function (result){
			$('#attrs').html(result);
		},'html');
	}
	function subTypeAttr(){
		if(!productId){
			alert("请先保存商品信息！");
		}else{
		$.ajax({ cache: true, 
			     type: "POST", 
                 url:"../../admin/product/addTypeAttrs.htm?productId="+productId,  
                 data:$('#typeAttrs').serialize(),// 你的formid     
                 async: false,     
                 error: function(request) {     
                	 alert("Connection error");    
                	 },           
                 success: function(data) {         
                              alert(data.obj);          
                 }         
                 }
		);
		}
	}
	 
</script>
</head>
<body>

</body>
</html>
