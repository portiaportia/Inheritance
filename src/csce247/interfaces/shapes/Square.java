package csce247.interfaces.shapes;

public class Square implements Shape{
	private int width;
	
	public Square(int width) {
		this.width = width;
	}
	
	public double getArea() {
		return width * width;
	}
	
	public double getPerimeter() {
		return width * 4;
	}
	
	public void draw() {

		for(int i=0; i < 4; i++) {
			System.out.println("*******");
		}
	}
}
