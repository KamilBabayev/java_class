package less04;

public class Task02 {
    public static void main(String[] args) {
        System.out.println(getSmallest(2,  4, 7));
    }
    
    public static String getSmallest(int a, int b, int c) {
        if (a < b && a < c) {
            return a + " is smaller than " + b + " and " + c;
        } else if (b < a && b < c) {
            return b + " is smaller than " + a + " and " + c;
        } else if (c < a && c < b) {
            return c + " is smaller than " + a + " and " + b;
        } else {
            return "can not compare";
        }
    }
}
