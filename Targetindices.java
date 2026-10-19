
import java.util.*;

public class Targetindices {

    public static List<Integer> targetIndices(int[] nums, int target) {
        int n = nums.length;
        ArrayList<Integer> res = new ArrayList<>();

        // Sort the array in ascending order
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        // Find all indices of the target
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;

        List<Integer> result = targetIndices(nums, target);

        System.out.println("Sorted array: " + Arrays.toString(nums));
        System.out.println("Target indices: " + result);
    }
}
