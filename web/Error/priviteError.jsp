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
    <title>输入私有IP</title>
</head>
<body>
<%
    String string = "你的IP地址为私有IP，我们不提供为私有IP地址的服务！请开通VIP服务！";
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
