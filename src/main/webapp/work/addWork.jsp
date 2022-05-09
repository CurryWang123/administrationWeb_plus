<%--
  Created by IntelliJ IDEA.
  User: 科比
  Date: 2021/12/5
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="http://localhost:8080/administrationWeb/">
    <title>Title</title>
</head>
<body>
<form action="work/addWork.do">
    <table border="3" align="center">
        <tr>
            <td>工作名称</td>
            <td><input type="text" name="wname"></td>
        </tr>
        <tr>
            <td>部门编号</td>
            <td><input type="text" name="depID"></td>
        </tr>
        <tr>
            <td>负责人</td>
            <td><input type="text" name="wperson"></td>
        </tr>
        <tr>
            <td>计划开始时间</td>
            <td><input type="date" name="start" ></td>
        </tr>
        <tr>
            <td>计划结束时间</td>
            <td><input type="date" name="end"></td>
        </tr>
        <tr>
            <td><input type="submit" value="添加"></td>
        </tr>

    </table>
</form>
</body>
</html>
