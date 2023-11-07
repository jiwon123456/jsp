<%@page import="javax.print.attribute.HashPrintRequestAttributeSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인확인</title>
	</head>
	<body>
		<%
			String id = request.getParameter("id");
			String pw = request.getParameter("pw");
			if(id.equals("admin") && pw.equals("1111")){ //성공할때
				session.setAttribute("session_id", id);
				session.setAttribute("session_nicName", "유신스");
		%>		
			<script>alert("로그인 하셨습니다!"); 
			location.href="../layout/main.jsp";</script>
		//실패할 경우
		<%}else{%> 
			<script>alert("아이디 또는 패스워드가 일치하지 않습니다. 다시 로그인하세요.");
			location.href="login.jsp"; </script>
		
		<%}%>
		
	</body>
</html>