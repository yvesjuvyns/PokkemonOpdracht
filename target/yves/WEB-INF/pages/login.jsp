<%--
  Created by IntelliJ IDEA.
  User: YVESJ
  Date: 09/09/2019
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hallo HB05 Java!!</title>
</head>
<body>

<%
response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
%>

<h1>Hello Guest${warning}</h1>
<h2>Give a name to Log in</h2>
<form method="POST" action="testdrie">

    <input type="text" name="SomeName"/>
    <input type="submit" value="Push here" />

</form>

</body>
</html>
