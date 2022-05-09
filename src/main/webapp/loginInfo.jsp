
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:choose>
        <c:when test="${sessionScope.flag==1}">
           <div align="center" style="font-size: 30px">
                   ${loginInfo}
           </div>
        </c:when>
        <c:otherwise>
            <div align="center" style="font-size: 30px">
                    游客浏览
            </div>
        </c:otherwise>
    </c:choose>


</body>
</html>
