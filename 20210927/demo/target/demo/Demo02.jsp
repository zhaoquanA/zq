<%--
  Created by IntelliJ IDEA.
  User: huyuansong
  Date: 2021/9/27
  Time: 17:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <%
        // 局部变量
        //int count = 1 ;
        out.print(count);
    %>


    <%!
        // 全局变量
        int count = 4 ;
    %>
    <%
        out.print(count);
    %>


</body>
</html>
