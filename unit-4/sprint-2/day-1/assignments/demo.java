package sprint1Day4;

public class demo {
	
	
	public void demo() {
		
		System.out.println("inside demo()");
	}

	public void demo(int x) {
		demo();
		System.out.println("inside demo(int x2)");
	}
	
	public void demo(double d) {
		demo(10);
		System.out.println("inside demo(double d)");
	}

	public void demo(String str) {
		demo((double)12);
		System.out.println("inside demo(String s)");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo d1=new demo();
		d1.demo("ankit");
				
	}

}
