<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/28
  Time: 15:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>显示用户信息</title>
</head>
<body>
<h5>注册成功，个人信息如下：</h5>
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
</table>
</body>
</html>
