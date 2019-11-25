<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <% EmployeeInfoBean employeeInfoBean=(EmployeeInfoBean) session.getAttribute("employeeInfoBean"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Hello!! <%=employeeInfoBean.getEmpName() %> !!</h3><br>
<a href='./searchPage'>Search Employee</a></br>
<a href='./AddempJsp'>Add New Employee</a></br>
<a href='./UpdateempJsp'>Update Employee</a></br>
<a href='./DeleteempJsp'>Delete Employee</a></br>
<a href='./logout'>Logout</a></br>

</body>
</html>