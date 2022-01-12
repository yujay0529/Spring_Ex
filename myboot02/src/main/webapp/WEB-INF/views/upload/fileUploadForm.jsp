<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
			<title>Insert title here</title>
	</head>
	<body>
		<form id="fileUploadForm" method="post" action="<c:url value='/fileUpload'/>" enctype="multipart/form-data">
			파일 : <input type="file" id="uploadFile" name="uploadFile"><br><br>
			<input type="submit" value="업로드">		
		</form>
		
		<hr>
		<h3>여러개파일업로드</h3>
		<form id="fileUploadFormMulti" method="post" action="<c:url value='/fileUploadMultiple'/>" enctype="multipart/form-data">
			파일 : <input type="file" id="uploadFileMulti" name="uploadFileMulti" multiple="multiple"><br><br>
			<input type="submit" value="업로드">		
		</form>
		
			<h3>파일명 변경하지 않고 파일 업로드</h3>
		<form id="fileOriginalNameUploadForm" method="post" action="<c:url value='/fileOriginalNameUpload'/>" enctype="multipart/form-data">
			파일 : <input type="file" id="uploadFile" name="uploadFile"><br><br>
			<input type="submit" value="업로드">		
		</form>

	</body>
</html>