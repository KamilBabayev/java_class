package less05_strings;

public class Task04 {
    public static void main(String[] args) {
        String a = "salam";
        String b = "la";

        String sentence = "demo java app";
        String subsentence = "ava";

        System.out.println(isCharsExist(a, b));
        System.out.println(isCharsExist(sentence, subsentence));
    }

    public static String isCharsExist(String text, String chars) {
        boolean result = text.contains(chars);
        if (result == true) {
            return text + " contains -> " + chars;
        } else {
            return text + " not contains -> " + chars;
        }

    }
}
