<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>listForm</title>
</head>
<body>
<form method="post">
    <table border="1">
        <tr>
            <td>학교</td>
            <td>이름</td>
            <td>국어</td>
            <td>영어</td>
            <td>수학</td>
            <td>교련</td>
        </tr>
        <c:forEach begin="0" end="3" var="i">
        <tr>
        	<td>
            	<select name="students[${i}].stud_univ" >
                	<c:forEach items="${unvi}" var="j">
                    	<option value="${j.uvname}">${j.uvname }</option>
                	</c:forEach>
            	</select> 
            </td>
            <td><input type="text" name="students[${i}].name"/></td>
            <td><input type="text" name="students[${i}].jum[0]"/></td>
            <td><input type="text" name="students[${i}].jum[1]"/></td>
            <td><input type="text" name="students[${i}].jum[2]"/></td>
            <td><input type="text" name="students[${i}].jum[3]"/></td>
        </tr>
        </c:forEach>
        <tr>
            <td colspan="6">
                <input type="submit" value="완료"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html> 