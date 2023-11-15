<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%
	UserDetails user1  = (UserDetails) session.getAttribute("User");
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

	<div class="col">
		<h1 class=" col-md-6 mx-auto">Add Your Notes</h1>
		<div class="card container-fluid col-md-6">

			<form method="post" action="./UserServlet/addnotes">
				<%
				UserDetails u1 = (UserDetails) session.getAttribute("User");
				if(u1 != null)
				{ %>
				
				<input type="text" hidden name="uid" value=<%=u1.getId()%>>

				<div class="mb-3">
					<%
					String regmsg = (String) session.getAttribute("Note-added");
					if (regmsg != null) {
					%>
					<div style="color: green; text-align: center;"><%=regmsg%>
					</div>
					<%
					}
					session.removeAttribute("Note-added");
					%>
					<%
					String Failedmsg = null;
					Failedmsg = (String) session.getAttribute("failed-note");
					if (Failedmsg != null) {
					}
					session.removeAttribute("failed-msg");
					%>
					<label for="exampleInputEmail1" class="form-label">Title</label> <input
						name="title" type="text" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp" required>

					<div class="mb-3">
						<label for="exampleInputPText1" class="form-label">Note</label>
						<textarea row="10" name="content" type="text" class="form-control"
							id="exampleInputPassword1" required></textarea>
					</div>

					<button href="addNotes.jsp" type="submit" class="btn btn-primary">Submit</button>
					<%}%>
			</form>

		</div>
	</div>
</body>
</html>