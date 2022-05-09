<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 科比
  Date: 2021/12/6
  Time: 0:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="http://localhost:8080/administrationWeb/">
    <title>Title</title>
</head>
<body>

<form action="work/updateWork.do">
    <table border="3" align="center">
        <tr>
            <td>工作编号</td>
            <td>工作名称</td>
            <td>部门编号</td>
            <td>负责人</td>
            <td>开始时间</td>
            <td>结束时间</td>
        </tr>
        <tr>
            <td><input type="text" name="wid" value="${work.wid} " readonly></td>
            <td><input type="text" name="wname" value="${work.wname}" ></td>
            <td><input type="text" name="depID" value="${work.depID}" ></td>
            <td><input type="text" name="wperson" value="${work.wperson}" ></td>
            <td><input type="text" name="start" value="${work.start}" ></td>
            <td><input type="text" name="end" value="${work.end}"></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交修改"></td>
        </tr>
        <tr>
            <td><input type="button"><a href="/work/cancel.do"></a></td>
        </tr>
    </table>
</form>
</body>
</html>
