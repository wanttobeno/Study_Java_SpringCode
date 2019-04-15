<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/26
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC表单之 - 输入框处理</title>
</head>
<body>
<h2>学生信息</h2>
<form:form method="POST" action="/TextBox_war_exploded/addStudent">
    <table>
        <tr>
            <td>
                <form:label path="name" >姓名</form:label>
            </td>
            <td>
                <form:input path="name" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="age">年龄：</form:label>
            </td>
            <td>
                <form:input path="age" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="id" >编号：</form:label>
            </td>
            <td>
                <form:input path="id" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交学生信息" />
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
