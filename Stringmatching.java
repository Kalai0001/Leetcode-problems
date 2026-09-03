import java.util.*;

class Solution {

    public List<String> StringMatching(String[] words) {

        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++) {

            String temp = words[i];

            for(int j = 0; j < words.length; j++) {

                if(words[j].contains(temp) && i != j) {
                    list.add(temp);
                    break;
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String words[] = new String[n];

        for(int i = 0; i < n; i++) {
            words[i] = sc.nextLine();
        }

        Solution obj = new Solution();

        List<String> result = obj.StringMatching(words);

        System.out.println(result);

        sc.close();
    }
}
