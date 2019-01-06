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
<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
<script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
<script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
<style>
    div#button
    {
        text-align: right;
    }
    .button {
        background-color: #ff983c; /* Green */
        border: none;
        color: white;
        padding: 15px 32px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        margin: 4px 2px;
        cursor: pointer;
        border-radius: 10px;
    }
    .button span {
        cursor: pointer;
        display: inline-block;
        position: relative;
        transition: 0.5s;
    }

    .button span:after {
        content: '»';
        position: absolute;
        opacity: 0;
        top: 0;
        right: -20px;
        transition: 0.5s;
    }

    .button:hover span {
        padding-right: 25px;
    }

    .button:hover span:after {
        opacity: 1;
        right: 0;
    }
</style>
</head>
<body>
<%
    HttpSession httpSession = request.getSession();
    SubnettingTool subnettingTool = (SubnettingTool) httpSession.getAttribute("SubnettingTool");
%>
<div id="button">
    <a href="/getYourIpAddressAndSubnetMask.jsp">
        <button class="button button1">
            <span>返回首页 </span>
        </button>
    </a>
</div>

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
        <tr>
            <th>
                <h3>
                    查看所有子网划分
                </h3>
            </th>
            <td>
                <h4>
                    <a href="/SubnetMaskInformation/index.jsp">
                        点我查看
                    </a>
                </h4>
            </td>
        </tr>
    </table>
</center>
</body>
</html>
