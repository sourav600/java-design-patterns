package builder.solution;

public class Main {
    public static void main(String[] args) {
        Phone phone = new PhoneBuilder()
                .setOs("Android")
                .setBattery(5500)
                .setDisplaySize(5.7)
                .setProcessor("QualComm")
                .setRam(16)
                .build();
        System.out.println(phone);
    }
}
