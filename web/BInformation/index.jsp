<%@ page import="SubnettingTools.SubnettingTool" %><%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018-12-10
  Time: 00:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>IP信息</title>
    <link type="text/css" href="CSSFile/index.css" rel="stylesheet">
</head>
<body>
<%
    HttpSession httpSession = request.getSession();
    SubnettingTool subnettingTool = (SubnettingTool) httpSession.getAttribute("SubnettingTool");
%>
<h1>
    IP 详细 信息
</h1>

<hr>
<center>
    <table class="tableForIndex">
        <tr>
            <th>
                <h3>
                    IP地址
                </h3>
            </th>
            <td>
                <h4>
                    <%=subnettingTool.getIpAddress().getIPAddress()%>
                </h4>
            </td>
        </tr>
        <tr>
            <th>
                <h3>
                    默认网关
                </h3>
            </th>
            <td>
                <h4>
                    <%=subnettingTool.getSubnetMask().getSubnetMask()%>
                </h4>
            </td>
        </tr>
        <tr>
            <th>
                <h3>
                    网络种类
                </h3>
            </th>
            <td>
                <h4>
                    <%=subnettingTool.getNetKind()%>
                </h4>
            </td>
        </tr>
        <tr>
            <th>
                <h3>
                    子网数量
                </h3>
            </th>
            <td>
                <h4>
                    <%=subnettingTool.getSubnetNumbers()%>
                </h4>
            </td>
        </tr>
        <tr>
            <th>
                <h3>
                    可用子网数量
                </h3>
            </th>
            <td>
                <h4>
                    <%=subnettingTool.getEffectiveSubnetNumber()%>
                </h4>
            </td>
        </tr>
        <tr>
            <th>
                <h3>
                    子网中主机数量
                </h3>
            </th>
            <td>
                <h4>
                    <%=subnettingTool.getHostNumber()%>
                </h4>
            </td>
        </tr>
        <tr>
            <th>
                <h3>
                    有效主机数量
                </h3>
            </th>
            <td>
                <h4>
                    <%=subnettingTool.getEffectiveHostNumber()%>
                </h4>
            </td>
        </tr>
        <tr>
            <th>
                <h3>
                    网段开始IP地址
                </h3>
            </th>
            <td>
                <h4>
                    <%=subnettingTool.getBeginIp().getIPAddress()%>
                </h4>
            </td>
        </tr>
        <tr>
            <th>
                <h3>
                    网段结束IP地址
                </h3>
            </th>
            <td>
                <h4>
                    <%=subnettingTool.getEndIp().getIPAddress()%>
                </h4>
            </td>
        </tr>
        <tr>
            <th>
                <h3>
                    网段广播地址
                </h3>
            </th>
            <td>
                <h4>
                    <%=subnettingTool.getBroadcastBIpAddress().getIPAddress()%>
                </h4>
            </td>
        </tr>
    </table>
</center>

</body>
</html>