/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.79
 * Generated at: 2023-10-25 18:31:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.User.UserDetails;

public final class RegisterPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/Components/Navbar.jsp", Long.valueOf(1698258666774L));
    _jspx_dependants.put("/Components/allcss.jsp", Long.valueOf(1698089573317L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.User.UserDetails");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Register Page</title>\r\n");
      out.write("<link ref=\"stylesheet\" href=\"Style/Style.css\" />\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<a class=\"navbar-brand\" >E-Notes</a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("					aria-current=\"page\" href=\"home.jsp\">Home</a></li>\r\n");
      out.write("				<li class=\"nav-item\"><a href = \"addNotes.jsp\" class=\"nav-link\">Add Notes</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"showNotes.jsp\">Show\r\n");
      out.write("						Notes</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<form class=\"d-flex\" method=\"post\" action=\"./UserServlet/logout\">\r\n");
      out.write("				");

				UserDetails user = (UserDetails) session.getAttribute("User");
				System.out.println( "In Navbar ---> " + user);
				if (user != null) {
				
      out.write("\r\n");
      out.write("				<a href=\"home.jsp\"\r\n");
      out.write("					class=\"btn btn-outline-success my-2 my-sm-0 mx-sm-2\" type=\"button\">Welcome\r\n");
      out.write("					");
      out.print(user.getName());
      out.write("</a> <button\r\n");
      out.write("					class=\"btn btn-outline-success my-2 my-sm-0 mx-sm-2\" type=\"submit\"\r\n");
      out.write("				     >Logout</button>\r\n");
      out.write("				");

				} else {
				
      out.write("\r\n");
      out.write("				<a href=\"LoginPage.jsp\"\r\n");
      out.write("					class=\"btn btn-outline-success my-2 my-sm-0 mx-sm-2\" type=\"button\">Login</a>\r\n");
      out.write("				<a href=\"RegisterPage.jsp\"\r\n");
      out.write("					class=\"btn btn-outline-success my-2 my-sm-0 mx-sm-2\" type=\"button\">Register</a>\r\n");
      out.write("				");

				}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("	<div class=\"card container-fluid col-md-6\">\r\n");
      out.write("		<div class=\"card-body\">\r\n");
      out.write("			<form method = \"post\" action=\"./UserServlet/adduser\">\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("				");
 String regmsg = (String) session.getAttribute("reg-success");
				System.out.println(regmsg);
				if(regmsg!= null) {
      out.write("\r\n");
      out.write("				<div style=\"color:green; text-align:center;\">");
      out.print( regmsg );
      out.write("<a href = \"LoginPage.jsp\">Login</a></div>\r\n");
      out.write("				");
 } session.removeAttribute("reg-success"); 
      out.write("\r\n");
      out.write("				");

				String Failedmsg = (String) session.getAttribute("failed-msg");
				if(Failedmsg!= null ){
      out.write("\r\n");
      out.write("				<div style=\"color:red; text-align:center;\">");
      out.print( Failedmsg);
      out.write("</div>\r\n");
      out.write("				");
  }session.removeAttribute("failed-msg"); 
      out.write("\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"mb-3\" >\r\n");
      out.write("					<label for=\"exampleInputEmail1\" class=\"form-label\">Enter\r\n");
      out.write("						Name</label> <input name= \"Name\" type=\"text\" class=\"form-control\"\r\n");
      out.write("						id=\"exampleInputEmail1\"  required>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"mb-3\">\r\n");
      out.write("					<label for=\"exampleInputEmail1\" class=\"form-label\">Email\r\n");
      out.write("						address</label> <input name= \"Email\" type=\"email\" class=\"form-control\"\r\n");
      out.write("						id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" required>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"mb-3\">\r\n");
      out.write("					<label for=\"exampleInputPassword1\" class=\"form-label\">Password</label>\r\n");
      out.write("					<input name=\"Password\" type=\"password\" class=\"form-control\"\r\n");
      out.write("						id=\"exampleInputPassword1\" required>\r\n");
      out.write("				</div>\r\n");
      out.write("				<button type=\"submit\" class=\"btn btn-primary\">Submit</button>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
