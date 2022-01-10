<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			<title>도서등록</title>
	</head>
	<body>
	<h3>도서등록</h3>
	
	<form method="post" action="/mybatis/book/insertBook">
			<table>
				<tr><td>도서번호</td><td><input type="text" name="bookNum"></td></tr>
				<tr><td>도서명</td><td><input type="text" name="bookName"></td></tr>
				<tr><td>저자 </td><td> <input type="text" name="bookAuther"></td></tr>
				<tr><td>가격</td><td><input type="text" name="bookPrice"></td></tr>
				<tr><td>발행일 </td> <td><input type="text" name="bookDate"></td></tr>
				<tr><td>출판사번호 </td> <td><input type="text" name="PubNum"></td></tr>
				<tr><td colspan="2"><input type="submit" value="등록"><input type="reset" value="취소"></td></tr>
			</table>
		</form>

		
	</body>
</html>