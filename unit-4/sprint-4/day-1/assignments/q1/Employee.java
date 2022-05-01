package day11.q1;

public class Employee implements Comparable<Employee> {
	private int empId;
	private String empName;
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub
		if(this.salary>emp.salary) {
			return 1;
		}
		else if(this.salary<emp.salary) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}
