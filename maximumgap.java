import java.util.Arrays;
import java.util.Scanner;

public class maximumgap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        if (n < 2) {
            System.out.println(0);
        } else {
            int res = 0;
            int max = 0;
            int finalmax = 0;
            for (int i = 1; i < n; i++) {
                res = nums[i] - nums[i - 1];
                max = res;
                if (max > finalmax) {
                    finalmax = max;
                }
            }
            System.out.printf("%d", finalmax);
        }
        sc.close();
    }
}
