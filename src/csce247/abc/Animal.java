package csce247.abc;

public abstract class Animal {
	private String name;
	protected int speed;
	private String food;
	private String sound;
	protected String color;
	
	public Animal(String name, int speed, String food, String sound, String color) {
		this.name = name;
		this.speed = speed;
		this.food = food;
		this.sound = sound;
		this.color = color;
	}
	
	public void eat() {
		System.out.println("Eating " + food);
	}
	
	public void speak() {
		System.out.println(sound + " " + sound + " " + sound);
	}
	
	public void display() {
		System.out.println("------ " + name + " ------");
	}
	
	public abstract void move();
	
	public abstract void attack();
}
