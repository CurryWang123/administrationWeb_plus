
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<base href="http://localhost:8080/administrationWeb/">
<table border="3" align="center">
    <tr>
        <td>财务编号</td>
        <td>事务</td>
        <td>金额</td>
        <td>部门</td>
        <td>时间</td>
        <td>审核状态</td>
    </tr>
    <c:forEach items="${sessionScope.listFinance}" var="finance">
        <tr>
            <td>${finance.fid}</td>
            <td>${finance.affair}</td>
            <td>${finance.money}</td>
            <td>${finance.dname}</td>
            <td>${finance.date}</td>
            <td>${finance.status}</td>
            <td><a href="finance/selectOneFinance.do?fid=${finance.fid}">查看详细信息</a></td>
            <td><a href="finance/deleteFinance.do?fid=${finance.fid}" target="right">删除</a></td>
        </tr>
    </c:forEach>
</table>
