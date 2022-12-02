<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,sec01.ex01.*"
    isELIgnored="false"%>
    <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
    <c:set var = "contextPath" value="${pageContext.request.contextPath}"/>
    <%
    request.setCharacterEncoding("utf-8");
    %>
<!DOCTYPE html>
<html>
<head>
<c:choose>
	<c:when test='${msg=="addMember" }'>
		<script>
		window.onload = function() {
			alert("회원을 등록했습니다.");
		}
		</script>
	</c:when>
	<c:when test='${msg=="modified" }'>
		<script>
		window.onload = function() {
			alert("회원 정보를 수정했습니다.");
		}
		</script>
	</c:when>
</c:choose>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
<style>
.cls1 {
font-size: 10px;
text-align: center;}
.cls2 {
font-size: 20px;
text-align: center;}
</style>
</head>
<body>
<table border="1" width="100%">
<tr bgcolor="lightgreen" align="center">
	<td>아이디</td>
	<td>비밀번호</td>
	<td>이름</td>
	<td>이메일</td>
	<td>가입일</td>
	<td>수정</td>
	<td>삭제</td>
</tr>
<c:choose>
<c:when test="${membersList==null}">
<tr>
	<td colspan=5>
	<b>등록된 회원이 없습니다.</b>
	</td>
</tr>
</c:when>
<c:when test="${membersList != null}">
<c:forEach var="mem" items="${membersList}">
<tr align="center">
	<td>${mem.id }</td>
	<td>${mem.pwd }</td>
	<td>${mem.name }</td>
	<td>${mem.email }</td>
	<td>${mem.joinDate }</td>
	<td><a href="${contextPath}/member2/modMemberForm.do?id=${mem.id}">수정</a></td>
	<td><a href="${contextPath}/member2/delMemberForm.do?id=${mem.id}">삭제</a></td>
</tr>
</c:forEach>
</c:when>
</c:choose>
</table>

<a href="${contextPath}/member2/memberForm.do"><p class="cls2">회원 가입하기</p></a>
</body>
</html>