package test.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.AND_AND_Expression;

/**
 * Servlet implementation class Servlet2
 */
@WebServlet("/servlet2")
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		if (password.equalsIgnoreCase("12345") && name.equalsIgnoreCase("sandeep")) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet3");
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/servlet4");
			requestDispatcher.forward(request, response);
		}
	}

}
