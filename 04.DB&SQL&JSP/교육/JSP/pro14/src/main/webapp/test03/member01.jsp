<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" import="java.util.*, sec01.ex01.MemberBean2"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    request.setCharacterEncoding("utf-8");
    List membersList = new ArrayList();
    membersList.add(token1);
    membersList.add(token2);
    %>
    <!--<c:set var="id" value="hong" scope="page"	/>
    <c:set var="pwd" value="1234" scope="page"	/>
    <c:set var="name" value="홍길동" scope="page"	/>
    <c:set var="age" value="22" scope="page"	/>
    <c:set var="height" value="177" scope="page"	/>
    <c:set var="email" value="hong@test.com" scope="page"	/>-->
    <c:set var="membersList" value="<%= membersList %>"	/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center" border=1>
		<tr align="center" bgcolor="lightgreen">
			<td width="7%"><b>아이디</b></td>
			<td width="7%"><b>비밀번호</b></td>
			<td width="7%"><b>이름</b></td>
			<td width="7%"><b>나이</b></td>
			<td width="7%"><b>키</b></td>
			<td width="7%"><b>이메일</b></td>
		</tr>
		<c:forEach var="i" begin="0" end="1" step="1">	
		<tr align="center">
			<td>${membersList[i]}</td>
			<td>${membersList[i]}</td>
			<td>${membersList[i]}</td>
			<td>${membersList[i]}</td>
			<td>${membersList[i]}</td>
			<td>${membersList[i]}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>