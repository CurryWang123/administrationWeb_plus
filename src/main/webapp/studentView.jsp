
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
</head>
<body>
<div style="height: 100%;width: 100%" >
    <div  style="font-size: 20px;background-color:#00f7ff" >
        <h1 style="height: 5%;padding-bottom: 50px" align="center">学生会管理系统  <img style="width: 100px;height: 100px" src="image/03.jpg"> </h1>
        当前用户： <span style="color: #ac8fbc">${username}</span>
        &nbsp&nbsp&nbsp&nbsp用户类型:<span style="color: crimson">${usertype}</span> </br>
        <a href="student/loginout.do"><button>退出系统</button></a>
    </div>
    <div style="height: 95%;width: 100%" >
        <div style="background-color:whitesmoke;height:100%;width:20%;float: left;font-size: 15px">
            <ul>
                <h2>个人模块</h2>
                <li><a href="student/selectDetail.do?sid=${sid}" target="right">修改个人信息</a></li>
                <h2>工作计划模块</h2>
                <li><a href="work/addWork.jsp" target="right">申请工作计划</a></li>
                <h2>财务模块</h2>
                <li><a href="finance/addFinance.jsp" target="right">申请财务</a></li>
                <h2>评优模块</h2>
                <li><a href="competition/selectByName.do?sname=${username}" target="right">查看个人评优</a></li>
            </ul>
        </div>
        <div style="height:100%;width: 80%;float: right;font-size: 20px"align="center">
            <iframe src="loginInfo.jsp" name="right"scrolling="yes" width="1200px" height="1200px" frameborder="0" align="center"></iframe>
        </div>
    </div>
</div>
</body>
</html>
