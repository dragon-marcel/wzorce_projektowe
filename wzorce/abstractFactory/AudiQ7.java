package wzorce.abstractFactory;

public class AudiQ7 implements  ISporCarAbstract {
	String name;

	public AudiQ7() {
		this.name = "Audi Q7";
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
