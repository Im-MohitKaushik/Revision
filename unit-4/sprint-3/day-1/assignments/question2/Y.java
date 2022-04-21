package day8.question2;

public interface Y {

	public abstract void method1y();

	public default void methodDefaulty() {
	System.out.println("inside methoddefault of y");
	};

	public static void method2y() {
		System.out.println("inside method 2 of y");	
	}

}
