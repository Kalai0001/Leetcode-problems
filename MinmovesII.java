import java.util.Arrays;

public class MinmovesII {

    public static int minMoves2(int[] nums) {

        if(nums.length == 1) return 0;

        int[] arr = nums.clone();

        Arrays.sort(arr);

        int mid = arr[arr.length / 2];

        int res = 0;

        for(int num : nums) {
            res += Math.abs(num - mid);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] nums = {1, 10, 2, 9};

        int result = minMoves2(nums);

        System.out.println("Minimum Moves: " + result);
    }
}