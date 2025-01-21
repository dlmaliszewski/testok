package Tools;
public class Saw extends Tool {
    public Saw(String name) {
        super(name);
    }

    public void use() {
        System.out.println("Saw is cutting");
    }

    public String material() {
        return "Carbon Steel";
    }
}
