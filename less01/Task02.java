package less01;

public class Task02 {
    public static void main(String[] args) {
        int x = 10;
        int y = 30;

        int result = SumTwoNumbers(x, y);
        System.out.println(x + " + " + y + " = " + result);
    }

    public static int SumTwoNumbers(int x, int y) {
        return x + y;
    }
}
