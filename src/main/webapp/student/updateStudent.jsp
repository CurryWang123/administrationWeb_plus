
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.6.0.js"></script>
<base href="http://localhost:8080/administrationWeb/">
<div id="table">
    <form action="student/updateStudent.do">
    <table border="3" align="center">
        <tr>
            <td>学生编号</td>
            <td>学生姓名</td>
            <td>性别</td>
            <td>部门</td>
            <td>职位</td>
            <td>密码</td>
        </tr>
        <tr>
            <td><input type="text" name="sid" value="${studentInfo.sid} "id="sid" readonly></td>
            <td><input type="text" name="sname" value="${studentInfo.sname}" id="sname"></td>
            <td><input type="text" name="ssex" value="${studentInfo.ssex}" id="ssex"></td>
            <td><input type="text" name="dname" value="${studentInfo.dname}"id="dname" ></td>
            <td><input type="text" name="smajor" value="${studentInfo.smajor}" id="smajor"></td>
            <td><input type="text" name="password" value="${studentInfo.password}"id="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="修改" id="updateButton">
                <button><a href="student/cancel.do">取消</a></button>
            </td>
        </tr>
    </table>
    </form>
</div>