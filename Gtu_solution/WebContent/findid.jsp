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
	color: #70AD47;
}

h5 {
	color: #70AD47;
}
</style>
</head>
<body>

	<div align="center">
		<img width=912 height="250" src="resources/img/aaa.PNG">
		<h5>아이디 찾기를 위해 이메일로 본인확인을 진행해주세요</h5>
		<h5>가입할 때 이메일 주소와 입력한 이메일 주소가 같아야, 인증번호를 받을 수 있습니다.</h5>
		<table border=0 width=0 height="20">
		</table>
		<form action="findid.do" method="post">
			<table border=0 width=500 height="100">
				<tr>
					<td>이름&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input id="name" name="name" class="form-control"
						type="text" value=""></td>
				</tr>
				<tr>
					<td>이메일 주소&nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input id="mail" name="mail" class="form-control"
						type="text" value=""></td>
					<td><input id="random" name="random" class="form-control"
					value="" readonly="readonly"></td>
					<td>&nbsp;&nbsp;&nbsp;</td>
					<td><a
				class="btn btn-default" href="${pageContext.request.contextPath}/mailsend">인증번호 받기</a></td>
				</tr>
				<tr>
					<td>인증 번호 &nbsp;&nbsp;&nbsp;&nbsp;</td>
					<td><input id="id" name="id" class="form-control" type="text"
						value="" placeholder="인증번호 6자리 입력"></td>
				</tr>
			</table>
			<table border=0 width=0 height="20">
			</table>
			<input class="btn btn-default" type="submit" value="다음">
		</form>
		<table border=0 width=0 height="100">
		</table>

		<br>
	</div>
</body>
</html>
