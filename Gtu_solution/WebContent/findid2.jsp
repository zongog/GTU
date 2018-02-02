<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>아이디 찾기</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<style type="text/css">
body {
	background: #EEF7E9;
}

body {
	padding: 5% 5%;
}

h1 {
	font-weight: bold;
	color: #999999;
}

h2 {
	width: 3;
	color: #A0B0DB;
}
</style>
</head>
<body>

	<div align="center">
		<br>
			<span><img width=400 height="160"
		src="resources/images/VICS.png"></span>
		<h1>아이디 찾기</h1>

		<form action="login.do" method="post">
			<table border=0 width=900 height="20">
				<tr>
					<table border=0 width=300 height=20%>
						<tr>
							<td><input id="pw" name="pw" class="form-control"
								type="password" value="" placeholder="이름을 입력해주세요"
								style="ime-mode: disabled"></td>
						</tr>

					</table>
				</tr>
			</table>
			<table border=0 width=900 height="20">
				<tr>
					<table border=0 width=300 height=20%>
						<tr>

							<td><input id="id" name="id" class="form-control"
								type="text" value="" placeholder="가입하실 때 사용하신 이메일을 입력해주세요"></td>
						</tr>
					</table>
				</tr>
			</table>

			</tr>
			</table>
			<h3></h3>
			<input class="btn btn-success" type="submit" value="로그인">
		</form>
			<table border=0 width=0 height="100">
			</table>
				<h2>아이디 찾기를 위해 이메일로 본인확인을 진행해주세요</h2>
		<h3></h3>
		<h3></h3>
	</div>
	<br>
</body>
</html>
