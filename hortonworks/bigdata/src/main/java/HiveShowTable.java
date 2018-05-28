import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class HiveShowTable {

    public static void main(String[] args) {

        String url = "jdbc:hive2://127.0.0.1:10000/default";

        Connection conn = null;

        try {

            Class.forName("org.apache.hive.jdbc.HiveDriver");

            conn = DriverManager.getConnection(url);

            System.out.println("Connected.");

            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("show tables");

            while (rs.next()) {

                System.out.println(rs.getString(1));
            }

        }

        catch (Exception ex) {

            System.out.println(ex.getMessage());

        }

    }
}