<%--
  Created by IntelliJ IDEA.
  User: 科比
  Date: 2021/12/6
  Time: 20:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://localhost:8080/administrationWeb/">
</head>
<body>
<form action="depart/addDepart.do" method="post">
    <table border="3" align="center">
        <tr>
            <td>部门名称<</td>
            <td><input type="text" name="dname"></td>
        </tr>
        <tr>
            <td>部长<</td>
            <td><input type="text" name="depminname"></td>
        </tr>
        <tr>
            <td>副部长</td>
            <td><input type="text"name="depsminname"></td>
        </tr>
        <tr>
            <td>部门总人数</td>
            <td><input type="text" name="depsum"></td>
        </tr>
        <tr>
            <td><input type="submit" value="添加"></td>
        </tr>
    </table>
</form>
</body>
</html>
