package com.masai.q5;

public class Shapes {

	public void area(Circle circle) {
		double ar=3.14*(double)circle.radius*(double)circle.radius;
		System.out.println("area of circle is :: "+ar);
		
	}
	public void area(Rectangle rectangle) {
		int ar=rectangle.breadth*rectangle.length;
		System.out.println("area of retangul is :: "+ar);
	}
	public void area(Square square) {
		int ar=square.side*square.side;
		System.out.println("area of square is :: "+ar);
	}
	
}
