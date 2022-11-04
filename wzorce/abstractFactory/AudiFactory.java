package wzorce.abstractFactory;

public class AudiFactory implements IAutoFactory {

	@Override
	public IEcoCarAbstract createEcoCar() {

		return new AudiA3();
	}

	@Override
	public ISporCarAbstract createSportCar() {
		return new AudiQ7();
	}

}
