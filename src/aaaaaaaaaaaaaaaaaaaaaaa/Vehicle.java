package aaaaaaaaaaaaaaaaaaaaaaa;

public class Vehicle {

	int speed;
    int fuel;

    public Vehicle(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    void move() {
        System.out.println("vehicle moving");
    }
}

class Car extends Vehicle {
    Car(int speed, int fuel) {
        super(speed, fuel);
    }

    @Override
    void move() {
        System.out.println("car moves at speed " + speed);
    }
}

class Bicycle extends Vehicle {
    Bicycle(int speed, int fuel) {
        super(speed, fuel);
    }

    @Override
    void move() {
        System.out.println("bicycle moves");
    }
}
