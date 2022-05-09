
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<base href="http://localhost:8080/administrationWeb/">
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.6.0.js"></script>
<script type="text/javascript">
    function ajaxSplit(page)
    {

        $.ajax({
            data:{"pageNum":page},
            url:"work/ajaxSplit.do",
            success:function ()
            {
                $("#table").load("work/selectWork.jsp")
            }

        })
    }
    function del(sid)
    {
        if (confirm("你确定删除吗"))
        {
            $.ajax({
                data: {"sid":sid},
                url:"work/deleteWork.do",
                dataType:"text",
                success:function (msg)
                {
                    alert(msg)
                    $("#table").load("work/selectWork.jsp")
                }
            })

        }
    }
    if ("${sessionScope.msg}"!="")
    {
        alert("${sessionScope.msg}")
    }
    <c:remove var="msg"></c:remove>
</script>
<div id="table">
<table border="3" align="center">
    <tr>
        <td>工作名称</td>
        <td>部门编号</td>
        <td>负责人</td>
        <td>开始时间</td>
        <td>结束时间</td>
        <td>状态</td>
    </tr>
    <c:forEach items="${sessionScope.workList.list}" var="work">
        <tr>
            <td>${work.wname}</td>
            <td>${work.depID}</td>
            <td>${work.wperson}</td>
            <td>${work.start}</td>
            <td>${work.end}</td>
            <td>${work.status}</td>
            <td><a href="work/selectOneWork.do?wid=${work.wid}">查看详细信息</a></td>
            <td><input type="button" onclick="del(${work.wid})" value="删除" id="deleteButton"></td>
        </tr>
    </c:forEach>
</table>
    <div style="padding-top: 80px" align="center">
        <%--        超链接并排--%>
        <nav>
            <a href="javascript:ajaxSplit(${sessionScope.workList.prePage})"><<</a>&nbsp;&nbsp;

            <c:forEach begin="1" end="${sessionScope.workList.pages}" var="i">
                <c:if test="${sessionScope.workList.pageNum==i}">
                    <a href="javascript:ajaxSplit(${i})" style="background-color: gray">${i}</a>&nbsp;&nbsp;
                </c:if>
                <c:if test="${sessionScope.workList.pageNum!=i}">
                    <a href="javascript:ajaxSplit(${i})" >${i}</a>&nbsp;&nbsp;
                </c:if>
            </c:forEach>
            <a href="javascript:ajaxSplit(${sessionScope.workList.nextPage})"> >> </a>&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;<span style="color: darkcyan">总共:</span>${sessionScope.workList.pages}页
            <c:if test="${sessionScope.workList.pageNum==0}">
                <span style="color: darkcyan">当前第</span>1页
            </c:if>
            <c:if test="${sessionScope.workList.pageNum!=0}">
                <span style="color: darkcyan">当前第</span>${sessionScope.workList.pageNum}页
            </c:if>
        </nav>
    </div>
</div>
