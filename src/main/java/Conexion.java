import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class Conexion {
        private static Connection myConnection;
        public static Connection getConnection(){
            if(myConnection == null) {
                try {
                    myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajeria?serverTimezone=UTC", "root", "20EstevoI12502");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return myConnection;
        }
    }

