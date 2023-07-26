package day12.practice;

import org.junit.jupiter.api.Test;

import day06.practice.Task;
import day11.practice.DAOException;

public class TestTask {

	@Test

	public void CreateTask() {
		TaskDAO taskDAO = new TaskDAO();

		Task task1 = new Task("Attend meeting", 5, 12);
		Task task2 = new Task("Sleeping", 7, 10);
		Task task3 = new Task("eat", 4, 32);
		try {
			taskDAO.createTask(task1);
			taskDAO.createTask(task2);
			taskDAO.createTask(task3);

		} catch (DAOException e) {
			e.printStackTrace();
		}

	}

	@Test

	public void DeleteTask() {
		TaskDAO taskDAO = new TaskDAO();

		try {
			taskDAO.deleteTask(12);
		} catch (DAOException e) {
			e.printStackTrace();
		}

	}

	@Test

	public void updateTask() {
		TaskDAO taskDAO = new TaskDAO();
		Task task1 = new Task("Attend meeting", 5, 12);

		try {
			task1.setName("Sleeping");
			taskDAO.updateTask(task1);
		} catch (DAOException e) {
			e.printStackTrace();
		}

	}

}
