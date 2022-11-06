package wzorce.decorator;

public class Decorator {
	public static void main(String[] args) {
		Car audi = new AudiA3();
		System.out.println("name: " + audi.name());
		System.out.println("price: " + audi.price());

		Car audiWithAC = new AirConditioning(audi);

		System.out.println("name: " + audiWithAC.name());
		System.out.println("price: " + audiWithAC.price());

		Car audiAcNavi = new Navigation(audiWithAC);

		System.out.println("name: " + audiAcNavi.price());
		System.out.println("price: " + audiAcNavi.name());

	}
}
