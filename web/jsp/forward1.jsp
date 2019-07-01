<%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/13
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>请求转发</title>
</head>
<body>
    <jsp:forward page="forward2.jsp">
        <jsp:param name="name" value="zhangsan"></jsp:param>
    </jsp:forward>
</body>
</html>
