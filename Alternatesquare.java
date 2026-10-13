
import java.util.Arrays;

public class Alternatesquare {

    public static long maxAlternatingSum(int[] nums) {

        int n = nums.length;

        // Convert all elements to positive values
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }

        // Sort the array in ascending order
        Arrays.sort(nums);

        int x = 0;
        int y = n - 1;

        long sum1 = 0;
        long sum2 = 0;

        // Two-pointer approach
        while (x < y) {
            sum1 += (long) nums[x] * nums[x];
            sum2 += (long) nums[y] * nums[y];

            x++;
            y--;
        }

        long mid = 0;

        if (n % 2 == 0) {
            return sum2 - sum1;
        } else {
            int a = n / 2;
            mid = (long) nums[a] * nums[a];
        }

        return mid + sum2 - sum1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        long result = maxAlternatingSum(nums);

        System.out.println("Maximum Alternating Sum: " + result);
    }
}