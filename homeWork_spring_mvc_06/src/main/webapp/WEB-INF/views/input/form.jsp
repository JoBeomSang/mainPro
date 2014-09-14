<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post">
	<table border="1">
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" value="${st.name }"/></td>
		</tr>
		<tr>
			<td>점수</td>
			<td><input type="text" name="jumsu" value="${st.jumsu }"/></td>
		</tr>
		<tr>
			<td>번호</td>
			<td><input type="text" name="number" value="${st.number }"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="입력"/></td>
		</tr>
	</table>
</form>
</body>
</html>