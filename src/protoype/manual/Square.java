package protoype.manual;

public class Square implements Shape {
    private String name;

    public Square(String  name){
        this.name = name;
    }

    @Override
    public Shape clone() {
        return new Square(this.name);
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
