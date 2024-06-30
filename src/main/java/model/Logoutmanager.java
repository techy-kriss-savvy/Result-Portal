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


@WebServlet("/Logoutmanager")
public class Logoutmanager extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {

		PrintWriter pw=res.getWriter();
		RequestDispatcher rd=req.getRequestDispatcher("header1.html");
	    rd.include(req, res);
	    HttpSession hsp=req.getSession();
	    hsp.getAttribute("uid");
	    hsp.invalidate();
		pw.println("<html><body><center><h3><i>Logged Out Successfully !</i></h3></center></body></html>");
	}
}
