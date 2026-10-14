
public class Maximumsumsquare {

    public static String maxSumOfSquares(int num, int sum) {

        if (sum > 9 * num) {
            return "";
        }

        StringBuilder res = new StringBuilder();

        while (sum >= 9) {
            res.append('9');
            sum -= 9;
            num--;
        }

        if (num > 0 && sum > 0) {
            res.append((char) ('0' + sum));
            num--;
        }

        while (num > 0) {
            res.append('0');
            num--;
        }

        return res.toString();
    }

    public static void main(String[] args) {

        int num = 3;
        int sum = 20;

        String result = maxSumOfSquares(num, sum);

        System.out.println("Result: " + result);
    }
}
