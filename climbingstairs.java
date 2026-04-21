import java.util.Scanner;

class climbingstairs{
    static int climbingstair(int num){
        if(num==0 || num==1){
            return 1;
        }
        int n0=1;
        int n1=1;
        int res=0;
        for(int i=2;i<=num;i++){
            res=n0+n1;
            n1=n0;
            n0=res;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int res=climbingstair(num);
        System.out.println(res);
        sc.close();
    }
}