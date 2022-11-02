package singleton;

import com.mongodb.client.MongoClient;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDBClient {
    public static PostgresDBClient client = null;

    private Connection connection;
    private String url = "jdbc:postgresql://localhost:5432/jdbc";
    private String username = "root";
    private String password = "localhost";

    private PostgresDBClient()
    {
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static PostgresDBClient getInstance() throws SQLException {

        PostgresDBClient instance = null;
        if (instance == null) {
            instance = new PostgresDBClient();
        } else if (instance.getConnection().isClosed()) {
            instance = new PostgresDBClient();
        }

        return instance;
    }

}
