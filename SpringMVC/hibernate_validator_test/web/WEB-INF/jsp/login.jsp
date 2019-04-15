<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/28
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:useBean id="command" class="com.my.test.User" scope="request"></jsp:useBean>
<html>
<head>
    <title>hibernate_validator_test</title>
</head>
<body>
<form:form method="POST" action="/hibernate_validator_test_war_exploded/save" >
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
            <td>邮箱:</td>
            <td>
                <form:input path="email" />
            </td>
            <td>
                <form:errors path="email" element="div"/>
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
