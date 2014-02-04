import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class formServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<title>FirstServletResponse</title>");
		out.println("<h2>Button Clicked</h2>");
		
		String name = request.getParameter("name");
		
		if(name != null)
			out.println("How are you, " + name + "?\n");
		else
			out.println("You didn't enter any text!\n");
		
		out.println("<a href=\"../../index.html\">"
				+ "Return to form</a>");
		out.close();
	}
}
