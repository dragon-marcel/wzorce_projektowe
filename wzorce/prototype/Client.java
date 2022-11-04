package wzorce.prototype;

public class Client {
	public Client() {

	}

	public void cloneVehicle() {
		Car carBMW = new Car();
		carBMW.setColor("red");
		carBMW.setName("BMW");

		Car carAudi = (Car) carBMW.clone();
		carAudi.setName("Audi");

		Bus busStar = new Bus();
		busStar.setColor("blue");
		busStar.setName("Star");

		Bus busMercedes = new Bus();
		busMercedes.setColor("blue");
		busMercedes.setName("Mercedes");

		System.out.print(carBMW.toString());
		System.out.print(carAudi.toString());
		System.out.print(busStar.toString());
		System.out.print(busMercedes.toString());

	}
}
