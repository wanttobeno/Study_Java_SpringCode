<%--
  Created by IntelliJ IDEA.
  User: ZhanYue
  Date: 2019/3/25
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <title>Spring Loading Page</title>
</head>
<body>
<h2>Spring Loading Page</h2>
<p>点击下面的按钮获得一个简单的HTML页面</p>
<form:form method="GET" action="/StaticPageSpringMVC_war_exploded/staticPage">
  <table>
    <tr>
      <td>
        <input type="submit" value="获取HTML页面">
      </td>
    </tr>
  </table>
</form:form>
</body>
</html>
