package builder.problem;

public class Phone {
    private String os;
    private int ram;
    private double displaySize;
    private int battery;
    private String processor;

    Phone(String os, int ram, double displaySize, int battery, String processor) {
        this.os = os;
        this.ram = ram;
        this.displaySize = displaySize;
        this.battery = battery;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram=" + ram +
                ", displaySize=" + displaySize +
                ", battery=" + battery +
                ", processor='" + processor + '\'' +
                '}';
    }
}
