<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, sec01.ex01.*" isELIgnored="false"%>
    <%
    request.setCharacterEncoding("utf-8");
    %>
    <jsp:useBean id ="m1" class="sec01.ex01.MemberBean"	/>
    <jsp:setProperty name="m1" property="*"	/>
    <jsp:useBean id="membersList" class="java.util.ArrayList"/>
    <jsp:useBean id="membersMap" class="java.util.HashMap"/>
    <%
    membersMap.put("id", "park2");
    membersMap.put("pwd", "4321");
    membersMap.put("name", "박지성");
    membersMap.put("email", "park2@test.com");
    
    MemberBean m2 = new MemberBean("son", "1234", "손흥민", "son@test.com");
    membersList.add(m1);
    membersList.add(m2);
    membersMap.put("membersList", membersList);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border=1 align="center">
	<tr align="center" bgcolor="#99ccff">
		<td width="20%"><b>아이디</b></td>
		<td width="20%"><b>비밀번호</b></td>
		<td width="20%"><b>이름</b></td>
		<td width="20%"><b>이메일</b></td>
	</tr>
	<tr align="center">
		<td><b>${membersMap.id}</b></td>
		<td><b>${membersMap.pwd}</b></td>
		<td><b>${membersMap.name}</b></td>
		<td><b>${membersMap.email}</b></td>
	</tr>
	<tr align="center">
		<td><b>${membersMap.membersList[0].id}</b></td>
		<td><b>${membersMap.membersList[0].pwd}</b></td>
		<td><b>${membersMap.membersList[0].name}</b></td>
		<td><b>${membersMap.membersList[0].email}</b></td>
	</tr>
	<tr align="center">
		<td><b>${membersMap.membersList[1].id}</b></td>
		<td><b>${membersMap.membersList[1].pwd}</b></td>
		<td><b>${membersMap.membersList[1].name}</b></td>
		<td><b>${membersMap.membersList[1].email}</b></td>
	</tr>
</table>
</body>
</html>