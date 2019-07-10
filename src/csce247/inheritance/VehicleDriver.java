package csce247.inheritance;

public class VehicleDriver {

	public static void main(String[] args) {
		Car myCar = new Car("abc123",4, 4, "green", "toyota", "prius", 2007, false, 32);
		Truck myTruck = new Truck("cde456", 2, 2, "siler", "ford", "150", 2010, 3000, 7000,true, "extended");
		
		System.out.println("---- " +  myCar.getYear() + " " + myCar.getMake() + " " + myCar.getModel() + "----");
		System.out.println("Doors: "+ myCar.getNumDoors());
		System.out.println("Seats: "+ myCar.getNumSeats());
		System.out.println("Trunk Size: " + myCar.getCargoSpace() + " cubic feet");
		
		if(myCar.isConvertable()) {
			System.out.println("And it's a convertable!");
		}
		
		System.out.println("\n---- " +  myTruck.getYear() + " " + myTruck.getMake() + " " + myTruck.getModel() +"----");
		System.out.println("Doors: "+ myTruck.getNumDoors());
		System.out.println("Seats: "+ myTruck.getNumSeats());
		System.out.println("Towing Capacity: " + myTruck.getTowingCapacity());
		
		if(myTruck.isDually()) {
			System.out.println("And it's a dually!");
		}
	}
}
