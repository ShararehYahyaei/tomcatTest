<%--
  Created by IntelliJ IDEA.
  User: Milad
  Date: 2/21/2025
  Time: 11:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>

    <title>Hello World JSP</title>
</head>
<body>
<%--    <c:if test="${param.name == null}">--%>
<%--        <h1>Hello, World</h1>--%>
<%--    </c:if>--%>
<%--    <c:if test="${param.name != null}">--%>
<%--        <h1>Hello, ${param.name}</h1>--%>
<%--    </c:if>--%>

<%--    <c:forEach var="item" items="${names}">--%>
<%--        <p>${item}</p>--%>
<%--    </c:forEach>--%>

<%--<h1>username: ${username} password: ${password}</h1>--%>
<%--<h1>username: ${user.username} password: ${user.password}</h1>--%>
<h1>user: ${foundedUser}</h1>
<form action="${action}" method="get">
    <input placeholder="userName" type="text" name="username">
    <button type="submit">submit</button>
</form>
</body>
</html>
