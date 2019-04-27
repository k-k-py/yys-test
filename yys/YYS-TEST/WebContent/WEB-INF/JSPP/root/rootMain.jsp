<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>root main page</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js">
</script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js">
</script>
</head>
<body>
	<a href="${pageContext.request.contextPath }/test/logout.do">退出登录</a><br>
	root用户(管理员)<br>
	root账户功能:增/删/查 式神 
				增/删/查 阴阳寮
				<br>
	获取所有式神<br>
	<a href="${pageContext.request.contextPath }/main/root/getAllHellspawn.do">获取所有式神</a><br>
	获取所有阴阳寮<br>
	<a href="${pageContext.request.contextPath }/main/root/getAllSociety.do">获取所有阴阳寮</a><br>
	
	添加一个式神<br>
	<form action="${pageContext.request.contextPath }/main/root/addHellspawn.do" method="POST">
		式神名:<input type="text" name="hellspawnName"/><br>
		类型:<input type="text" name="type"/><br>
		<input type="submit" value="提交"><br>
	</form>
	删除一个式神<br>
	<form action="${pageContext.request.contextPath }/main/root/delHellspawn.do" method="POST">
		式神名:<input type="text" name="hellspawnName"/><br>
		<input type="submit" value="提交"><br>
	</form>
	添加一个阴阳寮<br>
	<form action="${pageContext.request.contextPath }/main/root/addSociety.do" method="POST">
		阴阳寮名:<input type="text" name="societyName"/><br>
		<input type="submit" value="提交"><br>
	</form>
	删除一个阴阳寮<br>
	<form action="${pageContext.request.contextPath }/main/root/delSociety.do" method="POST">
		阴阳寮名:<input type="text" name="societyName"/><br>
		<input type="submit" value="提交"><br>
	</form>
	
	
</body>
</html>