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
<%if(msg!=null){ %>

<%=msg %>
<%} %>
	<fieldset>
		<legend>Employee login</legend>
		<form action="./login2" method="post">
			<table>
				<tr>
					<td>Employee Id</td>
					<td>:</td>
					<td><input type="number" name="empId" required></td>
				</tr>
				<tr>
					<td>Password</td>
					<td>:</td>
					<td><input type="password" name="password" required></td>
				</tr>
				<td colspan="3"><br /> <input type="submit" value="Login"></td>
				</tr>

			</table>
		</form>


	</fieldset>
</body>
</html>