package Interface;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }
    public void drive() {
        if (getFuelLevel() >= 10) {
            System.out.println("Car is driving");
            consumeFuel(10);
        } else {
            System.out.println("Not enough fuel to drive");
        }
    }
}
