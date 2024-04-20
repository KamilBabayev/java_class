package less02;

import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("enter 1st number");
        int a = scanner.nextInt();

        System.out.println("enter 2nd number");
        int b = scanner.nextInt();

        System.out.println("enter 3rd number");
        int c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println(a + " is bigger than others");
        } else if (b > a && b > c) {
            System.out.println(b + " is bigger than others");
        } else if (c > a && c > b) {
            System.out.println(c + " is bigger than others");
        }
    }
}
