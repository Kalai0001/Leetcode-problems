import java.util.Scanner;

public class withoutoperatoradd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(b>0){
            for(int i=0;i<b;i++){
                a++;
            }
        }
        else{
            for(int i=0;i>b;i--){
                a--;
            }
        }
        System.out.println(a);
        sc.close();
    }
}
