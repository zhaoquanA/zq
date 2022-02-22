<%--
  Created by IntelliJ IDEA.
  User: huyuansong
  Date: 2021/10/25
  Time: 14:45
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
        String uName = request.getParameter("uName");
        String pwd = request.getParameter("pwd");
        if ( uName.equals("amdin") ) {
            out.print("用户名不符合要求");
        }else {
            // 符合要求，加入到session域中，供下一个页面获取使用
            session.setAttribute("uName" , uName);
            session.setAttribute("pwd" , pwd );

            response.sendRedirect("login.jsp");

        }
    %>
</body>
</html>
