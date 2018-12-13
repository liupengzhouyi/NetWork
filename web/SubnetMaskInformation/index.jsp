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
</head>
<body>
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
