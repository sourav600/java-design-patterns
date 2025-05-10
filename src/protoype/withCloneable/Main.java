package protoype.withCloneable;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle");
        Shape square = new Square("Square");

        //Clone
        Shape clonedCircle = circle.clone();
        Shape clonedSquare = square.clone();

        //Customize cloned shape
        clonedCircle.setName("Cloned circle");
        clonedSquare.setName("Cloned Square");

        System.out.println("Circle: " + clonedCircle.getName());
        System.out.println("Square: " + clonedSquare.getName());


        //store and retrieve prototypes (Same as before)
        ShapeCache registry = new ShapeCache();
        registry.registerShape("circle", circle);
        registry.registerShape("square", square);

        clonedCircle = registry.getClone("circle");
        clonedSquare = registry.getClone("square");

        clonedCircle.setName("Cloned circle");
        clonedSquare.setName("Cloned Square");
        
        System.out.println("Circle: " + clonedCircle.getName());
        System.out.println("Square: " + clonedSquare.getName());
    }
}
