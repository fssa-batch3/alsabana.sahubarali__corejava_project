package day03.practice;

public class User {
	private String name;
      private String email;
      private int pass;
      
      public User(String name, String email,int pass) {
    	  this.name=name;
    	  this.email=email;
    	  this.pass=pass;
      }
      public User() {
    	  
      }
      public void setEmail(String email) {
    	  this.email = email;
      }
      public String getEmail() {
    	  return email;
      }
      public void setName(String name) {
    	  this.name = name;
      }
      public String getName() {
    	  return name;
      }
      public void setPass(int pass) {
    	  this.pass = pass;
      }
      public int getPass() {
    	  return pass;
      }
      
      
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user  = new User("Alsabana","als@gmail.com",324);
		System.out.println(user.name + " - " +user.email +" - "+user.pass);

	}

}
