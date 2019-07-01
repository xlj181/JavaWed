<%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/19
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/servlet1">Servlet1</a>
<a href="/servlet2">servlet2</a>
<a href="/servlet3">servlet3</a>
<a href="/filter1.jsp">filter1</a>

<br/>
<br/>
<br/>

<table border="1" width="50%">
    <tr>
        <th>ip地址</th>
        <th>访问次数</tr>
    </tr>
    <c:forEach items="${ipMap}" var="entry">
        <tr>
            <td>${entry.key}</td>
            <td>${entry.value}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
