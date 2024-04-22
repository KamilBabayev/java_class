package less02;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("welcome");

        int[] nums = {2,11, 23, 3,4,5,6,7,8,};
        int max = 0;
        int runnerUpMax = 0;
        for (int i=0; i< nums.length; i++) {
            if (max < nums[i]) {
                runnerUpMax = max;
                max = nums[i];
            }
        }
        System.out.println("max number " + max);
        System.out.println("runner-up number " + runnerUpMax);
    }
}
