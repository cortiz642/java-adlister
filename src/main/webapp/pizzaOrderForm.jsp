<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<jsp:include page="partials/navbar.jsp" />--%>
<h3> Welcome to Pizza On The Run </h3>
<form action="pizza-order" method="post">
    <label for="crustType">Choose a crust:</label>
    <select name="crustType" id="crustType">
        <option value="Thin Crust">Thin Crust</option>
        <option value="Garlic Crust">Garlic Crust</option>
        <option value="Original Crust">Original Crust</option>
        <option value="Cheesy Crust">Cheesy Crust</option>
    </select>
    <br/><br/>
    <label for="sauceType">Choose your sause:</label>
    <select name="sauceType" id="sauceType">
        <option value="Marinara">Marinara</option>
        <option value="Orale Spicy">Orale Spicy</option>
        <option value="Cool Ranch">Cool Ranch</option>
        <option value="Bean flavor">Bean Flavor</option>
    </select>
    <br/><br/>
        <input type="checkbox" id="pepperoni" name="topping" value="on">
        <label for="pepperoni"> Pepperoni</label><br>
        <input type="checkbox" id="pineapple" name="topping" value="Pineapple">
        <label for="pineapple"> Pineapple</label><br>
        <input type="checkbox" id="italian" name="topping" value="Italian Sausage">
        <label for="italian">Italian Sausage</label><br>
    <br/><br/>
<%--    <label for="delivery">Choose your sause:</label>--%>
<%--    <select name="delivery" id="delivery">--%>
<%--    <input type ="text" name ="address" value="Delivery Address"/>--%>
    <br/><br/>
    <input type ="submit" value="Submit"/>
</form>

</body>
</html>
<%--<%--%>
<%--    if (request.getMethod().equalsIgnoreCase("post")) {--%>
<%--        String crust = request.getParameter("crust");--%>
<%--        String sauce = request.getParameter("sauce");--%>
<%--        String size = request.getParameter("size");--%>
<%--        System.out.println(crust);--%>
<%--    }--%>
<%--%>--%>