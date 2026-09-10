import java.util.*;

public class Arraysign {

    public static int arraySign(int[] nums) {

        int sign = 1;

        for (int num : nums) {

            if (num == 0) {
                return 0;
            } 
            else if (num < 0) {
                sign = -sign;
            }
        }

        return sign;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = arraySign(nums);

        System.out.println(result);

        sc.close();
    }
}