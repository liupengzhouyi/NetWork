<%@ page import="java.util.ArrayList" %>
<%@ page import="SubnettingTools.RangeSubnet.RangeSubnets" %><%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018-12-10
  Time: 00:32
  To change this template use File | Settings | File Templates.
--%>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <title>子网划分范围</title>
    <link href="CSSFile/index.css" type="text/css" rel="stylesheet">
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
<div id="button">
    <a href="/getYourIpAddressAndSubnetMask.jsp">
        <button class="button button1">
            <span>返回首页 </span>
        </button>
    </a>
</div>

<h1>
    显示所有子网
</h1>
<hr>
<table>
    <tr>
        <th class="a">
            <h3>
                子网序号
            </h3>
        </th>
        <th class="b">
            <h3>
                子网起始IP
            </h3>
        </th>
        <th class="c">
            <h3>
                子网结束IP
            </h3>
        </th>
        <th class="d">
            <h3>
                子网广播IP
            </h3>
        </th>
    </tr>
<%
    HttpSession httpSession = request.getSession();
    ArrayList<RangeSubnets> list = (ArrayList<RangeSubnets>) httpSession.getAttribute("AllSubnet");
    int i=0;
    for (RangeSubnets rangeSubnets : list
        ) {
        i++;
        //rangeSubnets.show();
        %>
    <tr>
        <td class="a">
            <%=i%>
        </td>
        <td class="b">
            <%=rangeSubnets.getStartIP().getIPAddress()%>
        </td>
        <td class="c">
            <%=rangeSubnets.getEndIP().getIPAddress()%>
        </td>
        <td class="d">
            <%=rangeSubnets.getBroadcastIP().getIPAddress()%>
        </td>
    </tr>
<%
    }
%>
</table>
</body>
</html>
