package chat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampedMessage extends MessageDecorator {

    public TimestampedMessage(Message message) {
        super(message);
    }

    @Override
    public String getText() {
        String text = message.getText();
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        return "[" + timestamp + "] " + text;
    }
}