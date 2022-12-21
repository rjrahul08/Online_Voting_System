package Online_Voting_System;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Vote extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		DatabaseManager db = new DatabaseManager();
		java.sql.Connection  con = db.getConnection();
		
		String voter_card_number = request.getParameter("voterNumber");
		String party = request.getParameter("party");
		System.out.println(party);
		
		try {
            
        	PreparedStatement preparedStatement = con.prepareStatement("insert into vote(voter_card_number,party)values ('"+voter_card_number+"','"+party+"')");
        	
        	preparedStatement.executeUpdate();
          
            response.sendRedirect("index.jsp");
            
        } catch (SQLException e) {
        	out.println(e.getMessage());
        }
	}
}
