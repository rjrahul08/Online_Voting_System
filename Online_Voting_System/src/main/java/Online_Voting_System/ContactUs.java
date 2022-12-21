package Online_Voting_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class ContactUs
 */
public class ContactUs extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		DatabaseManager db = new DatabaseManager();
		java.sql.Connection con = db.getConnection();
		
		//System.out.print("Connected");
		

		String name = request.getParameter("name");
		String number = request.getParameter("number");
		String email = request.getParameter("email");
		String comment = request.getParameter("comment");
		
		
		try {
	    	PreparedStatement preparedStatement = con.prepareStatement("insert into contact(name,number,email,comment) values ('"+name+"','"+number+"','"+email+"','"+comment+"')");
			preparedStatement.executeUpdate();
			response.sendRedirect("index.jsp");
	    } catch (Exception e) {
			e.printStackTrace();
		}
	}

}
