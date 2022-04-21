package day7.Ques3;

public class HistoryStudent extends Student {
	
	int historyMarks;
	int civicsMarks;
	
	public static int noOfStudents;
	
	
	public int getHistoryMarks() {
		return historyMarks;
	}


	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}


	public int getCivicsMarks() {
		return civicsMarks;
	}


	public void setCivicsMarks(int civicsMarks) {
		this.civicsMarks = civicsMarks;
	}


	@Override
	public void getPercentage() {
		double sum=getHistoryMarks()+getCivicsMarks();
		double percentage= (sum/200)*100;
		System.out.println("total marks are :" +sum+"out of 200" );
		System.out.println(percentage);
		
	}
	
	
}
