package day03.solved;

public class Account {

	public String accNo;

	public String name;

	public double balance;

	public Account(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public static void main(String[] args) {
		Account account = new Account("A32","sabana",2344.0);
	 System.out.println(account.accNo);
	 System.out.println(account.balance);
	 System.out.println(account.name);
	 
	}

}