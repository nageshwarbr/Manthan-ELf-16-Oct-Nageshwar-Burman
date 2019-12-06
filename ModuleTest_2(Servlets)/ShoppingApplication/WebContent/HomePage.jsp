<%@page import="com.manthan.shoppingapp.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% UserBean user=(UserBean)session.getAttribute("userBean");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<h3>Hello!! <%=user.getUserName() %> !!</h3><br>
<h3>Email : <%=user.getEmailId() %> !!</h3><br>
<br>
<a href='./Search.jsp'>Search</a></br>
<a href='./Register.jsp'>Register</a></br>
<a href='./Order.jsp'>Order</a></br>
<a href='./Login.jsp'>Logout!!</a></br>
<a href='./OrderHistory.jsp'>See Order history</a></br>
</fieldset>
</body>
</html>