package day5ques3;

public class Account {
	 
	private int accountId;
	private String accountType;
	private int balance;
	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean withdraw(int x){
		if(balance>x) {
			balance=balance-x;
			System.out.println("Balance amount after withdraw:"+balance);
			return true;
		}
		else {
			System.out.println("Sorry!!! No enough balance");
			return false;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
