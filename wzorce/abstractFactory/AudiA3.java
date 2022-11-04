package wzorce.abstractFactory;

public class AudiA3 implements IEcoCarAbstract {
	private String name;

	protected AudiA3() {
		this.name = "Audi A3";
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
