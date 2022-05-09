<%--
  Created by IntelliJ IDEA.
  User: 科比
  Date: 2021/12/5
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="http://localhost:8080/administrationWeb/">
    <title>Title</title>
</head>
<body>
<form action="student/addStudent.do">
    <table border="2" align="center">
        <tr>
            <td>学生姓名<</td>
            <td><input type="text" name="sname" id="sname"></td>
        </tr>
        <tr>
            <td>性别<</td>
            <td>
                <input type="radio" name="ssex" value="男" checked id="man">男
                <input type="radio" name="ssex" value="女" id="woman">女
            </td>
        </tr>
        <tr>
            <td>部门</td>
            <td>
                <select name="dname" id="dname">
                    <option selected>宣传部</option>
                    <option >外联部</option>
                    <option >学习部</option>
                    <option >自律会</option>
                    <option >媒体部</option>
                    <option >体育部</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>职位</td>
            <td><input type="text" name="smajor" id="smajor"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="添加"></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>
    <div align="center">
        <button><a href="student/cancel.do">取消</a></button>
    </div>
</form>
</body>
</html>
