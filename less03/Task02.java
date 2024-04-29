package less03;

public class Task02 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 10;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println("First method to sum from 1 to " + n);
        System.out.println("sum of from 1 to " + n + " is " + sum);
        System.out.println(" ");

        System.out.println("Second method to sum from one to " + n);
        sum = 0;
        System.out.println("sum of from 1 to " + n + " is "  + n*(n+1)/2);
    }
}
