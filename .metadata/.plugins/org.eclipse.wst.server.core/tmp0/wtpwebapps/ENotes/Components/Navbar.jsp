<%@page import="com.User.UserDetails"%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container-fluid">
		<a class="navbar-brand" >E-Notes</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="home.jsp">Home</a></li>
				<li class="nav-item"><a href = "addNotes.jsp" class="nav-link">Add Notes</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="showNotes.jsp">Show
						Notes</a></li>
			</ul>
			<form class="d-flex" method="post" action="./UserServlet/logout">
				<%
				UserDetails user = (UserDetails) session.getAttribute("User");
				if (user != null) {
				%>
				<a href="home.jsp"
					class="btn btn-outline-success my-2 my-sm-0 mx-sm-2" type="button">Welcome
					<%=user.getName()%></a> <button
					class="btn btn-outline-success my-2 my-sm-0 mx-sm-2" type="submit"
				     >Logout</button>
				<%
				} else {
				%>
				<a href="LoginPage.jsp"
					class="btn btn-outline-success my-2 my-sm-0 mx-sm-2" type="button">Login</a>
				<a href="RegisterPage.jsp"
					class="btn btn-outline-success my-2 my-sm-0 mx-sm-2" type="button">Register</a>
				<%
				}
				%>



			</form>
		</div>
	</div>
</nav>