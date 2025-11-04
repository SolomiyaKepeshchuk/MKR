package chat;

public class AuthorMessage extends MessageDecorator {
    private String author;

    public AuthorMessage(Message message, String author) {
        super(message);
        this.author = author;
    }

    @Override
    public String getText() {
        return message.getText() + " - " + author;
    }
}