<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>
<body>

<h2>欢迎${loginUser.username} 登陆成功！！！</h2> &nbsp;&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/logout.do">登出</a>
<hr/>
<h3>菜单：</h3>

<div>
    <c:if test="${loginUser.menus!=null }">
		<c:forEach items="${loginUser.menus }" var="menu">
			<li>
			  <a href="${pageContext.request.contextPath}${menu.url }">${menu.name }</a><br/>
			</li>
		</c:forEach>
	</c:if>
</div>
</body>
</html>