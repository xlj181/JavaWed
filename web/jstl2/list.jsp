<%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/15
  Time: 17:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>图书展示</title>
</head>
<body >
<div align="center">
<form id="myForm" action="${pageContext.request.contextPath}/queryBookServlet" method="get" >
    书名：<input type="text" class="change" name="name" size="6" value="${pageBean.name}">
    作者：<input type="text" class="change" name="authorName" size="6" value="${pageBean.authorName}">
    价格： <input type="text" class="change" size="6"   value="${pageBean.priceFrom}" name="priceFrom" />-  
     <input type="text" size="6"    value="${pageBean.priceTo}" name="priceTo" />
    <input id="pi" type="hidden" name="pageIndex">
    <input type="submit" value="搜索">
</form>
</div>
<table border="1" width="80%" align="center">
    <tr>
        <th>图书编号</th>
        <th>书名</th>
        <th>作者</th>
        <th>价格</th>
        <th>出版社</th>
        <th><a href="${pageContext.request.contextPath}/jstl2/save.jsp">添加</a></th>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.authorName}</td>
            <td>${book.price}</td>
            <td>${book.press}</td>
            <td><a href="${pageContext.request.contextPath}/updatePageBookServlet?id=${book.id}">修改</a></td>
            <td><a href="${pageContext.request.contextPath}/deleteBookServlet?id=${book.id}">删除</a></td>
        </tr>
        
    </c:forEach>
</table >
<table align="center">
    <%--<td><a href="${pageContext.request.contextPath}/queryBookServlet?pageIndex=1">首页</a></td>
    <td><a href="${pageContext.request.contextPath}/queryBookServlet?pageIndex=${pageBean.pageIndex>1?pageBean.pageIndex-1:1}">上一页</a></td>
    <td><a href="${pageContext.request.contextPath}/queryBookServlet?pageIndex=${pageBean.pageIndex<pageBean.totalPage?pageBean.pageIndex+1:pageBean.totalPage}">下一页</a></td>
    <td><a href="${pageContext.request.contextPath}/queryBookServlet?pageIndex=${pageBean.totalPage}">尾页</a></td>--%>
        <td><a href="javascript:homePage()">首页</a></td>
       <td><a href="javascript:upPage()">上一页</a></td>
       <td><a href="javascript:downPage()">下一页</a></td>
       <td><a href="javascript:endPage()">尾页</a></td>
    <td>第${pageBean.pageIndex}页/共${pageBean.totalPage}页</td>
</table>
</body>
<script type="text/javascript">
    //首页
    function homePage() {
        //把隐藏域中设置值
        var pi=document.getElementById("pi");
        pi.value="1";
        //提交表单
        var myForm=document.getElementById("myForm");
        myForm.submit();
    }
    //上一页
    function upPage() {
        //把隐藏域中设置值
        var pi=document.getElementById("pi");
        pi.value="${pageBean.pageIndex>1?pageBean.pageIndex-1:1}";
        //提交表单
        var myForm=document.getElementById("myForm");
        myForm.submit();
    }
    //下一页
    function downPage() {
        //把隐藏域中设置值
        var pi=document.getElementById("pi");
        pi.value="${pageBean.pageIndex<pageBean.totalPage?pageBean.pageIndex+1 : pageBean.totalPage}";
        //提交表单
        var myForm = document.getElementById("myForm");
        myForm.submit();
    }
    //尾页
    function endPage() {
        //把隐藏域中设置值
        var pi = document.getElementById("pi");
        pi.value="${pageBean.totalPage}";
        //提交表单
        var myForm = document.getElementById("myForm");
        myForm.submit();
    }
    //双击消除
    var changes = document.getElementsByClassName("change");
    for(var i=0;i<changes.length;i++){
        changes[i].ondblclick= function () {
            this.value="";
        }
    }
</script>


</html>
