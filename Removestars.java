import java.util.Scanner;

public class Removestars {

    public static String removeStars(String s) {

        StringBuilder str = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();

        int k = str.length();

        for (int i = 0; i < k; i++) {

            if (str.charAt(i) == '*') {
                ans.deleteCharAt(ans.length() - 1);
            } 
            else {
                ans.append(str.charAt(i));
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String result = removeStars(s);

        System.out.println(result);

        sc.close();
    }
}