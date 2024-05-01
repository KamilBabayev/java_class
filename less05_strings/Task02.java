package less05_strings;

import java.util.Locale;

// Write a Java program to compare two strings lexicographically, ignoring case differences
public class Task02 {
    public static void main(String[] args) {
        String  a = "welcOme22";
        String b   = "Welcome22";

        System.out.println(compareStrings(a, b));
    }

    public static String compareStrings(String a, String b) {

        int result = a.toLowerCase().compareTo(b.toLowerCase());

        if (result == 0) {
            return a.toLowerCase() + " equals " + b.toLowerCase();
        } else {
            return a.toLowerCase() + " and " + b.toLowerCase() + " are different";
        }
    }
}
