package protoype.manual;

public class Circle implements Shape {
    private String name;
    public Circle(String name){
        this.name = name;
    }
    @Override
    public Shape clone() {
        return new Circle(this.name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
