package animals;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public String sound() {
        return "Woof";
    }

    public void swim() {
        System.out.println("Dog is swimming");
    }
}
