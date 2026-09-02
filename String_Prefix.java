import java.util.*;

class String_Prefix {

    public String reversePrefix(String s, int k) {

        if (k == 1) {
            return s;
        }

        char arr[] = s.toCharArray();

        String rev = "";

        int z = k - 1;

        for (int i = z; i >= 0; i--) {
            rev = rev + arr[i];
        }

        for (int i = z + 1; i < arr.length; i++) {
            rev = rev + arr[i];
        }

        return rev;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int k = sc.nextInt();

        String_Prefix obj = new String_Prefix();

        String result = obj.reversePrefix(s, k);

        System.out.println(result);

        sc.close();
    }
}