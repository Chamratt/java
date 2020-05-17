package helper;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

public class insertToDB {
    static private DBHandler dbHandler;
    static private Connection connection;
    static private PreparedStatement preparedStatement;
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        dbHandler = new DBHandler();
        connection = dbHandler.getDbConnection();
      // readFromDB();
     //  insertToDB();
       updateDB("1","Chamrong","27");

    }
    public static void insertToDB() throws SQLException {
        String insert = "INSERT INTO myusers(ID,NAME,AGE) VALUES(?,?,?)";
        preparedStatement = (PreparedStatement) connection.prepareStatement(insert);
        preparedStatement.setString(1,"3");
        preparedStatement.setString(2,"Chamrith");
        preparedStatement.setString(3,"17");
        preparedStatement.executeUpdate();


    }
    public static void readFromDB() throws SQLException {
        String query = "SELECT * from myusers";
        PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("ID  NAME      AGE");
        while (resultSet.next()){

            System.out.println(resultSet.getString("ID")+"   "+resultSet.getString("NAME")
                    +"   "+resultSet.getString("AGE"));
        }
    }
    public static void updateDB(String  ID,String NAME,String AGE){
        String query = "UPDATE myusers SET NAME = ?, AGE = ? WHERE ID = ?";
        try {
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            preparedStatement.setString(1,NAME);
            preparedStatement.setString(2, AGE);
            preparedStatement.setString(3, ID);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }catch (SQLException e){
            System.out.println(e);
        }
    }
}
