package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    private String url = "jdbc:mysql://localhost:3306/singleton";
    private String username = "root";
    private String password = "123456";

    private Connection connection;

    private DatabaseConnection() throws SQLException {
        this.connection = DriverManager.getConnection(url,username,password);
    }

    public static DatabaseConnection getInstance() throws SQLException, ClassNotFoundException {
        if(instance == null){
            instance = new DatabaseConnection();
        }

        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void closeConection() throws SQLException{
        if(connection != null && !connection.isClosed()){
            connection.close();
        }
    }
}
