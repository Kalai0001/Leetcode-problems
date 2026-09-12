import java.util.Scanner;

class Mergestring {
    public String mergeAlternately(String word1, String word2) {

        char arr1[] = word1.toCharArray();
        char arr2[] = word2.toCharArray();

        int i = 0;
        int j = 0;
        int k = 0;

        char arr[] = new char[arr1.length + arr2.length];

        if (arr1.length == arr2.length) {

            while (i < arr1.length) {
                arr[k] = arr1[i];
                k++;

                arr[k] = arr2[j];
                k++;

                i++;
                j++;
            }

        } else if (arr1.length < arr2.length) {

            while (i < arr1.length) {
                arr[k] = arr1[i];
                k++;

                arr[k] = arr2[j];
                k++;

                i++;
                j++;
            }

            if (i == arr1.length) {
                while (j < arr2.length) {
                    arr[k] = arr2[j];
                    k++;
                    j++;
                }
            }

        } else {

            while (j < arr2.length) {
                arr[k] = arr1[i];
                k++;

                arr[k] = arr2[j];
                k++;

                i++;
                j++;
            }

            if (j == arr2.length) {
                while (i < arr1.length) {
                    arr[k] = arr1[i];
                    k++;
                    i++;
                }
            }
        }

        String ans = "";

        for (int x = 0; x < arr.length; x++) {
            ans = ans + arr[x];
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word1: ");
        String word1 = sc.nextLine();

        System.out.print("Enter word2: ");
        String word2 = sc.nextLine();

        Mergestring obj = new Mergestring();

        String result = obj.mergeAlternately(word1, word2);

        System.out.println("Merged String: " + result);

        sc.close();
    }
}