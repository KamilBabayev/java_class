package less03;

import java.util.Arrays;
import java.util.Random;

public class Task11 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(1,30);
            numbers[i] = randomNumber;
        }

        System.out.println(Arrays.toString(numbers));

        int evenNumbersCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                evenNumbersCount++;
            }
        }

        int[] evenNumbers = new int[evenNumbersCount];
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                evenNumbers[index++] = numbers[i];
            }
        }
        System.out.println(Arrays.toString(evenNumbers));

    }
}
