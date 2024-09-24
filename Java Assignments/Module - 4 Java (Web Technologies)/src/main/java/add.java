import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("First name: " + request.getParameter("firstName"));
		System.out.println("Last name: " + request.getParameter("lastName"));
		System.out.println("Email: " + request.getParameter("email"));
		System.out.println("Mobile: " + request.getParameter("mobile"));
		System.out.println("Gender: " + request.getParameter("gender"));
		System.out.println("Password: " + request.getParameter("password"));
	}

}
