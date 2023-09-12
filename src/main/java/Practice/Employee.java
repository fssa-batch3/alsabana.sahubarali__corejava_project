package Practice;

import java.sql.*;

public class Employee {

	static String name;
	static int id;
	static String age;

	public static String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/project";
		String username = "root";
		String password = "123456";
		String query = "Create table if not exists employee(\r\n" + "id int primary key,\r\n" + "name varchar(30),\r\n"
				+ "age varchar(3)\r\n" + "\r\n" + "\r\n" + ");\r\n" + "";
		String values = "INSERT INTO EMPLOYEE(name,id,age)values('alsabana',2,20)";
		Connection con = DriverManager.getConnection(url, username, password);

		// Statement st = con.createStatement();

		// int table = st.executeUpdate(query);
		// int value = st.executeUpdate(values);
		// System.out.println("successfully added table is: " + table + "value is: " +
		// value);

		PreparedStatement pmt = con.prepareStatement("Select * from employee");
//		pmt.setString(1, "alsabana");
//		pmt.setInt(2, 5);
//		pmt.setString(3, "20");
//		pmt.executeUpdate();
		ResultSet rs = pmt.executeQuery();
		while (rs.next()) {
			String name = rs.getString("name");
			int id = rs.getInt("id");
			String age = rs.getString("age");

			System.out.println("Total values are: "+name + " " + id + " " + age);

		}

	}

}
