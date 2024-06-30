package model;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter pw=res.getWriter();
		
		RequestDispatcher rd=req.getRequestDispatcher("header.html");
	    rd.include(req, res);
		
		HttpSession hsp=req.getSession(false);
		if(hsp!=null) {
		String name=(String) hsp.getAttribute("name");
		
		pw.println("<html><body><center><h3><i>Welcome to the dashboard ! "+name+"</i></h3></center></body></html>");

	}
		else {
			
			pw.println("<html><body><center><h3><i>Oops ! you need to login first !</i></h3></center></body></html>");

			
		}

  }
}
