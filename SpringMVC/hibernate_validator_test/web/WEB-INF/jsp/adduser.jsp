<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/28
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>显示结果</title>
</head>
<body>
<table>
    <tr>
        <td>用户名：</td>
        <td>${username}</td>
    </tr>
    <tr>
        <td>密码：</td>
        <td>${password}</td>
    </tr>
    <tr>
        <td>昵称：</td>
        <td>${nickname}</td>
    </tr>
    <tr>
        <td>邮箱：</td>
        <td>${email}</td>
    </tr>
</table>
</body>
</html>
