<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/27
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC表单错误处理</title>
</head>
<body>
<form:form method="POST" commandName="user" >
    <table>
    <tr>
        <td>用户名:</td>
        <td>
            <form:input path="username"/>
        </td>
        <td>
            <form:errors path="username" />
        </td>
    </tr>
    <tr>
        <td>密码:</td>
        <td>
            <form:input path="password"/>
        </td>
        <td>
            <form:errors path="password" />
        </td>
    </tr>
    <tr>
    <td>昵称:</td>
        <td>
            <form:input path="nickname" />
        </td>
        <td>
            <form:errors path="nickname" element="div"/>
        </td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="提交">
        </td>
    </tr>
    </table>
</form:form>
</body>
</html>
