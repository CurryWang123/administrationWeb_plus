<%--
  Created by IntelliJ IDEA.
  User: 科比
  Date: 2021/12/6
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <base href="http://localhost:8080/administrationWeb/">
    <title>Title</title>
</head>
<body>
<table border="3" align="center">
    <tr>
        <td>部门编号</td>
        <td>部门名称<</td>
        <td>部长<</td>
        <td>副部长</td>
        <td>部门总人数</td>
    </tr>
    <c:forEach items="${sessionScope.departList}" var="depart">
        <tr>
            <td>${depart.depid}</td>
            <td>${depart.dname}</td>
            <td>${depart.depminname}</td>
            <td>${depart.depsminname}</td>
            <td>${depart.depsum}</td>
            <td><a href="depart/selectOneDepart.do?depid=${depart.depid}">查看详细信息</a></td>
            <td><a href="depart/deleteDepart.do?depid=${depart.depid}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
