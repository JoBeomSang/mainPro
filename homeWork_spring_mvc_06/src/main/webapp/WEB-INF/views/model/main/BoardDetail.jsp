<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <c:if test="${mb.flag==1}">
    	${mb.mainData} 상세
    	<br><br><br>
    	<a href="?service=BoardReply&content=${mb.mainData}">답글</a>
    	<a href="?service=BoardModify&content=${mb.mainData}">수정</a>
    	<a href="?service=BoardDel">삭제</a>
    </c:if>
    
    <c:if test="${mb.flag==2}">
    	${mb.subData} 상세
    	<br><br><br>
    	<a href="?service=BoardReply&content=${mb.subData}">답글</a>
    	<a href="?service=BoardModify&content=${mb.subData}">수정</a>
    	<a href="?service=BoardDel">삭제</a>
    </c:if>
    <br><br>
 
    <input type="button" value="목록으로" onclick="history.go(-1)"/>