package less08;

public class Person {
    public static void main(String[] args) {

        int[] nums = {3,4,22,23,45,44,12,11,5};
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
