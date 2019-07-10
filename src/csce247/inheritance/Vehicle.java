package csce247.inheritance;

public class Vehicle {
	protected String licensePlate = null;
	protected int numSeats;
	protected int numDoors;
	protected String color;
	protected String make;
	protected String model;
	protected int year;

	public Vehicle(String licensePlate, int numSeats, int numDoors, String color, String make,
				String model, int year) {
		this.licensePlate = licensePlate;
		this.numSeats = numSeats;
		this.numDoors = numDoors;
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public int getNumSeats() {
		return numSeats;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public String getColor() {
		return color;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}
	
	
}
