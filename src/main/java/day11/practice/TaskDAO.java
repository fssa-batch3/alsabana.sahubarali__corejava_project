package day11.practice;

import java.sql.*;


import com.mysql.cj.xdevapi.Statement;

import day11.solved.ResuableTestConnection;



public class TaskDAO {
	public void createTask(Task task) throws DAOException, SQLException {
		// Write code here to get connection

		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "123456");

		String query = "INSERT INTO task (id,name, status) VALUES (?, ?, ?)";
		PreparedStatement std = conn.prepareStatement(query);
		// Create insert statement
		// Execute insert statement
		// close connection
		std.setInt(1, task.getId());
		std.setString(2,task.getName());
		std.setString(3,task.getStatus());
		
		
		int rows =  std.executeUpdate();
		System.out.println("No of rows inserted :" + rows);
		std.close();
		conn.close();
	}

}
