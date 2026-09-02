import java.util.*;

public class Decode_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        char arr[] = s.toCharArray();

        Stack<Integer> n = new Stack<>();
        Stack<Character> ch = new Stack<>();

        String res = "";

        int a = 0;
        for (int i = 0; i < arr.length; i++) {

            if (Character.isDigit(arr[i])) {
                a = a * 10 + (arr[i] - '0');
            } 
            else if (arr[i] == '[') {
                ch.push(arr[i]);
                n.push(a);
                a = 0;
            } 
            else if (Character.isLetter(arr[i])) {
                ch.push(arr[i]);
            }

            else if (arr[i] == ']') {
                int num = n.pop();

                String variable = "";

                char ch2 = ch.pop();
                while (ch2 != '[') {
                    variable = ch2 + variable;
                    ch2 = ch.pop();
                }

                String nested = "";
                for (int z = 0; z < num; z++) {
                    nested = nested + variable;

                }
                for(int z = 0; z < nested.length();z++){
                    ch.push(nested.charAt(z));
                }  
                
            }

        }
        
        for(int i = 0; i < ch.size();i++){
            res = res + ch.get(i);
        }

        System.out.print(res);
        sc.close();
    }
}