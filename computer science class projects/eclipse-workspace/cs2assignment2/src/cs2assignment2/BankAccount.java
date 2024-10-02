package cs2assignment2;

public class BankAccount {
	private String customerName;
	private String email;
	private String accountID;
	private double balance;

	public BankAccount() {
		super();
		this.customerName = "";
		this.email = "";
		this.accountID = "";
		this.balance = 0;
	}

	public BankAccount(String customerName, String email, String accountID, double balance) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.accountID = accountID;
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAccountID() {
		return accountID;
	}

	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount \n----------------------- \ncustomerName=" + customerName + "\n-----------------------\n email=" +
	email + "\n----------------------- \n accountID=" + accountID+ "\n----------------------- \n balance=$" + balance+ "\n-----------------------";
	}
	public double deposit () {
		
		return 0;
	}

}
