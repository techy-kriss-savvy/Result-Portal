package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpSession;

 public class Validate {

	public static  boolean check(String email,String pass ,HttpSession hsp) {
		
		    boolean check=false;
		    
		Connection cn;
		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/VSB","root","root");
		
			
		
		String str="select studentname, Registerno, semester, subject1, subject2, subject3, status from result where Email=? and Password=?;";

		
		
			PreparedStatement ps;
			ps = cn.prepareStatement(str);
		 
		
	
			ps.setString(1, email);
		
		
		
			ps.setString(2, pass);
		
		
		
			ps.executeQuery();
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				String name=rs.getString(1);
				int rno=rs.getInt(2);
				int sem=rs.getInt(3);
				String sub1=rs.getString(4);
				String sub2=rs.getString(5);
				String sub3=rs.getString(6);
				String stat=rs.getString(7);
				
				hsp.setAttribute("name",name);

				hsp.setAttribute("rno",rno);
				
				hsp.setAttribute("sem",sem);

				hsp.setAttribute("sub1",sub1);
				
				hsp.setAttribute("sub2",sub2);
				
				hsp.setAttribute("sub3",sub3);
				
				hsp.setAttribute("stat",stat);


				
				check=true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return check;
		
		
		
	}

}
