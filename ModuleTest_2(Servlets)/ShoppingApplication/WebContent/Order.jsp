<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%String msg=(String)request.getAttribute("msg");%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%if(msg!=null && !msg.isEmpty()){ %>
	<%=msg %>
	<%} %>
<form action="./order" method="post">
		<table>
			<tr>
				<td>orderId</td>
				<td>:</td>
				<td><input type="number" name="orderId" required></td>
			</tr>
			<tr>
				<td>productId</td>
				<td>:</td>
				<td><input type="number" name="productId" required></td>
			</tr>
			<tr>
				<td>UserId</td>
				<td>:</td>
				<td><input type="number" name="UserId" required></td>
			</tr>
			
			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="Add order"></td>
			</tr>
		</table>
	</form>
</body>
</html>