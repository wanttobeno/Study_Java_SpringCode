<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/26
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Spring MVC表单处理之 - 密码</title>
</head>
<body>
<h2>提交的用户信息</h2>
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
        <td>用户地址：</td>
        <td>${address}</td>
    </tr>
</table>
</body>
</html>
