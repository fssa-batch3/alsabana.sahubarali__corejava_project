package day11.practice;

import java.sql.SQLException;

public class Task {
	int id;
	String name;
	String status;

	
	public Task(int id, String name, String status) {
	
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public static void main(String[] args) {
		Task t1 = new Task(1,"study","pending");
		Task t2 = new Task(3,"sleep","pending");
		
		try {
			new TaskDAO().createTask(t2);
		} catch (DAOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}