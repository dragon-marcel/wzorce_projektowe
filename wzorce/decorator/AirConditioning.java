package wzorce.decorator;

public class AirConditioning extends CarAccessories {

	public AirConditioning(Car car) {
		this.car = car;
	}

	@Override
	public int price() {
		return car.price() + 200;
	}

	@Override
	public String name() {
		return car.name() + " with AirConditioning ";
	}

}
