package csce247.interfaces.shapes;

public class Circle implements Shape{
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public void draw() {

		System.out.println("   * ");
		System.out.println(" *****");
		System.out.println("*******");
		System.out.println(" *****");
		System.out.println("   * ");
	}
}
