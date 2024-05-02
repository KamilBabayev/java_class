package less05_strings;

// Write a Java program to create a new String object with the contents of a character array
// (FE: char[] arr_num = new char[] { '1', '2', '3', '4' } --> The book contains 234 pages)
public class Task05 {
    public static void main(String[] args) {
        char[] arr_num = new char[] { '1', '2', '3', '4' };

        String pageCount = String.copyValueOf(arr_num, 1, 3);
        System.out.println(getStringFromCharArr(arr_num));
    }

    public static String getStringFromCharArr(char[] char_arr) {
        String pageCount = String.copyValueOf(char_arr, 1, 3);
        return "The book contains " + pageCount +  " pages.";
    }
}
