package chat;

public class EncryptedMessage extends MessageDecorator {

    public EncryptedMessage(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        String text = message.getText();
        StringBuilder encrypted = new StringBuilder();
        for (char c : text.toCharArray()) {
            encrypted.append((char)(c + 1));
        }
        return encrypted.toString();
    }
}