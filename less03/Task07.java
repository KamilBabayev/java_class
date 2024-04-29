package less03;

import java.util.Random;

// Write a Java program to sum values of an array
public class Task07 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(1,30);
            numbers[i] = randomNumber;
        }

        for (int i = 0; i <  numbers.length ; i++) {
            sum += numbers[i];
        }
        System.out.println("sum of array elements: " + sum);
    }
}
