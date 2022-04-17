package sprint2day4.question1;

public class Demo {

	public Animal[] getAnimals() {
		Animal[] a = {new Dog(), new Cat(), new Tiger()};
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();
		Animal[] arr=d1.getAnimals();
		System.out.println(" DOG DETAILS");		
		arr[0].makeNoise();
		Dog.dogobjgetter().handShake();
		arr[0].eat();
		arr[0].walk();
		System.out.println("###########################################");
	
		System.out.println(" CAT DETAILS");		
		arr[1].makeNoise();
		arr[1].eat();
		arr[1].walk();
		System.out.println("###########################################");
		System.out.println(" Tiger DETAILS");		
		arr[2].makeNoise();
		arr[2].eat();
		arr[2].walk();
		System.out.println("###########################################");
	}

}
