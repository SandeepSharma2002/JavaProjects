package in.filter;

import java.io.IOException;
import java.net.http.HttpRequest;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/servlet1")
public class Filter1 extends HttpFilter implements Filter {
  
    public Filter1() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    public void init(FilterConfig fConfig) throws ServletException {
    	// TODO Auto-generated method stub
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
    	
    	HttpServletRequest req = (HttpServletRequest)request;
    	String fname = req.getParameter("fname");
    	String lname = req.getParameter("lname");
    	String email = req.getParameter("email");
    	String phone = req.getParameter("phone");
    	String pass =  req.getParameter("pass");
    	String cpass =  req.getParameter("cpass");
    	
    	System.out.println(fname+ " "+lname+ " "+email+ " "+phone+ " "+pass+ " "+cpass);
    	chain.doFilter(req, response);
    }
    
	public void destroy() {
		// TODO Auto-generated method stub
	}



}
