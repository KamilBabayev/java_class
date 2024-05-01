package less05_strings;

// Write a Java program to get the character at the given index within the String
public class Task01 {
    public static void main(String[] args) {
        String text1 = "This is test line";
        String text2 = "Demo java program";
        System.out.println(getCharByIndex(text1));
        System.out.println(getCharByIndex(text2));
    }

    public static char getCharByIndex(String text) {
        return text.charAt(0);
    }
}
