package wzorce.prototype;

public class Bus implements IVehicle {
	private String name;
	private String color;

	public Bus() {
	}

	public Bus(Bus bus) {
		this.name = bus.name;
		this.color = bus.color;
	}

	@Override
	public IVehicle clone() {
		return new Bus(this);
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
		return "Bus [name=" + name + ", color=" + color + "]";
	}
	
}
