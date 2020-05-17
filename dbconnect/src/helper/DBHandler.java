package helper;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHandler extends config {
    Connection dbConnection;
    public Connection getDbConnection() throws SQLException, ClassNotFoundException {
        String connectionStrng = "jdbc:mysql://"+dbHost+":" +dbPort +"/"+dbName;
        Class.forName("com.mysql.jdbc.Driver");
        dbConnection = (Connection) DriverManager.getConnection(connectionStrng,dbUser,dbPass);
        return dbConnection;
    }
}
