<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%!
    int a=100;
    public int getA(){
    	return a;
    }
    public void setA(int a){
    	this.a=a;
    }
    String name="Kunal";
    public String getName(){
    	return name;
    }
    public String getName(String givenName){
    	return givenName;
    }
    public void setName(String givenName){
    	this.name=givenName;
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%boolean isTrue=true; %>
<h2>Hello user</h2>
<%for(int i=1;i<5;i++){ %>
<%=getName() %><br>
<%=getName("Abc") %>
<%} %>

</body>
</html>
<%--<jsp:forward page="date.html"></jsp:forward>--%>qxsqxzq	zq	xs<%-- static response--%>
<%--<jsp:forward page="/myFirstServletUpdate" />--%><%-- dynamic response--%>
<%-- <jsp:include page="date.html"></jsp:include> --%>
<jsp:include page="/myFirstServletUpdate"></jsp:include>
