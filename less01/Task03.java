package less01;

public class Task03 {
    public static void main(String[] args) {
        int x = 48;
        int y = 4;
        int result = DivideNumber(x, y);
        System.out.println(x + " / " + y + " = " + result);
    }

    public static int DivideNumber(int x, int y) {
        return  x / y;
    }
}
