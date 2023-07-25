package day12.practice;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.RowId;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import day06.practice.*;
import day11.practice.DAOException;
import day11.solved.ConnectionUtil;

public class TaskDAO {

	public void createTask(Task task) throws DAOException {
		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement stmt = connection
						.prepareStatement("INSERT INTO task (id,name, priority) VALUES ( ?, ?, ?)")) { // This is the
																										// try-with-resources

			// Hint: Set the values for the PreparedStatement using task properties
			stmt.setInt(1, task.getId());
			stmt.setString(2, task.getName());
			stmt.setInt(3, task.getPriority());

			// Hint: Execute the update statement
			int rows = stmt.executeUpdate();
			System.out.println("No of rows inserted :" + rows);

		} catch (SQLException e) {
			throw new DAOException("Error in createTask method", e);
		}
	}

	public void updateTask(Task task) throws DAOException {
		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement stmt = connection.prepareStatement("UPDATE task SET id=? WHERE priority=?")) {

			// Hint: Add the SQL update statement here

			// Hint: Set the values for the PreparedStatement using task properties
			stmt.setString(1, task.getName());
			stmt.setInt(2, task.getPriority());
			stmt.setInt(3, task.getId());

			// Hint: Execute the update statement
			int rows = stmt.executeUpdate();
			System.out.println("No of rows inserted :" + rows);
			stmt.close();
			connection.close();
		} catch (SQLException e) {
			throw new DAOException("Error in updateTask method", e);
		}
	}

	public void deleteTask(int taskId) throws DAOException {

		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement stmt = connection.prepareStatement("DELETE from task WHERE id=?")) {

			stmt.setInt(1, taskId);

			// Hint: Execute the update statement
			int rows = stmt.executeUpdate();
			System.out.println("No of rows inserted :" + rows);
			stmt.close();
			connection.close();

		} catch (SQLException e) {
			throw new DAOException("Error in deleteTask method", e);
		}
		// Hint: Add the try-with-resources for delete query here

		// Hint: Set the value for the PreparedStatement using the taskId

		// Hint: Execute the delete statement

		// Hint: Catch the SQLException and throw DAOException with appropriate message
	}

	public List<Task> getAllTask() throws DAOException {
		List<Task> task = new ArrayList<>();

		try (Connection connection = ConnectionUtil.getConnection();
				PreparedStatement stmt = connection.prepareStatement("SELECT id, name, pirority FROM task");
				ResultSet rs = stmt.executeQuery()) {

			// Hint: Iterate over the ResultSet to create Task objects and add them to the
			// tasks list
			while (rs.next()) {
				String name = rs.getString("name");
				int prio = rs.getInt("priority");
				RowId id = rs.getRowId("id");

				System.out.println("TaskName:" + name + ", ID:" + id + ", prio:" + prio);
			}

		} catch (SQLException e) {
			throw new DAOException("Error in getAllTasks method", e);
		}

		return task;
	}

	public static void main(String[] args) {
		TaskDAO taskDAO = new TaskDAO();

		Task task1 = new Task("Attend meeting", 5, 12);
		Task task2 = new Task("Sleeping", 7, 10);
		try {
			taskDAO.createTask(task1);
			taskDAO.createTask(task2);

		} catch (DAOException e) {
			e.printStackTrace();
		}

		try {
			taskDAO.deleteTask(12);
		} catch (DAOException e) {
			e.printStackTrace();
		}

		try {
			task1.setName("Sleeping");
			taskDAO.updateTask(task1);
		} catch (DAOException e) {
			e.printStackTrace();
		}

	}

	private void updateTask(Object setPriority) {
		// TODO Auto-generated method stub
		
	}
}