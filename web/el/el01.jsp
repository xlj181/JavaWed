<%@ page import="xlj.wed.demo2.entity.People" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: xlj
  Date: 2019/5/14
  Time: 22:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${4+3}
        <%
            People people=new People();
            people.setId(20);
            people.setName("张三");
            people.setSex("男");
            people.setAge(12);
            people.setAddress("武汉");
            people.setAslary(22222);
            people.setIdcard(123);
            request.setAttribute("p",people);
        %>
<%=people.getName()%>
<%--要获取的是域中数据，people没有指定位置，上面的peopleEL
            表达式无法获取
            只能获取
            pageScope   page域的数据
            requestScope    request域中数据
            sessionScope       session域
            applicationScope    application域
            param
--%>
${requestScope.p.aslary} ${requestScope.p.name}
<hr/>

获取数组
<%
    String[] arrs =new String[]{"张珊","李四","王五"};
    session.setAttribute("arrs",arrs);
%>
${sessionScope.arrs[0]}

<hr/>
list
<%
    List<People> list =new ArrayList<People>();
    list.add(new People(110,"张珊","女",18,"武汉",4561,123));
    list.add(new People(111,"李四","女",18,"武汉",4561,123));
    list.add(new People(112,"王五","女",18,"武汉",4561,123));

    request.setAttribute("list",list);
%>
${requestScope.list[1].name}
<hr/>
    <!-- 在jsp页面中，使用el表达式获取map集合的数据 -->
<%
    Map<String,String> map = new HashMap<String, String>();
    map.put("s9527","唐伯虎");
    map.put("s89757","林俊杰");
    map.put("s4396","厂长");

    pageContext.setAttribute("map",map);

    //键不建议使用数字
%>
${pageScope.map["s9527"]}
${pageScope.map.s9527}
<hr/>
${map.s4396}
${list[2].name}
${p.address}

<hr>

<!-- 迭代Map集合 -->
       <c:forEach var="me" items="${map}">
               ${me.key}=${me.value}<br/>
          </c:forEach>
<%--pageScope requestScope sessionScope applicationScope 可以省略不写
如果有属性名相同，从左到右的依次查找，有就停止，并使用--%>
${p}

</body>
</html>
