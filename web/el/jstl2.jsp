<%@ page import="java.util.List" %>
<%@ page import="xlj.wed.demo2.entity.People" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/15
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL循环语句</title>
</head>
<body>
循环数字
<c:forEach begin="1" end="10" var="x" step="1">
    ${x}
</c:forEach>
<!--
    begin  开始数
    end     结束数
    var     变量名     用来存储每次迭代的数据，    都存放在域中
    step     迭代的频率
 -->
<hr/>
循环集合  数组  map<br>
        <%
            List<People> list=new ArrayList<People>();
            list.add(new People(110,"张三","男",18,"武汉",12222,123));
            list.add(new People(111,"李四","男",18,"武汉",12222,123));
            list.add(new People(112,"王五","男",18,"武汉",12222,123));
            request.setAttribute("list",list);
        %>
<c:forEach items="${list}" var="p" varStatus="vs">
    ${p.name}
    ${vs.count}
</c:forEach>

</body>
</html>
