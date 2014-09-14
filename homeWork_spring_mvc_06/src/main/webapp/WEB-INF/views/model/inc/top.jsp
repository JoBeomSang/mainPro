<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<table width="100%">

    <tr align="center">

        <c:forEach var="top" items="${mb.menuList }">

            <td><a href="${top.key }">${top.value }</a></td>

        </c:forEach>

    </tr>

</table>