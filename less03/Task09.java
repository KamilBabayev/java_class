package less03;

import java.util.Arrays;
import java.util.Random;

//Write a Java program to test if an array contains a specific value
public class Task09 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        int value = 20;

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(1,30);
            numbers[i] = randomNumber;
        }

        Arrays.sort(numbers);
        int result = Arrays.binarySearch(numbers, value);

        if (result > 0) {
            System.out.println("array have number " + value + " at index " + result);
        } else {
            System.out.println("array does not have number " + value);
        }
    }
}
