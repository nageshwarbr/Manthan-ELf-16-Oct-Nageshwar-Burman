<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean) request.getAttribute("searchEmployee"); %>
    <%String msg=(String)request.getAttribute("msg");%>
    <<jsp:include page="/Homepage"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Search Employee</legend>
<form action="./searchJsp" method="get">
		Employee Id : <input type="text" name="empId" required><br />
		<br /> <input type="submit" value="Search">
	</form>
	</fieldset>
	<%if(msg!=null && !msg.isEmpty()){ %>
	<%=msg %>
	<%} %>
	<%if(employeeInfoBean!=null){ %>
	<table>
	<tr>
	<td>Employee Id</td>
	<td>:</td>
	<td><%=employeeInfoBean.getEmpId()%></td>
	</tr>
	<tr>
	<td>Employee name</td>
	<td>:</td>
	<td><%=employeeInfoBean.getEmpName()%></td>
	</tr>
	<tr>
	<td>Employee age</td>
	<td>:</td>
	<td><%=employeeInfoBean.getAge() %></td>
	</tr>
	<tr>
	<td>Employee mobile</td>
	<td>:</td>
	<td><%=employeeInfoBean.getMobile() %></td>
	</tr>
	<tr>
	<td>Employee designation</td>
	<td>:</td>
	<td><%=employeeInfoBean.getDesignation() %></td>
	</tr>
	<tr>
	<td>Employee salary</td>
	<td></td>
	<td><%=employeeInfoBean.getSalary() %></td>
	</tr>
	</table>
	<%} %>
	
</body>
</html>