<%@ tag language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ attribute name="file1_sys" required="false" %>
<%@ attribute name="file1_ori" required="false" %>
<%
    if(file1_sys.trim() != ""){
%>
    <img src="../resources/up/${photo_sys}"/>
    <%} %>