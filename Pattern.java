


import Adapter.Bicycle;
import Adapter.Car;
import Adapter.Vehicle;

public class Pattern {
	public static void main(String args[]) {
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		addapter(car);
		addapter(bicycle);

	}
	private static void addapter(Vehicle vehicle) {
	    vehicle.starteEngin();
	    vehicle.soundHorn();
	    vehicle.pushBreak();
	}

}
