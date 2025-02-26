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
    <title>Hello List </title>
</head>
<body>
    <c:if test="${param.reza == null}">
        <h1>Hello, World</h1>

    </c:if>
    <c:if test="${param.reza != null}">
        <h1>Hello, ${param.reza}</h1>
    </c:if>

    <c:forEach var="item" items="${names}">
        <p>${item}</p>
    </c:forEach>
    <p> Hello,${name}</p>
</body>
</html>
