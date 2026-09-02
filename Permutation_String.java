import java.util.*;

class Permutation_String {

    public int findPermutationDifference(String s, String t) {

        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();

        int ans = 0;

        for (int i = 0; i < arr1.length; i++) {

            int sum = 0;

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    sum = Math.abs(i - j);
                }
            }

            ans = ans + sum;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        Permutation_String obj = new Permutation_String();

        int result = obj.findPermutationDifference(s, t);

        System.out.println(result);

        sc.close();
    }
}