<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>药品管理页</title>
</head>
<body>
<h3>操作方法：</h3><br/>
<a href="${pageContext.request.contextPath}/medicine/add.do">添加药品</a>&nbsp; &nbsp; &nbsp; &nbsp;
<a href="${pageContext.request.contextPath}/medicine/delete.do">删除药品</a>&nbsp; &nbsp; &nbsp; &nbsp;
<a href="${pageContext.request.contextPath}/medicine/update.do">更新药品</a>&nbsp; &nbsp; &nbsp; &nbsp;
<a href="${pageContext.request.contextPath}/medicine/query.do">查询药品</a>
			
</body>
</html>