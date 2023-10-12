<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/home" method="post">
    <span>English:</span>
    <label>
        <input type="text" name="en" value="${en}">
    </label>
    <span>Vietnamese:</span>
    <label>
        <input type="text" name="vi" value="${vi}">
    </label>
    <button>Search</button>
</form>
</body>
</html>
