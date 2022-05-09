
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<base href="http://localhost:8080/administrationWeb/">
<form action="competition/updateCompetition.do">
    <table border="3" align="center">
        <tr>
            <td>评优编号</td>
            <td>学生姓名</td>
            <td>获奖类型</td>
            <td>时间</td>
        </tr>
        <tr>
            <td><input type="text" name="cid" value="${competition.cid} "id="cid" readonly></td>
            <td><input type="text" name="sname" value="${competition.sname}" id="sname"></td>
            <td><input type="text" name="type" value="${competition.type}" id="type"></td>
            <td><input type="date" name="date" value="${competition.date}"id="date" ></td>
        </tr>
        <tr>
            <td><input type="submit" value="修改"></td>
        </tr>
    </table>
</form>
