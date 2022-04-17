package day6Q3;


public class Bank {
	String branchName;
	String ifscCode;
	
	void displayDetails(){
		System.out.println("branch name is :" + branchName);
		System.out.println("ISFC CODE IS : " + ifscCode);
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public Bank(String branchName, String ifscCode) {
		super();
		this.branchName = branchName;
		this.ifscCode = ifscCode;
	}
	
	
	public Bank() {
		
	}
	
	
	
	
}
