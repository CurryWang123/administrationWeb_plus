<%--
  Created by IntelliJ IDEA.
  User: 科比
  Date: 2021/12/6
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://localhost:8080/administrationWeb/">
</head>
<body>
<form action="depart/updateDepart.do">
    <table border="3" align="center">
        <tr>
            <td>部门编号</td>
            <td>部门名称<</td>
            <td>部长<</td>
            <td>副部长</td>
            <td>部门总人数</td>
        </tr>
        <tr>
            <td><input type="text" value="${depart.depid} " name="depid" readonly></td>
            <td><input type="text" value="${depart.dname} " name="dname"></td>
            <td><input type="text" value="${depart.depminname}" name="depminname"></td>
            <td><input type="text" value="${depart.depsminname}" name="depsminname"></td>
            <td><input type="text" value="${depart.depsum}" name="depsum"></td>
        </tr>
        <tr>
            <td><input type="submit" value="修改"></td>
        </tr>
    </table>
</form>
</body>
</html>
