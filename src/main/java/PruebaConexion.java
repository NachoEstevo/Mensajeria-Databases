import java.util.Scanner;

public class PruebaConexion {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("----------------------");
            System.out.println("Messages app\n");
            System.out.println("1. Create a message");
            System.out.println("2. List Messages");
            System.out.println("3. Edit Messages");
            System.out.println("4. Delete messages");
            System.out.println("5. Exit");

            opcion  = input.nextInt();
            switch (opcion){
                case 1:
                    ServiceMessage.createMessage();
                    break;
                case 2:
                    ServiceMessage.listMessages();
                    break;
                case 3:
                    ServiceMessage.editMessage();
                    break;
                case 4:
                    ServiceMessage.deleteMessage();
                    break;
                default:
                    break;
            }
        }while (opcion != 5);
        /*Conexion conexion = new Conexion();

        try(Connection cnx = conexion.getConection()){

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }*/
    }


}
