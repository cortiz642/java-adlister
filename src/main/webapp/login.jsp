<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login Form</title>
</head>
<body>
<h3> Login here </h3>
<form action="profile.jsp" method="post">
   First name: <input type ="text" name ="firstName"/>
    <br/><br/>
   Last name: <input type ="text" name = "LastName"/>
    <br/><br/>
    <input type ="submit" value="Submit"/>
</form>
</body>
</html>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
%>
