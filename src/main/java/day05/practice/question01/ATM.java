package day05.practice.question01;

class Account  {
	String accNo;
	double balance;
	
	public Account(){
		
	}
	public Account (String acc,double n) {
		this.accNo=acc;
		this.balance=n;
				
	}
	
}

//Create an implementation of the below Interface
public interface ATM {
    boolean deposit(Account account, double amount);
    boolean withdraw(Account account,double amount) throws Exception;
    double getBalance(Account account);
}