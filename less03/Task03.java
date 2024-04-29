package less03;

public class Task03 {
    public static void main(String[] args) {
        int number = 5;
        int factorial = 1;

        if (number < 0) {
            System.out.println("enter positive number");
        } else if (number == 0) {
            System.out.println("factorial of 0 is 1");
        } else {
            for (int i = 1; i <= number ; i++) {
                System.out.println(factorial);
                factorial = factorial * i;
            }
            System.out.println("factorial of " + number + " is " + factorial);
        }

    }
}
