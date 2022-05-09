<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<base href="http://localhost:8080/administrationWeb/">
<table border="3" align="center">
    <tr>
        <td>工作名称</td>
        <td>部门编号</td>
        <td>负责人</td>
        <td>开始时间</td>
        <td>结束时间</td>
        <td>状态</td>
    </tr>
    <c:forEach items="${sessionScope.listAppro}" var="work">
        <tr>
            <td>${work.wname}</td>
            <td>${work.depID}</td>
            <td>${work.wperson}</td>
            <td>${work.start}</td>
            <td>${work.end}</td>
            <td>${work.status}</td>
            <td><a href="work/updateStatus.do?wid=${work.wid}">通过审核</a></td>
        </tr>
    </c:forEach>
</table>
<script type="text/javascript">
    if ("${requestScope.msg}"!="")
    {
        alert("${requestScope.msg}")
    }
</script>