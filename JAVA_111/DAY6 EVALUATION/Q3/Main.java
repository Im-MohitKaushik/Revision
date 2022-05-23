package com.masai.Q3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("RESULT WITH NON parameterasied constructor");
		System.out.println("=====================================================");
		Car c1=new Car();
		c1.setModel("Harrier");
		c1.setCompanyName("Tata");
		c1.setColor("black");
		Engine e1=c1.getEngine();
		e1.setRmp(10000);
		e1.setPower(110);
		e1.setManufacturer("tata");
		e1.makeTurbo();
		
		System.out.println("car mode :"+c1.getModel());
		System.out.println("car company :"+c1.getCompanyName());
		System.out.println("car color :"+c1.getColor());
		System.out.println("car RPM : "+e1.getRmp());
		System.out.println("car power :"+e1.getPower());
		System.out.println("car engine manufacture :"+e1.getManufacturer());
		System.out.println("turbo : " +e1.getHasTurbo());
		System.out.println("=====================================================");
		
		System.out.println("RESULT WITH --- parameterasied constructor");
		System.out.println("=====================================================");
		Engine E1=new Engine(9000,101,"maruti",false);
		Car c2=new Car("swift desire","Maruti","white",E1);
		
		System.out.println("car mode :"+c2.getModel());
		System.out.println("car company :"+c2.getCompanyName());
		System.out.println("car color :"+c2.getColor());
		System.out.println("car RPM : "+E1.getRmp());
		System.out.println("car power :"+E1.getPower());
		System.out.println("car engine manufacture :"+E1.getManufacturer());
		System.out.println("turbo : " +E1.getHasTurbo());
		System.out.println("=====================================================");
		
		
	}

}
