<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/home" method="post">
    <span>USD:</span>
    <label>
        <input type="text" name="usd" value="${usd}">
    </label>
    <span>Tỉ giá:</span>
    <label>
        <input type="text" name="tigia" value="${tigia}">
    </label>
    <span>VND:</span>
    <span>
        <input value="${vnd}">
    </span>
    <button>Convert</button>
</form>
</body>
</html>
