package less03;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int a = scanner.nextInt();
        System.out.println("enter 2nd number: ");
        int b = scanner.nextInt();

        int result = 1;
        for (int i = 1; i <= b; i++) {
            result = result * a;
        }

        System.out.println(a + " raised to power " + b + " equals " + result);
    }
}
