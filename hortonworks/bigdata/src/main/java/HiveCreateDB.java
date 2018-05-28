import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;

public class HiveCreateDB {

    private static String driverName = "org.apache.hive.jdbc.HiveDriver";

    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        //Register driver and create driver instance
        Class.forName(driverName);
        //get connection
        Connection con = DriverManager.getConnection("jdbc:hive2://127.0.0.1:10000/default", "", "");
        Statement stmt = con.createStatement();
        stmt.executeQuery("CREATE DATABASE sampledb");
        System.out.println("Database sampledb created successfully.");
        con.close();
    }

}