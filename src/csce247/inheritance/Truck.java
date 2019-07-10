package csce247.inheritance;

public class Truck extends Vehicle {
	private int payload;
	private int towingCapacity; 
	private boolean dually; 
	private String cabType; 

	public Truck(String licensePlate, int numSeats, int numDoors, String color, String make, String model, int year,
			int payload, int towingCapacity, boolean dually, String cabType) {
		super(licensePlate, numSeats, numDoors, color, make, model, year);

		this.payload = payload;
		this.towingCapacity = towingCapacity;
		this.dually = dually;
		this.cabType = cabType;
	}
	
	public int getPayLoad() {
		return payload;
	}
	
	public int getTowingCapacity() {
		return towingCapacity;
	}
	
	public boolean isDually() {
		return dually;
	}
	
	public String getCabType() {
		return cabType;
	}
}
