<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Login Form</title>
</head>
<body>
<h3> Login here </h3>
<form action="profile.jsp" method="post">
   User Name: <input type ="text" name ="username"/>
    <br/><br/>
   Password: <input type ="text" name = "password"/>
    <br/><br/>
    <input type ="submit" value="Submit"/>
</form>
</body>
</html>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }else{
            response.sendRedirect("/login.jsp");
        }
    }
%>
