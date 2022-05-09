
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript">
    function update()
    {
        var xmlHttp=new XMLHttpRequest();
        xmlHttp.onreadystatechange=function ()
        {
            if (xmlHttp.readyState==4&&xmlHttp.status==200)
            {
                alert(xmlHttp.responseText);
            }
        }

        var fid=document.getElementById("fid").value;
        var affair=document.getElementById("affair").value;
        var money=document.getElementById("money").value;
        var dname=document.getElementById("dname").value;
        var date=document.getElementById("date").value;
        var status=document.getElementById("status").value;
        xmlHttp.open("get","finance/updateFinance.do?fid="+fid+"&affair="+affair+"&money="+money+"&dname="+dname+"&date="+date+"&status="+status,true);
        xmlHttp.send();
    }
</script>
<base href="http://localhost:8080/administrationWeb/">
<table border="3" align="center">
    <tr>
        <td>财务编号</td>
        <td>事务</td>
        <td>金额</td>
        <td>部门</td>
        <td>时间</td>
        <td>状态</td>
    </tr>
    <tr>
        <td><input type="text" name="sid" value="${finance.fid} "id="fid" readonly></td>
        <td><input type="text" name="sname" value="${finance.affair}" id="affair"></td>
        <td><input type="text" name="ssex" value="${finance.money}" id="money"></td>
        <td><input type="text" name="dname" value="${finance.dname}"id="dname" ></td>
        <td><input type="text" name="smajor" value="${finance.date}" id="date"></td>
        <td><input type="text" name="password" value="${finance.status}"id="status"></td>
    </tr>
    <tr>
        <td><input type="button" value="修改" onclick="update()"></td>
    </tr>
</table>
