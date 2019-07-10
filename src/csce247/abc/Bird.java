package csce247.abc;

public class Bird extends Animal {
	private int wingspan;
	
	public Bird(String name, int speed, String food, String sound, String color, int wingspan) {
		super(name, speed, food, sound, color);
		this.wingspan = wingspan;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("I'm a " + color + " bird");
	}

	@Override
	public void move() {
		System.out.println("Flappying my wings with a speed of " + speed + " miles / hour");
	}

	@Override
	public void attack() {
		System.out.println("I'm attacking all of the worms");
	}
	
}
