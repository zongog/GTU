<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<style type="text/css">
body {
	padding : 10% 10%;
}

body {
	background: #EEF7E9;
}
</style>
</head>
<body>


	<h3>회원가입</h3>
	<br>
	<form name= "form"action="join.do" method="post" >
		<table class="table">
			<tr>
				<th>Email</th>
				<td><input id="loginId"  name="loginId" class="form-control" type="text" value="" placeholder="ID를 입력해주세요."> 
				</td>
				<td><input class="btn btn-success" type="submit" value="중복확인"></td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input id="password" name="password" class="form-control" type="password" value="" placeholder="비밀번호를 입력해주세요."></td>
			</tr>
						<tr>
				<th>Password 확인</th>
				<td><input id="password" name="password" class="form-control" type="password" value="" placeholder="비밀번호 확인"></td>
			</tr>
			<tr>
				<th>Name</th>
				<td><input id="name" name="name" class="form-control" type="text" value="" placeholder="이름을 입력해주세요."></td>
			</tr>
						<tr>
				<th>역활</th>
				<td><select id="name" name="name" class="form-control" type="text">
								<option value ='"CPA"' selected>CPA
								<option value ='"EA"' selected>EA
								<option value ='"Veteran"' selected>Veteran</option>
								</td>

			</tr>
						<tr>
				<th>첨부파일</th>
				<td>
  <SCRIPT LANGUAGE="JavaScript">
   function fileCheck(obj) {
     document.getElementById('update_image_view').innerHTML = "<img src='" + obj + "'>";
   }
  </SCRIPT>  <input type="file" name="file" onchange="fileCheck(this.value);">
  <table width="80" height="80">
 <tr>
  <td align="center" id='update_image_view'>
   미리보기
  </td>
 </tr>
</table> 

				</td>
			</tr>
		</table><br>
		<div align="center"> <input class="btn btn-success" type="submit" value="가입">			<a class="btn btn-default"
				href="${pageContext.request.contextPath}/">취소</a></div>
	</form>
	<br>
</body>
</html>
