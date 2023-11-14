<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>el태그</title>
	</head>
	<body>
		<%
			session.setAttribute("session_nicName", "길동스");
		%>
		<h1>form</h1>
		<form name="frm" method="get" action="jsp_result.jsp">
			<lable>아이디</lable>	
			<input type="text" name="id" id="id">
			<br>
			<lable>이름</lable>	
			<input type="text" name="name" id="name">
			<br>
			<lable>숫자1</lable>	
			<input type="text" name="num1">
			<br>
			<lable>숫자2</lable>	
			<input type="text" name="num2">
			<br>
			<lable>취미</lable>	
			<input type="checkbox" name="hobby" id="game" value="game">
			<lable for="game">게임</lable>
			<input type="checkbox" name="hobby" id="golf" value="golf">
			<lable for="golf">골프</lable>
			<input type="checkbox" name="hobby" id="run" value="run">
			<lable for="run">조깅</lable>
			<br>
			<input type="submit" value="전송">	
		</form>
		
	</body>
</html>