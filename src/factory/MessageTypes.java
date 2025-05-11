package factory;

class ErrorMessage implements Message{
    @Override
    public void print() {
        System.out.println("Error message!");
    }
}
class WarnignMessage implements Message{
    @Override
    public void print() {
        System.out.println("Warning message!");
    }
}

class InfoMessage implements Message{
    @Override
    public void print() {
        System.out.println("Information message!");
    }
}