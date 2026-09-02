import java.util.*;

public class Productofarray {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        int product = 1;

        
        for (int i = 0; i < n; i++) {
            res[i] = product;
            product = product * nums[i];
        }

        product = 1;

        
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * product;
            product = product * nums[i];
        }

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = productExceptSelf(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        sc.close();
    }
}
