import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@webservlet ("/cetpa")
public class HelloWorld extends HttpServlet{
public void serlet(HttpServletRequest req,HttpServletResponse res,)throws servletException,IOException{
	res.setContentType("text/html");
	printWritter out=res.getWritter();
	String e=req.getParameter("email");
	String e=req.getParameter("pwd");
	if(e.equals("cetpa@gmail.com") && p.equals("cetpa")){
	RequestDispatcher rd=req.getRequestDispatcher("success");
	rd.forward(req,res);
	}
	else{
	     out.println("<p style='color:red'>incorrect dasta</p>");
	     RequestDispatcher rd=req.getRequestDispatcher("index.html");
	     rd.include(req,res);
          }
}