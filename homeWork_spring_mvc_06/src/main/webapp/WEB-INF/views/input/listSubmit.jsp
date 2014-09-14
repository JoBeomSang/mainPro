<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>listSubmit</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>학교</td>
            <td>이름</td>
            <td>국어</td>
            <td>영어</td>
            <td>수학</td>
            <td>교련</td>
            <td>평균</td>
            <td>결과</td>
        </tr>
        <c:forEach items="${order.students }" var="i">
        <c:if test="${i.stud_name != '' }">
            <tr>
                <td>${i.stu_univ }</td>
                <td>${i.name}</td>
                <td>${i.jum[0]}</td>
                <td>${i.jum[1]}</td>
                <td>${i.jum[2]}</td>
                <td>${i.jum[3]}</td>
                <td>${i.stud_avg}</td>
                <td>${i.res}</td>
            </tr>
        </c:if>
        </c:forEach>
        <c:forEach items="${order.univ }" var="uu">
            <tr>
                <td>${uu.univ_name }</td>
                <td colspan="7">${uu.cnt }</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html> 