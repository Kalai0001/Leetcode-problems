import java.util.Scanner;

public class Countcommas {

    public static int countCommas(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i >= 1000) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = countCommas(n);

        System.out.println(result);

        sc.close();
    }
}