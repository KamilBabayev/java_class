package less02;

import java.util.Scanner;
import java.lang.Math;

public class Task07 {
    public static void main(String[] args) {
        System.out.println("welcome");

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter square, circle, pi or rectangle");

        String item = scanner.nextLine();
        switch (item) {
            case "rectangle" -> {
                System.out.println("enter a side");
                int a_side = scanner.nextInt();
                System.out.println("enter b side");
                int b_side = scanner.nextInt();
                System.out.println("area of rectangle " + a_side * b_side);
            }

            case "circle" -> {
                System.out.println("enter radius");
                int radius = scanner.nextInt();
                System.out.println("circle area is " +  radius * radius * Math.PI);
            }

            case "square" -> {
                System.out.println("enter a side");
                int side = scanner.nextInt();
                System.out.println("area of square: " + side * side);
            }

            default -> System.out.println("did not understand you, please choose figures from message");
        }
    }
}
