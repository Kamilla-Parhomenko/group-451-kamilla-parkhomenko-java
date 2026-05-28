package aaaaaaaaaaaaaaaaaaaaaaa;

public class Toy {

	protected String name;
    protected double price;

    
    public Toy(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ElectronicToy extends Toy {
    private boolean batteryRequired;

    public ElectronicToy(String name, double price, boolean batteryRequired) {
        super(name, price);
        this.batteryRequired = batteryRequired;
    }

}
