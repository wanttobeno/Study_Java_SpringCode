<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/25
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:useBean id="command" class="com.yiibai.springmvc.Student" scope="request"></jsp:useBean>
<html>
<head>
    <title>Spring MVC表单处理</title>
</head>
<body>

<h2>Student Information</h2>

<%--这个路径就工程名--%>
<form:form method="POST" action="/FormHandlingSpringMVC_war_exploded/addStudent">
    <table>
        <tr>
            <td><form:label path="name">名字:</form:label> </td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="age">年龄：</form:label></td>
            <td><form:input path="age" /></td>
        </tr>
        <tr>
            <td><form:label path="id">编号</form:label></td>
            <td><form:input path="id" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交表单">
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>
