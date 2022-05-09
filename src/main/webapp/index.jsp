
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
<base href="http://localhost:8080/administrationWeb/">
    <style>
        img{
            width:100px;
            height:100px;
        }
    </style>
</head>
<body>
<div style="height: 100%;width: 100%" >
    <div  style="font-size: 20px;background-color:#00f7ff" >
        <h1 style="height: 5%;padding-bottom: 50px" align="center">学生会管理系统   <img src="image/03.jpg"> </h1>
        当前用户： <span style="color: #ac8fbc">${username}</span>
        &nbsp&nbsp&nbsp&nbsp用户类型:<span style="color: crimson">${usertype}</span> </br>
        <a href="student/loginout.do"><button>退出系统</button></a>
    </div>
    <div style="height: 95%;width: 100%" >
    <div style="background-color:whitesmoke;height:100%;width:20%;float: left;font-size: 15px">
        <ul>
            <h2>成员管理模块</h2>
            <li><a href="student/selectStudent.do" target="right">查看所有成员</a></li>
            <li><a href="student/addStudent.jsp" target="right">添加成员</a></li>
            <li><a href="student/selectStudentInfo.jsp" target="right">查找成员</a></li>
            <h2>工作计划管理模块</h2>
            <li><a href="work/addWork.jsp" target="right">添加工作计划</a></li>
            <li><a href="work/selectWork.do" target="right">查看全部计划</a></li>
            <li><a href="work/selectApproval.do" target="right">查看待审批计划</a></li>
            <h2>部门管理模块</h2>
            <li><a href="depart/selectDepart.do" target="right">查看所有部门</a></li>
            <li><a href="depart/addDepart.jsp"target="right">增加部门</a></li>
            <li><a href="depart/select_dname.jsp " target="right">查询部门</a></li>
            <h2>财务管理模块</h2>
            <li><a href="finance/select.do" target="right">查询财务情况</a></li>
            <li><a href="finance/selectAppro.do" target="right">查看待审批财务</a></li>
            <h2>评优管理模块</h2>
            <li><a href="competition/selectAllCompetition.do" target="right">查看评优</a></li>
            <li><a href="competition/addCompetition.jsp" target="right">添加评优</a></li>
        </ul>
    </div>
    <div style="height:100%;width: 80%;float: right;font-size: 20px"align="center">
        <iframe src="loginInfo.jsp" name="right"scrolling="yes" width="1200px" height="1200px" frameborder="0" align="center"></iframe>
    </div>
    </div>
</div>
</body>
</html>
