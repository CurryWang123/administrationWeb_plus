<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 科比
  Date: 2021/12/7
  Time: 13:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="http://localhost:8080/administrationWeb/">
</head>
<body>
<h1 align="center" style="font-style:unset">${dname}</h1>
<table align="center" border="2">
    <tr>
        <td>学生姓名</td>
        <td>性别</td>
        <td>职位</td>
    </tr>
    <c:forEach items="${list_dname}" var="student">
        <tr>
            <td>${student.sname}</td>
            <td>${student.ssex}</td>
            <td>${student.smajor}</td>
        </tr>
    </c:forEach>
    <tr>
        <td><button><a href="student/cancel.do">返回</a></button></td>
    </tr>
</table>
</body>
</html>
