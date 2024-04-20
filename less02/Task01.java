package less02;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter number: ");
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            System.out.println("Wierd");
        } else if (number % 2 == 0 && (number > 2 && number < 5)) {
            System.out.println("Not Weird");
        } else if (number % 2 == 0 && (number > 6 && number < 20)){
            System.out.println("Weird");
        } else if (number % 2 == 0 && number > 20) {
            System.out.println("Not Wierd");
        }
    }
}
