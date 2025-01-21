package animals;

public class Eagle extends Animal {

    public Eagle(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Screech";
    }

    public void fly() {
        System.out.println("Eagle is flying");
    }
}
