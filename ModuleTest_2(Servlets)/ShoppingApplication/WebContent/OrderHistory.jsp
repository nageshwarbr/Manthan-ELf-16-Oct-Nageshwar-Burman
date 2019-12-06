<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.manthan.shoppingapp.bean.Orderbean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <% List<Orderbean> ls=(ArrayList) request.getAttribute("seeEmployee"); %>
    <%String msg=(String)request.getAttribute("msg");%>
    
    <jsp:include page="./HomePage.jsp"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<form action="./orderhistory" method="get">
<td><input type="number" name="userId" required></td>
<input type="submit" value="Search">
</fieldset>
</form>

<%if(msg!=null && !msg.isEmpty()){ %>
	<%=msg %>
	<%} %>
	<%if(ls!=null){ %>
	<table>
	<tr>
	<td>All orders</td>
	<td>:</td>
	<td><%%></td>
	</tr><%Iterator<Orderbean> it=ls.iterator();
		while (it.hasNext()) {
			Orderbean bean =  it.next();%>
			<td>Order id :</td>
			<%=bean.getOrderId() %></br>
			<td>Product id:</td>
			<%=bean.getProdId() %></br>
			<td>Product price :</td>
		<%=bean.getPrice() %></br>
		<td>user id:</td>
		<%=bean.getUserId()%></br>
		<%}%>
	
	</table>
	<%} %>
</body>
</html>