<%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/15
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加数据</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/saveBookServlet" method="get">
    <p>书名： <input type="text" name="name" /></p>
    <p>作者：<input type="text" name="authorName" /></p>
    <p>价格：<input type="text" name="price" /></p>
    <p>出版社：<input type="text" name="press" /></p>
    <p> <input type="submit" value="添加"></p>

</form>

</body>
</html>
