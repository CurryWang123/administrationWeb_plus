
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<base href="http://localhost:8080/administrationWeb/">
    <table border="3" align="center">
        <tr>
            <td>学生姓名</td>
            <td>获奖类型</td>
            <td>时间</td>
        </tr>
        <tr>
            <td>${competition.sname}</td>
            <td>${competition.type}</td>
            <td>${competition.date}</td>
        </tr>
    </table>
