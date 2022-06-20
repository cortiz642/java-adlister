<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h3> Pick A Color </h3>
<form action="/pickcolor" method="POST">
<%--    <label for="color">What's your favorite color:</label>--%>
    <input type="text" id="color" name="color" placeholder="Your Favorite Color??"/>
    <button>Submit</button>
</form>
</body>
</html>
