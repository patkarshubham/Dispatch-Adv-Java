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
@WebServlet("/success")
public class Success extends HttpServlet{
    
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		Cookie[] ck = req.getCookie();
		if(ck!null)
		{
			for(Cookie c:ck) {
				if(c.getName().equals("email"))
						{
							user=c.getValue();
							break;
						}
			}}
		if(user==null) {
			res.sendRedirect("index.html");
		}
		out.println(c.getName()+" "+c.getValue());
		out.println("<a href='logout'>logout</a>");
		}
		//String e=req.getParameter("email");
		//String p=req.getParameter("pwd");
       //out.println("Email="+e+"<br>");
       //out.println("Password="+p+"<br>");
	}
	
}

