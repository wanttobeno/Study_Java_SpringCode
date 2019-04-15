<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/26
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC表单处理（单选框）</title>
</head>
<body>
<h2>用户信息</h2>
<form:form method="POST" action="/RadioButton_war_exploded/addUser">
    <table>
        <tr>
            <td><form:label path="username">用户名：</form:label></td>
            <td><form:input path="username" /></td>
        </tr>
        <tr>
            <td><form:label path="password">密码：</form:label></td>
            <td><form:password path="password" /></td>
        </tr>
        <tr>
            <td><form:label path="address">地址：</form:label></td>
            <td><form:textarea path="address" rows="5" cols="30" /></td>
        </tr>
        <tr>
            <td><form:label path="receivePaper">订阅新闻？</form:label></td>
            <td><form:checkbox path="receivePaper" /></td>
        </tr>
        <tr>
            <td>喜欢的框架/技术：</td>
            <td>
                <form:checkboxes items="${webFrameworkList}" path="favoriteFrameworks" />
            </td>
        </tr>
        <tr>
            <td>
                <form:radiobutton path="gender" value="M" label="男" />
                <form:radiobutton path="gender" value="F" label="女" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
