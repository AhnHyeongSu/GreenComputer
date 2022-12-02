<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, sec01.ex01.*"%>
    <%
    request.setCharacterEncoding("utf-8");
    %>
    <jsp:useBean id="m" class="sec01.ex01.MemberBean" scope="page"/>
    <jsp:setProperty name="m" property="id" value='<%= request.getParameter("id") %>'/>
    <jsp:setProperty name="m" property="pwd" value='<%= request.getParameter("pwd") %>'/>
    <jsp:setProperty name="m" property="name" value='<%= request.getParameter("name") %>'/>
    <jsp:setProperty name="m" property="email" value='<%= request.getParameter("email") %>'/>
    
    <%
    /*
    String id = request.getParameter("id");
    String pwd = request.getParameter("pwd");
    String name = request.getParameter("name");
    String email = request.getParameter("email");
    
    m.setId(id);
    m.setPwd(pwd);
    m.setName(name);
    m.setEmail(email);
    */
    MemberDAO memberDAO = new MemberDAO();
    memberDAO.addMember(m);
    List membersList = memberDAO.listMembers();
    %>
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
		<td width="7%">가입일</td>
	</tr>
	<%
	if(membersList.size()==0) {
	%>
	<tr>
		<td colspan="5">
		<p align="center"><b><span style="font-size:9pt;">등록된 회원이 없습니다.</span></b></p>
		</td>
	</tr>
	<%
	}else{
		for(int i=0; i<membersList.size(); i++) {
			MemberBean bean = (MemberBean) membersList.get(i);
	%>
	<tr align="center">
		<td><%= bean.getId() %></td>
		<td><%= bean.getPwd() %></td>
		<td><%= bean.getName() %></td>
		<td><%= bean.getEmail() %></td>
		<td><%= bean.getJoinDate() %></td>
	</tr>
	<%
		}
	}
	%>
		
</table>
</body>
</html>