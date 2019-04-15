<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/27
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Spring MVC表单处理（下拉选择）</title>
</head>
<body>
<h2>提交用户信息</h2>
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
        <td>地址：</td>
        <td>${address}</td>
    </tr>
    <tr>
        <td>是否订阅：</td>
        <td>${receivePaper==true?"是":"否"}</td>
    </tr>
    <tr>
        <td>喜欢的技术/框架:</td>
        <td>
            <%
                String[] favos = (String []) request.getAttribute("favoriteFrameworks");
                for (String str:favos)
                    out.println(str);
            %>
        </td>
    </tr>
    <tr>
        <td>性别：</td>
        <td>${gender=="M"?"男":"女"}</td>
    </tr>
    <tr>
        <td>喜欢的数字：</td>
        <td>${favoriteNumber}</td>
    </tr>
    <tr>
        <td>国家：</td>
        <td>${country}</td>
    </tr>
</table>
</body>
</html>
