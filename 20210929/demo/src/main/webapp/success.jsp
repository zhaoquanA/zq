<%--
  Created by IntelliJ IDEA.
  User: huyuansong
  Date: 2021/9/29
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    成功
</head>
<body>
    <%
        String message = request.getParameter("message");
        out.print(message);
    %>
</body>
</html>
