package day5ques3;

import java.util.Scanner;

public class AccountDetails {
	
	public Account getAccountDetails() {
		Account a1=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account id :");
		int id=sc.nextInt();
		System.out.println(" Enter account type :");
		String accType=sc.next();
		System.out.println(" Enter balance :");
		int bal=sc.nextInt();
		while(bal<=0) {
			System.out.println("Balance should be positive");
			System.out.println(" Enter balance :");
			 bal=sc.nextInt();
		}
				
		
		
		a1.setAccountId(id);
		a1.setAccountType(accType);
		a1.setBalance(bal);
		
		return a1;
	}
	public int getWithdrawAmount() {
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn :");
		int withdrawAmt=sc1.nextInt();
		while(withdrawAmt<=0) {
			System.out.println("Amount should be positive");
			System.out.println(" Enter amount to be withdrawn :");
			 withdrawAmt=sc1.nextInt();
		}
		sc1.close();
		return withdrawAmt;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountDetails accdet=new AccountDetails();
		Account ac=accdet.getAccountDetails();
		int withdrawamtt=accdet.getWithdrawAmount();
	     ac.withdraw(withdrawamtt);
	
	}

}
