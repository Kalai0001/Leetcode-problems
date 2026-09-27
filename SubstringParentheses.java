import java.util.*;


public class SubstringParentheses {

    static String reverseparentheses(String s){

        char arr[] = s.toCharArray();

        Stack<Character> box = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '('){
                box.push(arr[i]);
            }
            else if(Character.isLetter(arr[i])){
                box.push(arr[i]);
            }
            else if(arr[i] == ')'){

                String ch = "";

                while(box.peek() != '('){
                    ch = ch + box.pop();
                }

                if(box.peek() == '('){
                    box.pop();
                }

                char a[] = ch.toCharArray();

                for(int j = 0; j < a.length; j++){
                    box.push(a[j]);
                }
            }
        }

        String ans = "";
        while(!box.isEmpty()){
            ans = ans + box.pop();
        }

        String rev = "";
        for(int i = ans.length()-1 ; i >= 0; i--){
            rev = rev + ans.charAt(i);
        }

        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ans = reverseparentheses(s);

        System.out.println(ans);

        sc.close();
    }
}
