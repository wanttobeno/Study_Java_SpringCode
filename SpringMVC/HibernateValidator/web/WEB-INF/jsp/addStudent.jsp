<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/4/2
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<style>
    .error {
        color:#ff0000;
    }

    .errorblock {
        color:#000;
        background-color: #ffeeee;
        border:3px solid #ff0000;
        padding: 8px;
        margin:16px;
    }
</style>
<body>
<h2>学生信息</h2>
<form:form method="POST"
           action="/HibernateValidator_war_exploded/addStudent"
           commandName="student" >
    <form:errors path="*" cssClass="errorblock" element="div" />
    <table>
        <tr>
            <td><form:label path="name">姓名：</form:label></td>
            <td><form:input path="name" /></td>
            <td><form:errors path="name" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="age">年龄：</form:label></td>
            <td><form:input path="age"/></td>
            <td><form:errors path="age" cssClass="error"/> </td>
        </tr>
        <tr>
            <td><form:label path="id">编号：</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交" />
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
