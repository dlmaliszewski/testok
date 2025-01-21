package animals;

public class Penguin extends Animal {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Squawk";
    }

    public void swim() {
        System.out.println("Penguin is swimming");
    }

    public void fly() {
        System.out.println("Penguin cannot fly");
    }
}
