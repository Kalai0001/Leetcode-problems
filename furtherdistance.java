import java.util.Scanner;

public class furtherdistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int res=0;
        for(int i=0;i<size;i++){
           for(int j=i+1;j<size;j++){
            if(arr[i]!=arr[j]){
                res=Math.max(res,Math.abs(i-j));
            }
           }
        }
        System.out.printf("%d",res);
        sc.close();
    }
}
