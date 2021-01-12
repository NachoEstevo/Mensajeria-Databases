import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MessageDAO {

    public static void createMessageDB(Message message){
        Conexion.getConnection();
        PreparedStatement ps = null;
        try {
            String query = "INSERT INTO mensajes (mensaje,autor) VALUES(?,?)";
            ps = Conexion.getConnection().prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setString(2,message.getMessageAuthor());
            ps.executeUpdate();
            System.out.println("Message Created");
        }catch (SQLException e){
            System.out.println(e);

        }

    }
    public static void readMessages(){

    }
    public static void deleteMessagesDB(int messageID){

    }
    public static void updateMessage(Message message){

    }
}
