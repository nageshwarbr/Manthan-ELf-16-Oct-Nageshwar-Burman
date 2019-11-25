<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg=(String)request.getAttribute("msg");%>
    <jsp:include page="/Homepage"/>
    
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
<form action="./addempJsp" method="post">
		<table>
			<tr>
				<td>EmpId</td>
				<td>:</td>
				<td><input type="number" name="empId" required></td>
			</tr>
			<tr>
				<td>EmpName</td>
				<td>:</td>
				<td><input type="text" name="empName" required></td>
			</tr>
			<tr>
				<td>EmpAge</td>
				<td>:</td>
				<td><input type="number" name="age" required></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td>:</td>
				<td><input type="text" name="designation" required></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td>:</td>
				<td><input type="number" name="salary" required></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td>:</td>
				<td><input type="number" name="mobile" required></td>
			</tr>
			<tr>
				<td colspan="3" align="center"><input type="submit"
					value="Add employee"></td>
			</tr>
		</table>
	</form>
</body>
</html>