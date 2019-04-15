<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/27
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC处理(隐藏字段)</title>
</head>
<body>

<h2>提交的学生信息：</h2>
<table>
    <tr>
        <td>学生姓名：</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>年龄：</td>
        <td>${age}</td>
    </tr>
    <tr>
        <td>编号：</td>
        <td>${id}</td>
    </tr>
</table>
</body>
</html>