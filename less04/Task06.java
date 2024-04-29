package less04;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        menu();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number: ");
        int number1 = scanner.nextInt();

        System.out.println("enter operation:  +, -, *, / ");
        char oper = scanner.next().charAt(0);

        System.out.println("enter number: ");
        int number2 = scanner.nextInt();

        switch (oper) {
            case '+' -> System.out.println(add(number1, number2));
            case '-' -> System.out.println(subtract(number1, number2));
            case '*' -> System.out.println(multiply(number1, number2));
            case '/' -> System.out.println(divide(number1, number2));
        }
    }
}
