
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="http://localhost:8080/administrationWeb/">
    <title>Title</title>
</head>
<body>
<form action="competition/addCompetition.do">
    <table border="3" align="center">
        <tr>
            <td>成员名称</td>
            <td><input type="text" name="sname"></td>
        </tr>
        <tr>
            <td>获奖类型</td>
            <td><input type="text" name="type"></td>
        </tr>
        <tr>
            <td>时间</td>
            <td><input type="date" name="date"></td>
        </tr>
        <tr>
            <td><input type="submit" value="添加"></td>
        </tr>
    </table>
</form>
</body>
</html>
