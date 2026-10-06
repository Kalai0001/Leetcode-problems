import java.util.Stack;

public class Makeparenthesisvalid {

    public static int minAddToMakeValid(String s) {

        Stack<Character> stack = new Stack<>();

        char arr[] = s.toCharArray();

        int open = 0;
        int close = 0;

        for(int i = 0; i < arr.length; i++){

            char ch = arr[i];

            if(ch == '('){
                stack.push(ch);
                open++;
            }
            else if(ch == ')'){

                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                    open--;
                }
                else{
                    close++;
                }
            }
        }

        return open + close;
    }

    public static void main(String[] args) {

        String s = "())(";

        int ans = minAddToMakeValid(s);

        System.out.println(ans);
    }
}