<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>loginPage</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/easyui/themes/icon.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js">
</script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/easyui/jquery.easyui.min.js">
</script>
<script type="text/javascript">
	function doSubmitForm(){
		 var form = document.getElementById('login_form');
		 form.submit();
	}
</script>	

</head>
<body>
登录界面!!<br>
默认管理员 root 123456<br>
测试1号 18814664479 123456<br>
	
<br>
 
	<div style="margin: 0px auto ;width:350px">
		<div id="login" class="easyui-panel" title="登录"     
		        style="width:350px;height:200px;padding:10px;background:#fafafa;"   
		        data-options="iconCls:'icon-save'"> 
		  <form id="login_form" action="${pageContext.request.contextPath }/test/login.do" method="POST">
		  	<table width="300px" align="center">
		   		<tr>
		   			<td colspan="2" style="text-align: center;font-size: 20px;font-weight:bold">ssr用户碎片平台</td>
		   		</tr>
		   		<tr>
		   			<td>用户名</td>
		   			<td><input id="userName" type="text" name="userName"/></td>
		   		</tr>
		   		<tr>
		   			<td>密&nbsp;&nbsp;码</td>
		   			<td><input id="passWord" type="password" name="passWord"/></td>
		   		</tr>
		   		<tr>
		   			<td colspan="2" align="right">
		   				<a id="submit"  class="easyui-linkbutton" data-options="iconCls:'icon-ok'" onclick='doSubmitForm()'>登录</a> 
		   			</td>
		   		</tr>
		   	</table>  
		  
		  </form>  
		   	
		</div>
	</div>
</body>
</html>