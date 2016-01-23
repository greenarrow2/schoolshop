<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt" %>
<%@ taglib uri="http://www.opensymphony.com/oscache" prefix="oscache" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0057)http://www.javamall.com.cn/b2b2c/admin/backendUi!login.do -->
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>示例商城</title>

<link rel="shortcut icon" href="http://www.javamall.com.cn/b2b2c/favicon.ico">

<link type="image/x-icon" href="http://www.javamall.com.cn:8080/b2b2c/statics/images/favicon.ico" rel="bookmark">
<script type="text/javascript" src="js/common/jquery.min.js"></script>
<script type="text/javascript" src="js/common/jquery-form-2.33.js"></script>
<script type="text/javascript" src="resources/login//login.js"></script>
<script type="text/javascript" src="jslib/laypage/laypage.js"></script>
<link rel="stylesheet" type="text/css" href="css/login/login.css">
</head>
<body>
xxxxxxxxxxxxxxxxx
  <div id="page1"></div>
  <div id="view1">
  
  </div>
</body>
<script type="text/javascript">
$.getJSON('admin/admin/adminList.htm', {currentPage: 1}, function(res){ //从第6页开始请求。返回的json格式可以任意定义
	alert(1);
    laypage({
        cont: 'page1', //容器。值支持id名、原生dom对象，jquery对象。【如该容器为】：<div id="page1"></div>
        pages: res.totalPage, //通过后台拿到的总页数
        curr: res.currentPage, //初始化当前页
        jump: function(e){ //触发分页后的回调
        	console.log(e);
            $.getJSON('admin/admin/adminList.htm', {currentPage: e.curr}, function(res){
                e.pages = e.last = res.totalPage; //重新获取总页数，一般不用写
                //渲染
                 var objs = new Array();
                     objs = res.records;
                     console.log(objs);
                     $('#view1').empty();
                     for (var i = 0; i < objs.length; i++)   {
                    	 console.log(objs[i]);
						var html = '<tr><td>'+objs[i].email+'</td></tr>'
						$('#view1').append(html);
					}
                     
            });
        }
    });
});
</script>
</html>