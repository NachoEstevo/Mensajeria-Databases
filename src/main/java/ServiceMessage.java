import java.util.Scanner;

public class ServiceMessage {
    public static void createMessage(){
        Scanner input = new Scanner(System.in);
        System.out.println("Write your message: ");
        String message = input.nextLine();

        System.out.println("Author name: ");
        String author = input.nextLine();

        Message messsage = new Message();
        messsage.setMessage(message);
        messsage.setMessageAuthor(author);
        MessageDAO.createMessageDB(messsage);
    }
    public static void listMessages(){

    }
    public static void deleteMessage(){

    }
    public static void editMessage(){

    }
}
