package Interface;

public class Motorbike extends Vehicle {
    public Motorbike(String name) {
        super(name);
    }
    public void drive() {
        if (getFuelLevel() >= 5) {
            System.out.println("Motorbike is riding");
            consumeFuel(5);
        } else {
            System.out.println("Not enough fuel to ride");
        }
    }
}
