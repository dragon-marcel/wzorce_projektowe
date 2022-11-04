
import java.sql.Connection;

import wzorce.abstractFactory.FactoryCar;
import wzorce.abstractFactory.IAuto;
import wzorce.abstractFactory.IAutoFactory;
import wzorce.abstractFactory.IEcoCarAbstract;
import wzorce.abstractFactory.ISporCarAbstract;
import wzorce.prototype.Client;
import wzorce.singleton.DatabaseConnection;

public class Pattern {
	public static void main(String args[]) {
//		//Singleton
		System.out.println("Sigleton");
		try {
			Connection connection = DatabaseConnection.getInstance().getConnection();
		} catch (Exception ex) {

		}
		// Protected
		System.out.println("Protected");
		Client client = new Client();
		client.cloneVehicle();

		// AbstractFactory
		System.out.println("AbstractFactory");
		IAutoFactory BMW = FactoryCar.createAuto("bmw");
		IAutoFactory AUDI = FactoryCar.createAuto("audi");

		IEcoCarAbstract bmwEco = BMW.createEcoCar();
		IEcoCarAbstract audiEco = AUDI.createEcoCar();
		
		ISporCarAbstract bmwSport = BMW.createSportCar();
		ISporCarAbstract audiSport = AUDI.createSportCar();

		bmwEco.turnOn();
		bmwEco.turnOff();
		audiEco.turnOn();
		audiEco.turnOff();
		
		bmwSport.turnOn();
		bmwSport.turnOff();
		audiSport.turnOn();
		audiSport.turnOff();
		
		
	}

}
