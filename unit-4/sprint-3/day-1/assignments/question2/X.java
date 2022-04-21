package day8.question2;

public interface X {
	public abstract void method1x();

	public default void methodDefaultx() {
		System.out.println("inside default of x");
	};

	public static void method2x() {
		System.out.println("inside method2 of x");
	}
}
