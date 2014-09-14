<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="ct" tagdir="/WEB-INF/tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
<body>
    <table border="1">
        <tr>
            <td>이름</td>
            <td>
                ${user.name}
            </td>
        </tr>
        <tr>
            <td>아이디</td>
            <td>
                ${user.id}
            </td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td>
                ${user.user_pw}
            </td>
        </tr>
        <tr>
            <td>사진</td>
            <td>
            <ct:file photo_sys="${user.file1_sys}" />
            </td>
        </tr>
        <tr>
            <td>이력서</td>
            <td>
                ${user.file2_ori}
            </td>
        </tr>
    </table>

<a href="user/loginForm">로그인</a>

</body>

</html>