package sprint1day5question1;

import java.util.Scanner;

public class Main {
	public static Employee getEmployeeDetails() {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID:");
		int id = sc.nextInt();
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter salary");
		double saliry = sc.nextDouble();
		System.out.println("Enter pfpercentage");
		int pf = sc.nextInt();
		int x = Main.getPFPercentage(pf);
		emp.setEmployeeId(id);
		emp.setEmployeeName(name);
		emp.setSalary(saliry);
		emp.calculateNetSalary(x);
		sc.close();
		return emp;
	}

	public static int getPFPercentage(int x) {
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = Main.getEmployeeDetails();

		System.out.println("employee ID : "+e1.getEmployeeId());
		System.out.println("Employee Name : "+e1.getEmployeeName());
		System.out.println("Employee salary :"+e1.getSalary());
		System.out.println("Employee Net Salary :"+e1.getNetSalary());

	}

}
