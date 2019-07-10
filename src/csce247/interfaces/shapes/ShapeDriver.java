package csce247.interfaces.shapes;

public class ShapeDriver {
	public static void main(String[] args) {
		
		Shape square = new Square(5);
		System.out.println("----Square----");
		System.out.println("Area: " + square.getArea());
		System.out.println("Perimeter: "+ square.getPerimeter());
		square.draw();
		
		
		Shape circle = new Circle(5);
		System.out.println("\n----Circle----");
		System.out.println("Area: " + circle.getArea());
		System.out.println("Perimeter: "+ circle.getPerimeter());
		circle.draw();
		
		Shape triangle = new Triangle(3,4);
		System.out.println("\n----Triangle----");
		System.out.println("Area: " + triangle.getArea());
		System.out.println("Perimeter: "+ triangle.getPerimeter());
		triangle.draw();
	}
}
