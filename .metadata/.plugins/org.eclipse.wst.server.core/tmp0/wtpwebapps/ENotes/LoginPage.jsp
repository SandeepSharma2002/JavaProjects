<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<%@ include file="Components/allcss.jsp"%>
</head>
<body>
	<%@include file="Components/Navbar.jsp"%>
	<div class="card container-fluid col-md-6">
		<div class="card-body">
			<form method = "post" action="./UserServlet/loginuser">
				<div class="mb-3">
				
				<%
				String Failedmsg = (String) session.getAttribute("failed-msg");
				if(Failedmsg!= null ){%>
				<div style="color:red; text-align:center;"><%= Failedmsg%></div>
				<%  }session.removeAttribute("failed-msg"); %>
				
					<label for="exampleInputEmail1" class="form-label">Email
						address</label> <input name = "Email" type="email" class="form-control"
						id="exampleInputEmail1" aria-describedby="emailHelp">
				</div>
					<div class="mb-3">
						<label for="exampleInputPassword1" class="form-label">Password</label>
						<input name= "Password" type="password" class="form-control"
							id="exampleInputPassword1">
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</div>
</body>
</html>