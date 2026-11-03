import java.util.*;

public class MinmovesIII {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }

        int res = 0;

        for (int num : nums) {
            res += max - num;
        }

        System.out.println("Minimum Moves: " + res);
    }
}