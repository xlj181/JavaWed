<%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/15
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updateBookServlet">
    <input type="text" hidden="hidden" name="id" value="${book.id}"/>
    <p>书名： <input type="text" name="name" value="${book.name}"/></p>
    <p>作者：<input type="text" name="authorName" value="${book.authorName}"/></p>
    <p>价格：<input type="text" name="price" value="${book.price}"/></p>
    <p>出版社：<input type="text" name="press" value="${book.press}"/></p>
    <p> <input type="submit" value="保存"></p>
</form>
</body>
</html>
