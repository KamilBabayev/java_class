package less02;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");

        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(number + " is positive");
        } else if(number < 0) {
            System.out.println(number + " is negative");
        } else if (number == 0) {
            System.out.println(number + "is zero");
        } else {
            System.out.println("bad number");
        }
    }
}
