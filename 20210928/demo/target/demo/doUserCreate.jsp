<%@ page import="java.util.Arrays" %><%--
  Created by IntelliJ IDEA.
  User: huyuansong
  Date: 2021/9/28
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String password1 = request.getParameter("con_password");
        String email = request.getParameter("email");
        String[] hobbys = request.getParameterValues("hobby");
    %>
    用户名：
    <%
        if(username != null && !"".equals(username)) {
            String name = new String( username.getBytes("iso-8859-1") , "UTF-8" );
            out.print(name);
            //out.print(username);
        }else {
            out.print("没有输入用户名");
        }
    %>



</body>
</html>
