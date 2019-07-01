<%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/15
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>导航栏</title>
</head>
<body>
<%--<a href="/JavaWed/HttpServletA">查看图片</a><br>
<a href="/JavaWed/HttpServletB">查看文本</a><br>
<a href="/JavaWed/HttpServletC">设置响应头</a><br>
<a href="/JavaWed/HttpServletD">获取请求数据1</a><br>

<a href="/JavaWed/RequestAA">获取请求数据</a><br>--%>

<a href="/JavaWed/querySanguoAll" target="min">查询全部</a><br>
<a href="/JavaWed/crud/save.jsp" target="min">添加</a><br>
<a href="${pageContext.request.contextPath}/queryBookServlet" target="min">查询全部</a>
</body>
</html>
