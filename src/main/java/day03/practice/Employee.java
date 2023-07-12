package day03.practice;

public class Employee {

	private int id;
	private String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String[] args) {
		Employee employe = new Employee(1,"sabna");
		Employee employe1 = new Employee(2,"sabin");
		
		System.out.println( "id = "+ employe.id +","+  " name = "+ employe.name );
		
		
		System.out.println( "id = "+ employe1.id +","+ " name = "+ employe1.name );
		
		
	}
}