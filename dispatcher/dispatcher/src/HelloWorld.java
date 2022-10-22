import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/cetpa")
public class HelloWorld extends HttpServlet{
    
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String e=req.getParameter("email");
		String p=req.getParameter("pwd");
if(e.equals("cetpa@gmail.com") && p.equals("cetpa")) {
/*RequestDispatcher rd=req.getRequestDispatcher("success");
rd.forward(req, res); */
	res.sendRedirect("http://www.google.com");
}
else {
	out.println("<p style='color:red'>incorrect data</p>");
	RequestDispatcher rd=req.getRequestDispatcher("index.html");
	rd.include(req, res);
}
		
	}
	
}