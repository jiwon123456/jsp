<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>로그인체크 - doLogin페이지</title>
	</head>
	<body>
		<c:if test="${result == 1}">
			<script>
				alert("로그인이 되었습니다.");
				location.href = "index.do";
			</script>
		</c:if>
		<c:if test="${result != 1}">
			<script>
				alert("아이디 또는 패스워드가 일치하지 않습니다. 다시 로그인해주세요.");
				location.href = "login.do";
			</script>
		</c:if>
	</body>
</html>