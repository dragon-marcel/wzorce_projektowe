package wzorce.decorator;

public class Navigation extends CarAccessories {
	private Car car;

	public Navigation(Car car) {
		this.car = car;
	}

	@Override
	public int price() {
		return car.price() + 300;
	}

	@Override
	public String name() {
		return car.name() + " with Navi";
	}
}
