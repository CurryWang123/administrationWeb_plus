
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<base href="http://localhost:8080/administrationWeb/">
<table border="3" align="center">
    <tr>
        <td>评优编号</td>
        <td>学生姓名</td>
        <td>获奖类型</td>
        <td>时间</td>
    </tr>
    <c:forEach items="${sessionScope.listCompetition}" var="competition">
        <tr>
            <td>${competition.cid}</td>
            <td>${competition.sname}</td>
            <td>${competition.type}</td>
            <td>${competition.date}</td>
            <td><a href="competition/selectOneCompetition.do?cid=${competition.cid}">查看详细信息</a></td>
            <td><a href="competition/deleteCompetition.do?cid=${competition.cid}" target="right">删除</a></td>
        </tr>
    </c:forEach>
</table>