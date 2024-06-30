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


@WebServlet("/Result")
public class Result extends HttpServlet {
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
		
		int rno=(int)(hsp.getAttribute("rno"));       
		
		int sem=(int)(hsp.getAttribute("sem"));       
		
		String sub1=(String) hsp.getAttribute("sub1");
		
		String sub2=(String) hsp.getAttribute("sub2");
		
		String sub3=(String) hsp.getAttribute("sub3");
		
		String stat=(String) hsp.getAttribute("stat");
		
		
		
		 pw.println("<html><body>");
		 pw.println("<center><h3><i>Here your result ! "+name+"</i></h3></center>");
         pw.println("<center><table style=border:solid 2px><td><b>RegisterNo</b><td><b>Semester</b></td><td><b>Subject1</b></td><td><b>Subject2</b></td><td><b>Subject3</b></td><td><b>Status</b></td></tr>");
         pw.println("<tr><td>"+ rno +"</td>");
         pw.println("<td>"+ sem +"</td>");
         pw.println("<td>"+ sub1 +"</td>");
         pw.println("<td>"+ sub2 +"</td>");
         pw.println("<td>"+ sub3 +"</td>");
         pw.println("<td><i>"+stat+"</i></td></tr></table></center>");
         pw.println("</body><style>td{border:solid 2px}</style></html>");
	}
		else {
			
			pw.println("<html><body><center><h3><i>Oops ! you need to login first !</i></h3></center></body></html>");
			
		}

  }
}
