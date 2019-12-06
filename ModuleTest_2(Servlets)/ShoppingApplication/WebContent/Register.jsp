<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg=(String)request.getAttribute("msg"); %>
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
<form action="./register" method="post">
		<table>
			
			<tr>
				<td>UserId</td>
				<td>:</td>
				<td><input type="number" name="userId" required></td>
			</tr>
			
			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="name" name="Name" required></td>
			</tr>
			
			<tr>
				<td>Email</td>
				<td>:</td>
				<td><input type="email" name="email" required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="Register"></td>
			</tr>
		</table>
	</form>
</body>
</html>