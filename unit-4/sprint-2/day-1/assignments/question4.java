package sprint1Day4;

public class Question4 {

	public void oddDetect(int x) {
		if(x<0) {
			System.out.println("error");
		}
		else if(x%2==0){
			while(x%10!=0) {
				x=x+2;
			}
			System.out.println(x);
		}
		else {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question4 fn1=new Question4();
		
		fn1.oddDetect(-12);

	}

}
