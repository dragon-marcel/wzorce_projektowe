package wzorce.abstractFactory;

public interface IAutoFactory {
	IEcoCarAbstract createEcoCar();

	ISporCarAbstract createSportCar();
}
