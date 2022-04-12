package sprint1Day4;

public class Demo {

	public Demo() {
		this(10);
		System.out.println("inside demo()");
	}

	public Demo(int x) {
		this((double) 10);
		System.out.println("inside demo(int x)");
	}

	public Demo(double d) {
		this("ankit");
		System.out.println("inside demo(double d)");
	}

	public Demo(String str) {
		
		System.out.println("inside demo(String s)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Demo();

	}

}
