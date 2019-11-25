<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%String msg=(String)request.getAttribute("msg");%>
    <<jsp:include page="/Homepage"/>
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
	<form action="./UpdateJsp" method="get">
		Employee Id : <input type="number" name="empId" required><br />
		Employee Name : <input type="text" name="empId" required><br />
		Mobile:<input type="number" name="mobile"><br/>
		
		Designation:<input type="text" name="mobile"><br/>
		Salary : <input type="number" name="empId" required><br />
		
		
		
		<br /> <input type="submit" value="Update">
	</form>

</body>
</html>