<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登陆页</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.12.4.min.js"></script>
<script type="text/javascript">

	// 登录提示方法
	function loginsubmit() {
		$("#loginform").submit();

	}
	
</script>
</head>
<body>
   <form id="loginform" name="loginform" action="${pageContext.request.contextPath}/login.do" method="post">
          <table width="10%" border="0" cellspacing="0" cellpadding="0">
              <tr>
                 <td>账号</td>
                 <td height="25"><input type="text" name="username"/>
              </tr>
              <tr>
                 <td>密码</td>
                 <td height="25"><input type="password" name="password"/>
              </tr>
              <tr>
                 <td height="25"><input type="button" onclick="loginsubmit()" value="登&nbsp;&nbsp;录"></td>
              </tr>
           </table>
   </form>
</body>
</html>