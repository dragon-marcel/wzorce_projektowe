package wzorce.Adapter;

public  class CarAdapter implements CarPL {
    public CarUSD carUSD;

    public CarAdapter(CarUSD carUSD) {
	this.carUSD = carUSD;
    }

    
    public double getSpeed() {
	double speed = carUSD.getSpeed() * 1.60934;
	System.out.println("CAR PL get speed " + speed + "KM/H");
	return speed;
    }

}
