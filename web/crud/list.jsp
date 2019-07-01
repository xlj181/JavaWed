<%@ page import="java.util.List" %>
<%@ page import="xlj.wed.xlj.entity.Sanguo" %><%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/14
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>三国人物</title>
</head>
<body>


<table border="1" width="50%" align="center">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>地址</th>
        <th>日期</th>
        <th>修改</th>
        <th>删除</th>
    </tr>
    <c:forEach items="${sanguoList}" var="sanguo">

        <tr>
            <td>${sanguo.id}</td>
            <td>${sanguo.name}</td>
            <td>${sanguo.age}</td>
            <td>${sanguo.address}</td>
            <td>${sanguo.birthday}</td>
            <td><a href="${pageContext.request.contextPath}/updatePageServlet?id=${sanguo.id}">修改</a></td>
            <td><a href="${pageContext.request.contextPath}/deleteServlet?id=${sanguo.id}">删除</a></td>
        </tr>
    </c:forEach>


    <%--<%
        List<Sanguo> sanguoList=(List<Sanguo>)request.getAttribute("sanguoList");
        for (Sanguo p : sanguoList) {
    %>
    <tr>
        <td><%=p.getId()%></td>
        <td><%=p.getName()%></td>
        <td><%=p.getAge()%></td>
        <td><%=p.getAddress()%></td>
        <td><%=p.getBirthday()%></td>
        <td><a href="<%=request.getContextPath()%>/updatePageServlet?id=<%=p.getId()%>">修改</a></td>
        <td><a href="<%=request.getContextPath()%>/deleteServlet?id=<%=p.getId()%>">删除</a></td>
    </tr>
    <%
    }
    %>--%>

</table>

页面
</body>
</html>
