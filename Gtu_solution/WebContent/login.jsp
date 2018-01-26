<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>로그인</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<style type="text/css">
body {
	padding: 10% 10%;
}

body {
	background: #EEF7E9;
}
</style>
</head>
<body>
	<div align="center">
		<img width=900 height="300" src="resources/img/aaa.PNG"> <br>
		<form action="login.do" method="post">
			<table border=0 width=900 height="20">
				<tr>
					<table border=0 width=300 height=20%>
						<tr>

							<td><input id="loginId" name="loginId" class="form-control"
								type="text" value="" placeholder="이메일"></td>
						</tr>
					</table>
				</tr>
			</table>
			<table border=0 width=900 height="20">
				<tr>
					<table border=0 width=300 height=20%>
						<tr>
							<td><input id="password" name="password"
								class="form-control" type="password" value=""
								placeholder="비밀번호." style="ime-mode: disabled"></td>
						</tr>
					</table>
				</tr>
			</table>
			</form>
			<h3></h3>
			<input class="btn btn-success" type="submit" value="로그인">
			<h3></h3>
			<h3></h3>
			<a class="bar" href="">ID찾기</a> 
			<span class="bar">| 
			</span><a href="">PW찾기</a> 
			<span class="bar">|
			</span><a href="${pageContext.request.contextPath}/join.do">회원가입</a>
	</div>
	<br>
</body>
</html>
