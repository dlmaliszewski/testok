package Tools;
public abstract class Tool {
    private String name;

    public Tool(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void use();
    public abstract String material();
}
