import java.util.*;

class Array_Parity {

    public boolean uniformArray(int[] nums1) {
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums1 = new int[n];

        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        Array_Parity obj = new Array_Parity();

        boolean result = obj.uniformArray(nums1);

        System.out.println(result);

        sc.close();
    }
}