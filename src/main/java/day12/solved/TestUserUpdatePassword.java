package day12.solved;


import java.sql.Connection;
import java.sql.PreparedStatement;


import day11.solved.ResuableTestConnection;

public class TestUserUpdatePassword {
		 
	    public static void main(String[] args) throws Exception {
	 
	        Connection connection = ResuableTestConnection.getConnection();
	 
	        // Input
	        String userName = "bharathwaj";
	        String password = "mypassword*(";
	        
	       
	        // DEPOSIT
	        String query = "UPDATE user SET password=? WHERE username=?";
	 
	        PreparedStatement pst = connection.prepareStatement(query);
	        pst.setString(1, password);
	        pst.setString(2, userName);
	 
	        int rows = pst.executeUpdate();
	        System.out.println("No of rows updated" + rows);
	    }
	 
	
}