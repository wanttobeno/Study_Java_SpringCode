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
    <title>Spring MVC表单提交（单选框）</title>
</head>
<body>
<h2>提示用户信息</h2>
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
        <td>是否订阅</td>
        <td>${receivePaper==true?"是":"否"}</td>
    </tr>
    <tr>
        <td>喜欢的技术/框架：</td>
        <td>
            <%
                String[] favoriteFrameworks = (String[])request.getAttribute("myfavoriteFrameworks");
                for (String framework : favoriteFrameworks) {
                    out.println(framework);
                }
            %>
        </td>
    </tr>
    <tr>
        <td>性别：</td>
        <td>${gender=="M"?"男":"女"}</td>
    </tr>
</table>
</body>
</html>
