<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script>
			$(function(){
				$("#fbtn").click(function(){
					//alert($("#id").val());
					alert("로그인을 진행합니다.");
					login_Frm.submit();
					
				});//click	
				
			});//jquery
		
		</script>
		<style>
			*{margin:0; padding:0;}
			div{width:400px; margin:30px auto; text-align: center;}
			h1{margin-bottom:30px;}
			table,th,td{border:2px solid yellowgreen; border-collapse:collapse;
			font-size: 16px;}
			th,td{width:200px; height:40px;}
			button{width:150px; height:40px; margin-top:30px;}
		</style>
	</head>
	<body>
		<div>
			<h1>로그인</h1>
			<form name="login_Frm" method="post" action="doLogin.do">
				<table>
					<tr>
						<th>아이디</th>
						<td><input type="text" name="id" id="id"></td>
					</tr>
					<tr>
						<th>패스워드</th>
						<td><input type="password" name="pw" id="pw"></td>
					</tr>
				</table>
					<button type="button" id="fbtn">로그인</button>
					<a href="index.do"><button type="button">홈으로</button></a>
			</form>
		</div>
	
	</body>
</html>