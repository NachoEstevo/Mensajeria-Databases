public class Message {
    int messageID;
    String message;
    String messageAuthor;
    String messageDate;

    public Message(){}

    public Message(String message, String messageAuthor, String messageDate){
        this.message = message;
        this.messageAuthor = messageAuthor;
        this.messageDate = messageDate;
    }

    public int getMessageID() {
        return messageID;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageAuthor() {
        return messageAuthor;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public void setMessage(String message) { this.message = message;}

    public void setMessageID(int messageID) { this.messageID = messageID;}

    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
    }
}
