import java.util.Scanner;

class mirrordistance{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int rev=0;
        int num=0;
        while(n>0){
            num=n%10;                //n=25 
            rev=rev*10+num;          //rev=52
            n=n/10;
        }
        int res=Math.abs(original-rev);    //res=Math.abs(27-52)=27
        System.out.println(res);
        sc.close();
    }
}
