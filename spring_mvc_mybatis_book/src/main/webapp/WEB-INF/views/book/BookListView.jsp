<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>전체 도서 조회</title>
	</head>
	<body>
			<h3>전체 도서 조회</h3>
			<table border="1" width="600">
				<tr><th>도서번호</th><th>도서명</th><th>저자</th>
						<th>가격</th><th>발행일</th><th>출판사번호</th></tr>
			
			   <c:forEach items="${bookList }" var="book">
			   	<tr><td><a href="<c:url value='/book/detailViewBook/${book.bookNum}'/>">${book.bookNum }</a></td>
			   			<td>${book.bookName}</td>
			   			<td>${book.bookAuther}</td>
			   			<td>${book.bookPrice }</td>
			   			<td>${book.bookDate}</td>
			   			<td>${book.PubNum}</td>
			   			<!-- <td><img src="<c:url value='/images/${prd.prdNo}.jpg'/>" width="30" height="20">-->
			   					<!-- 또는  -->
			   			    <!-- <img src="/mybatis/images/${prd.prdNo}.jpg" width="30" height="20"></td> -->
			   	</tr>
			   </c:forEach>
			</table><br>
			
			<a href="<c:url value='/' />">메인 화면으로 이동</a> <!-- 같은 표현 -->
			
	</body>
</html>