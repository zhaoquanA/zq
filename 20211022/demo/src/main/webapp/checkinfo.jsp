<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: huyuansong
  Date: 2021/10/22
  Time: 8:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setCharacterEncoding("utf-8");
        // response.setCharacterEncoding("utf-8"); // 可以省略
        String uName = request.getParameter("uName");
        String uPwd = request.getParameter("uPwd");
        out.print(uName + " " + uPwd ) ;
        //String habbit = request.getParameter("habbit");
        String[] habbits = request.getParameterValues("habbit");
        out.print(Arrays.toString(habbits));
    %>



</body>
</html>
