<%--
  Created by IntelliJ IDEA.
  User: huyuansong
  Date: 2021/10/25
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String uName = (String) session.getAttribute("uName");
        String pwd = (String) session.getAttribute("pwd");

    %>
    <lable> 姓名 ：</lable>
    <input type="text" value="<%=uName%>">





</body>
</html>
