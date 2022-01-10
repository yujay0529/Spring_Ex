<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>도서정보 상세조회</title>
	</head>
	<body>
			<h3>도서정보 상세조회</h3>
			<table border="1" width="300">
				<tr><td>도서번호</td><td>${book.bookNum }</td></tr>
				<tr><td>도서명</td><td>${book.bookName}</td></tr>
				<tr><td>저자</td><td>${book.bookAuther }</td></tr>
				<tr><td>가격</td><td>${book.bookPrice }</td></tr>
				<tr><td>발행일</td><td>${book.bookDate }</td></tr>
				<tr><td>출판사 번호</td><td>${book.PubNum }</td></tr>
			</table><br>
			<!--  상풍정보 수정 화면으로 이동 -->
			<a href = "/mybatis/book/updateBookForm/${book.bookNum}">도서 정보 수정</a><br><br>
			
			<!-- 상품정보삭제 : 삭제여부 확인 처리(자바스크립트)-->
			<a href="javascript:deleteCheck();">도서정보삭제</a><br><br>
			<script type="text/javascript">
			function deleteCheck(){
				var answer = confirm("선택한 도서 정보를 삭제하시겠습니까?");
				if(answer == true){
					location.href="/mybatis/book/deleteBook/${book.bookNum }";
				}
			}
			
			</script>
			
			<a href="<c:url value='/'/>">메인 화면으로 이동</a>
	</body>
</html>