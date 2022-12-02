 m <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" import="java.util.*, sec01.ex01.MemberBean2"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:redirect url="/test03/member01.jsp">
	<!--<c:param name="id" value="ahn"	/>
	<c:param name="pwd" value="1111"	/>
	<c:param name="name" value="안형수"	/>
	<c:param name="email" value="ahn@test.com"	/>
	<c:param name="age" value="29"	/>
	<c:param name="height" value="173"	/>-->
	
	<c:set var="hong" value="hong, 1234, 홍길동, hong@test.com"	/>
	<c:forTokens var="token1" items="${hong}" delims=",">
	</c:forTokens>
	
	<c:set var="son" value="son, 1111, 손흥민, son@test.com"	/>
	<c:forTokens var="token2" items="${son}" delims=",">
	</forTokens>
	
	

</c:forTokens>
</c:redirect>
</body>
</html>