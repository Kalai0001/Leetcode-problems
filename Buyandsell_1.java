import java.util.*;

public class Buyandsell_1 {

    public static int maxProfit(int[] prices) {

        int n = prices.length;

        int min = prices[0];
        int max = -1;

        for (int i = 1; i < n; i++) {

            max = Math.max(max, prices[i] - min);

            min = Math.min(min, prices[i]);
        }

        return max == -1 ? 0 : max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int result = maxProfit(prices);

        System.out.println(result);

        sc.close();
    }
}
