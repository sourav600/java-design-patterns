package singleton.problem;

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<10; ++i){
            DatabaseConnection databaseConnection = new DatabaseConnection();
            String response = databaseConnection.connect();
            System.out.println(databaseConnection +"====>"+response);
        }
    }
}