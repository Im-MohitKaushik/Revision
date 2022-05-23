package com.masai.Q3;

public class Car  {
	
	private String model;
	private String companyName;
	private String color;
	private Engine engine;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	
	public Car(String model, String companyName, String color, Engine engine) {
		super();
		Engine e1=new Engine();
		this.model = model;
		this.companyName = companyName;
		this.color = color;
		this.engine = e1;
	}
	public Car() {
		super();
		Engine e1=new Engine();
		this.engine=e1;
		// TODO Auto-generated constructor stub
	}
	
	
}
