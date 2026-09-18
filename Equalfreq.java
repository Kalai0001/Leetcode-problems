import java.util.HashMap;

public class Equalfreq {

    public static boolean areOccurrencesEqual(String s) {

        char arr[] = s.toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for(char ch : arr) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int first = 0;

        for(char ch : map.keySet()) {

            if(first == 0) {
                first = map.get(ch);
            }
            else if(map.get(ch) != first) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "abacbc";

        boolean ans = areOccurrencesEqual(s);

        System.out.println(ans);
    }
}