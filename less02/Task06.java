package less02;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are same");
        } else {
            System.out.println(num1 + " and " + num2 + " are different");
        }

    }
}

