import java.util.*;

class MinimumDeletion {

    public int minimumDeletions(int[] nums) {

        int n = nums.length;

        if (n == 1) {
            return 1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find minimum
        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        // Find maximum
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        int c1 = 0;
        int c2 = 0;

        // Minimum from front
        for (int i = 0; i < n; i++) {
            c1++;

            if (nums[i] == min) {
                break;
            }
        }

        // Minimum from back
        for (int i = n - 1; i >= 0; i--) {
            c2++;

            if (nums[i] == min) {
                break;
            }
        }

        int c3 = 0;
        int c4 = 0;

        // Maximum from front
        for (int i = 0; i < n; i++) {
            c3++;

            if (nums[i] == max) {
                break;
            }
        }

        // Maximum from back
        for (int i = n - 1; i >= 0; i--) {
            c4++;

            if (nums[i] == max) {
                break;
            }
        }

        // Delete both from front
        int front = Math.max(c1, c3);

        // Delete both from back
        int back = Math.max(c2, c4);

        // Delete min from front and max from back
        int bothSide1 = c1 + c4;

        // Delete max from front and min from back
        int bothSide2 = c3 + c2;

        return Math.min(
            Math.min(front, back),
            Math.min(bothSide1, bothSide2)
        );
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        MinimumDeletion obj = new MinimumDeletion();

        int result = obj.minimumDeletions(nums);

        System.out.println(result);

        sc.close();
    }
}
