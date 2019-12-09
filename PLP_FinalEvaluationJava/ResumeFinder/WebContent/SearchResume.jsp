<%@page import="java.io.*,java.net.*"%>
<%@page import="com.manthan.resume.bean.ResumeBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%
	List<ResumeBean> ls = (ArrayList) request.getAttribute("ls");
%>
<%
	String msg = (String) request.getAttribute("msg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./Upload" style="margin-left: 90%">Upload Resume</a>

	<!-- <div align="center">
		<h2>Search Resume</h2>
	</div>
	<br>
	<form>
		<input type="text" name="keyword" placeholder="Search" style="margin-left:42%">
		<input type="submit" value="Search">
	</form> -->
	<fieldset>
		<legend>Search Resume</legend>
		<form action="./searchResume" method="get">
			Enter your keyword <input type="text" name="keyword" required><br />
			<br /> <input type="submit" value="Search">
		</form>
	</fieldset>
	<%
		if (msg != null && !msg.isEmpty()) {
	%>
	<%=msg%>
	<%
		}
	%>
	<%
		if (ls != null) {
	%>
<style>
      table, th, td {
      padding: 10px;
      border: 1px solid black; 
      border-collapse: collapse;
      text-align: center;
      }
    </style>
	<table>
		<tr>
			<th>FileName</th>
			<th>Name</th>
			<th>Email_ID</th>
			<th>Download link</th>
		</tr>
		<%
			for (ResumeBean rs : ls) {
		%>
		<tr>
			<td><%=rs.getFileName()%></td>&nbsp;
			<td><%=rs.getName()%></td>&nbsp;&nbsp;&nbsp;&nbsp;
			<td><%=rs.getEmail()%></td>&nbsp;
			<td> <a href="./downloadsevlet?filename=<%= rs.getFileName()%>"><img src="" alt="Download here!!
"></a></td>

			
			<%
				}
			%>
			<%
				}
			%>
		</tr>
	</table>

</body>
</html>
