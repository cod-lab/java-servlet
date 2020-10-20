import java.io.*;

import javax.management.Query;
import javax.servlet.*;
import javax.servlet.http.*;

public class p7 extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		String str = req.getParameter("query");
		res.sendRedirect("https://www.google.com/#q=" + str);
	}
}