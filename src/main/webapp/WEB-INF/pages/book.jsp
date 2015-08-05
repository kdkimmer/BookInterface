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

<h2><a href="/">Back to Index</a></h2>
<table border="1" align="center" style="width:50%">
    <thead>
    <tr>
        <th>ID</th>
        <th>Title</th>
        <th>Publisher</th>
        <th>Category</th>
        <th>Authors</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="book" items="${booklist}">
        <tr>
            <td>${book.id}</td>
            <td>${book.bookTitle}</td>
            <td>${book.publisher}</td>
            <td>${book.categoryDescription}</td>

            <%--<td><c:forEach var="category" items="${book.categoryDescription}">--%>
                <%--<table>--%>
                    <%--<tr>${category.description}<%=" "%></tr>--%>
                <%--</table>--%>
            <%--</c:forEach></td>--%>
            <td><c:forEach var="author" items="${book.authors}">
                <table>
                    <tr>${author.firstName}<%=" "%></tr>
                    <tr>${author.lastName}</tr>
                </table>
            </c:forEach></td>

            <td></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>

