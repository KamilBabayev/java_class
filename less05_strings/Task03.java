package less05_strings;

// Write a Java program to concatenate a given string to the end of another string
public class Task03 {
    public static void main(String[] args) {
        String text1 = "Your position is";
        String text2 = " Senior Engineer";

        String text3 = "This is demo ";
        String text4 = "java application";

        System.out.println(concatStrings(text1, text2));
        System.out.println(concatStrings(text3, text4));
    }

    public static String concatStrings(String a, String b) {
        return a.concat(b);
    }
}
