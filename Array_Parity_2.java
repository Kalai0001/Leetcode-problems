import java.util.*;

class Array_Parity_2 {

    public boolean uniformArray(int[] nums1) {

        int small = Integer.MAX_VALUE;

        int evencount = 0;

        for(int i = 0; i < nums1.length; i++) {

            if(nums1[i] < small) {
                small = nums1[i];
            }

            if(nums1[i] % 2 == 0) {
                evencount++;
            }
        }

        if(small % 2 == 0) {
            return evencount == nums1.length;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int nums1[] = new int[n];

        for(int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }

        Array_Parity_2 obj = new Array_Parity_2();

        boolean result = obj.uniformArray(nums1);

        System.out.println(result);

        sc.close();
    }
}