import java.util.*;

public class Buyandsell_2 {

    public static int maxProfit(int[] prices) {

        int n = prices.length;

        int max = 0;

        for(int i = 1; i < n - 1; i++){

            if(prices[i] < prices[i + 1]){

                max = max + prices[i + 1] - prices[i];
            }
        }

        return max;
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
