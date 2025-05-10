package singleton.solution;

public class DatabaseConnection {
    private static DatabaseConnection reference;
    private DatabaseConnection(){
        System.out.println("Private constructor");
    };
    public static DatabaseConnection getReference(){
        if(DatabaseConnection.reference==null)
            DatabaseConnection.reference = new DatabaseConnection();

        return DatabaseConnection.reference;
    }

    public String connectDB(){
        return "Connected";
    }
}
