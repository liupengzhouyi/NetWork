<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018-12-10
  Time: 00:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>127Error</title>
</head>
<body>
    <%
        String string = "你的IP地址为127开头，我们不提供为127开头的IP地址服务！";
    %>
    <h1>
        <center>
            <%=string%>
        </center>
    </h1>
<hr>
<h3>
    <center>
        <a href="/getYourIpAddressAndSubnetMask.jsp">
            点我返回
        </a>
    </center>
</h3>
</body>
</html>
