<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	欢迎${sessionScope.user.user_account }登录 
	<br />
	<table>
		<tr>
			<th>用户名</th>
			<th>邮箱</th>
			<th>活跃度</th>
		</tr>
		<c:forEach items="${requestScope.users }" var="user">
		<tr>
			<td>${user.user_account }</td>
			<td>${user.user_email }</td>
			<td>${user.user_alive }</td>
		</tr>
		</c:forEach>
	
	
	</table>

</body>
</html>