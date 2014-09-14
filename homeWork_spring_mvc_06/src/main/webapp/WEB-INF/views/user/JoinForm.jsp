<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">

function join()
{
    var frm = document.frm;
    var Ext = frm.file1.value.split(".")[1];    
    var Chk = true;

    if(Ext!='' )
    {
        if(Ext!='jpg'|| Ext!='bmp'|| Ext!='gif')
        {    Chk=false;        }
        Chk=true;    
    }

  
    var Ext2 = frm.file2.value.split(".")[1];
    var Chk2 = true;

    if(Ext2!='' )
    {
        if(Ext2!='hpw'|| Ext2!='ppt'|| Ext2!='xls')
        {    
        	Chk2=false; 
        }
        Chk2=true;
    }    

    if(Chk2==true && Chk2==true)
    {
        frm.submit();        
    }
    else
    {
        var msg="";

        if(Chk==false)
            msg="이미지만 올릴수 있어요";

        if(Chk2==false)
            msg="문서형식 파일만 올릴 수 있어요";

        alert(msg);
    }

}

</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
<form name="frm" action="addUserForm" method="post" enctype="multipart/form-data">
    <table border="1">
        <tr>
            <td rowspan="7">사진</td>
            <td rowspan="7">
                	사진을 올려주세요	
            </td>
            <td>아이디</td>
            <td>
                <input type="text" name="id" />
            </td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td>
                <input type="password" name="pw" />
            </td>
        </tr>
        <tr>
            <td>비밀번호확인</td>
            <td>
                <input type="password" name="pw2" />
            </td>
        </tr>
        <tr>
            <td>이름</td>
            <td>
                <input type="text" name="name" />
            </td>
        </tr>
         <tr>
            <td>연락처</td>
            <td>
                <input type="text" name="name" />
            </td>
        </tr>
        <tr>
            <td>이력서</td>
            <td>
                <input type="file" name="file2" />
            </td>
        </tr>
        <tr>
        	<td>
            	<input type="file" name="file1" /></td>
            <td>
                <input type="button" value="가입" onclick="join()" />
            </td>
        </tr></td>
        </tr>
        
    </table>
</form>
</body>
</html>