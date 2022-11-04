package wzorce.abstractFactory;

public class BMWFactory implements IAutoFactory {

	@Override
	public IEcoCarAbstract createEcoCar() {
		return new BMW318();
	}

	@Override
	public ISporCarAbstract createSportCar() {

		return new BMW740();
	}

}
