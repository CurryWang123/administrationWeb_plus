<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://localhost:8080/administrationWeb/">
    <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
    <script type="text/javascript">
        $(function ()
        {
            $("#password").blur(function()
            {
                undefined
                $("#tishi").empty();
                var name = $(this).val();
                if (name == "" || name == null) {
                    undefined
                    $("#password").after("<span id='tishi' style='color: red'>密码不能为空</span>");
                }
            })
            $("#password1").blur(function ()
            {
                var val1=$("#password").val()
                var val2=$("#password1").val()
                if (val1!=val2)
                {
                    alert("两次密码不一样")
                }
            })
        })
    </script>
    <script type="text/javascript">
        if ("${requestScope.msg}"!="")
        {
            alert("${requestScope.msg}")
        }
        <c:remove var="msg"></c:remove>
    </script>
</head>
<body>
<div style="height: 100%;width: 100%">
    <div style="width: 100%;height: 10%;background-color: cornflowerblue"> <h1 align="center">注册界面</h1></div>
    <div style="height: 90%;width: 100%">
        <form action="student/register.do" style="padding-top: 20px">
            <table align="center"  border="3">
                <tr>
                    <td>学生姓名</td>
                    <td><input type="text" id="sname" name="sname"></td>
                </tr>
                <tr>
                    <td>性别</td>
                    <td><input type="radio" id="man" name="ssex" value="男" checked>男
                        <input type="radio" id="woman" name="ssex" value="女">女
                    </td>
                </tr>
                <tr>
                    <td>部门</td>
                    <td><input type="text" id="dname" name="dname"></td>
                </tr>
                <tr>
                    <td>职位</td>
                    <td><input type="text" name="smajor" id="smajor"></td>
                </tr>
                <tr>
                    <td>密码</td>
                    <td><input type="password" id="password" name="password"></td>
                </tr>
                <tr>
                    <td>请再输入一次密码</td>
                    <td><input type="password" id="password1" name="password1"></td>
                </tr>
                <tr>
                    <td><input type="submit" value="注册"></td>
                </tr>
            </table>
        </form>

    </div>
</div>


</body>
</html>
