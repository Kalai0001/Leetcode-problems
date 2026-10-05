public class Scoreparenthesis {
    public static int scoreOfParentheses(String s) {
        char arr[] = s.toCharArray();
        int count = 0;
        int depth = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch == '(') {
                depth++;
            } else {
                depth--;
                if (arr[i - 1] == '(') {
                    count += 1 << depth;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "(()(()))";
        int result = scoreOfParentheses(s);
        System.out.println(result);
    }
}