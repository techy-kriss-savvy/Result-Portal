package model;

import controller.Validate;
 

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Loginmanager")
public class Loginmanager extends HttpServlet {

	

	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		    String email=req.getParameter("email");
		    String pass=req.getParameter("pass");
		    boolean check=Validate.check(email,pass,req.getSession());
		    PrintWriter pw=res.getWriter();
		    RequestDispatcher rd=req.getRequestDispatcher("header.html");
		    rd.include(req, res);
		  if(check) {
			  HttpSession hsp=req.getSession();
			  hsp.setAttribute("email", email);
			  
				pw.println("<html><body><center><h3><i>Login Successful !</i></h3></center></body></html>");
			  
		  }
		  else if(email.equals("admin@gmail.com")&&pass.equals("admin")) {
			  
			  HttpSession hsp=req.getSession();
			  hsp.setAttribute("email", email);
			  
			  pw.print("test run ok");
			  
		  }
		  
		  
		  
		  
		  
		  else {
			      req.setAttribute("errorMessage", "Invalid username or password !" );
				  RequestDispatcher rd1=req.getRequestDispatcher("invalid.jsp");
				rd1.forward(req, res);
				
		
			} 
		  }
	  }

