package less01;

public class Task02 {
    public static void main(String[] args) {
        int x = 10;
        int y = 30;

        int result = sumTwoNumbers(x, y);
        System.out.println(x + " + " + y + " = " + result);
    }

    public static int sumTwoNumbers(int x, int y) {
        return x + y;
    }
}
