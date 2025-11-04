package chat;

public class ChatDemo {
    public static void main(String[] args) {
        Message msg = new SimpleMessage("Привіт, як справи?");
        System.out.println("Базове повідомлення:");
        System.out.println(msg.getText());

        // Зашифруємо повідомлення
        msg = new EncryptedMessage(msg);
        System.out.println("\nПісля шифрування:");
        System.out.println(msg.getText());

        // Додамо дату та час
        msg = new TimestampedMessage(msg);
        System.out.println("\nПісля додавання дати та часу:");
        System.out.println(msg.getText());

        // Додамо автора
        msg = new AuthorMessage(msg, "Кепещук Cоломія");
        System.out.println("\nПісля додавання автора:");
        System.out.println(msg.getText());

        // Додамо стиснення
        msg = new CompressedMessage(msg);
        System.out.println("\nПісля стиснення:");
        System.out.println(msg.getText());
    }
}
