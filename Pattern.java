
import java.sql.Connection;

import wzorce.Adapter.CarAdapter;
import wzorce.Adapter.CarPL;
import wzorce.Adapter.CarUSD;
import wzorce.Adapter.Ford;


public class Pattern {
	public static void main(String args[]) {
		CarUSD carUSD = new Ford();
		CarPL carPl = new CarAdapter(carUSD);
		carUSD.getSpeed();
		carPl.getSpeed();

	}
	
}
