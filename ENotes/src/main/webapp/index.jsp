<%@page import="com.db.DBconnect"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%
  UserDetails user1 = (UserDetails) session.getAttribute("User");
  if (user1 != null)
	response.sendRedirect("home.jsp");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>

<%@ include file="Components/allcss.jsp"%>
</head>
<body>
	<%@include file="Components/Navbar.jsp"%>
	<h1>E Notes-Save Your Notes</h1>
	<a href="LoginPage.jsp"
		class="btn btn-outline-success my-2 my-sm-0 mx-sm-2" type="submit">Login</a>
	<a href="RegisterPage.jsp" class="btn btn-outline-success my-2 my-sm-0"
		type="submit">Register</a>

</body>
</html>