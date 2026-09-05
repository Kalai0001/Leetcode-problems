import java.util.Scanner;

public class Shufflestring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = sc.nextInt();

        int[] indices = new int[n];

        for (int i = 0; i < n; i++) {
            indices[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        String result = obj.restoreString(s, indices);

        System.out.println(result);

        sc.close();
    }
}

class Solution {
    public String restoreString(String s, int[] indices) {

        char arr[] = s.toCharArray();

        String res = "";

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < indices.length; j++) {

                count++;

                if (i == indices[j]) {
                    res = res + arr[count - 1];
                }
            }
        }

        return res;
    }
}