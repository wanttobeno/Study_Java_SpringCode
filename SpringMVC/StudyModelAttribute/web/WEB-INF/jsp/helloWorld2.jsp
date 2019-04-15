<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/29
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>helloWord2</h1>
<table>
    <tr>
        <td>用户名：</td>
        <td>${myUser.name}</td>
    </tr>
    <tr>
        <td>账号:</td>
        <td>${myUser.account}</td>
    </tr>
</table>
</body>
</html>
