
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% request.setCharacterEncoding("UTF-8"); %>
<html>
<head>
  <base href="http://localhost:8080/administrationWeb/">
    <title>用户登录界面</title>
<style>
  body {
    background: url(image/01.jpg) no-repeat center center fixed;
    /*兼容浏览器版本*/
    -webkit-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
  }
</style>
  <script type="text/javascript" src="js/jquery-3.6.0.js"></script>
  <script type="text/javascript">
    $(function () {
      $("#username").blur(function()
      {

        $("#names").empty();
        var name = $(this).val();
        if (name == "" || name == null) {

          $("#username").after("<span id='names' style='color: #ff0000'>用户名不能为空</span>");
        }
      })
      $("#password").blur(function()
      {
        undefined
        $("#password1").empty();
        var name = $(this).val();
        if (name == "" || name == null) {
          undefined
          $("#password").after("<span id='password1' style='color: red'>密码不能为空</span>");
        }
      })
    });


  </script>

</head>
<body background="image/01.jpg">
<div style="height: 100%;width: 100%" >
<div style="width: 100%;height: 15%"align="center">
  <p style="color: #1b14dc;font-size: 20px">${loginInfo}</p>
  <div style="font-size: 30px;color: hotpink;padding-top: 80px">用户登录界面</div>
</div>
  <div style="height: 85%;width: 100%" align="center">
    <form action="student/login.do" method="post" style="height: 200px;width: 500px;font-style: oblique;padding-top: 100px">
      <table border="3" >
        <tr>
          <td style="background-color: cornsilk">编号</td>
          <td><input type="text" name="sid"></td>
        </tr>
        <tr>
          <td style="background-color: cornsilk">用户姓名</td>
          <td><input type="text" name="root" id="username"></td>
        </tr>
        <tr>
          <td style="background-color: cornsilk">密码</td>
          <td><input type="password" name="password" id="password"></td>
        </tr>
        <tr>
          <td style="background: cornsilk"><input type="radio" name="user" value="管理员" checked>管理员</td>
          <td style="background: cornsilk"><input type="radio" name="user" value="学生会成员">学生会成员</td>
        </tr>
        <tr>
          <td><input type="submit" value="登录"></td>
          <td><input type="reset"value="重置"></td>
        </tr>
      </table>
      <h2  align="center"><a href="register.jsp" target="_blank">注册</a></h2>
    </form>
  </div>
</div>
</body>
</html>
