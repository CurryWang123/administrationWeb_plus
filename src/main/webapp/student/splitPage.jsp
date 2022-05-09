<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<base href="http://localhost:8080/administrationWeb/">
<script type="text/javascript" src="js/jquery-3.6.0.js"></script>
<script type="text/javascript">
    function ajaxSplit(page)
    {

        $.ajax({
            data:{"pageNum":page,"sid":$("#sid").val(),"sname":$("#sname").val(),"ssex":$("#ssex").val(),"dname":$("#dname").val()},
            url:"student/ajaxSplit.do",
            success:function ()
            {
                $("#table").load("student/splitPage.jsp #table" )
            //    controller用到@ResponseBody,没有返回路径,所以用到load()
            }

        })
    }
    function del(sid)
    {
        if (confirm("你确定删除吗"))
        {
            $.ajax({
                data: {"sid":sid},
                url:"student/deleteStudent.do",
                dataType:"text",
                success:function (msg)
                {
                    alert(msg)
                    $("#table").load("student/splitPage.jsp #table")
                }
            })

        }
    }
    function allclick() {
        //取得全选复选框的选中未选 中状态
        var ischeck=$("#all").prop("checked");
        //将此状态赋值给每个商品列表里的复选框
        $("input[name=ck]").each(function () {
            this.checked=ischeck;
        });
    }
    function ckclick()
    {
        var num1=$("input[name=ck]").length
        var num2=$("input[name=ck]:checked").length
        if (num1==num2)
        {
            $("#all").prop("checked",true)
        }else
        {
            $("#all").prop("checked",false)
        }
    }
    function delAll()
    {
        var cks=$("input[name='ck']:checked")
        var str=""
        var sid=""
        if (cks.length==0)
        {
            alert("请选择要删除的学生")
        }else
        {
            if (confirm("确定删除这"+cks.length+"个学生吗"))
            {
                $.each(cks,function ()
                {
                  sid=$(this).val()
                    if (sid!=null)
                    {
                        str+=sid+","
                    }
                })
                $.ajax(
                    {
                        url:"student/delAll.do",
                        data:{"sids":str},
                        dataType: "text",
                        success:function (msg)
                        {
                            alert(msg)
                            $("#table").load("student/splitPage.jsp")
                        }
                    }
                )
            }
        }
    }
</script>
<div style="padding-bottom: 50px" align="center">
    <table>
        <tr>
            <td>学号:<input type="text" name="sid" id="sid"></td>
            <td>学生姓名:<input type="text" name="sname" id="sname"></td>
            <td>性别:<input type="text" name="ssex" id="ssex"></td>
            <td>部门:<input type="text" name="dname" id="dname"></td>
            <td><button id="selectButton" onclick="selectCondition()">查询</button> </td>
        </tr>
    </table>
</div>
<div id="table">
    <c:choose>
        <c:when test="${sessionScope.students.list.size()!=0}">
<table border="3" align="center">
    <tr>
        <td><input type="checkbox" id="all" onclick="allclick()">全选&nbsp;&nbsp;<button  onclick="delAll()">批量删除</button></td>
        <td>学生编号</td>
        <td>学生姓名</td>
        <td>性别</td>
        <td>部门</td>
        <td>职位</td>
    </tr>
    <c:forEach items="${sessionScope.students.list}" var="stu">
        <tr>
            <td align="center"><input type="checkbox" name="ck" value="${stu.sid}" onclick="ckclick()"></td>
            <td>${stu.sid}</td>
            <td>${stu.sname}</td>
            <td>${stu.ssex}</td>
            <td>${stu.dname}</td>
            <td>${stu.smajor}</td>
            <td><a href="student/selectDetail.do?sid=${stu.sid}">查看详细信息</a></td>
            <td><input type="button" onclick="del(${stu.sid})" value="删除学生" id="deleteButton"></td>
        </tr>
    </c:forEach>
</table>
    <div style="padding-top: 80px" align="center">
<%--        超链接并排--%>
        <nav>
    <a href="javascript:ajaxSplit(${sessionScope.students.prePage})"><<</a>&nbsp;&nbsp;

    <c:forEach begin="1" end="${sessionScope.students.pages}" var="i">
            <c:if test="${sessionScope.students.pageNum==i}">
            <a href="javascript:ajaxSplit(${i})" style="background-color: gray">${i}</a>&nbsp;&nbsp;
            </c:if>
            <c:if test="${sessionScope.students.pageNum!=i}">
                <a href="javascript:ajaxSplit(${i})" >${i}</a>&nbsp;&nbsp;
            </c:if>
    </c:forEach>
    <a href="javascript:ajaxSplit(${students.nextPage})"> >> </a>&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;<span style="color: darkcyan">总共:</span>${sessionScope.students.pages}页
            <c:if test="${sessionScope.students.pageNum==0}">
                <span style="color: darkcyan">当前第</span>1页
            </c:if>
            <c:if test="${sessionScope.students.pageNum!=0}">
                <span style="color: darkcyan">当前第</span>${sessionScope.students.pageNum}页
            </c:if>
        </nav>
    </div>
        </c:when>
        <c:otherwise>
            <div style="font-size: 50px;color: cornflowerblue" align="center">没有符合条件的学生</div>
        </c:otherwise>
    </c:choose>
</div>
<script type="text/javascript">
    if ("${sessionScope.msg}"!="")
    {
        alert("${sessionScope.msg}")
    }
    <c:remove var="msg"></c:remove>
    function selectCondition()
    {
        $.ajax(
            {
                data:{"sid":$("#sid").val(),"sname":$("#sname").val(),"ssex":$("#ssex").val(),"dname":$("#dname").val(),"pageNum":1},
                url:"student/ajaxSplit.do",
                success:function ()
                {
                    $("#table").load("student/splitPage.jsp #table" )
                }
            }
        )
    }
</script>
