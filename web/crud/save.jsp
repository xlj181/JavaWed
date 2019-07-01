<%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/14
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加数据</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/saveServlet" method="get">
    <p>姓名：<input type="text" name="name" /></p>
    <p>年龄：<input type="text" name="age" /></p>
    <p>地址：<input type="text" name="address" /></p>
    <p>日期：<input type="text" name="birthday" /></p>
    <p><input type="submit" value="添加" /></p>
</form>

<%--<form action="<%=request.getContextPath()%>/saveServlet" method="post">
    <p>姓名：<input type="text" name="name" /></p>
    <p>年龄：<input type="text" name="age" /></p>
    <p>地址：<input type="text" name="address" /></p>
    <p>日期：<input type="text" name="birthday" /></p>
    <p><input type="submit" value="添加" /></p>
</form>--%>
</body>
</html>
