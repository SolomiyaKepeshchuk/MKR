package chat;

public class CompressedMessage extends MessageDecorator {

    public CompressedMessage(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        String text = message.getText();
        return text.replaceAll("\\s+", " ").trim();
    }
}
