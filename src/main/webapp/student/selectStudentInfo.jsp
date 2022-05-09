
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<base href="http://localhost:8080/administrationWeb/">
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
<script type="text/javascript">
    $(function ()
    {
        $("#button").click(function ()
        {
            var sid=$("#sid").val()
            $.ajax(
                {
                    url:"student/selectStudentInfo.do",
                    data:{sid:sid},
                    dataType:"json",
                    success:function (result){
                            $("#sname").val(result.sname)
                            $("#ssex").val(result.ssex)
                            $("#dname").val(result.dname)
                            $("#smajor").val(result.smajor)
                        },
                    error:function ()
                    {
                        alert("查无此人")
                    }
                }
            )
        })
    })
</script>

    <table border="3" align="center">
        <tr>
            <td>学生编号</td>
        </tr>
        <tr>
            <td><input type="text" name="sid" id="sid"><input type="button" value="查找" id="button"></td>
        </tr>
        <tr>
            <td>学生姓名</td>
            <td><input type="text" id="sname"></td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="text" id="ssex"></td>
        </tr>
        <tr>
            <td>部门</td>
            <td><input type="text" id="dname"></td>
        </tr>
        <tr>
            <td>职位</td>
            <td><input type="text"id="smajor"></td>
        </tr>
    </table>
<div align="center">
    <button><a href="student/cancel.do">取消</a></button>
</div>

