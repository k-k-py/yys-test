<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
     <script type="text/javascript">
       	var isCommitted = false;//表单是否已经提交标识，默认为false
        function dosubmit(){
       		
            if(isCommitted==false){
                 isCommitted = true;//提交表单后，将表单是否已经提交标识设置为true
                 return true;//返回true让表单正常提交
             }else{
                return false;//返回false那么表单将不提交
            }
         }     
      </script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>阴阳师阴阳寮碎片平台系统用户注册</title>
</head>
<body>
注册界面
	<form action="${pageContext.request.contextPath}/test/register.do"  onsubmit="return dosubmit()" method="post">
		用户名:<input type="text" name="userName"/><br>
		密码:<input type="text" name="passWord"/><br>
		<input type="submit" value="注册" id="submit">
	</form>
</body>
</html>