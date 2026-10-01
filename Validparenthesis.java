import java.util.*;
public class Validparenthesis {

    static boolean isvalidparenthesis(String s){

        char arr[] = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++){

            char ch = arr[i];

            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else if(ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch == ']'){
                if(!stack.isEmpty() && stack.peek() == '['){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
            else if(ch == '}'){
                if(!stack.isEmpty() && stack.peek() == '{'){
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        boolean ans = isvalidparenthesis(s);

        System.out.println(ans);

        sc.close();
    }
}
