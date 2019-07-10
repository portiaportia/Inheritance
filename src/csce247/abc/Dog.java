package csce247.abc;

public class Dog extends Animal{
	private String breed;
	private boolean alergenic;
	
	public Dog(String name, int speed, String food, String sound, String color, String breed, boolean alergenic) {
		super(name, speed, food, sound, color);
		this.breed = breed;
		this.alergenic = alergenic;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("I'm a " + color + " "  + breed + " dog");
	}

	@Override
	public void move() {
		System.out.println("Running at a " + speed + " miles / hour");
	}

	@Override
	public void attack() {
		System.out.println("I'm attacking all of the cats!");
	}
}
