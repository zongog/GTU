<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="utf-8">
<%@ include file="/views/layout/common.jsp"%>
<link href="resources/css/bootstrap_modify.css" rel="stylesheet" type="text/css" />
<title>소셜보드</title>
<style type="text/css">
.col-lg-12{ margin:0; padding:0;}
.containers{ margin:0; width:100%;}


#nav { float: center; list-style: none; margin:0; padding:0; height: 100px; width:100%; background: #C5E0B4;  }
#nav li { float: left; margin: 25px 0px 0px 5px; }
#nav li a { color: #FFFFFF; display: block; font-size: 35px; padding: 5px 15px; }
#nav li a:hover, #nav li.active a { background: green; color: #ffffff; text-decoration: none; }




nav li {
    position: relative;
    border-bottom: 1px solid #d6d6d6;
    
}

nav li a {
    display: block;
    padding: 15px 20px;
    font-size: 13px;
    font-weight: bold;
    color: #363636;
}

nav li a:hover {
    background: #EEF7E9;
}

nav li a:before {
    content: '';
    display: block;
    width: 4px;
    height: 44px;
    position: absolute;
    left: 0;
    top: 0;
    background: #5bc0de;
}</style>


</head>
<body>

	<!-- Main Navigation ================================================================================= -->
	<%@ include file="/views/layout/menu.jsp"%>
	<!-- Header ========================================================================================== -->
		<div class="containers">
				<div class="col-lg-12">
					<div class="jumbotron">
						<h2>${categoryDetail.categoryName }</h2>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-12 col-lg-12">
					<ul id="nav">
									<li class="active"><a href="#">[공지사항]</a></li>
									<li><a href="#">[질의서 관리]</a></li>
									<li><a href="#">[QnA 게시판]</a></li>
									<li><a href="#">[회원 관리]</a></li>
					</ul>
				</div>
			</div>
		
		
		
	<!-- Container ======================================================================================= -->
	<div class="container">
		<div class="row">
			<div class="col-sm-9 col-lg-9">
					<div>
						<h3 align="center">글 목록</h3>
					</div>
						
						<div class="table-responsive">
					<table class="table table-striped table-bordered table-hover">
						<colgroup>
							<col width="100" />
							<col width="*" />
							<col width="120" />
							<col width="70" />
							<col width="50" />
						</colgroup>
						<thead>
							<tr>
								<th class="text-center">번호</th>
								<th class="text-center">제목</th>
								<th class="text-center">작성일</th>
								<th class="text-center">작성자</th>
								<th class="text-center">신고</th>
							</tr>
						</thead>
						
						
						
						
						<tbody>
							<c:choose>
								<c:when test="${empty categoryDetail.articles }">
									<tr>
										<th colspan="5" class="text-center">게시물이 존재하지 않습니다.</th>
									</tr>
								</c:when>
								<c:otherwise>
									<c:forEach var="article" items="${categoryDetail.articles }">
										<tr>
											<td class="text-center">${article.articleId }</td>
											<td><a
												href="${ctx}/article/find.do?articleId=${article.articleId} &categoryName=${categoryDetail.categoryName }">${article.title }
											</a></td>
											<td class="text-center"><fmt:formatDate
													value="${article.articleDate }" pattern="yyyy-MM-dd" /></td>
											<td class="text-center">${article.nickname }</td>
											<td><a class="btn btn-xs btn-danger btnPlay"
												href="${ctx }/blackList/regist.do?nickname=${article.nickname }"><b>
														X </b></a></td>
										</tr>

									</c:forEach>
								</c:otherwise>
							</c:choose>
						</tbody>
					</table>
				</div>

				
			</div>
		</div>

		<!-- Footer ========================================================================================== -->
	</div>

</body>
</html>