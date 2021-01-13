import java.util.Scanner;

public class ServiceMessage {   //CRUD System. Create, Read, Update and Delete

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
        MessageDAO.readMessages();
    }

    public static void deleteMessage(){
        Scanner input = new Scanner(System.in);
        System.out.print("ID of message to be deleted: ");
        int messageID = input.nextInt();
        MessageDAO.deleteMessagesDB(messageID);
    }

    public static void editMessage(){
        Scanner input = new Scanner(System.in);

        System.out.print("What's the message: ");
        String messageText = input.nextLine();

        System.out.print("ID of message to be updated: ");
        int messageID = input.nextInt();

        Message update = new Message();
        update.setMessageID(messageID);
        update.setMessage(messageText);
        MessageDAO.updateMessage(update);
    }

}
