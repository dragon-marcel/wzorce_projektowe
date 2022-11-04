package wzorce.abstractFactory;

public class BMW318 implements IEcoCarAbstract {

	private String name;

	protected BMW318() {
		this.name = "BMW 318";
	}

	@Override
	public void turnOn() {
		System.out.println("Car eco turn On:" + name);

	}

	@Override
	public void turnOff() {
		System.out.println("Car eco turn Off:" + name);
	}

}
