package less02;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        float num = scanner.nextFloat();

        if (num == 0) {
            System.out.println("number is zero");
        } else if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        }
    }
}
