import java.util.Scanner;

public class rotatestring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String goal=sc.nextLine();

        if(s.length()!=goal.length()){
            System.out.print("false");
            return;
        }
        String current=s;
        for(int i=0;i<s.length();i++){
            if(current.equals(goal)){
                System.out.print("true");
                return;
            }
            char temp=current.charAt(0);
            String remain=s.substring(1);
            current=remain+temp;
        }
        System.out.print("false");
        sc.close();
    }
}
