import java.util.*;

class Subarray {
    public int sumCounts(List<Integer> nums) {

        int n = nums.size();
        int res = 0;

        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < n; j++) {
                set.add(nums.get(j));

                int d = set.size();
                res += d * d;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Subarray sol = new Subarray();

        List<Integer> nums = Arrays.asList(1, 2, 1);

        int result = sol.sumCounts(nums);

        System.out.println("Sum of squared distinct counts: " + result);
    }
}