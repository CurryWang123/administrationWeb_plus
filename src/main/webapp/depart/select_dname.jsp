<%--
  Created by IntelliJ IDEA.
  User: 科比
  Date: 2021/12/7
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="http://localhost:8080/administrationWeb/">
    <title>Title</title>
</head>
<body>
<form action="student/select_dname.do">
    <table align="center">
        <tr>
           <td>部门名称</td>
            <td><select name="dname">
                <option>宣传部</option>
                <option>体育部</option>
                <option>外联部</option>
                <option>学习部</option>
                <option>媒体部</option>
                <option>自律会</option>
            </select>
            </td>
        </tr>
        <tr>
            <td style="font-style: oblique"><input type="submit" value="查找"></td>
        </tr>
    </table>
</form>
</body>
</html>
