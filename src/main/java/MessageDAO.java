import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            System.out.println("El mensaje no pudo ser creado");
            e.printStackTrace();
        }
    }

    public static void readMessages(){
        Conexion.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            String query = "SELECT * FROM mensajes";
            ps = Conexion.getConnection().prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("ID: " + rs.getInt("idmensajes"));
                System.out.println("Message: " + rs.getString("mensaje"));
                System.out.println("Author: " + rs.getString("autor"));
                System.out.println("Date: " + rs.getString("fecha"));
                System.out.println("-----------------\n");
            }
        }
        catch (SQLException e){
            System.out.println("Messages could not be retrieved");
            e.printStackTrace();
        }
    }

    public static void deleteMessagesDB(int messageID){
        Conexion.getConnection();
        PreparedStatement ps = null;
        try {
            String query = "DELETE FROM mensajes WHERE idmensajes =" + messageID;
            ps = Conexion.getConnection().prepareStatement(query);
            ps.executeUpdate();
            System.out.println("Message deleted succesfully");
        }
        catch (SQLException e){
            System.out.println("Message could not be deleted");
            e.printStackTrace();
        }
    }

    public static void updateMessage(Message message){
        Conexion.getConnection();
        PreparedStatement ps = null;
        try {
            String query = "UPDATE mensajes SET mensaje = ? WHERE idmensajes = ?" ;
            ps = Conexion.getConnection().prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setInt(2,message.getMessageID());
            ps.executeUpdate();
            System.out.println("Message updated succesfully");

        }
        catch (SQLException e){
            System.out.println("Message could not be updated");
            e.printStackTrace();
        }
    }

}
