<%@page import="com.manthan.shoppingapp.bean.ProductBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% ProductBean bean=(ProductBean)request.getAttribute("searchProduct");%>
    <%String msg=(String)request.getAttribute("msg"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Search Product</legend>
<form action="./search" method="get">
		Product Id : <input type="number" name="prodId" required><br />
		<br /> <input type="submit" value="Search">
	</form>
	</fieldset>
	<%if(msg!=null && !msg.isEmpty()){ %>
	<%=msg %>
	<%} %>
	<%if(bean!=null){ %>
	<table>
	<tr>
	<td>ProductId</td>
	<td>:</td>
	<td><%=bean.getProductId()%></td>
	</tr>
	<tr>
	<td>ProductName</td>
	<td>:</td>
	<td><%=bean.getProductName()%></td>
	</tr>
	
	<tr>
	<td>Product Quantity</td>
	<td>:</td>
	<td><%=bean.getQuantity() %></td>
	</tr>
	<tr>
	<td>Product Cost</td>
	<td>:</td>
	<td><%=bean.getProdcost() %></td>
	</tr>
	<tr>
	<td>Prod Color</td>
	<td>:</td>
	<td><%=bean.getProdColor() %></td>
	</tr>
	<tr>
	<td>Description</td>
	<td>:</td>
	<td><%=bean.getDescription() %></td>
	</tr>
	
	</table>
	<%} %>
	<a href='./Register.jsp'>Register</a></br>
	<a href='./HomePage.jsp'>Homepage</a></br>
	
</body>
</html>