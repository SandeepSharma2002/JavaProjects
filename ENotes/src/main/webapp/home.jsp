<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	 <%
	UserDetails user1  = (UserDetails) session.getAttribute("User");
	System.out.println( "In AddNotes ---> " + user1);
	if(user1 == null)
		response.sendRedirect("LoginPage.jsp");
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="Components/allcss.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<%@include file="Components/Navbar.jsp"%>
	<h1>Your Notes</h1>
	<a href="addNotes.jsp"
		class="btn btn-outline-success my-2 my-sm-0 mx-sm-2" type="submit">Start</a>
		
</body>
</html>