import java.util.*;

class Solution {

    public String AddSpaces(String s, int[] spaces) {

        char arr[] = s.toCharArray();

        StringBuilder ans = new StringBuilder();

        int j = 0;

        for(int i = 0; i < arr.length; i++) {

            if(j < spaces.length && i == spaces[j]) {
                ans.append(" ");
                j++;
            }

            ans.append(arr[i]);
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = sc.nextInt();

        int spaces[] = new int[n];

        for(int i = 0; i < n; i++) {
            spaces[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        String result = obj.AddSpaces(s, spaces);

        System.out.println(result);

        sc.close();
    }
}