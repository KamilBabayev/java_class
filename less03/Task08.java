package less03;

import java.util.Random;

// Write a Java program to calculate the average value of array elements
public class Task08 {
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
        System.out.println("average value of array elements = " +
                            "sum / array lenght = " + sum + " / " +
                            numbers.length + " = " + sum / numbers.length);
    }
}
