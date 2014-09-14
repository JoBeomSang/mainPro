<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<a href="hello">안녕?</a><br>
<a href="basic/now">now</a><br>
<a href="input/form">input</a><br>
<a href="input/listform">listinput</a><br>
<a href="file/form">file/form</a><br>
<a href="cookie/make">쿠키생성</a>
<a href="cookie/view">쿠키보기</a>
<a href="cookie/delete">쿠키삭제</a><br>
<a href="session/make">세션생성</a>
<a href="session/view">세션보기</a>
<a href="session/modify">세션수정</a>
<a href="session/delete">세션삭제</a><br>
<a href="user/addUserForm">회원가입</a><br>
<a href="user/loginForm">로그인</a><br>
<a href="basic/param">파람</a><br>
<a href="basic/direct">나르호도</a><br>
<a href="basic/model">모델이지</a><br>
<a href="path/aaa/bbb/ccc">path/aaa/bbb/ccc</a><br>
<a href="path/aaa/bbb">path/aaa/bbb</a><br>
<a href="pathmodel/intro/info/BoardList">pathmodel</a><br>
</body>
</html>
