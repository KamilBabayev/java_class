package less04;

import java.util.Arrays;

public class Task03 {
    public static void main(String[] args) {
        int[] points = {10,20,30};
        System.out.println(getAverage(points));
    }

    public static String getAverage(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return "average of " + Arrays.toString(numbers) + " = " + sum / numbers.length;
    }

}
