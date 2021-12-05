<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <title> 谈北京精神 </title>
</head>
<body>
    <% out.print("谈北京精神 hhhh "); %>
    <%
        // 这里书写Java代码
        String title = "这是标题";
        out.print(title);

    %>
    <%=title%>

    <%
        out.print(new Date().toString());
    %>
    <%
        out.print(" \"李姐\"万岁");
    %>



    <%--  jsp的注释  --%>
    <%
        out.print("<h2> 标题 </h2>   <!-- 这是jsp中的java代码中的html的注释--> "); // 这是Jsp中的java代码注释
    %>

</body>
</html>
