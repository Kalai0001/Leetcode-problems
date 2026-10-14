public class Longestpalindromicsubstring {
    public static void main(String[] args) {
        String s = "abracecarabbbbbbbbbbbbbbbb";

        int n = s.length();

        char arr[] = s.toCharArray();

        int max = 0;
        StringBuilder finalans = new StringBuilder();

        if (n == 1) {
            System.out.println(s);
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i; j < arr.length; j++) {
                    String res = "";
                    String copy = "";
                    int size = 0;
                    for (int k = i; k <= j; k++) {
                        res = res + arr[k];
                        copy = copy + arr[k];
                        size++;
                    }

                    char arr2[] = res.toCharArray();

                    int x = 0;
                    int y = arr2.length - 1;

                    while (x < y) {
                        char ch = arr2[x];
                        arr2[x] = arr2[y];
                        arr2[y] = ch;

                        x++;
                        y--;
                    }

                    String ans = new String(arr2);
                    
                    if (ans.equals(copy)) {
                        if (size > max) {
                            max = size;
                            finalans.setLength(0);
                            for (int k = 0; k < ans.length(); k++) {
                                finalans.append(ans.charAt(k));
                            }
                        }
                    }
                }
            }
            if (max == 1) {
                System.out.println(0);
                return;
            } else {
                System.out.println(finalans);
            }
        }
    }
}
