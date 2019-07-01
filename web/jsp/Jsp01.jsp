<%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/13
  Time: 8:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第一个JSP</title>
</head>
<body>
        jsp脚本
        <% int a=10;
            System.out.println("a="+a);
        %>
        <hr/>
        表达式
    <%= a %>
        <hr/>
        声明
    <%! private String name;
        private String sex;


        public void ser(String name){
            this.name=name;
        }
    %>
</body>
</html>
