<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: kim
  Date: 8/4/2015
  Time: 3:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title></title>
</head>
<body>
<h1>${message}</h1>
<h2><a href = "/">Back to Index</a></h2>
<table border="1" align="center" style="width:50%">
  <thead>
  <tr>
    <th>Categories</th>
    <th></th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="category" items="${category}">
    <tr>
      <td>${category.description}</td>
      <td></td>
    </tr>
  </c:forEach>
  </tbody>
</table>

</body>
</html>

