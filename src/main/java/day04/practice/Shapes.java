package day04.practice;

class Rectangle {
	protected int length;
	protected int breath;
     public Rectangle(int length,int breath) {
    	 this.length=length;
    	 this.breath=breath;
    	 
     }
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}
	
	public int CalculateArea(){
		return getLength()*getBreath();
	}
}

class Square extends Rectangle{
	
	public Square(int a) {
		super(a,a);
	}
}



public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Square value = new Square(5);
      System.out.print("The area is : ");
      System.out.print(value.CalculateArea());
	}

}
