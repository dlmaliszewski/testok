package Tools;
public class Screwdriver extends Tool {
    public Screwdriver(String name) {
        super(name);
    }

    public void use() {
        System.out.println("Screwdriver is turning screws");
    }

    public String material() {
        return "Plastic and Metal";
    }
}
