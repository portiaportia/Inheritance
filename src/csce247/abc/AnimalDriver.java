package csce247.abc;

public class AnimalDriver {
	
	public static void main(String[] args) {
		Bird myBird = new Bird("Tweety", 2, "seeds", "cheep", "yellow", 5);
		Dog myDog = new Dog("Tipsy", 5, "chicken", "woof", "brown", "retriever", true);
		
		myBird.display();
		myBird.eat();
		myBird.speak();
		myBird.attack();
		
		myDog.display();
		myDog.eat();
		myDog.speak();
		myDog.attack();
	}
	
}
