package day9.Q1;

public class Account {

	int accountNumber;
	double balance;

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public double withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("amount withdrawn is " + amount);

		} else {
			InsufficientFundsException ife = new InsufficientFundsException("insufficient funds");
			throw ife;
		}
		return amount;
	}

	public Account(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	};

}
