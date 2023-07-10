package day01.practice;


public class Cat {
	// Attributes
	
	private String color;
	private int age;
	private String speaks;

	// Constructor
	public Cat(int age, String color,String speaks) {
		this.age=age;
		this.speaks=speaks;
		this.color = color;
	}

	// Getters and setters
	public int getAge(int age) {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSpeaks() {
		return speaks;
	}

	public void setSpeaks(String speaks) {
		this.speaks = speaks;
	}
	

	// Main method to create Dog objects
	public static void main(String[] args) {
		// Create two Dog objects
		Cat cat1 = new Cat(53,"black","meow");
		Cat cat2 = new Cat(35,"white","meow");

		

		// Print the attributes of each Dog
		System.out.println("Cat 1:");
		System.out.println("Age: " + cat1.getAge(1));
		System.out.println("Color: " + cat1.getColor());
		System.out.println("Speaks: " + cat1.getSpeaks());

	

		System.out.println("Cat 2:");
		System.out.println("Age: " + cat2.getAge(3));
		System.out.println("Color: " + cat2.getColor());
		System.out.println("Speaks: " + cat2.getSpeaks());
	
	}


}