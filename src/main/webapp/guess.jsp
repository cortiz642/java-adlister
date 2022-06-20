<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <p>Guess a number between 1 and 3??</p>
    <form action="/guess" method="POST">
    <input type="text" name="win" id="win" placeholder="Guess A Number?">
    <button>Submit Guess</button>
    </form>
</body>
</html>
