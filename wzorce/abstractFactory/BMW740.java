package wzorce.abstractFactory;

public class BMW740 implements ISporCarAbstract {
	String name;

	public BMW740() {
		this.name = "BMW 740";
	}

	@Override
	public void turnOn() {
		System.out.println("Sport car turn On:" + name);

	}

	@Override
	public void turnOff() {
		System.out.println("Sport car turn Off:" + name);

	}
}
