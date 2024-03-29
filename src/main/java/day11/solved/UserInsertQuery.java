package day11.solved;

import day11.solved.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class UserInsertQuery {

	public static void main(String[] args) throws Exception {

		// Step 01: Get connection
		Connection connection = ConnectionUtil.getConnection();
		System.out.println(connection);

		// Step 02: Create a Statement
		Statement stmt = connection.createStatement();

		// Step 03: Execute Insert Query
		String query = "INSERT INTO USERS (user_name, email_id, password) VALUES (\"vinit_gore\",\"vinit.gore@ctr.freshworks.com\",\"Instructor FSSA\", \"password007\")";
		int rows = stmt.executeUpdate(query);
		System.out.println("No of rows inserted :" + rows);

		// Step 04: close the connection resources
//		rs.close();
		stmt.close();
		connection.close();

	}

}