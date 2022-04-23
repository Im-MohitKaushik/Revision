package day9.Q2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		System.out.println("enter Details of user");
		System.out.println("Enter username");
		String username = sc.next();
		if (username.matches("[a-zA-Z]{3,8}")) {
			c.setUsername(username);

		} else {
			while (username.length() != 0) {
				System.out.println("enter valid username");
				System.out.println("Enter username");
				username = sc.next();
				if (username.matches("[a-zA-Z]{3,8}")) {
					c.setUsername(username);
					break;
				}
			}
		}

		System.out.println("Enter user password");
		String password = sc.next();
		if (password.matches("[a-zA-Z0-9]{3,8}")) {
			c.setPassword(password);
		} else {

			while (password.length() != 0) {
				System.out.println("enter valid password");
				System.out.println("Enter user password");
				password = sc.next();
				if (password.matches("[a-zA-Z0-9]{3,8}")) {
					c.setPassword(password);
					break;
				}
			}
		}

		System.out.println("Enter mobile number");
		String mobileNumber = sc.next();
		if (mobileNumber.matches("[6,7,8,9]{1}[0-9]{9}")) {
			c.setMobileNumber(mobileNumber);

		} else {
			while (mobileNumber.length() != 0) {
				System.out.println("pls enter a valid password");
				System.out.println("Enter mobile number");
				mobileNumber = sc.next();
				if (mobileNumber.matches("[6,7,8,9]{1}[0-9]{9}")) {
					c.setMobileNumber(mobileNumber);
					break;
				}
			}
		}

		System.out.println("Enter email");
		String email = sc.next();

		if (email.matches("^(.+)@(.+)$")) {
			c.setEmail(email);

		}
		else {
			while (email.length() != 0) {
				System.out.println("enter valid email");
				System.out.println("Enter email");
				email = sc.next();
				if (email.matches("^(.+)@(.+)$")) {
					c.setEmail(email);
					break;
				}
			}
		}
		

		System.out.println("username is : " + c.getUsername());
		System.out.println("user passwrod is  :" + c.getPassword());
		System.out.println("user mobile number is : " + c.getMobileNumber());
		System.out.println("user email is :  " + c.getEmail());

	}

}
