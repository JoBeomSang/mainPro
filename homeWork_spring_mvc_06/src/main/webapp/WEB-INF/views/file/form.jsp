<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="submit1" method="post" enctype="multipart/form-data">
	번호 : <input type="text" name="number"><br>
	파일 : <input type="file" name="upfile"><br>	
	<input type="submit" value="작성"><br>
</form>
<br>
<form action="submit2" method="post" enctype="multipart/form-data">
	번호 : <input type="text" name="number"><br>
	파일 : <input type="file" name="upfile"><br>
	<input type="submit" value= "작성"><br>
</form>
<br>
<form action="submit3" method="post" enctype="multipart/form-data">
	번호 : <input type="text" name="number"><br>
	파일 : <input type="file" name="upfile"><br>
	<input type="submit" value="작성"><br>
</form>
</body>
</html>