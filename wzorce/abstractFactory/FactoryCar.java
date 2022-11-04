package wzorce.abstractFactory;

public class FactoryCar {
	public static IAutoFactory createAuto(String typ) {
		switch (typ) {
		case "bmw":
			return new BMWFactory();
		case "audi":
			return new AudiFactory();
		default:
			return null;
		}

	}
}
