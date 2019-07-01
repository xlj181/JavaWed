<%@ page import="xlj.wed.xlj.entity.Sanguo" %><%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/14
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>修改数据</title>
</head>
<body>
<%--<% //获取要修改的对象数据
    Sanguo sanguo=(Sanguo)request.getAttribute("sanguo");
%>
        <form action="<%=request.getContextPath()%>/updateServlet" method="get">

            <!--隐藏域 传递id-->
            <input type="text" hidden="hidden" name="id" value="<%=sanguo.getId()%>" />
            <p>姓名：<input type="text" name="name" value="<%=sanguo.getName()%>" /></p>
            <p>年龄：<input type="text" name="age" value="<%=sanguo.getAge()%>" /></p>
            <p>地址：<input type="text" name="address" value="<%=sanguo.getAddress()%>" /></p>
            <p>日期：<input type="text" name="birthday" value="<%=sanguo.getBirthday()%>" /></p>

            <p><input type="submit" value="保存" /></p>
        </form>--%>

        <form action="${pageContext.request.contextPath}/updateServlet" method="get">
            <!--隐藏域 传递id-->
            <input type="text" hidden="hidden" name="id" value="${sanguo.id}" />
            <p>姓名：<input type="text" name="name" value="${sanguo.name}" /></p>
            <p>年龄：<input type="text" name="age" value="${sanguo.age}" /></p>
            <p>地址：<input type="text" name="address" value="${sanguo.address}" /></p>
            <p>日期：<input type="text" name="birthday" value="${sanguo.birthday}" /></p>

            <p><input type="submit" value="保存" /></p>
        </form>
</body>
</html>
