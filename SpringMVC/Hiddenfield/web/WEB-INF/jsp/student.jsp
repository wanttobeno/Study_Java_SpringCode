<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/27
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC处理(隐藏字段)</title>
</head>
<body>
<h2>学生信息：</h2>
<form:form method="POST" action="/Hiddenfield_war_exploded/addStudent">
    <table>
        <tr>
            <td><form:label path="name" >学生姓名：</form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="age">年龄：</form:label></td>
            <td><form:input path="age" /></td>
        </tr>
        <tr>
            <td><form:hidden path="id" value ="1000" /></td>
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
