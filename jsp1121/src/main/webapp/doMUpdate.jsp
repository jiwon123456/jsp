<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>회원정보수정 - doMupdate페이지</title>
	</head>
	<body>
		<c:if test="${result == 1}">
			<script>
				alert("회원정보가 수정되었습니다.");
				location.href = "index.do";
			</script>
		</c:if>
		<c:if test="${result != 1}">
			<script>
				alert("회원정보가 수정되지 않았습니다. 다시 수정해주세요.");
				location.href = "mUpdate.do";
			</script>
		</c:if>
	</body>
</html>