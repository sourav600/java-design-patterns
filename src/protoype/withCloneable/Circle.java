package protoype.withCloneable;

public class Circle implements Shape {
    private String name;
    public Circle(String name){
        this.name = name;
    }
    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException("Clone not supported!", e);
        }
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
