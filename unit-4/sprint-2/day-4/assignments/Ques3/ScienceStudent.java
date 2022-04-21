package day7.Ques3;

public class ScienceStudent extends Student {

	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	public static int noOfStudents;
	
	
	@Override
	public void getPercentage() {
		double sum=getPhisicsMarks()+getChemistryMarks()+getMathsMarks();
		double percentage= (sum/300)*100;
		System.out.println("total marks are :" +sum+"out of 300" );
		System.out.println(percentage);
		
	}


	public int getPhisicsMarks() {
		return phisicsMarks;
	}


	public void setPhisicsMarks(int phisicsMarks) {
		this.phisicsMarks = phisicsMarks;
	}


	public int getChemistryMarks() {
		return chemistryMarks;
	}


	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}


	public int getMathsMarks() {
		return mathsMarks;
	}


	public void setMathsMarks(int mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
		
	
	
	
}
