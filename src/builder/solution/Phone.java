package builder.solution;

public class Phone {
    private String os;
    private int ram;
    private double displaySize;
    private int battery;
    private String processor;

    Phone(PhoneBuilder phoneBuilder) {
        this.os = phoneBuilder.getOs();
        this.ram = phoneBuilder.getRam();
        this.displaySize = phoneBuilder.getDisplaySize();
        this.battery = phoneBuilder.getBattery();
        this.processor = phoneBuilder.getProcessor();
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
