package wzorce.prototype;

public class Car implements IVehicle {
	private String name;
	private String color;

	public Car() {
	}

	public Car(Car car) {
		this.name = car.name;
		this.color = car.color;
	}

	@Override
	public IVehicle clone() {
		return new Car(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + "]";
	}

}
