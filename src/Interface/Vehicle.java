package Interface;

public abstract class Vehicle implements Driveable, Refuelable {
    private String name;
    private int fuelLevel;
    public Vehicle(String name) {
        this.name = name;
        this.fuelLevel = 0;
    }
    public String getName() {
        return name;
    }
    public void refuel(int amount) {
        if (amount > 0) {
            fuelLevel += amount;
        }
    }
    public int getFuelLevel() {
        return fuelLevel;
    }
    public void consumeFuel(int amount) {
        if (fuelLevel >= amount) {
            fuelLevel -= amount;
        }
    }
}
