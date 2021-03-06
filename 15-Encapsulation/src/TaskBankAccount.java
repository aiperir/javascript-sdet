
public class TaskBankAccount {
	
	private String accNumber;
	private double balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	
	public void deposit(double depositAmount) {
		this.balance+=depositAmount;
	}
	
	public void withdrawal(double withdrawalAmount) {
		if(this.balance-withdrawalAmount<0) {
			System.out.println("Only " + this.balance + 
					" available. Withdrawal is not processed");
		}else {
			this.balance=withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + 
					" processed.Remaining balance= " + this.balance);
			
		}
	}
	
	
	
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	
	
	

}
