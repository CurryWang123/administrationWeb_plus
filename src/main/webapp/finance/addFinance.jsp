
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="http://localhost:8080/administrationWeb/">
    <title>Title</title>
</head>
<body>
<form action="finance/addFinance.do">
    <table border="3" align="center">
        <tr>
            <td>事务</td>
            <td><input type="text" name="affair"></td>
        </tr>
        <tr>
            <td>金额</td>
            <td><input type="text" name="money"></td>
        </tr>
        <tr>
            <td>部门</td>
            <td><input type="text" name="dname"></td>
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
