package less01;

public class Task01 {

    public static void main(String[] args) {
        int sum = 0;
        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("sum of numbers: " + sum);
        System.out.println("len of array: " + numbers.length);
        System.out.println("everage of numbers: " + sum / numbers.length);
    }
}
