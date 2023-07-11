package day02.practice;

public class User {
	private static String email;
	private static String name;
	private static String pass;
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass=pass;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       User user = new User();
       user.setEmail("alsaba@gmail");
       user.setName("alsabana");
       user.setPass("98i0njcnj");
       
       System.out.println(user.getEmail());
       System.out.println(user.getName());
       System.out.println(user.getPass());
	}

}
