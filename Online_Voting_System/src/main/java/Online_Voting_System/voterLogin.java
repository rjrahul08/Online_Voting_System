package Online_Voting_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;



public class voterLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();

		DatabaseManager db = new DatabaseManager();
		java.sql.Connection con = db.getConnection();
		
		String voternum = request.getParameter("voter_card_number");
		
		try {
			PreparedStatement preparedStatement1 = con.prepareStatement("select voter_card_number from vote where voter_card_number = '"+voternum+"'");
			ResultSet rs1 = preparedStatement1.executeQuery("select voter_card_number from vote where voter_card_number = '"+voternum+"'");
			if(rs1.next()) {
				response.sendRedirect("votercheck.jsp");
				out.println("You already voted ........."+rs1.getString("voter_card_number"));
			}
			else {
				PreparedStatement preparedStatement2 = con.prepareStatement("select vid,pnumber from voters where voter_card_number = '"+voternum+"'");
	            ResultSet rs2 =   preparedStatement2.executeQuery("select vid,number from voters where voter_card_number = '"+voternum+"'");
	            if(rs2.next()) {
	            	String contact = rs2.getString("number");
	            	response.sendRedirect("userWelcome.jsp?con="+contact);
	            	out.println(contact);
	            }
	            else {
	            	out.println("Please enter valid card number");
	            }
			}
		}
		catch (SQLException ex) {
	       ex.printStackTrace();        
	    }
        out.println(voternum);
	}
}
