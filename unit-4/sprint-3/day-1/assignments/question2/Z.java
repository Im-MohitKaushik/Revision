package day8.question2;

public interface Z extends X,Y{
	public abstract void method1z();
	@Override
	public default void methodDefaultx() {
		System.out.println("inside default of x in  Z interface overritten");
	};
}
