import java.util.*;

public class Characterfrequ {

    public static int maxFreqSum(String s) {

        char arr[] = s.toCharArray();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int max1 = 0;
        int max2 = 0;

        for (char ch : set) {

            int count = 0;

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                for (int i = 0; i < arr.length; i++) {
                    if (ch == arr[i]) {
                        count++;
                        max1 = Math.max(max1, count);
                    }
                }

            } else {

                for (int i = 0; i < arr.length; i++) {
                    if (ch == arr[i]) {
                        count++;
                        max2 = Math.max(max2, count);
                    }
                }
            }
        }

        int res = max1 + max2;

        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = maxFreqSum(s);

        System.out.println("Maximum frequency sum = " + result);

        sc.close();
    }
}