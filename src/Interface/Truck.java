package Interface;

public class Truck extends Vehicle {
    public Truck(String name) {
        super(name);
    }
    public void drive() {
        if (getFuelLevel() >= 20) {
            System.out.println("Truck is hauling");
            consumeFuel(20);
        } else {
            System.out.println("Not enough fuel to haul");
        }
    }
}
