import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class p6_b extends HttpServlet
{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String a = req.getParameter("name");
        
        out.print("<title>server2</title>");
        req.getRequestDispatcher("index.html").include(req,res);
        out.println("<div class='container'>&nbsp;&nbsp;&nbsp;hey!.. <b>" + a + "</b></div>");
	}
}
