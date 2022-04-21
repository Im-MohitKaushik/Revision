package c2.question4;

public abstract class Parent {
	public abstract void method1();

	public  final void method2() {
		System.out.println("inside method 2 of parent");
	};

	public void method3() {
		System.out.println("inside method 3 of parent");
	};
	
	final int number;
	
	public Parent(int num) {
		this.number=num;
	}
	
	
	
	
}
