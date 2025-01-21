package Tools;
public class Hammer extends Tool {
    public Hammer(String name) {
        super(name);
    }
    public void use() {
        System.out.println("Hammer is hitting");
    }

    public String material() {
        return "Steel";
    }
}
