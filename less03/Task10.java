package less03;

import java.util.Arrays;
import java.util.Random;

// Write a Java program to find the index of an array element
public class Task10 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            numbers[i] = i;
        }

        int a = Arrays.binarySearch(numbers, 5);
        int b = Arrays.binarySearch(numbers, 4);
        int c = Arrays.binarySearch(numbers, 6);

        System.out.println(a + " sits at index " + a);
        System.out.println(b + " sits at index " + b);
        System.out.println(c + " sits at index " + c);

        numbers[7] = 34;
        int d = Arrays.binarySearch(numbers, 34);
        System.out.println(34 + " sits at index " + d);
    }
}
