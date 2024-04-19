package less01;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter value of 1st number: ");
        int x = scanner.nextInt();
        System.out.println("enter value of 2nd number: ");
        int y = scanner.nextInt();

        System.out.println(x + " * " + y + " = " + x * y);
    }
}
