import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class formServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,
			HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<title>FirstServletResponse</title>");
		
		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String title = request.getParameter("title");
		
		//if any of the fields are empty
		if(firstName.isEmpty() || lastName.isEmpty() || title.isEmpty()) {
			System.out.println("<p>Information could not be saved. Please enter information for "
					+ "all fields.</p>");
			System.exit(0);
		}
		
		out.println("<h2>A new employee has been created.</h2>");
		out.println("<p>" + firstName + " " + lastName + ", " + title + "</p>");
		
		out.println("<a href=\"../../index.html\">"
				+ "Return to form</a>");
		out.close();
	}
}
