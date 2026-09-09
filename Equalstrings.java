import java.util.Scanner;

public class Equalstrings {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String w1 = "";

        String w2 = "";

        for (int i = 0; i < word1.length; i++) {
            w1 = w1 + word1[i];
        }

        for (int i = 0; i < word2.length; i++) {
            w2 = w2 + word2[i];
        }

        if (w1.equals(w2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] word1 = new String[n];

        for (int i = 0; i < n; i++) {
            word1[i] = sc.next();
        }

        int m = sc.nextInt();

        String[] word2 = new String[m];

        for (int i = 0; i < m; i++) {
            word2[i] = sc.next();
        }

        boolean result = arrayStringsAreEqual(word1, word2);

        System.out.println(result);

        sc.close();
    }
}