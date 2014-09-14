<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table width="100%">

    

        <c:forEach var="mm" items="${mb.mainList }">

        <tr align="center">

            <td><a href="../${mm.key }">${mm.value }</a></td>

        </tr>

        </c:forEach>

    

</table>