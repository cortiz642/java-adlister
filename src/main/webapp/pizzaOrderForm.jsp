<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<jsp:include page="partials/navbar.jsp" />--%>
<h3> Welcome to Pizza On The Run </h3>
<form action="pizzaOrderForm.jsp" method="post">
    <p>Crust Type:</p>
    <input type = "checkbox" name = "crust"  /> Thin Crust
    <input type = "checkbox" name = "crust"  /> Pan Pizza
    <input type = "checkbox" name = "crust"  /> Garlic Crust
    <input type = "checkbox" name = "crust"  /> Burnt Crust
    <br/><br/>
    <p>Sauce Type:</p>
    <input type = "checkbox" name = "sauce"  /> Mellow Marinara
    <input type = "checkbox" name = "sauce"  /> Orale Spicy
    <input type = "checkbox" name = "sauce"  /> Too Good for Sauce
    <input type = "checkbox" name = "sauce"  /> Random
    <br/><br/>
    <p>Size Type:</p>
    <input type = "checkbox" name = "size"  /> Chingon 48"
    <input type = "checkbox" name = "size"  /> Large and In Charge 36"
    <input type = "checkbox" name = "size"  /> Normal "16"
    <input type = "checkbox" name = "size"  /> Small "8"
    <br/><br/>
    <input type ="submit" value="Submit"/>
</form>

</body>
</html>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String crust = request.getParameter("crust");
        String sauce = request.getParameter("sauce");
        String size = request.getParameter("size");
        System.out.println(crust);
    }
<%--%>--%>