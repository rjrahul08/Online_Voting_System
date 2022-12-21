package Online_Voting_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class adminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stubadminName
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

		DatabaseManager db = new DatabaseManager();
		java.sql.Connection con = db.getConnection();
		
		String adminName = request.getParameter("adminName");
		String password = request.getParameter("adminPass");
		//System.out.println(adminName+" "+password);
		try {
			PreparedStatement preparedStatement1 = con.prepareStatement("select * from Admin where adminName = '"+adminName+"' and adminPass = '"+password+"'");
			ResultSet rs1 = preparedStatement1.executeQuery("select * from Admin where adminName = '"+adminName+"' and adminPass = '"+password+"'");
			if(rs1.next())
			   {
				   HttpSession session=request.getSession();
				   session.setAttribute("", adminName);
				   response.sendRedirect("adminWelcome.jsp");
			     }
			   else  
			   {
				   out.println("WRONG CREDENTIALS");
			   }
		   }
		   catch (Exception e) {
	             out.println(e.getMessage());
		   }
		}
	}
