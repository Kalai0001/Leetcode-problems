import java.util.Scanner;

class Goatlatin {
    public static String toGoatLatin(String sentence) {

        String finalans = "";

        String s = "maa";

        String arr1[] = sentence.split(" ");

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {

            String str = arr1[i];
            count++;

            String res = "";

            char arr2[] = str.toCharArray();
            char ch = arr2[0];

            for (int j = 1; j < arr2.length; j++) {
                res = res + arr2[j];
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {

                res = ch + res;
            } 
            else {
                res = res + ch;
            }

            finalans = finalans + res + s;

            if (count != arr1.length) {
                finalans = finalans + ' ';
            }

            s = s + "a";
        }

        return finalans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();

        String ans = toGoatLatin(sentence);

        System.out.println(ans);

        sc.close();
    }
}