import java.util.*;

class Sortvowel {

    public String sortVowels(String s) {

        char arr[] = s.toCharArray();

        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            if(isVowel(arr[i])) {
                list.add(arr[i]);
            }
        }

        
        Collections.sort(list);

        
        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            if(isVowel(arr[i])) {
                arr[i] = list.get(j);
                j++;
            }
        }

        
        String res = "";

        for(int i = 0; i < arr.length; i++) {
            res = res + arr[i];
        }

        return res;
    }

    
    public boolean isVowel(char c) {

        return c == 'a' || c == 'e' || c == 'i' ||
               c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' ||
               c == 'O' || c == 'U';
    }

    public static void main(String[] args) {

        Sortvowel obj = new Sortvowel();

        String s = "lEetcOde";

        String result = obj.sortVowels(s);

        System.out.println(result);
    }
}