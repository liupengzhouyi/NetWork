<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018-12-10
  Time: 00:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>IP错误</title>
</head>
<body>
<%
    String string = "你的IP格式错误!";
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
