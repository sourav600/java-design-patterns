package factory;

public class MessageFactory {
    public Message getMessage(String messageType){
        if(messageType == null){
            return null;
        }
        else if(messageType.equalsIgnoreCase("error")){
            return new ErrorMessage();
        }
        else if(messageType.equalsIgnoreCase("warning")){
            return new WarnignMessage();
        }
        else if(messageType.equalsIgnoreCase("info")){
            return new InfoMessage();
        }
        return null;
    }
}
