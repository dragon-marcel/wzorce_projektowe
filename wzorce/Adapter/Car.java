package Adapter;

public class Car extends Vehicle{
    @Override
    public void soundHorn() {
	System.out.println("Car sound Horn ");
    }
    @Override
    public void starteEngin() {
	System.out.println("Car start Engine");

    }
    @Override
    public void pushBreak() {
	System.out.println("Car push Break");

    }

}
