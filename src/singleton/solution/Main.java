package singleton.solution;

public class Main {
    public static void main(String[] args) {
        for(int i=0; i<10; ++i){
            DatabaseConnection databaseConnection = DatabaseConnection.getReference();
            String response = databaseConnection.connectDB();
            System.out.println(databaseConnection +"====>"+response);
        }
    }
}