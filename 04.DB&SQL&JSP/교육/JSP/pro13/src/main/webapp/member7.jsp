<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, sec01.ex01.*"%>
    <%
    request.setCharacterEncoding("utf-8");
    %>
    <jsp:useBean id="m" class="sec01.ex01.MemberBean" scope="page"/>
    <jsp:setProperty name="m" property="*"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align="center" width="100%">
	<tr align="center" bgcolor="#99ccff">
		<td width="7%">아이디</td>
		<td width="7%">비밀번호</td>
		<td width="7%">이름</td>
		<td width="7%">이메일</td>
	</tr>
	<tr align="center">
	<td>
	<jsp:getProperty property="id" name="m"/>
	</td>
	<td>
	<jsp:getProperty property="pwd" name="m"/>
	</td>
	<td>
	<jsp:getProperty property="name" name="m"/>
	</td>
	<td>
	<jsp:getProperty property="email" name="m"/>
	</td>	
	</tr>	
</table>
</body>
</html>
