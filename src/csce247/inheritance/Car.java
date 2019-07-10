package csce247.inheritance;

public class Car extends Vehicle {
	private boolean convertable;
	private int cargoSpace; 
	
	public Car(String licensePlate, int numSeats, int numDoors, String color, String make, String model, int year,
			boolean convertable, int cargoSpace) {
		super(licensePlate, numSeats, numDoors, color, make, model, year);
		this.convertable = convertable;
		this.cargoSpace = cargoSpace;
	}
	
	public boolean isConvertable() {
		return convertable;
	}
	
	public int getCargoSpace() {
		return cargoSpace;
	}
}
