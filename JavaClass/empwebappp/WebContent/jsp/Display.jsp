<%@page import="javax.servlet.annotation.WebServlet"%>
<%@page import="com.manthan.empwebapp.beans.EntryBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p><%=request.getParameter("Id") %></p>
<p><%=request.getParameter("Name") %></p>
</body>
</html>