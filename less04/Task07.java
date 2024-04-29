package less04;

public class Task07 {
    public static void main(String[] args) {
        String message1 = "test_message";
        String message2 = "welcome";

        System.out.println(stringValidator(message1));
        System.out.println(stringValidator(message2));
    }

    public static String stringValidator(String text) {
        if (text.length() < 8 && text.length() > 3) {
            return "OKAY";
        }

        return "ERROR";
    }
}
