package factory;

public class Main {
    public static void main(String[] args) {
        MessageFactory messageFactory = new MessageFactory();

        Message message = messageFactory.getMessage("error");
        message.print();

        Message message2 = messageFactory.getMessage("warning");
        message2.print();

        Message message3 = messageFactory.getMessage("info");
        message3.print();
    }
}
