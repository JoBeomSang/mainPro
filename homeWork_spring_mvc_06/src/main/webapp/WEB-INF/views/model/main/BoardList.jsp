<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">

function BoardWrite()
{
    var frm = document.frm;   
    frm.action="model/${ }/${mb.menu }/BoardWrite";   
    frm.submit();
}


</script>

</head>
<body>
<form method="post" name="frm">

    <table border="1">

        <tr>

            <td>번호</td>
            <td>제목</td>

        </tr>

            <c:forEach items="${mb.mainData }" var="list">

            <tr>

                <td>${list.num }</td>

                <td>${list.title } </td>


            </tr>

            </c:forEach>

        <tr>

                <td><input type="button" onclick="BoardWrite()" value="쓰기"></td>

        </tr>

    </table>

</form>

 

</body>

</html>