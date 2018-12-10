<%--
  Created by IntelliJ IDEA.
  User: liupeng
  Date: 2018-12-09
  Time: 23:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查看你的网络</title>
</head>
<body>
<form action="/SubnettingTools/GetInputInformationServlet" method="post">
    <table border="1">
        <tr>
            <th>
                <h3>
                    请输入你的IP地址：
                </h3>
            </th>
            <td>
                <input type="number" name="IPAddressNumberI">
                ·
                <input type="number" name="IPAddressNumberII">
                ·
                <input type="number" name="IPAddressNumberIII">
                ·
                <input type="number" name="IPAddressNumberIV">
            </td>
        </tr>
        <tr>
            <th>
                <h3>
                    请输入你的默认网关
                </h3>
            </th>
            <td>
                <input type="number" name="SubnetMaskNumberI">
                ·
                <input type="number" name="SubnetMaskNumberII">
                ·
                <input type="number" name="SubnetMaskNumberIII">
                ·
                <input type="number" name="SubnetMaskNumberIV">
            </td>
        </tr>
        <tr>
            <th>
                <input type="reset" name="重置">
            </th>
            <th>
                <input type="submit" name="提交">
            </th>
        </tr>
    </table>
</form>
</body>
</html>
