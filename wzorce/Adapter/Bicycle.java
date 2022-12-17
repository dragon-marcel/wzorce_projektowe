package Adapter;

public class Bicycle extends Vehicle {

    @Override
    public void soundHorn() {
	System.out.println("Bicycle sound Horn ");
    }

    @Override
    public void starteEngin() {
	System.out.println("Bicycle start Engine");

    }

    @Override
    public void pushBreak() {
	System.out.println("Bicycle push Break");

    }

}
