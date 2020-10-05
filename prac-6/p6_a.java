import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class p6_a extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String a = req.getParameter("name");
		String b = req.getParameter("pass");

		out.print("<title>server1</title>");
		if(b.equals("abc"))
			req.getRequestDispatcher("server6_b").forward(req,res);
		else
		{
			req.getRequestDispatcher("index.html").include(req,res);
			out.println("<div class='container'><b>&nbsp;&nbsp;&nbsp;Incorrect password!</b></div>");
		}
	}
}
