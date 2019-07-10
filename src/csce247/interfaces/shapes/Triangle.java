package csce247.interfaces.shapes;

public class Triangle implements Shape {
	private int base;
	private int height;
	
	public Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}
	
	public double getArea() {
		return base * height / 2;
	}
	
	public double getPerimeter() {
		return 2 * base * height;	//This is incorrect
	}
	
	public void draw() {
		System.out.println("   *");
		System.out.println("  ***");
		System.out.println(" *****");
		System.out.println("*******");
	}
}
