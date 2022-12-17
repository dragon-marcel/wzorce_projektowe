package fasada;

public class DeliveryBoxFasade {
    private DeliveryBox deliveryBox;
    private DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFasade() {
	this.deliveryBox = new DeliveryBox();
	this.deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public void pickPakage() {
	deliveryBox.getDataUser();
	if (deliveryBoxSystem.isPaymentSecured() && deliveryBoxSystem.isUserDataValidate()) {
	    deliveryBox.openBox();
	}
    }
}
