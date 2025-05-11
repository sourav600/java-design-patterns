package builder.solution;

public class PhoneBuilder {
    private String os;
    private int ram;
    private double displaySize;
    private int battery;
    private String processor;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Phone build(){
        return new Phone(this);
    }

    public String getOs() {
        return os;
    }

    public int getRam() {
        return ram;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public int getBattery() {
        return battery;
    }

    public String getProcessor() {
        return processor;
    }
}
