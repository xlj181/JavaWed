<%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/15
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="name" value="zhangsan" scope="request"></c:set><br>
<!--
    var:定义变量，接受value值
    scope：定义变量存放的域
 -->

<c:out value="name" default="pp"></c:out><br>
<!--
    value: 输出给页面值  给什么就输出什么
    default：当值为空时就输出这个
 -->

<c:out value="name"></c:out><br>
<c:out value="${name}"></c:out><br>
<c:out value="zhangsan"></c:out><br>

</body>
</html>
