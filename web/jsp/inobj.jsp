<%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/13
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="true" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // out  和< %="字符输出"% > 一样的用法
    out.print("字符输出");
    //page  当前页面对象 this
    String contextPath = pageContext.getServletContext().getContextPath();
//      pageContext 这是一个域对象最小的作用域 当前页面  页面上下文
//      config    ServletConfig的对象
//      request     HttpServletRequest的对象
//      response    HttpServletResponse的对象
//      session     HttpSession的对象
//      application   ServeltContext的对象
//      exception   异常对象 只能在异常页面使用

    //page、config、application、exception、pageContext使用少
    //out、request、response、session使用的相对较多
%>

<%=contextPath%>
</body>
</html>
